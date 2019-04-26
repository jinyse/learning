/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.basic.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 15:13
 * @Version V1.0
 */
public class InstanceOperation4 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> dClazz = Class.forName("learning.basic.reflect.Dog");

        Constructor<?> threeCtr = dClazz.getConstructor(int.class, String.class, int.class);
        Dog dog = (Dog) threeCtr.newInstance(101, "旺财", 2);
        System.out.println("id" + dog.getId() + ", name : " + dog.getName());

        Constructor<?> oneCtr = dClazz.getDeclaredConstructor(String.class);
        oneCtr.setAccessible(true);
        Dog dog2 = (Dog) oneCtr.newInstance("大黄");
        System.out.println(dog2);

    }
}