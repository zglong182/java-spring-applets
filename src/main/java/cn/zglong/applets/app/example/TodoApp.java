package cn.zglong.applets.app.example;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/19 23:00
 */
@Slf4j
@Component
public class TodoApp implements Application {
    @Override
    public void get() {
        log.info("这是待办应用");
    }


    @Override
    public Object getObject() throws Exception {
        return new TodoApp();
    }


    @Override
    public Class<?> getObjectType() {
        return TodoApp.class;
    }
}
