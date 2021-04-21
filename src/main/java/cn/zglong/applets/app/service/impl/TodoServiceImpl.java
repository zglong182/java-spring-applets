package cn.zglong.applets.app.service.impl;


import cn.zglong.applets.base.BaseRepository;
import cn.zglong.applets.app.entity.AppEntity;
import cn.zglong.applets.app.entity.TodoEntity;
import cn.zglong.applets.app.repository.TodoRepository;
import cn.zglong.applets.app.service.TodoService;
import org.springframework.stereotype.Service;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/21 0:08
 */
@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;


    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @Override
    public BaseRepository<TodoEntity, Long> getRepository() {
        return todoRepository;
    }
}
