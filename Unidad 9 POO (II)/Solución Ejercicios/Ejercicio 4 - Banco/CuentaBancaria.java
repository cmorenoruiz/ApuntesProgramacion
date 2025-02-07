
abstract public class CuentaBancaria {

    // Atributos
    private final String iban;
    private double saldo;
    public static final double interesAnualBasico = 2.5;

    // constructor
    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    // Método abstracto para calcular intereses
    public abstract void calcularIntereses();

    // Método abstracto para mostrar datos de la cuenta
    public abstract void mostrar();

    // GETTERS
    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    // Añadir cantidad (método privado usado por ingresar y retirar)
    private void añadir(double cantidad) {
        this.saldo += cantidad;
    }

    // Ingresar cantidad
    public void ingresar(double cantidad) {
        añadir(cantidad);
    }

    // Retirar cantidad
    public void retirar(double cantidad) {
        añadir(-cantidad);
    }

    // Traspasamoa 'cantidad' de esta cuenta a cc
    public boolean traspaso(double cantidad, CuentaBancaria cb) {
        cantidad=Math.abs(cantidad);
        if (this.getSaldo() > cantidad) {//comprobamos tener suficiente saldo
            cb.ingresar(cantidad);
            this.retirar(cantidad);
            return true;
        } else {
            return false;
        }
    }

}
