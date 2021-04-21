package cn.zglong.applets.app;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/19 22:58
 */
@Slf4j
@Component
public class ReptileApp implements Application{
    @Override
    public void get() {
      log.info("这是爬虫应用");
    }


    @Override
    public Object getObject() throws Exception {
        return new ReptileApp();
    }


    @Override
    public Class<?> getObjectType() {
        return ReptileApp.class;
    }
}
