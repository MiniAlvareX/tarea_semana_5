public class Main {
    public static void main(String[] args) {

        Contenedor<String, Integer> contenedor = new Contenedor<>();

        contenedor.agregarPar("Juan", 20);
        contenedor.agregarPar("Maria", 22);
        contenedor.agregarPar("Pedro", 19);
        contenedor.agregarPar("Ana", 21);

        System.out.println("Todos los pares:");
        contenedor.mostrarPares();

        System.out.println("\nPar en la posición 1:");
        System.out.println(contenedor.obtenerPar(1));

        System.out.println("\nLista completa:");
        System.out.println(contenedor.obtenerTodosLosPares());
    }
}