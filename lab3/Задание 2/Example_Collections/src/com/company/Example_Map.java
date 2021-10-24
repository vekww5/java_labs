package com.company;

import java.util.HashMap;
import java.util.Map;

public class Example_Map {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        //Добавляем данные в map
        map.put("BMW", 5);
        map.put("Mercedes", 3);
        map.put("Audi", 4);
        map.put("Ford", 10);

        System.out.println("Количество элементов : " + map.size());

        // Вывод всех элементов map.
        for (String key : map.keySet())
            System.out.println(key + " - " + map.get(key));
        System.out.println();

        // Поиск по ключу.
        String searchKey = "Audi";
        if (map.containsKey(searchKey))
            System.out.println("Найдено " + map.get(searchKey) + " " + searchKey + " машин\n");

        // Очистка.
        map.clear();

    }
}
