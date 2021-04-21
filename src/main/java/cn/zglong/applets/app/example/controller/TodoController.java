package cn.zglong.applets.app.example.controller;


import cn.zglong.applets.base.BaseController;
import cn.zglong.applets.base.BaseService;
import cn.zglong.applets.app.example.entity.TodoEntity;
import cn.zglong.applets.app.example.service.TodoService;
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
@RequestMapping("/todo")
@Slf4j
@Api(tags = "待办管理")
public class TodoController extends BaseController<TodoEntity, Long> {

    private final TodoService todoService;


    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }


    @Override
    public BaseService<TodoEntity, Long> getService() {
        return todoService;
    }
}
