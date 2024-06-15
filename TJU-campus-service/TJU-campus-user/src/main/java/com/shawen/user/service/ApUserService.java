package com.shawen.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shawen.model.common.dtos.ResponseResult;
import com.shawen.model.user.dtos.LoginDto;
import com.shawen.model.user.pojos.ApUser;

public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    public ResponseResult login(LoginDto dto);
}
