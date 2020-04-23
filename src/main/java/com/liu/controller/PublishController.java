package com.liu.controller;

import com.liu.pojo.Book;
import com.liu.pojo.Publish;
import com.liu.service.PublishService;
import com.liu.utils.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/publish/")
public class PublishController {
    @Resource
    private PublishService publishService;

    @RequestMapping("showPublishPage")
    public String showPublishPage(@RequestParam("page")int page, HttpServletRequest request){
        if( request.getSession().getAttribute("pageSize") == null){ //�ж�úҵ��ʾ�����Ƿ�Ϊ��
            request.getSession().setAttribute("pageSize", 20);//Ϊ��������Ϊ20
        }
        int pageSize = (Integer)request.getSession().getAttribute("pageSize");
        int count;
        List<Publish> publishList = new ArrayList<Publish>();
        publishList = publishService.findPublishInfoList(page, pageSize);//��ѯ����
        count = publishService.selectPublishCount(pageSize);
        request.getSession().setAttribute("publishList", publishList);
        request.getSession().setAttribute("count", count);
        return "publish_list";
    }
    @RequestMapping("showAddInfoPage")
    public String showAddInfoPage(){
        return "publish_add";
    }


    @RequestMapping("addPublishInfo")
    public String addPublishInfo(Publish publish){
        DateUtil dateUtil = new DateUtil();
        publish.setPublishTime(dateUtil.getDateformat());
        publishService.addPublishInfo(publish);
        return "publish_list";

    }


}
