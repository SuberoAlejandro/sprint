
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


package com.tono.tablet.service ;

import java.util.Date;

import java.util.ArrayList;
import java.util.List;
import com.tono.tablet.entitys.ConfiguracionNotificacionPendiente;


public interface ConfiguracionNotificacionPendienteService{
 
		public ConfiguracionNotificacionPendiente findById(Long id);
		public boolean saveOrUpdateConfiguracionNotificacionPendiente(ConfiguracionNotificacionPendiente configuracionnotificacionpendiente);
		public List<ConfiguracionNotificacionPendiente> getAllConfiguracionNotificacionPendiente();
		public List<ConfiguracionNotificacionPendiente>  search(String search);
		public ConfiguracionNotificacionPendiente  findByIdTemplate(Long idTemplate);

		public ConfiguracionNotificacionPendiente  findByProceso(String proceso);

		public ConfiguracionNotificacionPendiente  findByPlazoDias(Integer plazoDias);

		public ConfiguracionNotificacionPendiente  findByAsuntoMail(String asuntoMail);

		public ConfiguracionNotificacionPendiente  findByReintentoDiario(Integer reintentoDiario);

		public ConfiguracionNotificacionPendiente  findByDescripcion(String descripcion);

		public ConfiguracionNotificacionPendiente  findByMailFron(String mailFron);

		public List<ConfiguracionNotificacionPendiente>  findByIdTemplateContaining(Long idTemplate);

		public List<ConfiguracionNotificacionPendiente>  findByProcesoContaining(String proceso);

		public List<ConfiguracionNotificacionPendiente>  findByPlazoDiasContaining(Integer plazoDias);

		public List<ConfiguracionNotificacionPendiente>  findByAsuntoMailContaining(String asuntoMail);

		public List<ConfiguracionNotificacionPendiente>  findByReintentoDiarioContaining(Integer reintentoDiario);

		public List<ConfiguracionNotificacionPendiente>  findByDescripcionContaining(String descripcion);

		public List<ConfiguracionNotificacionPendiente>  findByMailFronContaining(String mailFron);


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


