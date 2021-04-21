package cn.zglong.applets.app.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author zglong
 * @version 1.0
 * @date 2021/2/21 0:09
 */
@Data
@Entity
@Table(name = "app_reptile")
public class ReptileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
