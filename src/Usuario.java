public class Usuario {
    private String usuarioId;
    private String nombre;
    private String rol;

    public Usuario(){};
    public Usuario(String usuarioId, String nombre, String rol){
        this.usuarioId= usuarioId;
        this.nombre= nombre;
        this.rol=rol;
    }
    public String getUsuario_id (){
        return usuarioId;
    }
    public void setUsuario(String usuarioId){
        this.usuarioId= usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
