
/*
Create on Fri Sep 10 20:36:47 ART 2021
*Copyright (C) 121.
@author ALE
@author ale
@author ANACODE AND IVANCODE
@since 1.7
@version1.0.0.0
@version  %I%, %G%
*<p>Description: test of tono </p>
*/


package com.tono.tablet.service;

import java.util.Date;

import java.util.List;

import com.tono.tablet.dao.Entityx;
import com.tono.tablet.entitys.NotificacionPendiente;


public interface NotificacionPendienteService {

    public NotificacionPendiente findById(Long id);

    public boolean saveOrUpdateNotificacionPendiente(NotificacionPendiente notificacionpendiente);

    public List<NotificacionPendiente> getAllNotificacionPendiente();

    public List<NotificacionPendiente> search(String search);

    public NotificacionPendiente findByInstanciaProceso(Long instanciaProceso);

    public NotificacionPendiente findByProceso(String proceso);

    public NotificacionPendiente findByLegajoAsignado(Long legajoAsignado);

    public NotificacionPendiente findByFechaAsignacion(Date fechaAsignacion);

    public NotificacionPendiente findByMailTo(String mailTo);

    public NotificacionPendiente findByData(String data);

    public NotificacionPendiente findByEnvios(Integer envios);

    public List<NotificacionPendiente> findByInstanciaProcesoContaining(Long instanciaProceso);

    public List<NotificacionPendiente> findByProcesoContaining(String proceso);

    public List<NotificacionPendiente> findByLegajoAsignadoContaining(Long legajoAsignado);

    public List<NotificacionPendiente> findByFechaAsignacionContaining(Date fechaAsignacion);

    public List<NotificacionPendiente> findByMailToContaining(String mailTo);

    public List<NotificacionPendiente> findByDataContaining(String data);

    public List<NotificacionPendiente> findByEnviosContaining(Integer envios);

    public List<Entityx> findEntityx();
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


