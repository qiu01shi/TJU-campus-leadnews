package com.shawen.behavior.service;

import com.shawen.model.behavior.dtos.ReadBehaviorDto;
import com.shawen.model.common.dtos.ResponseResult;

public interface ApReadBehaviorService {

    /**
     * 保存阅读行为
     * @param dto
     * @return
     */
    public ResponseResult readBehavior(ReadBehaviorDto dto);
}
