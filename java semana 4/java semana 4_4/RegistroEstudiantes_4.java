import java.util.NoSuchElementException;
public class RegistroEstudiantes_4 {
    private String[] estudiantes;
    private int cantidad;
    public RegistroEstudiantes_4(int capacidad) {
        estudiantes = new String[capacidad];
        cantidad = 0;
    }
    public void agregarEstudiante(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "El nombre no puede ser nulo o vacío."
            );
        }
        if (cantidad >= estudiantes.length) {
            throw new IllegalArgumentException(
                "El arreglo está lleno."
            );
        }
        estudiantes[cantidad] = nombre;
        cantidad++;
    }
    public String buscarEstudiante(String nombre) {
        for (int i = 0; i < cantidad; i++) {
            if (estudiantes[i].equalsIgnoreCase(nombre)) {
                return estudiantes[i];
            }
        }

        throw new NoSuchElementException(
            "El estudiante no se encuentra en el registro."
        );
    }
}
