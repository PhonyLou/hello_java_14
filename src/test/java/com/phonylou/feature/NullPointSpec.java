package com.phonylou.feature;

import org.junit.jupiter.api.Test;

public class NullPointSpec {
    @Test
    void null_point_exception_with_tips() {
        Animal animal = new Animal();
        animal.getAction().getOperation().run();
    }
}

class Animal {
    Action action;
    public Action getAction() {
        return action;
    }
}
class Action {
    Operation operation;
    public Operation getOperation() {
        return operation;
    }
}
class Operation {
    public void run() {
        System.out.println("run");
    }
}