package cn.zglong.applets.demo;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Classname UserApi
 * @description:
 * @author: zglong
 * @create: 2021-05-18 12:01
 **/
@Api(value = "user")
@RequestMapping("/user")
//@Validated
public interface UserApi {
    @GetMapping("/get_user")
    @ApiOperation("获取用户")
    String getUser(@ApiParam(value = "username", required = true) String username);
}
