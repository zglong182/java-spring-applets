package cn.zglong.applets.json;


import cn.zglong.applets.excel.CustomStringToDateConverter;
import cn.zglong.applets.excel.CustomStringToGenderConverter;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;


/**
 * @Classname User
 * @description:
 * @author: zglong
 * @create: 2021-05-27 18:32
 **/
@Data
public class User {
    private String id;
    private String name;
    private String password;
    private String email;
    @ExcelProperty(converter = CustomStringToGenderConverter.class)
    private Gender gender;

    @ExcelProperty(converter = CustomStringToDateConverter.class)
    private Date registerDate;
}
