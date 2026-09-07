abstract class Vehiculo {
    public abstract void acelerar();
}

class Coche extends Vehiculo {
    public void acelerar() {
        System.out.println("El coche acelera usando el motor");
    }
}

class Bicicleta extends Vehiculo {
    public void acelerar() {
        System.out.println("La bicicleta acelera pedaleando");
    }
}

public class ejercicio3 {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Coche();
        Vehiculo vehiculo2 = new Bicicleta();

        vehiculo1.acelerar();
        vehiculo2.acelerar();
    }
}