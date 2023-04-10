package com.adviters.bootcamp;

public class Empleado {
    private String nombre;
    private Integer dni;

    public Empleado() {
        super();
    }

/*    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }*/

    public Empleado setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Empleado setDni(Integer dni) {
        this.dni = dni;
        return this;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }
}
