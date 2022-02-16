package com.codingdojo.linkedlist;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList sll = new LinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.printValues();
        System.out.println("-------------");
        sll.remove();
        sll.remove();
        sll.printValues();
        System.out.println("-------------");
        Nodo find1 = sll.find(100);
        if (find1 != null) {
        	System.out.println("Se encontro " + find1.value);
		} else {
			System.out.println("No se encontro");
		}
        System.out.println("-------------");
        sll.remove(0);
        sll.remove(1);
        sll.printValues();
        
        
	}

}
