package cn.zglong.applets.app.service.impl;


import cn.zglong.applets.base.BaseRepository;
import cn.zglong.applets.app.entity.ReptileEntity;
import cn.zglong.applets.app.repository.ReptileRepository;
import cn.zglong.applets.app.service.ReptileService;
import org.springframework.stereotype.Service;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/21 16:53
 */
@Service
public class ReptileServiceImpl implements ReptileService {
    private final ReptileRepository reptileRepository;


    public ReptileServiceImpl(ReptileRepository reptileRepository) {
        this.reptileRepository = reptileRepository;
    }


    @Override
    public BaseRepository<ReptileEntity, Long> getRepository() {
        return reptileRepository;
    }
}
