/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author yesse
 */
public class Cliente {
    private int idCliente;
    private String documento;
    private String nombres;
    private String telefono;
    private String direccion;

    public Cliente(int idCliente,
            String documento,
            String nombres,
            String telefono,
            String direccion) {

        this.idCliente = idCliente;
        this.documento = documento;
        this.nombres = nombres;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public boolean validarDocumento() {

        if (documento.matches("\\d{8}")) {
            return true;
        }

        if (documento.matches("\\d{11}")) {
            return true;
        }

        return false;
    }

    public void verDatos() {

        System.out.println(
                documento + " "
                + nombres);

    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getIdCliente() {
        return idCliente;
    }

}
