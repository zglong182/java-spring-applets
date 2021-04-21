package cn.zglong.applets.base;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/21 16:40
 */
@NoRepositoryBean
public interface BaseRepository<ReptileEntity, Long extends Serializable> extends JpaRepository<ReptileEntity, Long> {
}
