package org.euaggelionscode;

import java.util.HashSet;

import java.util.Objects;
import java.util.Set;


public class TheSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.remove(new Ball("red"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

    static class Ball {
       String colour;
        public Ball(String colour) {
            this.colour = colour;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Ball ball)) return false;

            return Objects.equals(colour, ball.colour);
        }

        @Override
        public int hashCode() {
            return colour != null ? colour.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "colour='" + colour + '\'' +
                    '}';
        }
    }
   // record Ball(String colour){}
}
