
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


@Entity
@Table(name = "WFG_CFG_NOTIF_PENDIENTES")
public class ConfiguracionNotificacionPendiente implements Serializable {

    private static final long serialVersionUID = 6624975270878484553L;

    @Id
    @GeneratedValue(generator = "sequence_mat_id_generator")
    @SequenceGenerator(name = "sequence_mat_id_generator", initialValue = 25, allocationSize = 1000)
    @Column(name = "id", updatable = true, nullable = false, length = 25)
    private Long id;

    @Column(name = "idTemplate", updatable = true, nullable = true, length = 200)
    private Long idTemplate;

    @Column(name = "proceso", updatable = true, nullable = true, length = 200)
    private String proceso;

    @Column(name = "plazoDias", updatable = true, nullable = true, length = 200)
    private Integer plazoDias;

    @Column(name = "asuntoMail", updatable = true, nullable = true, length = 200)
    private String asuntoMail;

    @Column(name = "reintentoDiario", updatable = true, nullable = true, length = 200)
    private Integer reintentoDiario;

    @Column(name = "DESCRIPCION", updatable = true, nullable = true, length = 200)
    private String descripcion;

    @Column(name = "MAILFRON", updatable = true, nullable = true, length = 200)
    private String mailFron;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdtemplate() {
        return idTemplate;
    }

    public void setIdtemplate(Long idTemplate) {
        this.idTemplate = idTemplate;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public Integer getPlazodias() {
        return plazoDias;
    }

    public void setPlazodias(Integer plazoDias) {
        this.plazoDias = plazoDias;
    }

    public String getAsuntomail() {
        return asuntoMail;
    }

    public void setAsuntomail(String asuntoMail) {
        this.asuntoMail = asuntoMail;
    }

    public Integer getReintentodiario() {
        return reintentoDiario;
    }

    public void setReintentodiario(Integer reintentoDiario) {
        this.reintentoDiario = reintentoDiario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMailfron() {
        return mailFron;
    }

    public void setMailfron(String mailFron) {
        this.mailFron = mailFron;
    }

    public boolean equalsConfiguracionNotificacionPendiente(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfiguracionNotificacionPendiente configuracionnotificacionpendiente = (ConfiguracionNotificacionPendiente) o;
        return Objects.equals(id, configuracionnotificacionpendiente.id) ||
                Objects.equals(idTemplate, configuracionnotificacionpendiente.idTemplate) ||
                Objects.equals(proceso, configuracionnotificacionpendiente.proceso) ||
                Objects.equals(plazoDias, configuracionnotificacionpendiente.plazoDias) ||
                Objects.equals(asuntoMail, configuracionnotificacionpendiente.asuntoMail) ||
                Objects.equals(reintentoDiario, configuracionnotificacionpendiente.reintentoDiario) ||
                Objects.equals(descripcion, configuracionnotificacionpendiente.descripcion) ||
                Objects.equals(mailFron, configuracionnotificacionpendiente.mailFron);

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

