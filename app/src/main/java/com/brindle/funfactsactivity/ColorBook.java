package com.brindle.funfactsactivity;

import java.util.Random;

public class ColorBook {

    private Random randGen;
    private int randInt;
    private final int[] colors = {
            0xFFFF895D,
            0xFF2E94B9,
            0xFF79BD8F,
            0xFF1B435D,
            0xFF8F5B4A,
            0xFFE9767C,
            0xFFD25565,
            0xFFF6AAD0,
            0xFF36C186,
            0xFFF0B775,
            0xFF158A8C,
            0xFF84577C,
            0xFF39add1, // light blue
            0xFF3079ab, // dark blue
            0xFFc25975, // mauve
            0xFFe15258, // red
            0xFFf9845b, // orange
            0xFF838cc7, // lavender
            0xFF7d669e, // purple
            0xFF53bbb4, // aqua
            0xFF51b46d, // green
            0xFFe0ab18, // mustard
            0xFF637a91, // dark gray
            0xFFf092b0, // pink
            0xFFb7c0c7  // light gray
    };

    public int getColors() {
        randGen = new Random();
        randInt = randGen.nextInt(colors.length);
        return colors[randInt];
    }
}
