interface Imprimible {
    void imprimir();
}

interface Escaneable {
    void escanear();
}

class Impresora implements Imprimible {
    public void imprimir() {
        System.out.println("La impresora esta imprimiendo");
    }
}

class ImpresoraMultifuncional implements Imprimible, Escaneable {
    public void imprimir() {
        System.out.println("La impresora multifuncional esta imprimiendo");
    }

    public void escanear() {
        System.out.println("La impresora multifuncional esta escaneando");
    }
}

public class ejercicio4 {
    public static void main(String[] args) {
        Impresora impresora = new Impresora();
        ImpresoraMultifuncional multifuncional = new ImpresoraMultifuncional();

        impresora.imprimir();
        multifuncional.imprimir();
        multifuncional.escanear();
    }
}