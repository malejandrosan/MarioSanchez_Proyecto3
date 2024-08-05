/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MARIO
 */
public class ArbolBinario {
    
    public Nodo raiz;
    
    public ArbolBinario(){
        raiz = null;
    }
    
    public boolean estaArbolVacio(){
        return raiz == null;
    }
    
    public void insertarNodo(Impresora dato){
        Nodo nuevo = new Nodo(dato);
        
        if (estaArbolVacio()){
            raiz = nuevo;
        }

        
    }
    
    
    
}