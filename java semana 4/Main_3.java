public class Main_3 {
    public static void main(String[] args) {
        Numero_3 numero = new Numero_3();
        try {
            numero.setValor(-10.5);
            System.out.println("Valor establecido: " + numero.getValor());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            numero.setValor(25.5);
            System.out.println("Valor establecido: " + numero.getValor());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
