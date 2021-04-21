package cn.zglong.applets.app.example;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/19 22:59
 */
@Slf4j
@Component
public class BpmvApp implements Application {
    @Override
    public void get() {
        log.info("这是审批应用");
    }


    @Override
    public Object getObject() throws Exception {
        return new BpmvApp();
    }


    @Override
    public Class<?> getObjectType() {
        return BpmvApp.class;
    }
}
