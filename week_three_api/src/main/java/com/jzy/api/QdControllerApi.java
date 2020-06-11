package com.jzy.dao.api;


import com.jzy.common.response.QueryResponseResult;
import com.jzy.common.response.ResponseResult;
import com.jzy.dao.entity.Qd;

public interface QdControllerApi {

    QueryResponseResult<Qd> findByDateBetween(String start, String end);

    ResponseResult save(Qd qd);

    ResponseResult deleteById(int id);

    Qd getOne(int id);
}
