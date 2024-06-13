package com.example.linkedlist;

import com.example.linkedlist.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList("Elemento 1");

        list.append("Elemento 2");

        list.append("Elemento 3");
        list.prepend("Elemento 0");

        list.insert(3, "Elemento 2.5");

        // System.out.println(list.get(2).data);

        // System.out.println(list.removeFirst().data);

        list.print();

        list.set(1, "Elemento n");

        list.print();
        // list.getHead();
        // list.getTail();
        // list.getLength();

        list.remove(2);

        list.print();
    }
}