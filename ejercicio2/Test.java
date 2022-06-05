public class Test {
   public static void main(String[] args){
       Pila<Integer> pila = new Pila<Integer>();
       System.out.println(pila);
       System.out.println("Esta vacia: "+pila.empty());
       pila.push(3);
       System.out.println(pila);
       pila.push(5);
       System.out.println(pila);
   } 
}
