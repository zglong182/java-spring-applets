package cn.zglong.applets.app.repository;


import cn.zglong.applets.base.BaseRepository;
import cn.zglong.applets.app.entity.TodoEntity;
import org.springframework.stereotype.Repository;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/21 0:10
 */
@Repository
public interface TodoRepository extends BaseRepository<TodoEntity, Long> {
}
