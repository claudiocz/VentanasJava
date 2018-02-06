package com.graficas;

public class Main {

    public static void main(String[] args) {
	    Ventana ventana = new Ventana("Inicio Sesión");
	    ventana.insertarNombre("Pepito");
	    ventana.insertarPassword("1234");

	    boolean respuesta = ventana.validar();

	    if(respuesta){
			System.out.println("Bienvenido!!!");
        }
        else{
			System.out.println("Datos incorrectos");
		}

    }
}
