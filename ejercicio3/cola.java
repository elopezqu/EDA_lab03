
public class cola <T> {
    private Node inicioCola;
    private Node finalCola;
    T Cola ;
    
    public cola(){
        inicioCola = null;
        finalCola = null;
    }
    
    //Método para saber si la cola esta vacia
    public boolean ColaVacia(){
        if (inicioCola == null) 
            return true;
        else 
            return false;   
    }
    
    //Método para insertar a la cola
    public void Insertar(T obj){
        Node nodo = new Node(obj);
       
        if (ColaVacia()) {
            inicioCola = nodo;
            finalCola = nodo;
        } 
        else {
            finalCola.nextNode = nodo;
            finalCola = nodo;
        }
    }
    
    //Método para extraer de la cola
    public <T> Object Extraer(){
        if (!ColaVacia()) {
        	inicioCola=inicioCola.nextNode;
        	return inicioCola.data;

        }
        else {
            return null;
        }
    }
    
    //Método para mostrar el contenido de la cola
    public void MostrarContenido(){
    	Node nodo = inicioCola;
        while(nodo!=null) {
        	System.out.println(nodo.data.toString());
        	nodo=nodo.nextNode;
        }
        System.out.print("\n \n");
        
    }
}