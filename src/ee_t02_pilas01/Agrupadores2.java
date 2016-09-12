/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t02_pilas01;

import java.util.Scanner;

/**
 *
 * @author IngridNiño
 */
public class Agrupadores2 {
    Scanner sc= new Scanner(System.in);
    Scanner s= new Scanner(System.in);
    PilaString pila;
    
    
    public void verificar(){
        String expresion="";
        System.out.println("¿Cuántas cadenas vas a verificar?");
        int numCad=sc.nextInt();
        for(int j=0;j<numCad;j++){
            System.out.println("Introduce una cadena de agrupadores (),[],{}");
                 expresion=s.nextLine();
            pila= new PilaString(expresion.length());
        for(int i=1;i<=expresion.length();i++){
            String aux=expresion.substring((i-1),i);
            if(aux.equals("(") || aux.equals("[") || aux.equals("{"))
                pila.push(aux);
            else if((aux.equals(")") && pila.peek().equals("(")) || (aux.equals("]") && pila.peek().equals("[")) || (aux.equals("}") && pila.peek().equals("{"))){
                pila.pop();
                System.out.println("SI ESTÁ BALANCEADO");
                break;
            } else {System.out.println("NO ESTÁ BALANCEADO");
                break;
            }           
        }   
    }   
}
    
    public static void main(String[] args) {
        Agrupadores2 a= new Agrupadores2();
        a.verificar();
    }
}
