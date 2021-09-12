package com.tono.tablet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public class EntityxRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Entityx> findAllEntityxQuery() {
        List<Entityx> entityxs = null;
        String sql = "select np.id, np.id_instancia_proceso,np.PROCESO,np.legajo_asignado,np.fecha_asignacion,np.mail_to, np.data, en.id_notificacion, en.id_configuracion_notificacion, en.FECHA_ENVIO, cfn.id_template, cfn.plazo_dias , cfn.asunto_mail, cfn.MAILFRON from NOTIFICACIONPENDIENTE np , WFG_CFG_NOTIF_PENDIENTES cfn,  envio en where  np.id = en.id_notificacion and  cfn.id = en.id_configuracion_notificacion";
        entityxs = jdbcTemplate.query(sql, new EntityxMapper());
        return entityxs;
    }

}
