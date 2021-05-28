package cn.zglong.applets.json;


import cn.zglong.applets.JavaSpringAppletsApplicationTests;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;


/**
 * @Classname JsonTest
 * @description: json测试
 * @author: zglong
 * @create: 2021-05-27 18:46
 **/
public class JsonTest extends JavaSpringAppletsApplicationTests {
    @Test
    public void javaToJson() {
        User user = new User();
        user.setId("1786424");
        user.setName("zglong");
        user.setEmail("admin@admin.com");
//        user.setGender();

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(user);
        String string = jsonObject.toString();
        System.out.println(string);
        JSONObject jsonObject1 = (JSONObject) JSON.parse(string);
        User user1 = JSONObject.toJavaObject(jsonObject1, User.class);
//        System.out.println(user1.getGender().value());
    }
}
