package com.jzy.dao;

import com.jzy.dao.entity.Qd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QdDao extends JpaRepository<Qd, Integer> {

    List<Qd> findByDateBetween(String start, String end);



}
