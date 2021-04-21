package cn.zglong.applets.app;


import org.springframework.beans.factory.FactoryBean;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/19 22:57
 */
public interface Application extends FactoryBean {
    void get();
}
