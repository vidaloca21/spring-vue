package com.demo.article.dao;

import com.demo.article.vo.ArticleVO;

import java.util.List;

public interface ArticleDAO {

    public List<ArticleVO> getAllArticle();
    public int getAllArticleCnt();
}
