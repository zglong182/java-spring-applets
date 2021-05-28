package cn.zglong.applets.app.id;


import cn.hutool.core.util.IdUtil;
import cn.zglong.applets.utils.IMEIANDiMSI;
import cn.zglong.applets.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @Classname IDGenerateService
 * @description: 唯一ID工具
 * @author: zglong
 * @create: 2021-04-21 11:42
 **/
@Service
public class IDGenerateService {

    @Autowired
    private IDGenerateRepository idGenerateRepository;
    public List<String> getUUIDs(int count, boolean flag) {
        List<String> UUIDList = new ArrayList<>();
        if (StringUtils.isNull(count)) {
            count = 5;
        }
        for (int i = 0; i < count; i++) {
            if (flag) {
                UUIDList.add(IdUtil.randomUUID());
            } else {
                if (count > 10000) {
                    UUIDList.add(IdUtil.fastSimpleUUID());
                }else {
                    UUIDList.add(IdUtil.simpleUUID());
                }
            }
        }
        IDGenerateEntity idGenerateEntity = new IDGenerateEntity();
        idGenerateEntity.setIp("10.192.1.230");
        idGenerateRepository.save(idGenerateEntity);
        return UUIDList;
    }

    public static void main(String[] args) {
        IDGenerateService idGenerateService = new IDGenerateService();
        System.out.println(idGenerateService.getObjId(5));
    }
    public List<String> getObjId(int count) {
        List<String> objIds = new ArrayList<>();
        if (StringUtils.isNull(count)) {
            count = 5;
        }
        for (int i = 0; i < count; i++) {
            objIds.add(IdUtil.objectId());
        }
        return objIds;
    }

    public List<String> getIMEI(Integer count) {
        if (StringUtils.isNull(count)) {
            count = 5;
        }List<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(IMEIANDiMSI.getIMEI());
        }
        return list;
    }
}
