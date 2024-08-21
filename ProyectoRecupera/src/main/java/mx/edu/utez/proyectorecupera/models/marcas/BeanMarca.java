package mx.edu.utez.proyectorecupera.models.marcas;

public class BeanMarca {
    private Long id ;
    private String nombre;
    private String fechaCreacion;

    public BeanMarca() {
    }

    public BeanMarca(Long id, String nombre, String fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
