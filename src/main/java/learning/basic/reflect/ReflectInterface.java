/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.basic.reflect;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 15:39
 * @Version V1.0
 */
public class ReflectInterface {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> dClazz = Class.forName("learning.basic.reflect.Dog");
        Class<?>[] interfaces = dClazz.getInterfaces();
        for (Class<?> i : interfaces) {
            System.out.println(i);
        }
    }
}
