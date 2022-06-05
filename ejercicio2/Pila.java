public class Pila<T>{
    private Node<T> top ;
    
    public Pila(){
        this.top = null;
    }
    public boolean empty(){
        return this.top == null;
    } 
    public T peek(){
        return this.top.obtenerValor();
    }
    public T pop(){
        T ultimo = this.top.obtenerValor();
        top = this.top.obtenerSiguiente();
        return ultimo;
    }
    public void push(T dato){
        Node<T> nuevo = new Node<T>(dato);
        nuevo.enlazarSiguiente(top);
        top = nuevo;
    }
}