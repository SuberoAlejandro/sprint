
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
@Table(name = "envio")
public class Envio implements Serializable {

    private static final long serialVersionUID = 4975423231991458591L;

    @Id
    @GeneratedValue(generator = "sequence_mat_id_generator")
    @SequenceGenerator(name = "sequence_mat_id_generator", initialValue = 25, allocationSize = 1000)
    @Column(name = "id", updatable = true, nullable = false, length = 25)
    private Long id;


    @Column(name = "ID_NOTIFICACION", updatable = true, nullable = true, length = 200)
    private Long idNotificacion;


    @Column(name = "ID_CONFIGURACION_NOTIFICACION", updatable = true, nullable = true, length = 200)
    private Long idConfiguracion;


    @Column(name = "FECHA_ENVIO", updatable = true, nullable = true, length = 200)
    private Date fechaEnvio;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdnotificacion() {
        return idNotificacion;
    }

    public void setIdnotificacion(Long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Long getIdconfiguracion() {
        return idConfiguracion;
    }

    public void setIdconfiguracion(Long idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public Date getFechaenvio() {
        return fechaEnvio;
    }

    public void setFechaenvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public boolean equalsEnvio(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Envio envio = (Envio) o;
        return Objects.equals(id, envio.id) ||
                Objects.equals(idNotificacion, envio.idNotificacion) ||
                Objects.equals(idConfiguracion, envio.idConfiguracion) ||
                Objects.equals(fechaEnvio, envio.fechaEnvio);

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

