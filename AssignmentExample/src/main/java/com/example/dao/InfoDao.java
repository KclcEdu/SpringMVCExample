package com.example.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.InfoModel;

/**
 * Interact with DB.
 * 
 * @author minhnn
 *
 */
@Repository
public interface InfoDao {
    /**
     * Save a model to DB
     * 
     * @param model
     *            Info model
     * @throws Exception
     *             exception
     */
    void save(InfoModel model) throws Exception;

    /**
     * Select a row from DB
     * 
     * @param id
     *            Info id
     * @return An InfoModel
     * @throws Exception
     *             exception
     */
    List<InfoModel> selectAll() throws Exception;
}
