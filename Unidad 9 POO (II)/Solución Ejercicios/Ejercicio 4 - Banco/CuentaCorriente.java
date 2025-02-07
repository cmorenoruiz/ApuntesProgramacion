


public class CuentaCorriente extends CuentaBancaria {

    // Constructor
    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    // Calcula intereses y los ingresa en la cuenta
    public void calcularIntereses() {
        double interes = this.getSaldo() * (interesAnualBasico / 100);
        this.ingresar(interes);
    }

    public void mostrar() {
        System.out.println("Cuenta Corriente IBAN: " + this.getIban() + " Saldo: " + this.getSaldo());
    }

}
