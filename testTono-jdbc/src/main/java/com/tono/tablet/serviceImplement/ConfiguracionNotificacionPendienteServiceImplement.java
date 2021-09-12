
/*
Create on Fri Sep 10 20:36:49 ART 2021
*Copyright (C) 121.
@author ALE
@author ale
@author ANACODE AND IVANCODE
@since 1.7
@version1.0.0.0
@version  %I%, %G%
*<p>Description: test of tono </p>
*/



package com.tono.tablet.serviceImplement ;

import com.tono.tablet.service.ConfiguracionNotificacionPendienteService;
import com.tono.tablet.repository.ConfiguracionNotificacionPendienteRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import com.tono.tablet.entitys.ConfiguracionNotificacionPendiente;




@Service
public class ConfiguracionNotificacionPendienteServiceImplement implements ConfiguracionNotificacionPendienteService {

protected static final Log logger = LogFactory.getLog(ConfiguracionNotificacionPendienteServiceImplement.class);
@Autowired
private ConfiguracionNotificacionPendienteRepository configuracionnotificacionpendienterepository;

		@Override
		public ConfiguracionNotificacionPendiente findByIdTemplate(Long idTemplate){

		logger.info("Starting getConfiguracionNotificacionPendiente");
			ConfiguracionNotificacionPendiente configuracionnotificacionpendienteEntity = new ConfiguracionNotificacionPendiente();
		ConfiguracionNotificacionPendiente fileOptional1 = configuracionnotificacionpendienterepository.findByIdTemplate(idTemplate);

		if (null != fileOptional1) { 

				try {
			configuracionnotificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return configuracionnotificacionpendienteEntity;	}
		@Override
		public ConfiguracionNotificacionPendiente findByProceso(String proceso){

		logger.info("Starting getConfiguracionNotificacionPendiente");
			ConfiguracionNotificacionPendiente configuracionnotificacionpendienteEntity = new ConfiguracionNotificacionPendiente();
		ConfiguracionNotificacionPendiente fileOptional1 = configuracionnotificacionpendienterepository.findByProceso(proceso);

		if (null != fileOptional1) { 

				try {
			configuracionnotificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return configuracionnotificacionpendienteEntity;	}
		@Override
		public ConfiguracionNotificacionPendiente findByPlazoDias(Integer plazoDias){

		logger.info("Starting getConfiguracionNotificacionPendiente");
			ConfiguracionNotificacionPendiente configuracionnotificacionpendienteEntity = new ConfiguracionNotificacionPendiente();
		ConfiguracionNotificacionPendiente fileOptional1 = configuracionnotificacionpendienterepository.findByPlazoDias(plazoDias);

		if (null != fileOptional1) { 

				try {
			configuracionnotificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return configuracionnotificacionpendienteEntity;	}
		@Override
		public ConfiguracionNotificacionPendiente findByAsuntoMail(String asuntoMail){

		logger.info("Starting getConfiguracionNotificacionPendiente");
			ConfiguracionNotificacionPendiente configuracionnotificacionpendienteEntity = new ConfiguracionNotificacionPendiente();
		ConfiguracionNotificacionPendiente fileOptional1 = configuracionnotificacionpendienterepository.findByAsuntoMail(asuntoMail);

		if (null != fileOptional1) { 

				try {
			configuracionnotificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return configuracionnotificacionpendienteEntity;	}
		@Override
		public ConfiguracionNotificacionPendiente findByReintentoDiario(Integer reintentoDiario){

		logger.info("Starting getConfiguracionNotificacionPendiente");
			ConfiguracionNotificacionPendiente configuracionnotificacionpendienteEntity = new ConfiguracionNotificacionPendiente();
		ConfiguracionNotificacionPendiente fileOptional1 = configuracionnotificacionpendienterepository.findByReintentoDiario(reintentoDiario);

		if (null != fileOptional1) { 

				try {
			configuracionnotificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return configuracionnotificacionpendienteEntity;	}
		@Override
		public ConfiguracionNotificacionPendiente findByDescripcion(String descripcion){

		logger.info("Starting getConfiguracionNotificacionPendiente");
			ConfiguracionNotificacionPendiente configuracionnotificacionpendienteEntity = new ConfiguracionNotificacionPendiente();
		ConfiguracionNotificacionPendiente fileOptional1 = configuracionnotificacionpendienterepository.findByDescripcion(descripcion);

		if (null != fileOptional1) { 

				try {
			configuracionnotificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return configuracionnotificacionpendienteEntity;	}
		@Override
		public ConfiguracionNotificacionPendiente findByMailFron(String mailFron){

		logger.info("Starting getConfiguracionNotificacionPendiente");
			ConfiguracionNotificacionPendiente configuracionnotificacionpendienteEntity = new ConfiguracionNotificacionPendiente();
		ConfiguracionNotificacionPendiente fileOptional1 = configuracionnotificacionpendienterepository.findByMailFron(mailFron);

		if (null != fileOptional1) { 

				try {
			configuracionnotificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return configuracionnotificacionpendienteEntity;	}




		@Override
		public List<ConfiguracionNotificacionPendiente> getAllConfiguracionNotificacionPendiente(){
		logger.info("Get allProyect");
			List<ConfiguracionNotificacionPendiente> listaConfiguracionNotificacionPendiente = configuracionnotificacionpendienterepository.findAll();
			return listaConfiguracionNotificacionPendiente;
}


		@Override
		public boolean saveOrUpdateConfiguracionNotificacionPendiente(ConfiguracionNotificacionPendiente configuracionnotificacionpendiente){
		logger.info("Save Proyect");


				try {
				configuracionnotificacionpendienterepository.save(configuracionnotificacionpendiente);
				return true;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);
				return false;
				}
		}





		@Override
		public ConfiguracionNotificacionPendiente findById( Long id){
				return  configuracionnotificacionpendienterepository.findByIdQuery(id);
		}



		@Override
		public List<ConfiguracionNotificacionPendiente> search(String search ){
				return  configuracionnotificacionpendienterepository.finBySearch(search);
		}


		@Override
		public List<ConfiguracionNotificacionPendiente> findByIdTemplateContaining(Long idtemplate){
			logger.info("get all ConfiguracionNotificacionPendiente donde IdTemplate Containing idtemplate");
 			List<ConfiguracionNotificacionPendiente> listaConfiguracionNotificacionPendiente = new ArrayList<ConfiguracionNotificacionPendiente>();
			listaConfiguracionNotificacionPendiente = configuracionnotificacionpendienterepository.findByIdTemplateContaining(idtemplate);
  			return listaConfiguracionNotificacionPendiente;
		}

		@Override
		public List<ConfiguracionNotificacionPendiente> findByProcesoContaining(String proceso){
			logger.info("get all ConfiguracionNotificacionPendiente donde Proceso Containing proceso");
 			List<ConfiguracionNotificacionPendiente> listaConfiguracionNotificacionPendiente = new ArrayList<ConfiguracionNotificacionPendiente>();
			listaConfiguracionNotificacionPendiente = configuracionnotificacionpendienterepository.findByProcesoContaining(proceso);
  			return listaConfiguracionNotificacionPendiente;
		}

		@Override
		public List<ConfiguracionNotificacionPendiente> findByPlazoDiasContaining(Integer plazodias){
			logger.info("get all ConfiguracionNotificacionPendiente donde PlazoDias Containing plazodias");
 			List<ConfiguracionNotificacionPendiente> listaConfiguracionNotificacionPendiente = new ArrayList<ConfiguracionNotificacionPendiente>();
			listaConfiguracionNotificacionPendiente = configuracionnotificacionpendienterepository.findByPlazoDiasContaining(plazodias);
  			return listaConfiguracionNotificacionPendiente;
		}

		@Override
		public List<ConfiguracionNotificacionPendiente> findByAsuntoMailContaining(String asuntomail){
			logger.info("get all ConfiguracionNotificacionPendiente donde AsuntoMail Containing asuntomail");
 			List<ConfiguracionNotificacionPendiente> listaConfiguracionNotificacionPendiente = new ArrayList<ConfiguracionNotificacionPendiente>();
			listaConfiguracionNotificacionPendiente = configuracionnotificacionpendienterepository.findByAsuntoMailContaining(asuntomail);
  			return listaConfiguracionNotificacionPendiente;
		}

		@Override
		public List<ConfiguracionNotificacionPendiente> findByReintentoDiarioContaining(Integer reintentodiario){
			logger.info("get all ConfiguracionNotificacionPendiente donde ReintentoDiario Containing reintentodiario");
 			List<ConfiguracionNotificacionPendiente> listaConfiguracionNotificacionPendiente = new ArrayList<ConfiguracionNotificacionPendiente>();
			listaConfiguracionNotificacionPendiente = configuracionnotificacionpendienterepository.findByReintentoDiarioContaining(reintentodiario);
  			return listaConfiguracionNotificacionPendiente;
		}

		@Override
		public List<ConfiguracionNotificacionPendiente> findByDescripcionContaining(String descripcion){
			logger.info("get all ConfiguracionNotificacionPendiente donde Descripcion Containing descripcion");
 			List<ConfiguracionNotificacionPendiente> listaConfiguracionNotificacionPendiente = new ArrayList<ConfiguracionNotificacionPendiente>();
			listaConfiguracionNotificacionPendiente = configuracionnotificacionpendienterepository.findByDescripcionContaining(descripcion);
  			return listaConfiguracionNotificacionPendiente;
		}

		@Override
		public List<ConfiguracionNotificacionPendiente> findByMailFronContaining(String mailfron){
			logger.info("get all ConfiguracionNotificacionPendiente donde MailFron Containing mailfron");
 			List<ConfiguracionNotificacionPendiente> listaConfiguracionNotificacionPendiente = new ArrayList<ConfiguracionNotificacionPendiente>();
			listaConfiguracionNotificacionPendiente = configuracionnotificacionpendienterepository.findByMailFronContaining(mailfron);
  			return listaConfiguracionNotificacionPendiente;
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


