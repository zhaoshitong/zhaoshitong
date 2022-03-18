package com.bdqn.controller;


import cn.itrip.dao.itripAreaDic.ItripAreaDicMapper;
import cn.itrip.dao.itripLabelDic.ItripLabelDicMapper;
import cn.itrip.pojo.ItripAreaDic;
import cn.itrip.pojo.ItripLabelDic;
import itrip.common.Dto;
import itrip.common.DtoUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class bizController {

// 热门城市
    @Resource
    ItripAreaDicMapper dao;
    @RequestMapping("/api/hotel/queryhotcity/{type}")

    @ResponseBody
    public Dto getCitty(@PathVariable("type")int t) throws  Exception{

        System.out.println(t);
        List<ItripAreaDic> list=dao.selectChina(t);

        return DtoUtil.returnDataSuccess(list);

    }

    // 首页热门酒店特色
    @Resource
    ItripLabelDicMapper dao1;
    @RequestMapping("/api/hotel/queryhotelfeature")

    @ResponseBody
    public Dto getCittytese() throws  Exception{

         List<ItripLabelDic> list=dao1.fisttop();

        return DtoUtil.returnDataSuccess(list);

    }


    //个人中心

    @Resource
    ItripLabelDicMapper dao2;
    @RequestMapping("api/userinfo/queryuserlinkuser")

    @ResponseBody
    public Dto getuser() throws  Exception{

        List<ItripLabelDic> list=dao1.fisttop();

        return DtoUtil.returnDataSuccess(list);

    }

}
