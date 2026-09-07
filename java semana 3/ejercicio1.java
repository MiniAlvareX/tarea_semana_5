class Empleado {

    String nombre;
    double salario;
    String departamento;

    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }
}

class CalculadoraPago {

    public double calcularPagoMensual(Empleado empleado) {
        return empleado.salario;
    }
}

public class ejercicio1 {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("John", 2500, "Sistemas");

        CalculadoraPago calculadora = new CalculadoraPago();

        System.out.println("Nombre: " + empleado.nombre);
        System.out.println("Departamento: " + empleado.departamento);
        System.out.println("Pago mensual: S/ " + calculadora.calcularPagoMensual(empleado));
    }
}