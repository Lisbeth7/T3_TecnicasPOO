/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author yesse
 */
public class Caja {
    private double montoInicial;
    private double ingresos;
    private double egresos;
    private double ventasEfectivo;

    public Caja() {
        montoInicial = 0;
        ingresos = 0;
        egresos = 0;
        ventasEfectivo = 0;
    }

    public boolean abrirCaja(double monto) {

        if (monto <= 0) {

            System.out.println("Mensaje: monto inicial inválido");
            return false;
        }
        montoInicial = monto;
        return true;
    }

    public boolean registrarEgreso(double monto) {

        if (monto > calcularSaldoActual()) {

            System.out.println("Mensaje: saldo insuficiente");

            return false;
        }

        egresos += monto;
        return true;
    }

    public void registrarIngreso(
            double monto) {

        ingresos += monto;
    }

    public void registrarVenta(
            double monto) {

        ventasEfectivo += monto;
    }

    public double calcularSaldoActual() {

        return montoInicial
                + ingresos
                + ventasEfectivo
                - egresos;
    }

    public double calcularCierre() {

        return montoInicial
                + ventasEfectivo
                + ingresos
                - egresos;
    }

    public void verDatos() {

       System.out.println(
                "SALDO CAJA: "
                + calcularSaldoActual());

    }
}
