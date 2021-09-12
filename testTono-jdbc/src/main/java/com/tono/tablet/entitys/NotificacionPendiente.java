
/*
Create on Fri Sep 10 20:36:43 ART 2021
*Copyright (C) 121.
@author ALE
@author ale
@author ANACODE AND IVANCODE
@since 1.7
@version1.0.0.0
@version  %I%, %G%
*<p>Description: test of tono </p>
*/

package com.tono.tablet.entitys;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

import java.util.Date;


@Entity
@Table(name = "notificacionpendiente")
public class NotificacionPendiente implements Serializable {

    private static final long serialVersionUID = 9007440762930849076L;

    @Id
    @GeneratedValue(generator = "sequence_mat_id_generator")
    @SequenceGenerator(name = "sequence_mat_id_generator", initialValue = 25, allocationSize = 1000)
    @Column(name = "id", updatable = true, nullable = false, length = 25)
    private Long id;


    @Column(name = "ID_INSTANCIA_PROCESO", updatable = true, nullable = true, length = 200)
    private Long instanciaProceso;


    @Column(name = "PROCESO", updatable = true, nullable = true, length = 200)
    private String proceso;


    @Column(name = "legajoAsignado", updatable = true, nullable = true, length = 200)
    private Long legajoAsignado;


    @Column(name = "fechaAsignacion", updatable = true, nullable = true, length = 200)
    private Date fechaAsignacion;


    @Column(name = "mailTo", updatable = true, nullable = true, length = 200)
    private String mailTo;


    @Column(name = "DATA", updatable = true, nullable = true, length = 200)
    private String data;


    @Column(name = "envios", updatable = true, nullable = true, length = 200)
    private Integer envios;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInstanciaproceso() {
        return instanciaProceso;
    }

    public void setInstanciaproceso(Long instanciaProceso) {
        this.instanciaProceso = instanciaProceso;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public Long getLegajoasignado() {
        return legajoAsignado;
    }

    public void setLegajoasignado(Long legajoAsignado) {
        this.legajoAsignado = legajoAsignado;
    }

    public Date getFechaasignacion() {
        return fechaAsignacion;
    }

    public void setFechaasignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getMailto() {
        return mailTo;
    }

    public void setMailto(String mailTo) {
        this.mailTo = mailTo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getEnvios() {
        return envios;
    }

    public void setEnvios(Integer envios) {
        this.envios = envios;
    }

    public boolean equalsNotificacionPendiente(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificacionPendiente notificacionpendiente = (NotificacionPendiente) o;
        return Objects.equals(id, notificacionpendiente.id) ||
                Objects.equals(instanciaProceso, notificacionpendiente.instanciaProceso) ||
                Objects.equals(proceso, notificacionpendiente.proceso) ||
                Objects.equals(legajoAsignado, notificacionpendiente.legajoAsignado) ||
                Objects.equals(fechaAsignacion, notificacionpendiente.fechaAsignacion) ||
                Objects.equals(mailTo, notificacionpendiente.mailTo) ||
                Objects.equals(data, notificacionpendiente.data) ||
                Objects.equals(envios, notificacionpendiente.envios);
    }
}
 /*
 Copyright (C) 2008 Google Inc.
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

