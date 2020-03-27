package com.phonylou.feature;

import org.junit.jupiter.api.Test;

import java.util.Random;

class SwitchSpec {
    @Test
    void arrow_in_switch() {
        var day = new Random().nextInt(6);
        switch (day) {
            case 1 -> System.out.println(1);
            case 2 -> System.out.println(2);
            default -> System.out.println("day");
        }
    }

    @Test
    void expression_in_switch() {
        var day = new Random().nextInt(6);
        var date = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Others";
        };
        System.out.println("The result is " + date);
    }

    @Test
    void yield_in_switch_default_section() {
        var day = new Random().nextInt(6);
        var date = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> {
                String result = day > 4 ? "Happy Weekend" : "Working day";
                System.out.println(result + " from default");
                yield result;
            }
        };
        System.out.println("The result is " + date);
    }
}
