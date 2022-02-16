package com.codingdojo.linkedlist;

public class LinkedList {
	public Nodo head;
    public LinkedList() {
        this.head = null;
    }
    // Los métodos de SLL van aquí. Para empezar, te mostraremos cómo agregar un nodo a la lista.
    public void add(int value) {
        Nodo newNodo = new Nodo(value);
        if(head == null) {
            head = newNodo;
        } else {
            Nodo runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNodo;	
        }
    }
    
    public void remove() {
        if(head == null) {
            System.out.println("La lista no tiene elementos");
        } else {
        	Nodo prev = head;
            Nodo runner = head;
            while(runner.next != null) {
            	prev = runner;
                runner = runner.next;
            }
            prev.next = null;
            runner = null;
        }
    }
    
    public void printValues() {
        if(head == null) {
            System.out.println("La lista no tiene elementos");
        } else {
        	Nodo runner = head;
            while(runner != null) {
            	System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }
    
    public Nodo find(int value) {
        if(head == null) {
            System.out.println("La lista no tiene elementos");
        } else {
        	Nodo runner = head;
            while(runner != null) {
            	if (runner.value == value) {
					return runner;
				}
                runner = runner.next;
            }
        }
        return null;
    }
    
    public void remove(int value) {
        if(head == null) {
            System.out.println("La lista no tiene elementos");
        } else {
        	Nodo prev = head;
        	Nodo runner = head;
        	for (int i = 0; i <= value; i++) {
        		if (i == value) {
        			if(runner.next != null) {
        				if (runner == head) {
							head = runner.next;
						} else {
							prev.next = runner.next;
						}
        			}else {
        				prev.next = null;
        			}
					System.out.println("Nodo eliminado");
				}
        		if (runner.next == null) {
        			System.out.println("No existe el indice ingresado");
        			break;
        		}
        		prev = runner;
        		runner = runner.next;
			}
        }
    }
    
}
