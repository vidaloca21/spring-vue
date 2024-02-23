package com.demo.article.controller;

import com.demo.article.service.ArticleService;
import com.demo.article.vo.ArticleListVO;
import com.demo.article.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/board")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @GetMapping("/list")
    public ArticleListVO getArticleList() {
        return articleService.getAllArticle();
    }

}
