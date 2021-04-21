package cn.zglong.applets.app.example.controller;


import cn.zglong.applets.base.BaseController;
import cn.zglong.applets.base.BaseService;
import cn.zglong.applets.app.example.entity.ReptileEntity;
import cn.zglong.applets.app.example.service.ReptileService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/21 16:47
 */
@RestController
@RequestMapping("/reptile")
@Slf4j
@Api(tags = "爬虫管理")
public class ReptileController extends BaseController<ReptileEntity, Long> {
    private final ReptileService reptileService;


    public ReptileController(ReptileService reptileService) {
        this.reptileService = reptileService;
    }


    @Override
    public BaseService<ReptileEntity, Long> getService() {
        return reptileService;
    }
}
