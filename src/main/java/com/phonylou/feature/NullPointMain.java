package com.phonylou.feature;


public class NullPointMain {
    public static void main(String[] args) {
//        Action action = new Action();
        Animal animal = new Animal();
//        animal.action = action;

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