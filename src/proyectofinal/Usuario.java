/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author yesse
 */
public class Usuario {
   private int idUsuario;
    private String nombres;
    private String usuario;
    private String contrasenia;
    private String rol;
    private boolean estado;

    public Usuario(int idUsuario,
            String nombres,
            String usuario,
            String contrasenia,
            String rol) {

        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.estado = true;
    }

    public boolean validarAcceso(String user,
            String pass) {

        return usuario.equals(user)
                && contrasenia.equals(pass)
                && estado == true;
    }

    public void desactivarUsuario() {

        estado = false;
    }

    public void verDatos() {

       System.out.println(
                idUsuario + " "
                + nombres + " "
                + rol);

    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getRol() {
        return rol;
    }

    public boolean isEstado() {
        return estado;
    }
}
