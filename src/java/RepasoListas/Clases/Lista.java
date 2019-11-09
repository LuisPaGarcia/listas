package RepasoListas.Clases;


import java.util.LinkedList;


  
public class Lista 
{ 
    public String testMethod(){
        return "Hello";
    }
    
    public void AgregarAlInicio(LinkedList list, String valor){        
        list.addFirst(valor);
    }

    public void AgregarAlFinal(LinkedList list, String valor){        
        list.addLast(valor);
    }
    
    public void Eliminar(LinkedList list, String valor){        
        list.remove(valor);
    }
} 