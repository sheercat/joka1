package net.vg4.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by amano on 2016/12/19.
 */

@Controller("Root")
@lombok.extern.slf4j.Slf4j
public class RootController {
    @RequestMapping("/")
    String loginForm() {
        log.info("dispatch index");
        return "index";
    }

}
