package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.InfoDao;
import com.example.model.InfoModel;

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
        dao.save(model);
        
    }

}
