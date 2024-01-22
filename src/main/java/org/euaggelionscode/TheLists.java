package org.euaggelionscode;



import java.util.ArrayList;

import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        List<String> coloursUnmodifiable = List.of(
                "blue",
                "yellow"
        );

        coloursUnmodifiable.add("black");

        List<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("purple");
        colours.add("yellow");
        System.out.println(colours.size());
        System.out.println(colours.contains("yellow"));
        System.out.println(colours.contains("pink"));
        System.out.println(colours);

        for (String colour : colours){
            System.out.println(colour);
        }
        colours.forEach(System.out::println);

        for(int i = 0; i < colours.size(); i++){
            System.out.println(colours.get(i));
        }
    }
}
