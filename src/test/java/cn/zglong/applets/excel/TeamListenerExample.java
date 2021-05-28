package cn.zglong.applets.excel;


import cn.zglong.applets.json.Team;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;


/**
 * @Classname TeamListenerExample
 * @description:
 * @author: zglong
 * @create: 2021-05-28 11:49
 **/
@Slf4j
public class TeamListenerExample extends AnalysisEventListener<Team> {
    /**
     * When analysis one row trigger invoke function.
     *
     * @param data    one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(Team data, AnalysisContext context) {
        log.info(data.toString());
    }

    /**
     * if have something to do after all analysis
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.info("团队解析完成");
    }
}
