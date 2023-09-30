package com.acme;

public record PersonaRegistro(String nombre, String apellido) {
    @Override
    public String toString() {
        // Moises comente este cambio
        //System.out.println("Esta instrucción no finciona");
        return "%s %s".formatted(nombre,apellido);
    }
}
