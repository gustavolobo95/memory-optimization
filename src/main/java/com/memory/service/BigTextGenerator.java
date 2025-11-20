package com.memory.service;

public class BigTextGenerator {

    private static final String LOREM_IPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
            "Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. ";

    public static String generateBigText(int repeat) {
        return LOREM_IPSUM.repeat(Math.max(0, repeat));
    }

}
