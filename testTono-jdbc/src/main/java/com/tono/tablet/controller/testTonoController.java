package com.tono.tablet.controller;

import com.tono.tablet.dao.EntityxRepository;
import com.tono.tablet.dao.Entityx;
import com.tono.tablet.service.NotificacionPendienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class testTonoController {

    @Autowired
    NotificacionPendienteService notificacionpendienteService;

    @GetMapping("/start")
    public String startTest() {
        return "<h1>!!!!!!!!!!!!!!!!!Hello Mundo!!!!!!!!!!!!</h1>\r\n"
                + "<br>" +
                "<h2> !!!!!!!!!!!Estoy funcionando!!!!!!!!! </h2>";
    }


    @GetMapping("/entityxxs")
    private List<Entityx> findEntityx() {
        EntityxRepository dao = new EntityxRepository();
      //  return dao.findAllDetailNamedQuery();
       return notificacionpendienteService.findEntityx();
    }


}
