package src.biblioteca.model;

import java.util.Date;

public class EntradaSalida {
    private int id;
    private int idUsuario;
    private Date fechaEntrada;
    private Date fechaSalida;

    public EntradaSalida(int id, int idUsuario, Date fechaEntrada, Date fechaSalida) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
