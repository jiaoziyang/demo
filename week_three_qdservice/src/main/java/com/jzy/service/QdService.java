package com.jzy.service;

import com.jzy.common.response.ResponseResult;
import com.jzy.dao.QdDao;
import com.jzy.dao.entity.Qd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QdService  {

    @Autowired
    private QdDao qdDao;

    public List<Qd> findByDateBetween(String start, String end) {
        return qdDao.findByDateBetween(start, end);
    }

    public void save(Qd qd) {
        qdDao.save(qd);
    }

    public void deleteById(int id) {
        deleteById(id);
    }

    public Qd getOne(int id) {
        return qdDao.getOne(id);
    }
}
