package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vitelon on 2016/12/3.
 */
@Controller
public class TestController {

    /**
     * @ResponseBody 该注解可以把map自动转换成json格式给前台
     */
    @RequestMapping(value = "/ajax",method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Map ajax(HttpServletRequest request){

        Map mapJson = new HashMap();
        String person;
        String optValues = request.getParameter("opt_values");
        if ("1".equals(optValues)){
            person = "姓名：张三，年龄：24，性别：男，出生地：广西南宁";
            mapJson.put("person",person);
        }
        if ("2".equals(optValues)){
            person = "姓名：李四，年龄：30，性别：男，出生地：广西百色";
            mapJson.put("person",person);
        }
        if ("3".equals(optValues)){
            person = "姓名：王五，年龄29，性别：男，出生地：广西桂林";
            mapJson.put("person",person);
        }
        return mapJson;
    }
}
