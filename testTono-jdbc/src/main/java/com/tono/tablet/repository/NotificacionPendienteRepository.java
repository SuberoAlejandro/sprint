
/*
Create on Fri Sep 10 20:36:46 ART 2021
*Copyright (C) 121.
@author ALE
@author ale
@author ANACODE AND IVANCODE
@since 1.7
@version1.0.0.0
@version  %I%, %G%
*<p>Description: test of tono </p>
*/


package com.tono.tablet.repository;

import java.util.List;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tono.tablet.entitys.NotificacionPendiente;

@Repository
public interface NotificacionPendienteRepository extends JpaRepository<NotificacionPendiente, Long> {

    public NotificacionPendiente findById(Long id);

    public List<NotificacionPendiente> findByIdContaining(Long id);

    @Query(value = "SELECT t FROM NotificacionPendiente t WHERE t.id =?1")
    public NotificacionPendiente findByIdQuery(Long id);

    @Query(value = "SELECT p FROM NotificacionPendiente p WHERE CONCAT( p.instanciaProceso, ' ', p.proceso, ' ', p.legajoAsignado, ' ', p.fechaAsignacion, ' ', p.mailTo, ' ', p.data, ' ', p.envios) LIKE %?1%")
    public List<NotificacionPendiente> finBySearch(String keyword);


    public NotificacionPendiente findByInstanciaProceso(Long instanciaProceso);

    public List<NotificacionPendiente> findByInstanciaProcesoContaining(Long instanciaProceso);

    public NotificacionPendiente findByProceso(String proceso);

    public List<NotificacionPendiente> findByProcesoContaining(String proceso);

    public NotificacionPendiente findByLegajoAsignado(Long legajoAsignado);

    public List<NotificacionPendiente> findByLegajoAsignadoContaining(Long legajoAsignado);

    public NotificacionPendiente findByFechaAsignacion(Date fechaAsignacion);

    public List<NotificacionPendiente> findByFechaAsignacionContaining(Date fechaAsignacion);

    public NotificacionPendiente findByMailTo(String mailTo);

    public List<NotificacionPendiente> findByMailToContaining(String mailTo);

    public NotificacionPendiente findByData(String data);

    public List<NotificacionPendiente> findByDataContaining(String data);

    public NotificacionPendiente findByEnvios(Integer envios);

    public List<NotificacionPendiente> findByEnviosContaining(Integer envios);



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


