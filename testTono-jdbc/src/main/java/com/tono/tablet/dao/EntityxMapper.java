package com.tono.tablet.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EntityxMapper implements RowMapper<Entityx> {

    @Override
    public Entityx mapRow(ResultSet rs, int rowNum) throws SQLException {
        Entityx entityx = new Entityx();
        entityx.setId(rs.getLong("id"));
        entityx.setInstanciaProceso(rs.getLong("id_instancia_proceso"));
        entityx.setProceso(rs.getString("proceso"));
        entityx.setLegajoAsignado(rs.getLong("legajo_asignado"));
        entityx.setFechaAsignacion(rs.getDate("fecha_asignacion"));
        entityx.setMailTo(rs.getString("mail_to"));
        entityx.setData(rs.getString("data"));
        entityx.setIdNotificacion(rs.getLong("id_notificacion"));
        entityx.setIdConfiguracion(rs.getLong("id_configuracion_notificacion"));
        entityx.setFechaEnvio(rs.getDate("fecha_envio"));
        entityx.setIdTemplate(rs.getLong("id_template"));
        entityx.setPlazoDias(rs.getInt("plazo_dias"));
        entityx.setAsuntoMail(rs.getString("asunto_mail"));
        entityx.setMailFron(rs.getString("mailfron"));
        return entityx;
    }
}
