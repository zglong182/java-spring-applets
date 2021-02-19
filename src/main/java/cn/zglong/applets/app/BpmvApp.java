package cn.zglong.applets.app;


import lombok.extern.slf4j.Slf4j;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/19 22:59
 */
@Slf4j
public class BpmvApp implements Application {
    @Override
    public void get() {
        log.info("这是审批应用");
    }
}
