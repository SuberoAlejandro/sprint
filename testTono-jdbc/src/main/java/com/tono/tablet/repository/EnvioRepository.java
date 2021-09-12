
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
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tono.tablet.entitys.Envio;
@Repository
public interface EnvioRepository extends JpaRepository< Envio, Long> {
 
		public Envio findById(Long id);
		public List<Envio> findByIdContaining(Long id);

@Query(value = "SELECT t FROM Envio t WHERE t.id =?1")
 public Envio findByIdQuery(Long id);

@Query(value = "SELECT p FROM Envio p WHERE CONCAT( p.idNotificacion, ' ', p.idConfiguracion, ' ', p.fechaEnvio) LIKE %?1%")
public List<Envio> finBySearch(String keyword);


		public Envio findByIdNotificacion(Long idNotificacion);
		public List<Envio> findByIdNotificacionContaining(Long idNotificacion);
		public Envio findByIdConfiguracion(Long idConfiguracion);
		public List<Envio> findByIdConfiguracionContaining(Long idConfiguracion);
		public Envio findByFechaEnvio(Date fechaEnvio);
		public List<Envio> findByFechaEnvioContaining(Date fechaEnvio);

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


