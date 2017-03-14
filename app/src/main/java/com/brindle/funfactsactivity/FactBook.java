package com.brindle.funfactsactivity;

import java.util.Random;

public class FactBook {
    // Fields (Member Variables - properties about the object)
    private final String[] mFacts = {
            "If everyone on Earth joined hands with one another across the planet, lots of people would drown.",
            "If you took a person's intestines and stretching it out as far as you could, that person would die!",
            "There are more stars in space than there are on Earth! Wow.",
            "Dogs that live in Hawaii are more likely to die choking on a tomato than dogs anywhere else in the world. ",
            "In 1992, to celebrate his third consecutive year of hosting the Oscars®, Billy Crystal got his nipples pierced.",
            "Most reptiles are allergic to eye makeup.",
            "By law, a pregnant woman can pee anywhere she wants to in Britain, even if she chooses, in a police officer’s helmets.",
            "It is illegal to get a tattoo of a didgeridoo in Adelaide, Australia. ",
            "Chocolate chip bagels are required to include trace amounts of fluoride. ",
            "The names of Popeye's four nephews are Pipeye, Peepeye, Pupeye, and Poopeye!",
            "Asbestos will dissolve in most water-based liquids and can liven up your cup of tea.",
            "The ampersand was originally referred to a a jumperoo.",
            "Cod liver oil works well as an anti-perspirant, but is a terrible deodorant."};

    public String getFact() {

        String fact;

        // Randomly select a fact
        Random gen = new Random();
        int randInt = gen.nextInt(mFacts.length);
        fact = mFacts[randInt];

        return fact;
    }
}
