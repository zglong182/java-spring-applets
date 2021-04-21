package cn.zglong.applets.app.example.repository;


import cn.zglong.applets.base.BaseRepository;
import cn.zglong.applets.app.example.entity.AppEntity;
import org.springframework.stereotype.Repository;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/21 0:10
 */
@Repository
public interface AppRepository extends BaseRepository<AppEntity, Long> {
}
