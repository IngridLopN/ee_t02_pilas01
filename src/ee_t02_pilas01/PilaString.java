/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t02_pilas01;

/**
 *
 * @author IngridNiño
 */
public class PilaString {
    String pila[];
    Integer tope;
    Integer tam;
    
    public void push(String dato){
        if(tope<tam-1){
            tope++;
            pila[tope]=dato;
        }else{
            System.out.println("Desbordamiento");
        }
    }
    
    public String pop(){
        String resultado="";
        if(tope>-1){
            resultado=pila[tope];
            pila[tope]=null;
            tope--;
        }else{
            System.out.println("Subdesbordamiento");
        }
        return resultado;
    }
    
    public String peek(){
        String resultado="";
        if(tope>-1){
            resultado=pila[tope];
    }else{
            System.out.println("Subdesbordamiento");
        }return resultado;
        }
    
    public PilaString(Integer tamanio){
        tope=-1;
        pila=new String[tamanio];
        tam=tamanio;
    }

}
