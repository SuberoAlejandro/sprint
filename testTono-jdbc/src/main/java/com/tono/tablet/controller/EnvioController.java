
/*
Create on Fri Sep 10 20:36:50 ART 2021
*Copyright (C) 121.
@author ALE
@author ale
@author ANACODE AND IVANCODE
@since 1.7
@version1.0.0.0
@version  %I%, %G%
*<p>Description: test of tono </p>
*/



package com.tono.tablet.controller;
import com.tono.tablet.entitys.Envio;
import com.tono.tablet.service.EnvioService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/envio")
public class EnvioController {

@Autowired
EnvioService envioService;



        @GetMapping("/Getidnotificacion/{idnotificacion}")
        private Envio findByIdNotificacion(@PathVariable("idnotificacion") Long  idnotificacion) {
            return envioService.findByIdNotificacion(idnotificacion);
        }

        @GetMapping("/Getidconfiguracion/{idconfiguracion}")
        private Envio findByIdConfiguracion(@PathVariable("idconfiguracion") Long  idconfiguracion) {
            return envioService.findByIdConfiguracion(idconfiguracion);
        }

        @GetMapping("/Getfechaenvio/{fechaenvio}")
        private Envio findByFechaEnvio(@PathVariable("fechaenvio") Date  fechaenvio) {
            return envioService.findByFechaEnvio(fechaenvio);
        }


        @GetMapping("/Getidnotificacioncontain/{idnotificacion}")
        private List<Envio> findByIdNotificacionContain(@PathVariable("idnotificacion") Long  idnotificacion) {
            return envioService.findByIdNotificacionContaining(idnotificacion);
        }

        @GetMapping("/Getidconfiguracioncontain/{idconfiguracion}")
        private List<Envio> findByIdConfiguracionContain(@PathVariable("idconfiguracion") Long  idconfiguracion) {
            return envioService.findByIdConfiguracionContaining(idconfiguracion);
        }

        @GetMapping("/Getfechaenviocontain/{fechaenvio}")
        private List<Envio> findByFechaEnvioContain(@PathVariable("fechaenvio") Date  fechaenvio) {
            return envioService.findByFechaEnvioContaining(fechaenvio);
        }


        @GetMapping("/GetEnvio/{id}")
          private Envio findById(@PathVariable("id") Long id) {
            return envioService.findById(id);
          }


        @GetMapping("/GetAllEnvio")
        private  List<Envio> getAllEnvio(){
            return envioService.getAllEnvio();}



        @PostMapping("/saveOrUpdate")
        private Boolean  saveOrUpdateEnvio(@RequestBody Envio envio){ 
            return envioService.saveOrUpdateEnvio(envio); }

        @GetMapping("/Search")
        private  List<Envio> finBySearch(@RequestParam(value = "search") String search){
            return envioService.search(search);}



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


