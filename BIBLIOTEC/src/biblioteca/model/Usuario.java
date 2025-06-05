package src.biblioteca.model;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String matricula;
    private String tipo;

    public Usuario(int idUsuario, String nombre, String matricula, String tipo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.matricula = matricula;
        this.tipo = tipo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTipo() {
        return tipo;
    }
}
