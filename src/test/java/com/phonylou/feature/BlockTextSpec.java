package com.phonylou.feature;

import org.junit.jupiter.api.Test;

class BlockTextSpec {
    @Test
    void different_line_of_block_text() {
        String text = """
                I'm the first line
                I'm the second line""";
        System.out.println(text);
    }

    @Test
    void same_line_of_block_text() {
        String text = """
                I'm the first line \
                I'm the second line""";
        System.out.println(text);
    }
}
