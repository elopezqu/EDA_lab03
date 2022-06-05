public class Test {
   public static void main(String[] args){
       Pila<Integer> pila = new Pila<Integer>();
       System.out.println(pila);
       System.out.println("Esta vacia: "+pila.empty());
       pila.push(3);
       System.out.println(pila);
       pila.push(5);
       System.out.println(pila);
       pila.push(6);
       System.out.println(pila);
       pila.pop();
       System.out.println(pila);
       System.out.println("Ultimo elemento: "+pila.peek());
       System.out.println("Posicion del numero: "+pila.search(3));
   }
}
