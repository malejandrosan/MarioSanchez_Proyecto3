/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MARIO
 */
public class Impresora {
    
    private int id;
    private String marca;
    private String tipo;
    private float peso;
    
    public Impresora(){
        id = 0;
        marca = "";
        tipo = "";
        peso = 0;
    }
    
    public Impresora(int id, String marca, String tipo, float peso){
        this.id = id;
        this.marca = marca;
        this.tipo = tipo;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPeso() {
        return peso;
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "\n" + 
                "Marca: "  + marca + "\n" +
                "Tipo: " + tipo + "\n" +
                "Peso:" + peso + "";
    }
    
} // Fin de clase Impresora
