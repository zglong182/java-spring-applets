package cn.zglong.applets.app.example.repository;


import cn.zglong.applets.base.BaseRepository;
import cn.zglong.applets.app.example.entity.ReptileEntity;
import org.springframework.stereotype.Repository;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/21 0:10
 */
@Repository
public interface ReptileRepository extends BaseRepository<ReptileEntity, Long> {

}
