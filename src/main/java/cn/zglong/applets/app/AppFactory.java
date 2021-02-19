package cn.zglong.applets.app;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/19 23:02
 */
public class AppFactory {
    public static Application createBpmvApp() {
        return new BpmvApp();
    }


    public static Application createReptileApp() {
        return new ReptileApp();
    }


    public static Application createTodoApp() {
        return new TodoApp();
    }


    public static Application createWeatherApp() {
        return new WeatherApp();
    }
}
