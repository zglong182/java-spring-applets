package cn.zglong.applets.excel;


import cn.zglong.applets.json.User;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;


/**
 * @Classname ListenerExample
 * @description: 读取每一行数据的回调
 * @author: zglong
 * @create: 2021-05-28 11:22
 **/
@Slf4j
public class UserListenerExample extends AnalysisEventListener<User> {

    @Override
    public void invoke(User user, AnalysisContext analysisContext) {
        log.info(user.toString());
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("用户解析完成");
    }

    /**
     * Returns the header as a map.Override the current method to receive header data.
     *
     * @param headMap
     * @param context
     */
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        super.invokeHeadMap(headMap, context);
    }
}
