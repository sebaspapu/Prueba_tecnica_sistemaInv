package com.sebasPapu.sistemainv.persistence.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "ventas")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id_venta")
    private Integer idVenta;
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "id_vendedor")
    private Integer idVendedor;
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id_cliente", updatable = false, insertable = false)
    private Cliente cliente;

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   
}
