/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author yesse
 */
public class Proveedor {
    private int idProveedor;
    private String ruc;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;

    public Proveedor(int idProveedor,
                     String nombre, String telefono,
                     String ruc,
                     String correo,
                     String direccion) {
        
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ruc = ruc;
        this.correo = correo;
        this.direccion = direccion;
        
    }    
    // VALIDAR RUC
    public boolean validarRuc() {
        return ruc != null && ruc.matches("\\d{11}");
    }
    // VALIDAR NOMBRE
    public boolean validarNombre() {
        return nombre != null &&
           nombre.matches("[A-Za-zÁÉÍÓÚáéíóúÑñ ]{3,60}");
    }
    // VALIDAR TELÉFONO
    public boolean validarTelefono() {
        return telefono != null &&
           telefono.matches("\\d{9}");
    }
    // VALIDAR CORREO
    public boolean validarCorreo() {
        return correo != null &&
           correo.matches("^[A-Za-z0-9._%+-]+@gmail\\.com$");
    }
    // VALIDAR DIRECCIÓN
    public boolean validarDireccion() {
        return direccion != null &&
           direccion.trim().length() >= 5;
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void verDatos() {
        System.out.println(
            idProveedor + " | " +  ruc + " | " +
            nombre + " | " +
            telefono + " | " +
            correo + " | " +
            direccion
   );
   }
    
   @Override
   public String toString() {
    return nombre;
   }
}
