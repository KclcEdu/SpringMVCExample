package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.InfoModel;

/**
 * Manipulate data for controller
 * 
 * @author minhnn
 *
 */
public interface InfoService {

    /**
     * Save info to DB through DAO
     * 
     * @param model
     * @throws Exception
     *             exception
     */
    void saveInfo(InfoModel model) throws Exception;

    /**
     * Get info from DAO, manipulate it and return to controller
     * 
     * @param id
     * @return Info model
     * @throws Exception
     *             exception
     */
    List<InfoModel> getInfo() throws Exception;

}
