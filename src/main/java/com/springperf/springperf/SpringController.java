package com.springperf.springperf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class SpringController {
    @GetMapping
    public String hello() {
        log.info("Hitting endpoint hello");
        CustomClass customClass = CustomClass.builder().build();

        String s = CustomUtility.doSomething("ABCDEF");

        return "Hello Spring";
    }
}
