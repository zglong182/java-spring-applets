package cn.zglong.applets.demo;


import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Classname UserController
 * @description:
 * @author: zglong
 * @create: 2021-05-18 13:05
 **/
@RestController
public class UserController implements UserApi {

    @Override
    public String getUser(@ApiParam(value = "username", required = true) String username) {
        return "UserController";
    }
}
