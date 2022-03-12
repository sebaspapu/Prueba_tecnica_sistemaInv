package com.sebasPapu.sistemainv.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = )
public class VentaProducto {

    private VentaProductoPK id;
    private Integer cantidad;
    private Double total;

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
