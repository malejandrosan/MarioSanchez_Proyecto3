/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MARIO
 */
public class Arbol {
    
    // Clase interna del nodo
    public static class Nodo {
        
        private Impresora dato;
        private Nodo derecha;
        private Nodo izquierda;
        
        // Buen recurso https://parzibyte.me/blog/2020/05/08/arbol-binario-java/
        public Nodo(Impresora impresora){
            this.derecha = null;
            this.izquierda = null;
            this.dato = impresora;
        }

        public Impresora getDato() {
            return dato;
        }

        public Nodo getDerecha() {
            return derecha;
        }

        public Nodo getIzquierda() {
            return izquierda;
        }  
    } // Fin de clase interna Nodo
    
    
    
    
    
    
    
    
    
}
