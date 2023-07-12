package rocketteam.java.empresaclase13;

public class Revision {
    private int identificador;
    private String nombreRevision;
    private String detalle;
    private int estado;

    public Revision() {
    }

    public Revision(int identificador, String nombreRevision, String detalle, int estado) {
        this.identificador = identificador;
        this.nombreRevision = nombreRevision;
        this.detalle = detalle;
        this.estado = estado;
    }

    public int getIdentificador() {return identificador;}

    public void setIdentificador(int identificador) {this.identificador = identificador;}

    public String getNombreRevision() {return nombreRevision;}

    public void setNombreRevision(String nombreRevision) {this.nombreRevision = nombreRevision;}

    public String getDetalle() {return detalle;}

    public void setDetalle(String detalle) {this.detalle = detalle;}

    public int getEstado() {return estado;}

    public void setEstado(int estado) {this.estado = estado;}



    @Override
    public String toString() {
        return "Revision{" +
                "identificador=" + identificador +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }


}