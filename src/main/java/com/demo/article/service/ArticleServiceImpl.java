package com.demo.article.service;

import com.demo.article.dao.ArticleDAO;
import com.demo.article.vo.ArticleListVO;
import com.demo.article.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDAO articleDAO;

    @Override
    public ArticleListVO getAllArticle() {
        ArticleListVO articleList = new ArticleListVO();
        articleList.setArticleList(articleDAO.getAllArticle());
        articleList.setArticleCnt(articleDAO.getAllArticleCnt());
        return articleList;
    }

}
