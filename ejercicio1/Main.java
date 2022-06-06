public class Main {
    public static void main(String[] args) {
        Pila mio1 = new Pila();
        Pila mio2 = new Pila();
        Pila mio3 = new Pila();
        int[] valores1 = { 1, 1, 1, 2, 3 };
        int[] valores2 = { 2, 3, 4 };
        int[] valores3 = { 1, 4, 1, 1 };

        ingresarDatos(mio1, valores1);
        ingresarDatos(mio2, valores2);
        ingresarDatos(mio3, valores3);
        System.out.println("La respuesta es: " + equalStacks(mio1, mio2, mio3));

    }

    public static void ingresarDatos(Pila p, int[] n) {
        for (int i = 0; i < n.length; i++) {
            p.insertarNode(n[i]);
        }
    }

    public static int equalStacks(Pila p1, Pila p2, Pila p3) {
        int min = Math.min(Math.min(p1.Altura(), p2.Altura()), p3.Altura());
        boolean activate = true;
        boolean marcador;
        while (activate != false) {
            if (p1.Altura() == min && p2.Altura() == min && p3.Altura() == min)
                break;
            marcador = false;
            if (p1.Altura() == min) {
                while (p2.Altura() > min && !(p2.Altura() == min)) {
                    p2.eliminarNode();
                    if (p2.Altura() == min) {
                        break;
                    } else if (p2.Altura() < min) {
                        min = p2.Altura();
                        marcador = true;
                        break;
                    }
                }
                if (marcador == true)
                    continue;
                while (p3.Altura() > min && !(p3.Altura() == min)) {
                    p3.eliminarNode();
                    if (p3.Altura() == min) {
                        break;
                    } else if (p3.Altura() < min) {
                        min = p3.Altura();
                        break;
                    }
                }
            } else if (p2.Altura() == min) {
                while (p1.Altura() > min && !(p1.Altura() == min)) {
                    p1.eliminarNode();
                    if (p1.Altura() == min) {
                        break;
                    } else if (p1.Altura() < min) {
                        min = p1.Altura();
                        marcador = true;
                        break;
                    }
                }
                if (marcador == true)
                    continue;
                while (p3.Altura() > min && !(p3.Altura() == min)) {
                    p3.eliminarNode();
                    if (p3.Altura() == min) {
                        break;
                    } else if (p3.Altura() < min) {
                        min = p3.Altura();
                        break;
                    }
                }
            } else {
                while (p1.Altura() > min && !(p1.Altura() == min)) {
                    p1.eliminarNode();
                    if (p1.Altura() == min) {
                        break;
                    } else if (p1.Altura() < min) {
                        min = p1.Altura();
                        marcador = true;
                        break;
                    }
                }
                if (marcador == true)
                    continue;
                while (p2.Altura() > min && !(p2.Altura() == min)) {
                    p2.eliminarNode();
                    if (p2.Altura() == min) {
                        break;
                    } else if (p2.Altura() < min) {
                        min = p2.Altura();
                        break;
                    }
                }
            }
        }
        return min;
    }
}