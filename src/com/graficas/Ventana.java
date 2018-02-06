package com.graficas;

public class Ventana {
    private String titulo;
    private Boton entrar;
    private Etiqueta etiquetaNombre, etiquetaPassword;
    private CampoTexto campoNombre, campoPassword;

    public Ventana(String titulo) {
        this.titulo = titulo;
        this.entrar = new Boton("entrar");
        this.etiquetaNombre = new Etiqueta("Nombre");
        this.etiquetaPassword = new Etiqueta("Password");
        this.campoNombre = new CampoTexto("");
        this.campoPassword = new CampoTexto("");
    }


    public void insertarNombre(String nombre) {
        this.campoNombre.setTexto(nombre);
    }


    public void insertarPassword(String password) {
        this.campoPassword.setTexto(password);
    }

    public boolean validar(){
        String nombre = campoNombre.getTexto();
        String pass = campoPassword.getTexto();

        return (nombre.equals("Pepito") && pass.equals("1234"));

    }


}

