public class Pila<T>{
    private Node ultValor;
    int tamano = 0;
    String Lista = "";
    public boolean pilaVacia(){}
    public void insertarNode(){}
    public T eliminarNode(){}
    public T ultimoValor(){}
    public int tamanoPila(){}
    public int vaciarPila(){}
    public void mostrarValores(){
        Node recorrido = ultValor;
        while(recorrido != null){
            Lista += recorrido.obtenerValor() + "\n";
            recorrido = recorrido.nextNode;
        }
        System.out.println(Lista);
        Lista = "";
    }
    public int Altura(){}
}