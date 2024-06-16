package com.shawen.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shawen.model.common.dtos.ResponseResult;
import com.shawen.model.wemedia.dtos.WmNewsDto;
import com.shawen.model.wemedia.dtos.WmNewsPageReqDto;
import com.shawen.model.wemedia.pojos.WmNews;

public interface WmNewsService extends IService<WmNews> {

    /**
     * 条件查询文章列表
     * @param dto
     * @return
     */
    public ResponseResult findList(WmNewsPageReqDto dto);

    /**
     * 发布修改文章或保存为草稿
     * @param dto
     * @return
     */
    public ResponseResult submitNews(WmNewsDto dto);


}
