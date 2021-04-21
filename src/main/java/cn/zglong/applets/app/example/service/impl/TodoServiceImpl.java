package cn.zglong.applets.app.example.service.impl;


import cn.zglong.applets.base.BaseRepository;
import cn.zglong.applets.app.example.entity.TodoEntity;
import cn.zglong.applets.app.example.repository.TodoRepository;
import cn.zglong.applets.app.example.service.TodoService;
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
