package com.jzy.controller;

import com.jzy.common.response.CommonCode;
import com.jzy.common.response.QueryResponseResult;
import com.jzy.common.response.QueryResult;
import com.jzy.common.response.ResponseResult;
import com.jzy.dao.api.QdControllerApi;
import com.jzy.dao.entity.Qd;
import com.jzy.service.QdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/qd")
public class QdController implements QdControllerApi {

    @Autowired
    private QdService qdService;

    @Override
    public QueryResponseResult<Qd> findByDateBetween(String start, String end) {
        List<Qd> qdList = qdService.findByDateBetween(start, end);
        QueryResult<Qd> queryResult = new QueryResult<>();
        queryResult.setList(qdList);
        queryResult.setTotal(qdList.size());
        return new QueryResponseResult<>(CommonCode.SUCCESS, queryResult);
    }

    @Override
    public ResponseResult save(Qd qd) {
        qd.setId(0);
        qdService.save(qd);
        return new ResponseResult(CommonCode.SUCCESS);
    }

    @Override
    public ResponseResult deleteById(int id) {
        qdService.deleteById(id);
        return new ResponseResult(CommonCode.SUCCESS);
    }

    @Override
    public Qd getOne(int id) {
        return qdService.getOne(id);
    }
}
