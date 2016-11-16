package se.kits.svedberg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Pär Svedberg on 2016-10-25.
 */
@Controller
public class MiscController {

    @RequestMapping({"/explorer", "/about"})
    public String index() {
        return "/";
    }
}
