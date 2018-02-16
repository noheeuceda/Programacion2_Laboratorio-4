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
public class Cola {
    private int size;
    private Nodo nod;

    public Cola() {
    }

    public Cola(int size, Nodo nod) {
        this.size = 0;
        this.nod = null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo getNod() {
        return nod;
    }

    public void setNod(Nodo nod) {
        this.nod = nod;
    }

    @Override
    public String toString() {
        return "Cola{" + "size=" + size + ", nod=" + nod + '}';
    }
    
    public void Queue(){
        
    }
    public void Peek(){
        
    }
    
    
}
