package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.InfoModel;

public class InfoMapper implements RowMapper<InfoModel> {

    @Override
    public InfoModel mapRow(ResultSet arg0, int arg1) throws SQLException {
        InfoModel model = new InfoModel();
        model.setId(arg0.getString("id"));
        model.setName(arg0.getString("name"));
        model.setValue(arg0.getString("value"));
        return model;
    }

}
