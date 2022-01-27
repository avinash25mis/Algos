package com.ingrediantAndBurger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumOfSmallAndBigBurger {

    public static void main(String[] args) {
        findtheNumberOftotalSmallAndBigBurger(7,8) ;
    }

    private static List findtheNumberOftotalSmallAndBigBurger(int tomatoSlices, int cheeseSlices) {
        int twoX = tomatoSlices - 2 * cheeseSlices;
        int x = twoX / 2;
        int y = cheeseSlices - x;
        return twoX >= 0 && twoX % 2 == 0 && y >= 0 ? Arrays.asList(x, y) : new ArrayList<>();
    }

}

/*
4x + 2y = tomato
x + y = cheese
=>
2x = tomato - 2 * cheese
x = (tomato - 2 * cheese) / 2
y = cheese - x
*/