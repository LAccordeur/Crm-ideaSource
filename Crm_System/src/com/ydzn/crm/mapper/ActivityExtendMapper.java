package com.ydzn.crm.mapper;

import com.ydzn.crm.po.Activity;

import java.util.HashMap;

/**
 * Created by HeathHose on 2016/8/5.
 */
public interface ActivityExtendMapper {

    //更新活动状态
    int updateAcitvityState(HashMap<String,Object> map) throws Exception;

    //更新活动信息
    int updateActivityInfo(Activity activity) throws Exception;
    //新增已编辑活动
    boolean insertActivity(Activity activity) throws Exception;
}
