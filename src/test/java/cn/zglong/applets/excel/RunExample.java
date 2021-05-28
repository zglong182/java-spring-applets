package cn.zglong.applets.excel;


import cn.zglong.applets.json.Team;
import cn.zglong.applets.json.User;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import org.junit.Test;


/**
 * @Classname RUnExample
 * @description: easyExcel
 * @author: zglong
 * @create: 2021-05-28 09:17
 **/
public class RunExample {
    public static void main(String[] args) {

    }

    @Test
    public void simpleRead() {
        String fileName = "H:\\my\\java-spring-applets\\src\\db\\user.xlsx";

        // 读取唯一sheet
        EasyExcel.read(fileName, User.class, new UserListenerExample()).sheet().headRowNumber(12).doRead();

        // 读取全部sheet
//        EasyExcel.read(fileName,User.class,new UserListenerExample()).doReadAll();

        // 读取指定sheet
//        EasyExcel.read(fileName, User.class, new UserListenerExample()).sheet(0).doRead();

        // 不同sheet不同的回调,不同的Class
        ExcelReader excelReader = null;
        try {

            excelReader = EasyExcel.read(fileName).build();
            ReadSheet sheetUser = EasyExcel.readSheet(0).head(User.class).registerReadListener(new UserListenerExample()).build();
            ReadSheet sheetTeam = EasyExcel.readSheet(1).head(Team.class).registerReadListener(new TeamListenerExample()).build();
            excelReader.read(sheetUser, sheetTeam);
        } finally {
            if (excelReader != null) {
                // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
                excelReader.finish();
            }
        }

    }

}
