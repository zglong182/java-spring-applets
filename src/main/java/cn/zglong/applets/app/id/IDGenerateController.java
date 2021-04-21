package cn.zglong.applets.app.id;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Classname IDGenerateController
 * @description: 唯一ID工具
 * @author: zglong
 * @create: 2021-04-21 11:04
 **/
@RestController
@RequestMapping("/id_generate")
@Slf4j
@Api(tags = "唯一ID工具")
public class IDGenerateController {

    @Autowired
    private IDGenerateService idGenerateService;

    @GetMapping("/uuid/{count}/{flag}")
    @ApiOperation(value = "生成UUID", notes = "默认五个")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "count", value = "生成数量", dataType = "Integer", required = false),
            @ApiImplicitParam(name = "flag", value = "是否带连接符", dataType = "Boolean", required = false)
    })
    public List<String> getUUIDs(@PathVariable(value = "count") Integer count,
                                 @PathVariable(value = "flag") Boolean flag) {
        return idGenerateService.getUUIDs(count, flag);
    }

    @GetMapping("/obj_id/{count}")
    @ApiOperation(value = "生成ObjectId", notes = "默认五个")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "count", value = "生成数量", dataType = "Integer", required = true)
    })
    public List<String> getObjId(@PathVariable(value = "count") Integer count) {
        return idGenerateService.getObjId(count);
    }
}
