package com.phonylou.feature;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class InstanceofSpec {
    @Test
    void assign_variable_after_instanceof() {
        var kumar = new Child();
        Map<String, Object> map = new HashMap<>();
        map.put("0", kumar);
        if (map.get("0") instanceof Child realKumar) {
            realKumar.age = 6;
            realKumar.name = "Kumar";
            System.out.println("Hi I'm " + realKumar.name);
        }
    }

    @Test
    void variable_scope_should_effect_first_bracket_group_of_instanceof() {
        var kumar = new Child();
        Map<String, Object> map = new HashMap<>();
        map.put("0", kumar);

        if (map.get("0") instanceof Child realKumar) {
            realKumar.age = 6;
            realKumar.name = "Kumar";
            System.out.println("Hi I'm " + realKumar.name);
        } else {
            // Variable realKumar isn't work here
            // System.out.println(realKumar);
        }
    }
}

class Child {
    String name;
    int age;
}
