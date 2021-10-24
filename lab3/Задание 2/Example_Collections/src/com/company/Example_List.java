package com.company;

import java.util.ArrayList;
import java.util.List;

public class Example_List {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Alex");
        list.add("Iter");
        list.add("Robert");
        list.add("Jake");

        System.out.printf("Количество элементов: %d" + "\n", list.size());

        for(String p : list)
            System.out.println(p);

        // получаем 2-й объект
        System.out.println("Второй элемент: " + list.get(1));

        // установка нового значения для 2-го объекта
        list.set(1, "Robert");

        // удаление конкретного элемента
        list.remove("Robert");
        // удаление по индексу
        list.remove(0);

        // проверяем наличие элемента и выводим на экран
        if(list.contains("Robert")){
            System.out.println("ArrayList содержит Robert");
        }
    }
}
