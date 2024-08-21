package mx.edu.utez.proyectorecupera.models.autos;

import mx.edu.utez.proyectorecupera.models.marcas.BeanMarca;

public class BeanAuto {
    private Long id;
    private String modelo;
    private String color;
    private String placas;
    private String tipo;
    private  String fechaCreacion;
    private boolean estado;
    private BeanMarca Idmarca;

    public BeanAuto() {
    }

    public BeanAuto(Long id, String modelo, String color, String placas, String tipo, String fechaCreacion, boolean estado, BeanMarca idmarca) {
        this.id = id;
        this.modelo = modelo;
        this.color = color;
        this.placas = placas;
        this.tipo = tipo;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        Idmarca = idmarca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public BeanMarca getIdmarca() {
        return Idmarca;
    }

    public void setIdmarca(BeanMarca idmarca) {
        Idmarca = idmarca;
    }
}
