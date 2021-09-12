
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
import com.tono.tablet.entitys.NotificacionPendiente;
import com.tono.tablet.service.NotificacionPendienteService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/notificacionpendiente")
public class NotificacionPendienteController {

@Autowired
NotificacionPendienteService notificacionpendienteService;



        @GetMapping("/Getinstanciaproceso/{instanciaproceso}")
        private NotificacionPendiente findByInstanciaProceso(@PathVariable("instanciaproceso") Long  instanciaproceso) {
            return notificacionpendienteService.findByInstanciaProceso(instanciaproceso);
        }

        @GetMapping("/Getproceso/{proceso}")
        private NotificacionPendiente findByProceso(@PathVariable("proceso") String  proceso) {
            return notificacionpendienteService.findByProceso(proceso);
        }

        @GetMapping("/Getlegajoasignado/{legajoasignado}")
        private NotificacionPendiente findByLegajoAsignado(@PathVariable("legajoasignado") Long  legajoasignado) {
            return notificacionpendienteService.findByLegajoAsignado(legajoasignado);
        }

        @GetMapping("/Getfechaasignacion/{fechaasignacion}")
        private NotificacionPendiente findByFechaAsignacion(@PathVariable("fechaasignacion") Date  fechaasignacion) {
            return notificacionpendienteService.findByFechaAsignacion(fechaasignacion);
        }

        @GetMapping("/Getmailto/{mailto}")
        private NotificacionPendiente findByMailTo(@PathVariable("mailto") String  mailto) {
            return notificacionpendienteService.findByMailTo(mailto);
        }

        @GetMapping("/Getdata/{data}")
        private NotificacionPendiente findByData(@PathVariable("data") String  data) {
            return notificacionpendienteService.findByData(data);
        }

        @GetMapping("/Getenvios/{envios}")
        private NotificacionPendiente findByEnvios(@PathVariable("envios") Integer  envios) {
            return notificacionpendienteService.findByEnvios(envios);
        }


        @GetMapping("/Getinstanciaprocesocontain/{instanciaproceso}")
        private List<NotificacionPendiente> findByInstanciaProcesoContain(@PathVariable("instanciaproceso") Long  instanciaproceso) {
            return notificacionpendienteService.findByInstanciaProcesoContaining(instanciaproceso);
        }

        @GetMapping("/Getprocesocontain/{proceso}")
        private List<NotificacionPendiente> findByProcesoContain(@PathVariable("proceso") String  proceso) {
            return notificacionpendienteService.findByProcesoContaining(proceso);
        }

        @GetMapping("/Getlegajoasignadocontain/{legajoasignado}")
        private List<NotificacionPendiente> findByLegajoAsignadoContain(@PathVariable("legajoasignado") Long  legajoasignado) {
            return notificacionpendienteService.findByLegajoAsignadoContaining(legajoasignado);
        }

        @GetMapping("/Getfechaasignacioncontain/{fechaasignacion}")
        private List<NotificacionPendiente> findByFechaAsignacionContain(@PathVariable("fechaasignacion") Date  fechaasignacion) {
            return notificacionpendienteService.findByFechaAsignacionContaining(fechaasignacion);
        }

        @GetMapping("/Getmailtocontain/{mailto}")
        private List<NotificacionPendiente> findByMailToContain(@PathVariable("mailto") String  mailto) {
            return notificacionpendienteService.findByMailToContaining(mailto);
        }

        @GetMapping("/Getdatacontain/{data}")
        private List<NotificacionPendiente> findByDataContain(@PathVariable("data") String  data) {
            return notificacionpendienteService.findByDataContaining(data);
        }

        @GetMapping("/Getenvioscontain/{envios}")
        private List<NotificacionPendiente> findByEnviosContain(@PathVariable("envios") Integer  envios) {
            return notificacionpendienteService.findByEnviosContaining(envios);
        }


        @GetMapping("/GetNotificacionPendiente/{id}")
          private NotificacionPendiente findById(@PathVariable("id") Long id) {
            return notificacionpendienteService.findById(id);
          }


        @GetMapping("/GetAllNotificacionPendiente")
        private  List<NotificacionPendiente> getAllNotificacionPendiente(){
            return notificacionpendienteService.getAllNotificacionPendiente();}



        @PostMapping("/saveOrUpdate")
        private Boolean  saveOrUpdateNotificacionPendiente(@RequestBody NotificacionPendiente notificacionpendiente){ 
            return notificacionpendienteService.saveOrUpdateNotificacionPendiente(notificacionpendiente); }



        @GetMapping("/Search")
        private  List<NotificacionPendiente> finBySearch(@RequestParam(value = "search") String search){
            return notificacionpendienteService.search(search);}




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


