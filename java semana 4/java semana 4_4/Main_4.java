import java.util.NoSuchElementException;
public class Main_4 {
    public static void main(String[] args) {
        RegistroEstudiantes_4 registro = new RegistroEstudiantes_4(5);
        try {
            registro.agregarEstudiante("Juan");
            registro.agregarEstudiante("Maria");
            registro.agregarEstudiante("Pedro");
            System.out.println(
                "Estudiantes agregados correctamente."
            );
        } catch (IllegalArgumentException e) {
            System.out.println(
                "Error al agregar: " + e.getMessage()
            );
        }
        try {
            registro.agregarEstudiante("");
        } catch (IllegalArgumentException e) {
            System.out.println(
                "Error: " + e.getMessage()
            );
        }
        try {
            String estudiante =
                    registro.buscarEstudiante("Maria");
            System.out.println(
                "Estudiante encontrado: " + estudiante
            );
        } catch (NoSuchElementException e) {
            System.out.println(
                "Error de búsqueda: " + e.getMessage()
            );
        }
        try {
            String estudiante =
                    registro.buscarEstudiante("Carlos");
            System.out.println(
                "Estudiante encontrado: " + estudiante
            );
        } catch (NoSuchElementException e) {
            System.out.println(
                "Error de búsqueda: " + e.getMessage()
            );
        }
    }
}