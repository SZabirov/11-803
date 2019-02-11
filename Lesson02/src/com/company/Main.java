package com.company;

public class Main {

    public static void main(String[] args) {
	    Node n1 = new Node();
	    n1.value = 42;

	    Node n2 = new Node();
	    n2.value = 76;

	    Node n3 = new Node();
	    n3.value = 0;

        Node n4 = new Node();
        n4.value = 15;

	    n1.next = n2;
	    n2.next = n3;
	    n3.next = n4;
    }
}
