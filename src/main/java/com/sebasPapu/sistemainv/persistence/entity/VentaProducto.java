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
    @MapsId("idVenta")
    @JoinColumn(name = "id_venta", updatable = false, insertable = false)
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_producto", updatable = false, insertable = false)
    private Producto producto;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

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
