public class Par<F, S> {

    private F primero;
    private S segundo;

    public Par(F primero, S segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public F getPrimero() {
        return primero;
    }

    public S getSegundo() {
        return segundo;
    }

    public void setPrimero(F primero) {
        this.primero = primero;
    }

    public void setSegundo(S segundo) {
        this.segundo = segundo;
    }

    public boolean esIgual(Par<F, S> otroPar) {
        boolean primerIgual = primero.equals(otroPar.getPrimero());
        boolean segundoIgual = segundo.equals(otroPar.getSegundo());

        if (primerIgual && segundoIgual) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String resultado = "(Primero: " + primero + ", Segundo: " + segundo;
        return resultado;
    }
}