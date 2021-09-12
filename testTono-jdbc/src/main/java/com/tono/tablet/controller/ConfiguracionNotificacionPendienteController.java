
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
import com.tono.tablet.entitys.ConfiguracionNotificacionPendiente;
import com.tono.tablet.service.ConfiguracionNotificacionPendienteService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/configuracionnotificacionpendiente")
public class ConfiguracionNotificacionPendienteController {

@Autowired
ConfiguracionNotificacionPendienteService configuracionnotificacionpendienteService;



        @GetMapping("/Getidtemplate/{idtemplate}")
        private ConfiguracionNotificacionPendiente findByIdTemplate(@PathVariable("idtemplate") Long  idtemplate) {
            return configuracionnotificacionpendienteService.findByIdTemplate(idtemplate);
        }

        @GetMapping("/Getproceso/{proceso}")
        private ConfiguracionNotificacionPendiente findByProceso(@PathVariable("proceso") String  proceso) {
            return configuracionnotificacionpendienteService.findByProceso(proceso);
        }

        @GetMapping("/Getplazodias/{plazodias}")
        private ConfiguracionNotificacionPendiente findByPlazoDias(@PathVariable("plazodias") Integer  plazodias) {
            return configuracionnotificacionpendienteService.findByPlazoDias(plazodias);
        }

        @GetMapping("/Getasuntomail/{asuntomail}")
        private ConfiguracionNotificacionPendiente findByAsuntoMail(@PathVariable("asuntomail") String  asuntomail) {
            return configuracionnotificacionpendienteService.findByAsuntoMail(asuntomail);
        }

        @GetMapping("/Getreintentodiario/{reintentodiario}")
        private ConfiguracionNotificacionPendiente findByReintentoDiario(@PathVariable("reintentodiario") Integer  reintentodiario) {
            return configuracionnotificacionpendienteService.findByReintentoDiario(reintentodiario);
        }

        @GetMapping("/Getdescripcion/{descripcion}")
        private ConfiguracionNotificacionPendiente findByDescripcion(@PathVariable("descripcion") String  descripcion) {
            return configuracionnotificacionpendienteService.findByDescripcion(descripcion);
        }

        @GetMapping("/Getmailfron/{mailfron}")
        private ConfiguracionNotificacionPendiente findByMailFron(@PathVariable("mailfron") String  mailfron) {
            return configuracionnotificacionpendienteService.findByMailFron(mailfron);
        }


        @GetMapping("/Getidtemplatecontain/{idtemplate}")
        private List<ConfiguracionNotificacionPendiente> findByIdTemplateContain(@PathVariable("idtemplate") Long  idtemplate) {
            return configuracionnotificacionpendienteService.findByIdTemplateContaining(idtemplate);
        }

        @GetMapping("/Getprocesocontain/{proceso}")
        private List<ConfiguracionNotificacionPendiente> findByProcesoContain(@PathVariable("proceso") String  proceso) {
            return configuracionnotificacionpendienteService.findByProcesoContaining(proceso);
        }

        @GetMapping("/Getplazodiascontain/{plazodias}")
        private List<ConfiguracionNotificacionPendiente> findByPlazoDiasContain(@PathVariable("plazodias") Integer  plazodias) {
            return configuracionnotificacionpendienteService.findByPlazoDiasContaining(plazodias);
        }

        @GetMapping("/Getasuntomailcontain/{asuntomail}")
        private List<ConfiguracionNotificacionPendiente> findByAsuntoMailContain(@PathVariable("asuntomail") String  asuntomail) {
            return configuracionnotificacionpendienteService.findByAsuntoMailContaining(asuntomail);
        }

        @GetMapping("/Getreintentodiariocontain/{reintentodiario}")
        private List<ConfiguracionNotificacionPendiente> findByReintentoDiarioContain(@PathVariable("reintentodiario") Integer  reintentodiario) {
            return configuracionnotificacionpendienteService.findByReintentoDiarioContaining(reintentodiario);
        }

        @GetMapping("/Getdescripcioncontain/{descripcion}")
        private List<ConfiguracionNotificacionPendiente> findByDescripcionContain(@PathVariable("descripcion") String  descripcion) {
            return configuracionnotificacionpendienteService.findByDescripcionContaining(descripcion);
        }

        @GetMapping("/Getmailfroncontain/{mailfron}")
        private List<ConfiguracionNotificacionPendiente> findByMailFronContain(@PathVariable("mailfron") String  mailfron) {
            return configuracionnotificacionpendienteService.findByMailFronContaining(mailfron);
        }


        @GetMapping("/GetConfiguracionNotificacionPendiente/{id}")
          private ConfiguracionNotificacionPendiente findById(@PathVariable("id") Long id) {
            return configuracionnotificacionpendienteService.findById(id);
          }


        @GetMapping("/GetAllConfiguracionNotificacionPendiente")
        private  List<ConfiguracionNotificacionPendiente> getAllConfiguracionNotificacionPendiente(){
            return configuracionnotificacionpendienteService.getAllConfiguracionNotificacionPendiente();}



        @PostMapping("/saveOrUpdate")
        private Boolean  saveOrUpdateConfiguracionNotificacionPendiente(@RequestBody ConfiguracionNotificacionPendiente configuracionnotificacionpendiente){ 
            return configuracionnotificacionpendienteService.saveOrUpdateConfiguracionNotificacionPendiente(configuracionnotificacionpendiente); }



        @GetMapping("/Search")
        private  List<ConfiguracionNotificacionPendiente> finBySearch(@RequestParam(value = "search") String search){
            return configuracionnotificacionpendienteService.search(search);}




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


