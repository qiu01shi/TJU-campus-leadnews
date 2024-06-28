package com.shawen.user.controller.v1;

import com.shawen.model.common.dtos.ResponseResult;
import com.shawen.model.user.dtos.UserRelationDto;
import com.shawen.user.service.ApUserRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserRelationController {

    @Autowired
    private ApUserRelationService apUserRelationService;

    @PostMapping("/user_follow")
    public ResponseResult follow(@RequestBody UserRelationDto dto){
        return apUserRelationService.follow(dto);
    }
}
