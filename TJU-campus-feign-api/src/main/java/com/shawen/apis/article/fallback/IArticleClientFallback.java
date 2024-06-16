package com.shawen.apis.article.fallback;

import com.shawen.apis.article.IArticleClient;
import com.shawen.model.article.dtos.ArticleDto;
import com.shawen.model.common.dtos.ResponseResult;
import com.shawen.model.common.enums.AppHttpCodeEnum;
import org.springframework.stereotype.Component;

/**
 * feign失败配置
 * @author shawen
 */
@Component
public class IArticleClientFallback implements IArticleClient {
    @Override
    public ResponseResult saveArticle(ArticleDto dto)  {
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"获取数据失败");
    }
}