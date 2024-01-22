package org.euaggelionscode;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colours = new String[5];
        colours[0] = "purple";
        colours[1] = "blue";

        System.out.println(Arrays.toString(colours));
        System.out.println(colours[0]);
        System.out.println(colours[1]);
        System.out.println(colours[2]);
        System.out.println(colours[3]);
        System.out.println(colours[4]);

        colours[2] = "yellow";

        System.out.println(Arrays.toString(colours));

        //Once you define the array you can no long change the size)
        int[] numbers = {100, 200};

        for(int i = colours.length - 1; i >= 0; i--) {
            System.out.println(colours[i]);
        }
        for (String colour : colours){
            System.out.println(colour);
        }
        Arrays.stream(colours).forEach(System.out::println);


    }
}
// An array is a building block for data