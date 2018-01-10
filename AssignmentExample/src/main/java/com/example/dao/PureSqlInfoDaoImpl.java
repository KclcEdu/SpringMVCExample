package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.model.InfoModel;

public class PureSqlInfoDaoImpl implements InfoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(InfoModel model) throws Exception {
        String sql = "insert into info values (?,?)";
        jdbcTemplate.update(sql, new Object[] { model.getName(), model.getValue() });
    }

    @Override
    public List<InfoModel> selectAll() throws Exception {
        String sql = "select * from info";
        List<InfoModel> listInfo = jdbcTemplate.query(sql, new InfoMapper());
        return listInfo;
    }

}
