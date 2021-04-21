package cn.zglong.applets;


import cn.zglong.applets.app.example.AppFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author zglong
 * @date 2021年2月19日22点45分
 */
@SpringBootApplication
@RestController
@RequestMapping("/home")
@EnableSwagger2
public class JavaSpringAppletsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringAppletsApplication.class, args);
    }


    @GetMapping("/example")
    public void example() {
        AppFactory.createTodoApp().get();
        AppFactory.createBpmvApp().get();
        AppFactory.createReptileApp().get();
        AppFactory.createWeatherApp().get();
    }
}
