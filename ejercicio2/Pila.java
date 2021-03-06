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
        nuevo.enlazarSiguiente(this.top);
        this.top = nuevo;
    }
    public int search(T dato){
        int total = 0;
        Node<T> aux= this.top; 
        while(aux != null ){
            aux = aux.obtenerSiguiente();
            total++;
        }
        aux = this.top;
        System.out.println("total: "+total);
        int num = total;
        while(aux != null && !aux.obtenerValor().equals(dato)){
            num--;
            aux = aux.obtenerSiguiente();
        }
        System.out.println("num: "+num);
        if (aux != null) {
            return num;
        } else {
            return -1;
        }
    }

    public String toString() {
        String text = "";
        Node<T> aux = this.top;
        while (aux != null) {
            text = aux.obtenerValor().toString() + " " + text;
            aux = aux.obtenerSiguiente();
        }
        return "{ " + text + "}";
    }
}