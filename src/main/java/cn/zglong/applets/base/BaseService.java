package cn.zglong.applets.base;


import cn.zglong.applets.utils.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/21 16:36
 */
@FunctionalInterface
public interface BaseService<E, ID extends Serializable> {

    public BaseRepository<E, ID> getRepository();


    public default E get(ID id) {
        return getRepository().findById(id).orElse(null);
    }


    public default void del(ID id) {
        E entity = getRepository().findById(id).orElse(null);
        if (StringUtils.isNotNull(entity)) {
            getRepository().delete(entity);
        }
    }


    public default E add(E entity) {
        return getRepository().save(entity);
    }


    public default E update(ID id, E entity) {
        if (StringUtils.isNotNull(entity)) {
            return getRepository().save(entity);
        }
        return null;
    }


    public default List<E> list() {
        return getRepository().findAll();
    }


    public default void deletes(List<ID> ids) {
        List<E> entitys = new ArrayList<E>();
        for (ID id : ids) {
            E e = getRepository().findById(id).orElse(null);
            if (StringUtils.isNotNull(e)) {
                entitys.add(e);
            }
        }
        getRepository().deleteInBatch(entitys);
    }

}
