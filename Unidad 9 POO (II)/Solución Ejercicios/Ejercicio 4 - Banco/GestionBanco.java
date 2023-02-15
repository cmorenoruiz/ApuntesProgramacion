/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class GestionBanco {

    public static void main(String arg[]) {

        // Creamos una cuenta corriente y otra de ahorro
        CuentaCorriente cc = new CuentaCorriente("ES6256465847", 1000);
        CuentaAhorro ca = new CuentaAhorro("ES9956415656", 3000);

        // Mostramos datos de las cuentas
        System.out.println("Valores iniciales");
        cc.mostrar();
        ca.mostrar();
        System.out.println("");

        // Ingresamos, retiramos y mostramos
        System.out.println("Ingresamos 1000 en cc, retiramos 500 de ca y mostramos");
        cc.ingresar(1000);
        ca.retirar(500);
        cc.mostrar();
        ca.mostrar();
        System.out.println("");

        // Traspasamos 1000 de cc a ca y mostramos
        System.out.println("Pudo hacerse el traspaso de 1000 desde cc hacia ca: " + cc.traspaso(1000, ca));
        cc.mostrar();
        ca.mostrar();
        System.out.println("");

        // Calculamos intereses y mostramos
        System.out.println(" Calculamos intereses y mostramos");
        cc.calcularIntereses();
        ca.calcularIntereses();
        cc.mostrar();
        ca.mostrar();
        System.out.println("");

        System.out.println("Pudo hacerse el traspaso de 20000 desde cc hacia ca: " + cc.traspaso(20000, ca));
        cc.mostrar();
        ca.mostrar();
        System.out.println("");

        System.out.println("Mostrar usando variables CuentaBancaria");
        CuentaBancaria cuentaB1, cuentaB2;
        cuentaB1 = cc;
        cuentaB2 = ca;
        cuentaB1.mostrar();
        cuentaB2.mostrar();
    }
}
