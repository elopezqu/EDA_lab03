public class Node <T>{
	//"T" es el tipo de dato genérico 
	T data;
	Node <T> nextNode;
	//constructor de "Node"
	public Node(T valor){
		data=valor;
	}
	//Me enlaza con el nodo que le damos como parámetro
	public void enlazarSiguiente(Node<T> n) {
		nextNode = n;
	}
	//Me regresa la referencia al "nextNode"
	public Node <T>obtenerSiguiente() {
		return nextNode;
	}
	//Me devuelve el valor("data") del nodo
	public T obtenerValor() {
		return data;
	}
}
