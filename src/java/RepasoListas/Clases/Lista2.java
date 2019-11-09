
package RepasoListas.Clases;


public class Lista2 {
    private Nodo<Integer> primero;
    private Nodo<Integer> aux;

    public Lista2() {
        this.primero = null;
        this.aux = null;
    }
    
    public String hello() {
        return "Hey";
    }
    
    
    public boolean listaVacia() {        
        return (this.primero == null);
    }
    
    public void ponerPrimero(Integer dato) {
        if(listaVacia()) {
            Nodo<Integer> nuevo = new Nodo<>(dato, null);
            primero = nuevo;                         
        }
        else {
            Nodo<Integer> nuevo = new Nodo<>(dato, null); 
            nuevo.setSiguiente(primero);
            primero = nuevo;			            
        }
    }
    
        public void ponerUltimo(Integer dato) {
        if(listaVacia()) {
            Nodo<Integer> nuevo = new Nodo<>(dato, null);
            primero = nuevo;                         
        }
        else {
            Nodo<Integer> nuevo = new Nodo<>(dato, null); 
            aux=primero;

            while(aux.getSiguiente() != null)
                    aux = aux.getSiguiente();
				
            aux.setSiguiente(nuevo);            
        }
    }
        
     public void eliminar() {        
        if(primero.getSiguiente() == null) {
            primero = null;
             
        }
        else {		 
            aux=primero;
            primero = primero.getSiguiente();			
            aux = null;             
        }         
    }     
     
    public String imprimir() {
        String str = "";
        aux = primero;
        while (aux != null){
                str = str + aux.getDato() + "->";
                aux = aux.getSiguiente();
        }
        str = str + "null";
        return str;
    }
}
