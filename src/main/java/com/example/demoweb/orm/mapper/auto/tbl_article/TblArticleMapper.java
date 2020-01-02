package com.example.demoweb.orm.mapper.auto.tbl_article;

import com.example.demoweb.orm.model.auto.tbl_article.TblArticle;
import com.example.demoweb.orm.model.auto.tbl_article.TblArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblArticleMapper {
    int countByExample(TblArticleExample example);

    int deleteByExample(TblArticleExample example);

    int deleteByPrimaryKey(String article_id);

    int insert(TblArticle record);

    int insertSelective(TblArticle record);

    List<TblArticle> selectByExampleWithBLOBs(TblArticleExample example);

    List<TblArticle> selectByExample(TblArticleExample example);

    TblArticle selectByPrimaryKey(String article_id);

    int updateByExampleSelective(@Param("record") TblArticle record, @Param("example") TblArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") TblArticle record, @Param("example") TblArticleExample example);

    int updateByExample(@Param("record") TblArticle record, @Param("example") TblArticleExample example);

    int updateByPrimaryKeySelective(TblArticle record);

    int updateByPrimaryKeyWithBLOBs(TblArticle record);

    int updateByPrimaryKey(TblArticle record);
}