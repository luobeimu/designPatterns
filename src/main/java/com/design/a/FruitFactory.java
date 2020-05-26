package com.design.a;

public class FruitFactory {


    public static Fruit getFruit(String type) throws Exception {
        if (type.equalsIgnoreCase("apple")) {
            return Apple.class.newInstance();
        } else if (type.equalsIgnoreCase("banana")) {
            return Banana.class.newInstance();
        } else {
            throw new Exception("没有返回对应的实体累");
        }
    }


    /**
     * 所有方法的创建全部放在工厂中进行，方便扩展
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        FruitFactory.getFruit("apple").get();
    }
}
