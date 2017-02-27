/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author Estudiante
 */
public class Pizza {
    private String sabor;
    private int diametro;
    private double precio;

    public Pizza(String sabor, int diametro, double precio) {
        this.sabor = sabor;
        this.diametro = diametro;
        this.precio = precio;
    
        
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pizza{" + "sabor=" + sabor + ", diametro=" + diametro + ", precio=" + precio + '}';
    }

    
    }

