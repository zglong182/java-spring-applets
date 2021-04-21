package cn.zglong.applets.app.id;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;


/**
 * @Classname IdGenerateEntity
 * @description:
 * @author: zglong
 * @create: 2021-04-21 11:45
 **/
@Data
@Entity
@Table(name = "app_id_generate")
public class IDGenerateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ip;
}
