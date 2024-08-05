/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MARIO
 */
public class Nodo {
    
    private Impresora dato;
    private Nodo hijoDerecho;
    private Nodo hijoIzquierdo;
    
    public Nodo(Impresora impresora){
        this.dato = impresora;
        this.hijoDerecho = null;
        this.hijoIzquierdo  = null;
    }
    
    // Getters y setters
    public Impresora getDato() {
        return dato;
    }

    public void setDato(Impresora dato) {
        this.dato = dato;
    }

    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

} // Fin de la clase Nodo
