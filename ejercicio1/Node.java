public class Node<T> {
	// "T" es el tipo de dato genérico
	T data;
	Node nextNode;

	// constructor de "Node"
	public Node(T valor) {
		data = valor;
		nextNode = null;
	}

	public Node() {
		data = null;
		nextNode = null;
	}

	// Me enlaza con el nodo que le damos como parámetro
	public void enlazarSiguiente(Node n) {
		nextNode = n;
	}

	// Me regresa la referencia al "nextNode"
	public Node obtenerSiguiente() {
		return nextNode;
	}

	// Me devuelve el valor("data") del nodo
	public T obtenerValor() {
		return data;
	}
}