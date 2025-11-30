import java.util.*;
public class Incidencia {
    private String folio;
    private String descripcion;
    private Date fecha;
    private String equipoAfectado;
    private TipoIncidencia tipoIncidencia;
    private Prioridad prioridad;
    private EstadoIncidencia estado;
    private Tecnico tecnicoAsignado;

    public Incidencia(String folio, String descripcion, Date fecha, String equipoAfectado, TipoIncidencia tipoIncidencia, Prioridad prioridad, EstadoIncidencia estado) {
        this.folio = folio;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.equipoAfectado = equipoAfectado;
        this.tipoIncidencia = tipoIncidencia;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    public String getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public TipoIncidencia getTipoIncidencia() {
        return tipoIncidencia;
    }

    public String getEquipoAfectado() {
        return equipoAfectado;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public EstadoIncidencia getEstado() {
        return estado;
    }

    public Tecnico getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEquipoAfectado(String equipoAfectado) {
        this.equipoAfectado = equipoAfectado;
    }

    public void setTipoIncidencia(TipoIncidencia tipoIncidencia) {
        this.tipoIncidencia = tipoIncidencia;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstado(EstadoIncidencia estado) {
        this.estado = estado;
    }

    public void setTecnicoAsignado(Tecnico tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }

    @Override
    public String toString() {
        return "Incidencia:" +
                "folio='" + folio + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", equipoAfectado='" + equipoAfectado + '\'' +
                ", tipoIncidencia=" + tipoIncidencia +
                ", prioridad=" + prioridad +
                ", estado=" + estado +
                ", tecnicoAsignado=" +(tecnicoAsignado !=null ? tecnicoAsignado.getNombre() : "Sin asignar");

    }
}
