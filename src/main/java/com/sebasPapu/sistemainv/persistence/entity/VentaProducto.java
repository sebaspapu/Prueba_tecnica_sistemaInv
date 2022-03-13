package com.sebasPapu.sistemainv.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "ventas_productos")
public class VentaProducto {

    @EmbeddedId
    private VentaProductoPK id;
    private Integer cantidad;
    private Double total;


    @ManyToOne
    @JoinColumn(name = "id_venta", updatable = false, insertable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_producto", updatable = false, insertable = false)
    private Venta venta;


    public VentaProductoPK getId() {
        return id;
    }

    public void setId(VentaProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
