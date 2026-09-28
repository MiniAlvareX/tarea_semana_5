public class Main {

    public static <F, S> void imprimirPar(Par<F, S> par) {
        System.out.println("Primero: " + par.getPrimero());
        System.out.println("Segundo: " + par.getSegundo());
        System.out.println();
    }

    public static void main(String[] args) {

        Par<String, Integer> par1 = new Par<>("Edad", 19);

        Par<Double, Boolean> par2 = new Par<>(15.5, true);

        Par<Persona, Integer> par3 = new Par<>(
            new Persona("Carlos", 20),
            100
        );

        imprimirPar(par1);
        imprimirPar(par2);
        imprimirPar(par3);
    }
}