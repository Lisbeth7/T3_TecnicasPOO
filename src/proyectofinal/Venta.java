/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author yesse
 */
public class Venta {
    private int idVenta;
    private String fecha;
    private Cliente cliente;
   ArrayList<DetalleVenta> listaDetalles;
    private String estado;
   
    public void setFecha(String fecha) {
    this.fecha = fecha;
}
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Venta(int idVenta,
            Cliente cliente) {

         this.idVenta = idVenta;
    this.cliente = cliente;

    fecha = "PENDIENTE";

    listaDetalles = new ArrayList();

    estado = "Pendiente";
    }

    public boolean agregarDetalle(
            Producto producto,
            int cantidad) {

        if (cantidad > producto.getStock()) {

            System.out.println(
                    "Mensaje: stock insuficiente");

            return false;
        }

        DetalleVenta d =
                new DetalleVenta(
                        producto,
                        cantidad,
                        producto.getPrecio());

        listaDetalles.add(d);

        return true;
    }

    public double calcularTotal() {

        double total = 0;

        for (int i = 0;
                i < listaDetalles.size();
                i++) {

            total += listaDetalles.get(i)
                    .calcularSubtotal();
        }

        return total;
    }

    public boolean procesarPago(
            double dineroCliente) {

        double total = calcularTotal();

        if (dineroCliente < total) {

            System.out.println(
                    "Mensaje: dinero insuficiente");

            return false;
        }

        double vuelto =
                dineroCliente - total;

        System.out.println(
                "Vuelto: " + vuelto);

        actualizarStock();

        estado = "Pagado";

        return true;
    }

    public void actualizarStock() {

        for (int i = 0;
                i < listaDetalles.size();
                i++) {

            Producto p =
                    listaDetalles.get(i)
                            .getProducto();

            int cantidad =
                    listaDetalles.get(i)
                            .getCantidad();

            p.setStock(
                    p.getStock()
                    - cantidad);
        }
    }

    public void verDatos() {

        System.out.println(
                "VENTA N° "
                + idVenta
                + " TOTAL: "
                + calcularTotal()
                + " ESTADO: "
                + estado);

    }

    public ArrayList<DetalleVenta>
            getListaDetalles() {

        return listaDetalles;
    }

    public String getFecha() {
        return fecha;
    }
 
}
