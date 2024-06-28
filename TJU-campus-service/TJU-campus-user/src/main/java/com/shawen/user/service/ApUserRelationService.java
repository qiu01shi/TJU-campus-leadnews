package com.shawen.user.service;

import com.shawen.model.common.dtos.ResponseResult;
import com.shawen.model.user.dtos.UserRelationDto;

public interface ApUserRelationService {
    /**
     * 用户关注/取消关注
     * @param dto
     * @return
     */
    public ResponseResult follow(UserRelationDto dto);
}
