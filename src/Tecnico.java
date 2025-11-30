public class Tecnico extends Usuario{
    private String especialidad;
   public Tecnico(String especialidad) {
        this.especialidad = especialidad;
    }

    public Tecnico(String usuarioId, String nombre, String rol, String especialidad) {
        super(usuarioId, nombre, rol);
        this.especialidad = especialidad;
    }
    public String getEspecialidad (){
       return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Tecnico tiene de " +
                "especialidad='" + especialidad + '\'' +
                '}';
    }
}
