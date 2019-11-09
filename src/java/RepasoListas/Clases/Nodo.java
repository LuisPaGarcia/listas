
package RepasoListas.Clases;


public class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente;
    
    public Nodo(T data, Nodo<T> siguiente){
        dato=data;
        this.siguiente=null;
    }

    public Nodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
