public class Pila<T>{
    private Node ultValor;
    int tamano = 0;
    String Lista = "";
    public boolean pilaVacia(){ return ultValor == null; }
    public void insertarNode(){
        Node aux = new Node(n);
        aux.nextNode = ultValor;
        ultValor = aux;
        tamano = tamano + 1;
    }
    public T eliminarNode(){
        Node aux = new Node(ultValor.obtenerValor());
        ultValor = ultValor.obtenerSiguiente();
        tamano--;
        return (T)aux.obtenerValor();
    }
    public T ultimoValor(){
        return (T) ultValor.obtenerValor();
    }
    public int tamanoPila(){
        return tamano;
    }
    public int vaciarPila(){
        while(!pilaVacia()){
            eliminarNode();
        }
    }
    public void mostrarValores(){
        Node recorrido = ultValor;
        while(recorrido != null){
            Lista += recorrido.obtenerValor() + "\n";
            recorrido = recorrido.nextNode;
        }
        System.out.println(Lista);
        Lista = "";
    }
    public int Altura(){
        Node recorrido = ultValor;
        int acum = 0;
        while(recorrido != null){
            acum += (Integer)recorrido.obtenerValor();
            recorrido = recorrido.nextNode;
        }
        return acum;
    }
}