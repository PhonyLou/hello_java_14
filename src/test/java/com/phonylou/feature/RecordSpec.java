package com.phonylou.feature;

import org.junit.jupiter.api.Test;

class RecordSpec {
    @Test
    void constructor_of_record() {
        Person tiechui = new Person("tiechui", 22);
        System.out.println(tiechui);
    }

    @Test
    void direct_field_instead_of_get_set() {
        Person tiechui = new Person("tiechui", 22);
        System.out.println("俺叫欧阳" + tiechui.name() + ", 年方" + tiechui.age());
    }

    @Test
    void should_have_same_hash_code_when_given_same_input() {
        Person tiechui = new Person("tiechui", 22);
        Person realTiechui = new Person("tiechui", 22);

        System.out.println(tiechui == realTiechui);
        System.out.println(tiechui.equals(realTiechui));

        System.out.println(tiechui.name() + "'s hash code is " + tiechui.hashCode());
        System.out.println(realTiechui.name() + "'s hash code is " + realTiechui.hashCode());
    }

}

record Person(String name, int age) {
}
