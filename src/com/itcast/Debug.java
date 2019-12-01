package com.itcast;

import java.util.HashMap;

public class Debug {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        System.out.println(123);
        System.out.println(456);
        System.out.println(789);
        HashMap<String, String> map = new HashMap<>();
        map.put("name","shao");
        map.put("age","22");
        map.put("school","tsinghua");
        String age = map.get("age");
        System.out.println(age);
        map.put("address","zz");
        System.out.println(map);
    }
}
