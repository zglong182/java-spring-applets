package cn.zglong.applets.json;


/**
 * @Classname Gender
 * @description: Gender
 * @author: zglong
 * @create: 2021-05-27 18:32
 **/


import com.alibaba.fastjson.JSONObject;


public enum Gender {
    M("男"),
    F("女"),
    unknown("未知");

    private String value;

    private Gender(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("label", this.value());
        object.put("value", this.name());
        return object;
    }
}
