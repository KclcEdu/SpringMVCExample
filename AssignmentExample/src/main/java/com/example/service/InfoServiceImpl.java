package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.example.dao.InfoDao;
import com.example.model.InfoModel;

@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoDao dao;

    @Transactional
    @Override
    public List<InfoModel> getInfo() throws Exception {
        return dao.selectAll();
    }

    @Transactional
    @Override
    public void saveInfo(InfoModel model) throws Exception {
        if (model == null || StringUtils.isEmpty(model.getName()) || StringUtils.isEmpty(model.getValue())) {
            throw new IllegalArgumentException("Input value must not be null or empty");
        }
        dao.save(model);
    }

}
