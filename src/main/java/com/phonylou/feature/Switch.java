package com.phonylou.feature;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        int status = new Random().nextInt(10);
        var log = switch (status) {
            case 1 -> "Your status is approved";
            case 0 -> "Your status is pending";
            default -> {
                final String prefix = "Hi, ";
                yield "hello" + status;
            }
        };

        System.out.println(log);
    }
}
