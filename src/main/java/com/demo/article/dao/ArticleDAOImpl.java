package com.demo.article.dao;

import com.demo.article.vo.ArticleVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleDAOImpl extends SqlSessionDaoSupport implements ArticleDAO {

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public List<ArticleVO> getAllArticle() {
        return getSqlSession().selectList("getAllArticle");
    }

    @Override
    public int getAllArticleCnt() {
        return getSqlSession().selectOne("getAllArticleCnt");
    }
}
