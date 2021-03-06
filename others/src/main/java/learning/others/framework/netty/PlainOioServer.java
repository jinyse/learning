package learning.others.framework.netty;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @Author Lin JingHui
 * @Date 2019/3/26
 */
public class PlainOioServer {
    public void server(int port) throws Exception {
        final ServerSocket socket = new ServerSocket(port);
        try {
            while (true) {
                final Socket clientSocket = socket.accept();
                System.out.println("Accepted connection from " + clientSocket);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        OutputStream out;
                        try {
                            out = clientSocket.getOutputStream();
                            out.write("Hi\r\n".getBytes(Charset.forName("UTF-8")));
                            out.flush();
                            clientSocket.close();
                        } catch (IOException e) {
                            try {
                                clientSocket.close();
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
            socket.close();
        }
    }
}
