
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

import com.tono.tablet.dao.Entityx;
import com.tono.tablet.dao.EntityxRepository;
import com.tono.tablet.service.NotificacionPendienteService;
import com.tono.tablet.repository.NotificacionPendienteRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import com.tono.tablet.entitys.NotificacionPendiente;


@Service
public class NotificacionPendienteServiceImplement implements NotificacionPendienteService {

	protected static final Log logger = LogFactory.getLog(NotificacionPendienteServiceImplement.class);
	@Autowired
	private NotificacionPendienteRepository notificacionpendienterepository;

	@Autowired
	private EntityxRepository entityxRepository;


		@Override
		public NotificacionPendiente findByInstanciaProceso(Long instanciaProceso){

		logger.info("Starting getNotificacionPendiente");
			NotificacionPendiente notificacionpendienteEntity = new NotificacionPendiente();
		NotificacionPendiente fileOptional1 = notificacionpendienterepository.findByInstanciaProceso(instanciaProceso);

		if (null != fileOptional1) { 

				try {
			notificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return notificacionpendienteEntity;	}
		@Override
		public NotificacionPendiente findByProceso(String proceso){

		logger.info("Starting getNotificacionPendiente");
			NotificacionPendiente notificacionpendienteEntity = new NotificacionPendiente();
		NotificacionPendiente fileOptional1 = notificacionpendienterepository.findByProceso(proceso);

		if (null != fileOptional1) { 

				try {
			notificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return notificacionpendienteEntity;	}
		@Override
		public NotificacionPendiente findByLegajoAsignado(Long legajoAsignado){

		logger.info("Starting getNotificacionPendiente");
			NotificacionPendiente notificacionpendienteEntity = new NotificacionPendiente();
		NotificacionPendiente fileOptional1 = notificacionpendienterepository.findByLegajoAsignado(legajoAsignado);

		if (null != fileOptional1) { 

				try {
			notificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return notificacionpendienteEntity;	}
		@Override
		public NotificacionPendiente findByFechaAsignacion(Date fechaAsignacion){

		logger.info("Starting getNotificacionPendiente");
			NotificacionPendiente notificacionpendienteEntity = new NotificacionPendiente();
		NotificacionPendiente fileOptional1 = notificacionpendienterepository.findByFechaAsignacion(fechaAsignacion);

		if (null != fileOptional1) { 

				try {
			notificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return notificacionpendienteEntity;	}
		@Override
		public NotificacionPendiente findByMailTo(String mailTo){

		logger.info("Starting getNotificacionPendiente");
			NotificacionPendiente notificacionpendienteEntity = new NotificacionPendiente();
		NotificacionPendiente fileOptional1 = notificacionpendienterepository.findByMailTo(mailTo);

		if (null != fileOptional1) { 

				try {
			notificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return notificacionpendienteEntity;	}
		@Override
		public NotificacionPendiente findByData(String data){

		logger.info("Starting getNotificacionPendiente");
			NotificacionPendiente notificacionpendienteEntity = new NotificacionPendiente();
		NotificacionPendiente fileOptional1 = notificacionpendienterepository.findByData(data);

		if (null != fileOptional1) { 

				try {
			notificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return notificacionpendienteEntity;	}
		@Override
		public NotificacionPendiente findByEnvios(Integer envios){

		logger.info("Starting getNotificacionPendiente");
			NotificacionPendiente notificacionpendienteEntity = new NotificacionPendiente();
		NotificacionPendiente fileOptional1 = notificacionpendienterepository.findByEnvios(envios);

		if (null != fileOptional1) { 

				try {
			notificacionpendienteEntity = fileOptional1;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);

				}
		}
		return notificacionpendienteEntity;	}




		@Override
		public List<NotificacionPendiente> getAllNotificacionPendiente(){
		logger.info("Get allProyect");
			List<NotificacionPendiente> listaNotificacionPendiente = notificacionpendienterepository.findAll();
			return listaNotificacionPendiente;
}


		@Override
		public boolean saveOrUpdateNotificacionPendiente(NotificacionPendiente notificacionpendiente){
		logger.info("Save Proyect");


				try {
				notificacionpendienterepository.save(notificacionpendiente);
				return true;
				} catch (DataAccessException e) {
				logger.error(" ERROR : " + e);
				return false;
				}
		}





		@Override
		public NotificacionPendiente findById( Long id){
				return  notificacionpendienterepository.findByIdQuery(id);
		}



		@Override
		public List<NotificacionPendiente> search(String search ){
				return  notificacionpendienterepository.finBySearch(search);
		}


		@Override
		public List<NotificacionPendiente> findByInstanciaProcesoContaining(Long instanciaproceso){
			logger.info("get all NotificacionPendiente donde InstanciaProceso Containing instanciaproceso");
 			List<NotificacionPendiente> listaNotificacionPendiente = new ArrayList<NotificacionPendiente>();
			listaNotificacionPendiente = notificacionpendienterepository.findByInstanciaProcesoContaining(instanciaproceso);
  			return listaNotificacionPendiente;
		}

		@Override
		public List<NotificacionPendiente> findByProcesoContaining(String proceso){
			logger.info("get all NotificacionPendiente donde Proceso Containing proceso");
 			List<NotificacionPendiente> listaNotificacionPendiente = new ArrayList<NotificacionPendiente>();
			listaNotificacionPendiente = notificacionpendienterepository.findByProcesoContaining(proceso);
  			return listaNotificacionPendiente;
		}

		@Override
		public List<NotificacionPendiente> findByLegajoAsignadoContaining(Long legajoasignado){
			logger.info("get all NotificacionPendiente donde LegajoAsignado Containing legajoasignado");
 			List<NotificacionPendiente> listaNotificacionPendiente = new ArrayList<NotificacionPendiente>();
			listaNotificacionPendiente = notificacionpendienterepository.findByLegajoAsignadoContaining(legajoasignado);
  			return listaNotificacionPendiente;
		}

		@Override
		public List<NotificacionPendiente> findByFechaAsignacionContaining(Date fechaasignacion){
			logger.info("get all NotificacionPendiente donde FechaAsignacion Containing fechaasignacion");
 			List<NotificacionPendiente> listaNotificacionPendiente = new ArrayList<NotificacionPendiente>();
			listaNotificacionPendiente = notificacionpendienterepository.findByFechaAsignacionContaining(fechaasignacion);
  			return listaNotificacionPendiente;
		}

		@Override
		public List<NotificacionPendiente> findByMailToContaining(String mailto){
			logger.info("get all NotificacionPendiente donde MailTo Containing mailto");
 			List<NotificacionPendiente> listaNotificacionPendiente = new ArrayList<NotificacionPendiente>();
			listaNotificacionPendiente = notificacionpendienterepository.findByMailToContaining(mailto);
  			return listaNotificacionPendiente;
		}

		@Override
		public List<NotificacionPendiente> findByDataContaining(String data){
			logger.info("get all NotificacionPendiente donde Data Containing data");
 			List<NotificacionPendiente> listaNotificacionPendiente = new ArrayList<NotificacionPendiente>();
			listaNotificacionPendiente = notificacionpendienterepository.findByDataContaining(data);
  			return listaNotificacionPendiente;
		}

		@Override
		public List<NotificacionPendiente> findByEnviosContaining(Integer envios){
			logger.info("get all NotificacionPendiente donde Envios Containing envios");
 			List<NotificacionPendiente> listaNotificacionPendiente = new ArrayList<NotificacionPendiente>();
			listaNotificacionPendiente = notificacionpendienterepository.findByEnviosContaining(envios);
  			return listaNotificacionPendiente;
		}

	@Override
	public List<Entityx> findEntityx() {
		return entityxRepository.findAllEntityxQuery();
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


