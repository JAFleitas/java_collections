package Logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    /*

        List<Persona> personas = new ArrayList<Persona>();

        personas.add(new Persona(11111111,"Gonzalo", "Fleitas"));
        personas.add(new Persona(11111111,"Gonzalo", "Fleitas"));
        personas.add(new Persona(11111111,"Gonzalo", "Fleitas"));
        System.out.println( personas.size());
        System.out.println(personas.get(0).getDni());

        System.out.println(  personas.size());
        personas.add(0,new Persona(2222,"g","d"));
        System.out.println(personas.size());

        Persona persOne = personas.get(2);
        personas.remove(persOne);
        System.out.println("-------------");
        for(Persona perso: personas){
            System.out.println(perso.getName());
        }

        personas.clear();
        System.out.println(personas.size());


        System.out.println(personas.contains(persOne));

        List<Persona> personasDos = new ArrayList<Persona>();
        personasDos.addAll(personas);
        System.out.println("ssssssssssssssssssssss");


        for (Persona perso:personasDos
             ) {
            System.out.println(perso.getSurname());
        }

        System.out.println(personas.equals(personasDos));

        personas.add(0,new Persona(1,"primero","probando"));
        for (Persona perso:personas) {
            System.out.println(perso.getName());C
        }
     */
    List<Persona> gente = new ArrayList<Persona>();
    gente.add(new Persona());
    gente.get(0);
    Bank customerOne = new Bank("12345"
            ,"Gonzalo Fleitas",5000,
            "Type 4",1000);
        Bank customerTwo = new Bank("12345"
                ,"Gonzalo Fleitas",10000,
                "Type 4",0);
        System.out.println(customerOne.getCreditLimit());
        customerOne.increaseLimit();
        System.out.println(customerTwo.getCreditLimit());
        System.out.println(customerOne.getCreditLimit());
        customerTwo.increaseLimit();
        System.out.println(customerTwo.getCreditLimit());

    }
}