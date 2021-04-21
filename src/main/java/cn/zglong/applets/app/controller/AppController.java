package cn.zglong.applets.app.controller;


import cn.zglong.applets.base.BaseController;
import cn.zglong.applets.base.BaseService;
import cn.zglong.applets.app.entity.AppEntity;
import cn.zglong.applets.app.service.AppService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/21 0:05
 */
@RestController
@RequestMapping("/app")
@Slf4j
@Api(tags = "应用管理")
public class AppController extends BaseController<AppEntity, Long> {

    private final AppService appService;


    public AppController(AppService appService) {
        this.appService = appService;
    }


    @Override
    public BaseService<AppEntity, Long> getService() {
        return appService;
    }
}
