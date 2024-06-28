package com.shawen.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shawen.model.article.dtos.ArticleDto;
import com.shawen.model.article.dtos.ArticleHomeDto;
import com.shawen.model.article.dtos.ArticleInfoDto;
import com.shawen.model.article.pojos.ApArticle;
import com.shawen.model.common.dtos.ResponseResult;

import java.io.IOException;

public interface ApArticleService extends IService<ApArticle> {

    /**
     * 根据参数加载文章列表
     * @param loadtype 1为加载更多  2为加载最新
     * @param dto
     * @return
     */
    ResponseResult load(Short loadtype, ArticleHomeDto dto);

    /**
     * 保存app端相关文章
     * @param dto
     * @return
     */
    ResponseResult saveArticle(ArticleDto dto) ;

    /**
     * 加载文章详情 数据回显
     * @param dto
     * @return
     */
    public ResponseResult loadArticleBehavior(ArticleInfoDto dto);

    /**
     * 加载文章列表
     * @param dto
     * @param type  1 加载更多   2 加载最新
     * @param firstPage  true  是首页  flase 非首页
     * @return
     */
    public ResponseResult load2(ArticleHomeDto dto, Short type, boolean firstPage);

}