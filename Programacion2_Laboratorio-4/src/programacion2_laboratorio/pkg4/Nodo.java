/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio.pkg4;

/**
 *
 * @author euced
 */
public class Nodo {
    private Object valor;
    private Nodo siguiente;

    public Nodo(Object valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public Nodo() {
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "valor=" + valor + ", siguiente=" + siguiente + '}';
    }
    
    
    
}
