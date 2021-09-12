
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

import com.tono.tablet.service.EnvioService;
import com.tono.tablet.repository.EnvioRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import com.tono.tablet.entitys.Envio;




@Service
public class EnvioServiceImplement implements EnvioService {

protected static final Log logger = LogFactory.getLog(EnvioServiceImplement.class);
@Autowired
private EnvioRepository enviorepository;

		@Override
		public Envio findByIdNotificacion(Long idNotificacion){

		logger.info("Starting getEnvio");
			Envio envioEntity = new Envio();
		Envio fileOptional1 = enviorepository.findByIdNotificacion(idNotificacion);

		if (null != fileOptional1) { 

				try {
			envioEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return envioEntity;	}
		@Override
		public Envio findByIdConfiguracion(Long idConfiguracion){

		logger.info("Starting getEnvio");
			Envio envioEntity = new Envio();
		Envio fileOptional1 = enviorepository.findByIdConfiguracion(idConfiguracion);

		if (null != fileOptional1) { 

				try {
			envioEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return envioEntity;	}
		@Override
		public Envio findByFechaEnvio(Date fechaEnvio){

		logger.info("Starting getEnvio");
			Envio envioEntity = new Envio();
		Envio fileOptional1 = enviorepository.findByFechaEnvio(fechaEnvio);

		if (null != fileOptional1) { 

				try {
			envioEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return envioEntity;	}




		@Override
		public List<Envio> getAllEnvio(){
		logger.info("Get allProyect");
			List<Envio> listaEnvio = enviorepository.findAll();
			return listaEnvio;
}


		@Override
		public boolean saveOrUpdateEnvio(Envio envio){
		logger.info("Save Proyect");


				try {
				enviorepository.save(envio);
				return true;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);
				return false;
				}
		}





		@Override
		public Envio findById( Long id){
				return  enviorepository.findByIdQuery(id);
		}



		@Override
		public List<Envio> search(String search ){
				return  enviorepository.finBySearch(search);
		}


		@Override
		public List<Envio> findByIdNotificacionContaining(Long idnotificacion){
			logger.info("get all Envio donde IdNotificacion Containing idnotificacion");
 			List<Envio> listaEnvio = new ArrayList<Envio>();
			listaEnvio = enviorepository.findByIdNotificacionContaining(idnotificacion);
  			return listaEnvio;
		}

		@Override
		public List<Envio> findByIdConfiguracionContaining(Long idconfiguracion){
			logger.info("get all Envio donde IdConfiguracion Containing idconfiguracion");
 			List<Envio> listaEnvio = new ArrayList<Envio>();
			listaEnvio = enviorepository.findByIdConfiguracionContaining(idconfiguracion);
  			return listaEnvio;
		}

		@Override
		public List<Envio> findByFechaEnvioContaining(Date fechaenvio){
			logger.info("get all Envio donde FechaEnvio Containing fechaenvio");
 			List<Envio> listaEnvio = new ArrayList<Envio>();
			listaEnvio = enviorepository.findByFechaEnvioContaining(fechaenvio);
  			return listaEnvio;
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


