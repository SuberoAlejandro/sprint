package com.tono.tablet.dao;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class Entityx implements Serializable {

    private static final long serialVersionUID = 5661173417022935649L;

    private Long id;
    private Long instanciaProceso;
    private String proceso;
    private Long legajoAsignado;
    private Date fechaAsignacion;
    private String mailTo;
    private String data;
    private Long idNotificacion;
    private Long idConfiguracion;
    private Date fechaEnvio;
    private Long idTemplate;
    private Integer plazoDias;
    private String asuntoMail;
    private String mailFron;


    public Entityx() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInstanciaProceso() {
        return instanciaProceso;
    }

    public void setInstanciaProceso(Long instanciaProceso) {
        this.instanciaProceso = instanciaProceso;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public Long getLegajoAsignado() {
        return legajoAsignado;
    }

    public void setLegajoAsignado(Long legajoAsignado) {
        this.legajoAsignado = legajoAsignado;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(Long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Long getIdConfiguracion() {
        return idConfiguracion;
    }

    public void setIdConfiguracion(Long idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Long getIdTemplate() {
        return idTemplate;
    }

    public void setIdTemplate(Long idTemplate) {
        this.idTemplate = idTemplate;
    }

    public Integer getPlazoDias() {
        return plazoDias;
    }

    public void setPlazoDias(Integer plazoDias) {
        this.plazoDias = plazoDias;
    }

    public String getAsuntoMail() {
        return asuntoMail;
    }

    public void setAsuntoMail(String asuntoMail) {
        this.asuntoMail = asuntoMail;
    }

    public String getMailFron() {
        return mailFron;
    }

    public void setMailFron(String mailFron) {
        this.mailFron = mailFron;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entityx entityx = (Entityx) o;
        return Objects.equals(id, entityx.id) && Objects.equals(instanciaProceso, entityx.instanciaProceso) && Objects.equals(proceso, entityx.proceso) && Objects.equals(legajoAsignado, entityx.legajoAsignado) && Objects.equals(fechaAsignacion, entityx.fechaAsignacion) && Objects.equals(mailTo, entityx.mailTo) && Objects.equals(data, entityx.data) && Objects.equals(idNotificacion, entityx.idNotificacion) && Objects.equals(idConfiguracion, entityx.idConfiguracion) && Objects.equals(fechaEnvio, entityx.fechaEnvio) && Objects.equals(idTemplate, entityx.idTemplate) && Objects.equals(plazoDias, entityx.plazoDias) && Objects.equals(asuntoMail, entityx.asuntoMail) && Objects.equals(mailFron, entityx.mailFron);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instanciaProceso, proceso, legajoAsignado, fechaAsignacion, mailTo, data, idNotificacion, idConfiguracion, fechaEnvio, idTemplate, plazoDias, asuntoMail, mailFron);
    }
}
