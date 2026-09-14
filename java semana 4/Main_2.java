public class Main_2 {

    public static void main(String[] args) {

        Calculadora_2 calculadora = new Calculadora_2();

        try {
            System.out.println("Suma: " +
                    calculadora.sumar(10, 5));

            System.out.println("Resta: " +
                    calculadora.restar(10, 5));

            System.out.println("Multiplicación: " +
                    calculadora.multiplicar(10, 5));

            System.out.println("División: " +
                    calculadora.dividir(10, 0));

        } catch (IllegalArgumentException e) {
            System.out.println("Error de argumento: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        }
    }
}