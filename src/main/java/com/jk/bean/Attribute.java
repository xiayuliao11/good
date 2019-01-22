package com.jk.bean;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Attribute {

    private Integer id;//(编号)             PKInteger
    private String shxzh;//(属性值)        String(100)
    private String shfqy;//(是否启用)      String(1)
    private Integer shxm_id;//(属性id)      Integer
    private String shxzh_mch;//(属性值名)  String(100)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date chjshj;//(创建时间)     Date
}
