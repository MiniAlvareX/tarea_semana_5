abstract class Forma {
    public abstract void dibujar();
}

class Circulo extends Forma {
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }
}

class Rectangulo extends Forma {
    public void dibujar() {
        System.out.println("Dibujando un rectangulo");
    }
}

class Triangulo extends Forma {
    public void dibujar() {
        System.out.println("Dibujando un triangulo");
    }
}

public class ejercicio2 {
    public static void main(String[] args) {
        Forma circulo = new Circulo();
        Forma rectangulo = new Rectangulo();
        Forma triangulo = new Triangulo();

        circulo.dibujar();
        rectangulo.dibujar();
        triangulo.dibujar();
    }
}