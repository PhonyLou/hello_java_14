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

    @Test
    void indentation_with_block_text() {
        String text = """
                <html>
                    <body>
                        <h1>Hello</h1>
                        <h4>World</h4>
                    </body>
                </html>""";
        System.out.println(text);
    }

    @Test
    void return_formatted_SQL_with_block_text() {
        String text = """
                SELECT * from Person
                WHERE id = 'id' and name = 'aouyang tiechui'""";
        System.out.println(text);
    }
}
