package com.demo.article.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ArticleListVO {

    private List<ArticleVO> articleList;
    private int articleCnt;

}
