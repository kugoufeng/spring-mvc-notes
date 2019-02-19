package cn.jeremy.study.springmvc.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class AppConfig
{

    @RequestMapping("/hello")
    public String hello()
    {
        return "hello";
    }
}
