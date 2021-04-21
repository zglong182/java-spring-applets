package cn.zglong.applets.app.example.service.impl;


import cn.zglong.applets.base.BaseRepository;
import cn.zglong.applets.app.example.entity.AppEntity;
import cn.zglong.applets.app.example.repository.AppRepository;
import cn.zglong.applets.app.example.service.AppService;
import org.springframework.stereotype.Service;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/21 0:08
 */
@Service
public class AppServiceImpl implements AppService {
    private final AppRepository appRepository;


    public AppServiceImpl(AppRepository todoRepository) {
        this.appRepository = todoRepository;
    }


    @Override
    public BaseRepository<AppEntity, Long> getRepository() {
        return appRepository;
    }


}
