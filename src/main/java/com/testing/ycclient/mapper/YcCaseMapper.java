package com.testing.ycclient.mapper;

import com.testing.ycclient.model.Cases;
import com.testing.ycclient.model.YcCase;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface YcCaseMapper {

    @Select("select * from yc_case")
    List<Map<String,Object>> getDatas();

    @Select("select * from yc_case")
    List<YcCase> getCases();

    @Select("select * from yc_case")
    List<Cases> getwrongCases();


    @Select("select * from yc_case where step_name=#{stepName}")
    List<YcCase> getCasesByStep(@Param("stepName") String stepName);

    @Insert("insert into yc_case values(#{id},#{caseName},#{stepName},#{keywords},#{param1},#{author})")
    int addCase(YcCase ycCase);

    @Delete("delete from yc_case  where id=#{id}")
    int delCase(@Param("id") Long id);

    @Update("update yc_case set author=#{author}")
    int updateCase(@Param("author")   String author);


    //-------------------------------以下是XML映射文件的配置SQL语句-------------------------------------

    YcCase getCaseById(Long id);

    //批量删除数组中的元素
    int  delCaseById(List<Long> ids);

    //查询 可传空或null
    List<YcCase> getcaseByParam1(@Param("Param1")String Param1);

    //更新updateCase
    int updateCaseByXML(YcCase yccase);
}
