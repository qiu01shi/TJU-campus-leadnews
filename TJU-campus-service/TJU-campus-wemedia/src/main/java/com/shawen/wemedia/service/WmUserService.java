package com.shawen.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shawen.model.common.dtos.ResponseResult;
import com.shawen.model.wemedia.dtos.WmLoginDto;
import com.shawen.model.wemedia.pojos.WmUser;

public interface WmUserService extends IService<WmUser> {

    /**
     * 自媒体端登录
     * @param dto
     * @return
     */
    public ResponseResult login(WmLoginDto dto);

}