/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Adria
 */
public class Persona {
    private String nombre;
    private String operacion;
    private double Numero1;
    private double Numero2;

    public Persona() {
    }

    public Persona(String nombre, String operacion, double Numero1, double Numero2) {
        this.nombre = nombre;
        this.operacion = operacion;
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //Getters
    public double getNumero1() {
        return Numero1;
    }

    public double getNumero2() {
        return Numero2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOperacion() {
        return operacion;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void setNumero1(double Numero1) {
        this.Numero1 = Numero1;
    }

    public void setNumero2(double Numero2) {
        this.Numero2 = Numero2;
    }
    
    public double suma() {
        System.out.println(Numero1+" + "+Numero2);
        Numero1=Numero1+Numero2;
        System.out.println(" = "+Numero1);
    return Numero1;
    }
    
    
    public double divison() {
        System.out.println(Numero1+" / "+Numero2);
        Numero1=Numero1/Numero2;
        System.out.println(" = "+Numero1);
    return Numero1;
    }
    public double resta() {
        System.out.println(Numero1+" - "+Numero2);
        Numero1=Numero1-Numero2;
        System.out.println(" = "+Numero1);
    return Numero1;
    }
    
    public double multiplicacion() {
        System.out.println(Numero1+" x "+Numero2);
        Numero1=Numero1*Numero2;
        System.out.println(" = "+Numero1);
    return Numero1;
    }
}
