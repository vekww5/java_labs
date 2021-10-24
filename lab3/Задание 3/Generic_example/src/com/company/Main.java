package com.company;

public class Main {

    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add("element - " + i);
        }

        for (int i = 0; i < list.getLength(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Вызов метода");

        print(1);
        print("text");
        print(1.5);
    }

    static public <T> void print(T record){
        System.out.println(record.toString());
    }
}
