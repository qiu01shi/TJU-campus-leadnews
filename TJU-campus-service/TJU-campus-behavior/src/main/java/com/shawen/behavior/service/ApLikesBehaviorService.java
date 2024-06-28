package com.shawen.behavior.service;

import com.shawen.model.behavior.dtos.LikesBehaviorDto;
import com.shawen.model.common.dtos.ResponseResult;

public interface ApLikesBehaviorService {

    /**
     * 存储喜欢数据
     * @param dto
     * @return
     */
    public ResponseResult like(LikesBehaviorDto dto);
}
