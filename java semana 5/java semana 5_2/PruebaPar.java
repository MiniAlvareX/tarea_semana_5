public class PruebaPar {

    public static void main(String[] args) {

        Par<String, Integer> par1 = new Par<>("Juan", 20);
        Par<String, Integer> par2 = new Par<>("Juan", 20);
        Par<String, Integer> par3 = new Par<>("Pedro", 25);

        System.out.println(par1);
        System.out.println(par2);
        System.out.println(par3);

        System.out.println("¿Par 1 y Par 2 son iguales?");
        System.out.println(par1.esIgual(par2));

        System.out.println("¿Par 1 y Par 3 son iguales?");
        System.out.println(par1.esIgual(par3));
    }
}