package pkgclass;

import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pizza[] Pizzas = new Pizza[2];
        String ingrediente=null;
        int tamaño= 0;
        double precio = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingreediente pizza" + (i+1));
            ingrediente = teclado.next();
            System.out.println("Tamaño pizza" + (i+1));
            tamaño = teclado.nextInt();
            System.out.println("Precio pizza" + (1+1));
            precio = teclado.nextDouble();
            Pizzas[i] = new Pizza(ingrediente, tamaño, precio);
        }
            
        for (Pizza pizza : Pizzas) {
            System.out.println(pizza);        
        }    
    }
    }
        
    
