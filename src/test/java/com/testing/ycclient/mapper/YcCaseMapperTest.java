package com.testing.ycclient.mapper;

import com.testing.ycclient.model.YcCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//自动装配操作必须通过启动springboot启动类，由框架完成，否则会是空对象
@SpringBootTest

//单元测试的回滚
@Transactional
class YcCaseMapperTest {
//单元测试  alt+insert

    @Autowired
    YcCaseMapper ycCaseMapper;

    @Test
    void testGeCaseById() {
        YcCase caseById=ycCaseMapper.getCaseById(2l);
        System.out.println("查询结果是"+caseById);
    }

    @Test
    @Rollback(false)  //用例回滚
    void delCaseById() {
        ycCaseMapper.delCase(2L);

    }

    @Test

    void testDelCaseById() {
        List<Long> idList=new ArrayList<>();
        idList.add(1L);
        idList.add(2l);
        ycCaseMapper.delCaseById(idList);

    }
    @Test
    void testGetcaseByParam1() {
        List<YcCase> yclist = ycCaseMapper.getcaseByParam1("");
        System.out.println("查询的结果是："+yclist);
    }

    @Test
    void testUpdateCase() {
        YcCase yccase=new YcCase(1L,"修改","11","111","xiugai","1111");
        int i= ycCaseMapper.updateCaseByXML(yccase);
        System.out.println("-------------"+i);
    }
}