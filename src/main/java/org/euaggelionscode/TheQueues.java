package org.euaggelionscode;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class TheQueues {
    public static void main(String[] args) {

      LinkedList<Person> linkedList = new LinkedList<>();
      linkedList.add(new Person("Alex",23));
      linkedList.add(new Person("Alexa",23));
      linkedList.addFirst(new Person("Arron",18));
      ListIterator<Person> personListIterator =linkedList.listIterator();
      while (personListIterator.hasNext()) {
          System.out.println(personListIterator.next());
      }
        System.out.println();
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }

    }

    private static void extracted() {


        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add (new Person("Alex", 23));
        supermarket.add (new Person("Segun", 21));
        supermarket.add (new Person("Steve", 35));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){}
}
