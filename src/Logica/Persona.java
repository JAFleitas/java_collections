package Logica;

public class Persona {

    private int dni;
    private String name;
    private String surname;

    public Persona() {
    }

    public Persona(int dni, String name, String surname) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
