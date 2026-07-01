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
    private String nrodocumento;
    private String TipoDocumento;
    private String nombres;
    private String apellidomaterno;
    private String apellidopaterno;
    private String telefono;
    private String direccion;
    private String Correo;

    public Cliente(int idCliente,
            String nrodocumento,String TipoDocumento,
            String nombres,String telefono,
            String direccion,
            String apellidomaterno,
            String apellidopaterno,
            String Correo) {

        this.idCliente = idCliente;
        this.nrodocumento = nrodocumento;
        this.TipoDocumento = TipoDocumento;
        this.nombres = nombres;
        this.apellidomaterno = apellidomaterno;
        this.apellidopaterno = apellidopaterno;
        this.telefono = telefono;
        this.direccion = direccion;
        this.Correo = Correo;
    }
    
     // VALIDACIÓN DNI / RUC SEGÚN TIPO
    public boolean validarDocumento() {

        if (TipoDocumento.equalsIgnoreCase("DNI")) {
            return nrodocumento.matches("\\d{8}");
        }

        if (TipoDocumento.equalsIgnoreCase("RUC")) {
            return nrodocumento.matches("\\d{11}");
        }

        return false;
    }
    
    // VALIDAR NOMBRES
    public boolean validarNombre() {

           return nombres != null &&
           nombres.matches("[A-Za-zÁÉÍÓÚáéíóúÑñ ]{2,50}");
    }

     // VALIDAR APELLIDO PATERNO
    public boolean validarApellidoPaterno() {

           return apellidopaterno != null &&
           apellidopaterno.matches("[A-Za-zÁÉÍÓÚáéíóúÑñ ]{2,50}");

    }
    // VALIDAR APELLIDO MATERNO
    public boolean validarApellidoMaterno() {

           return apellidomaterno != null &&
           apellidomaterno.matches("[A-Za-zÁÉÍÓÚáéíóúÑñ ]{2,50}");

    }
     
    public void verDatos() {
        System.out.println(
                nrodocumento + " | " +
                TipoDocumento + " | " +
                nombres + " " +
                apellidopaterno + " " +
                apellidomaterno
        );
    }
    
    

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNrodocumento() {
        return nrodocumento;
    }

    public void setNrodocumento(String nrodocumento) {
        this.nrodocumento = nrodocumento;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
}
