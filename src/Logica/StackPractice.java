package Logica;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        System.out.println(pila);

        System.out.println(pila.search(1));

        System.out.println(pila.search(2));
        System.out.println(pila.search(5));

        System.out.println(pila.search(8));
        pila.pop();
        System.out.println(pila);
        System.out.println(pila.isEmpty());
        System.out.println("el ultimo agregado es " +  pila.peek());
        System.out.println("primer elemento " + pila.firstElement());

        /*
         System.out.println(pila.get(2));
        for (int i = 0 ; i<pila.size(); i++){
            System.out.println(pila.get(i));
        }
        */
        for (Integer element: pila) {
            System.out.println(element);
        }

        System.out.println(pila.peek());
    }
}
