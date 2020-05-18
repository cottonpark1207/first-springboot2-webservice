package com.soma.world.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 머스테치에 URL 매핑. return 값의 의미 : src/main/resources/templates/index.mustache로 전환되어
 * View Resolver(URL 요청의 결과를 전달할 타입과 값을 지정하는 관리자 격)가 처리.
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
