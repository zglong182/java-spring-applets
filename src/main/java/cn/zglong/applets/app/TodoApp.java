package cn.zglong.applets.app;


import lombok.extern.slf4j.Slf4j;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/19 23:00
 */
@Slf4j
public class TodoApp implements Application {
    @Override
    public void get() {
        log.info("这是待办应用");
    }
}
