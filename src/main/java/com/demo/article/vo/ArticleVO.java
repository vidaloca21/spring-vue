package com.demo.article.vo;

public class ArticleVO {

    private String articleId;
	private String upperArticleId;
    private String articleContent;
    private String articleTitle;
    private int viewCnt;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getUpperArticleId() {
        return upperArticleId;
    }

    public void setUpperArticleId(String upperArticleId) {
        this.upperArticleId = upperArticleId;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }
}
