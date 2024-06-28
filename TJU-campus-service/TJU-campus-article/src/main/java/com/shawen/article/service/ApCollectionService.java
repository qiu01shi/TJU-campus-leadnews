package com.shawen.article.service;

import com.shawen.model.article.dtos.CollectionBehaviorDto;
import com.shawen.model.common.dtos.ResponseResult;

public interface ApCollectionService {

    /**
     * 收藏
     * @param dto
     * @return
     */
    public ResponseResult collection(CollectionBehaviorDto dto);
}

