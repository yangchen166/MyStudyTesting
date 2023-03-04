package com.testing.ycclient.services.impl;

import com.testing.ycclient.mapper.YcCaseMapper;
import com.testing.ycclient.model.YcCase;
import com.testing.ycclient.services.YcCaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
@Service("ycCaseServices")
//实现类
public class YcCaseServicesImpl implements YcCaseServices {
    @Autowired
    YcCaseMapper ycCaseMapper;

    @Override
    public int delCases(List<Long> ids) {

        int count=0;
        for(Long id:ids){
            count+=ycCaseMapper.delCase(id);
        }
        System.out.println("删除了"+count+"条用例");
        return count;
    }
}
