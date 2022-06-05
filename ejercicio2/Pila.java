public class Pila<T>{
    private Node<T> top ;
    
    public Pila(){
        this.top = null;
    }
    public boolean empty(){
        return this.top == null;
    } 
}