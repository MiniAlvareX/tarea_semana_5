import java.io.IOException;

public class ProcesadorCaracteres_1 {

    private LeerEntrada_1 entrada;

    public ProcesadorCaracteres_1() {
        entrada = new LeerEntrada_1(System.in);
    }

    public void procesar() throws IOException, 
            ExcepcionVocal_1,
            ExcepcionNumero_1,
            ExcepcionBlanco_1,
            ExcepcionSalida_1 {
        char caracter = entrada.getChar();
        System.out.println("Carácter leído: " + caracter);
        if (caracter == 'x' || caracter == 'X') {
            throw new ExcepcionSalida_1();
        }
        if ("aeiouAEIOU".indexOf(caracter) != -1) {
            throw new ExcepcionVocal_1();
        }
        if (Character.isDigit(caracter)) {
            throw new ExcepcionNumero_1();
        }
        if (Character.isWhitespace(caracter)) {
            throw new ExcepcionBlanco_1();
        }

        System.out.println("Carácter válido.");
    }

    public static void main(String[] args) {

        ProcesadorCaracteres_1 programa = new ProcesadorCaracteres_1();

        boolean continuar = true;

        while (continuar) {

            try {

                System.out.print("Ingrese un carácter (X para salir): ");

                programa.procesar();

            } catch (ExcepcionVocal_1 e) {

                System.out.println(e.getMessage());

            } catch (ExcepcionNumero_1 e) {

                System.out.println(e.getMessage());

            } catch (ExcepcionBlanco_1 e) {

                System.out.println(e.getMessage());

            } catch (ExcepcionSalida_1 e) {

                System.out.println(e.getMessage());
                continuar = false;

            } catch (IOException e) {

                System.out.println("Error al leer el carácter.");
                continuar = false;
            }
        }

        System.out.println("Programa finalizado.");
    }
}