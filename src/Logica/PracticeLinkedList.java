package Logica;

import java.util.LinkedList;
import java.util.List;

public class PracticeLinkedList {
    public static void main(String[] args) {
        List <Persona> personas = new LinkedList<Persona>();
        personas.add(new Persona());
        personas.add(0,new Persona(123,"Gonza","Fleitas"));
        personas.add(2,new Persona(123456,"Gonzalo","Fleitas"));


        for (Persona perso: personas) {
            System.out.println(perso.getDni());
        }
        personas.removeAll(personas);
        System.out.println(personas.isEmpty());

    }
}
