package cn.zglong.applets.app.service.impl;


import cn.zglong.applets.base.BaseRepository;
import cn.zglong.applets.app.entity.AppEntity;
import cn.zglong.applets.app.entity.TodoEntity;
import cn.zglong.applets.app.repository.AppRepository;
import cn.zglong.applets.app.repository.TodoRepository;
import cn.zglong.applets.app.service.AppService;
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
