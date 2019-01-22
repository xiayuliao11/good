package com.jk.service.impl;

import com.jk.bean.Attribute;
import com.jk.bean.MallAttr;
import com.jk.mapper.AttrMapper;
import com.jk.utils.QueryParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class AttrServiceImpl implements com.jk.service.AttrService {

    @Resource
    AttrMapper mapper;

    public void addAttr(MallAttr arr, QueryParam param) {
        ArrayList<Attribute> attribute = param.getAttribute();
        Integer shxm_id=null;
          if(arr.getShxm_mch()!=null){
           shxm_id=mapper.getArrrId(arr.getShxm_mch());
           if(shxm_id==null){
               mapper.addMallAttr(arr.getShxm_mch());
               shxm_id=mapper.getArrrId(arr.getShxm_mch());
               System.out.println(shxm_id);
           }
          }
        for (Attribute attribute1 : attribute) {
            attribute1.setShxm_id(shxm_id);
        }
        mapper.addAttr(attribute);
    }

}
