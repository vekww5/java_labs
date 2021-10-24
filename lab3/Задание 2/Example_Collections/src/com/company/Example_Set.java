package com.company;

import java.util.HashSet;
import java.util.Set;

public class Example_Set {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();

        // добавим в список ряд элементов
        hashSet.add("Germany");
        hashSet.add("France");
        hashSet.add("Italy");
        // пытаемся добавить элемент, который уже есть в коллекции
        boolean isAdded = hashSet.add("Germany");
        System.out.println(isAdded);    // false

        System.out.printf("Количество элементов: %d \n", hashSet.size());

        for(String state : hashSet){
            System.out.println(state);
        }
        // удаление элемента
        hashSet.remove("Germany");
    }
}
