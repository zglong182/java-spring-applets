package cn.zglong.applets.base;


import cn.zglong.applets.result.Results;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/21 14:01
 */

@Slf4j
@Service
public abstract class BaseController<E, ID extends Serializable> {
    @Autowired
    public abstract BaseService<E, ID> getService();


    @PostMapping
    @ApiOperation("新增")
    public Results add(@RequestBody E entity) {
        return Results.success().render(getService().add(entity));
    }


    @GetMapping("/{id}")
    @ApiOperation("查询")
    public Results get(@PathVariable ID id) {
        return Results.success().render(getService().get(id));
    }


    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Results del(@PathVariable ID id) {
        getService().del(id);
        return Results.success();
    }


    @PutMapping("/{id}")
    @ApiOperation("更新")
    public Results update(@PathVariable ID id, @RequestBody E entity) {
        return Results.success().render(getService().update(id, entity));
    }


    @GetMapping("/list")
    @ApiOperation(("查询所有"))
    public Results list() {
        return Results.success().render(getService().list());
    }


    @DeleteMapping("/deletes")
    @ApiOperation(("批量删除"))
    public Results deletes(@RequestBody List<ID> ids) {
        getService().deletes(ids);
        return Results.success();
    }
}
