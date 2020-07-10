/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package learning.others.spi;

import org.junit.Test;

import java.util.ServiceLoader;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/4/29 19:39
 * @Version V1.0
 */
public class JavaSPITest {

    @Test
    public void test() {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }
}
