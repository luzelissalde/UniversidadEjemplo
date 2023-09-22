/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadejemplo.Entidades;

/**
 *
 * @author USURIO
 */
public class Login {
    private int idLogin;
    private String usuario;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private String mail;
    private String pregunta;

    public Login() {
    }

    public Login(int idLogin, String usuario, String contraseña, String nombre, String contrasenia, String mail, String pregunta) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.contrasenia = contraseña;
        this.nombre = nombre;
        this.apellido = contrasenia;
        this.mail = mail;
        this.pregunta = pregunta;
    }

    public Login(String usuario, String contraseña, String nombre, String contrasenia, String mail, String pregunta) {
        this.usuario = usuario;
        this.contrasenia = contraseña;
        this.nombre = nombre;
        this.apellido = contrasenia;
        this.mail = mail;
        this.pregunta = pregunta;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public String toString() {
        return "Login{" + "idLogin=" + idLogin + ", usuario=" + usuario + ", contrase\u00f1a=" + contrasenia + ", nombre=" + nombre + ", contrasenia=" + apellido + ", mail=" + mail + ", pregunta=" + pregunta + '}';
    }

    

    
}
