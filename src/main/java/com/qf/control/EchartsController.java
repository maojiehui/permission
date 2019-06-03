package com.qf.control;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.qf.dto.HistogramDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by DELL on 2019/5/30.
 */
@Controller
public class EchartsController {

    @CrossOrigin(origins = "*", maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "getDataJsonp",method = RequestMethod.GET)
    public Object getDataJsonp(String callback){//此处与前端jsonp属性一致
        System.out.println("inner getDataJsonp");
        System.out.println(callback);
        HistogramDto dto = new HistogramDto();
        dto.addCategory("苹果");
        dto.addCategory("梨子");
        dto.addCategory("香蕉");
        dto.addCategory("菠萝");
        dto.addCategory("芒果");
        dto.addData("100");
        dto.addData("50");
        dto.addData("120");
        dto.addData("40");
        dto.addData("170");
        //注意返回值类型应该为JSONPObject所封装
        JSONPObject jsonpObject = new JSONPObject(callback,dto);
        return jsonpObject;
    }

}
