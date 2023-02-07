package ua.hillelit.lms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * {@link WebController}
 *
 * @author Dmytro Trotsenko on 2/7/23
 */

@Controller
@RequestMapping("/")
@Slf4j
public class WebController {

    private static final int year = LocalDateTime.now().getYear();

    @GetMapping("home")
    public String welcome(Model model) {
        log.info("Home page");
        model.addAttribute("year", year);
        return "main/home";
    }

    @GetMapping("info")
    public String info(Model model) {
        log.info("Info page");
        model.addAttribute("year", year);
        model.addAttribute("systemTimeNano", LocalDateTime.now().getNano());
        return "main/info";
    }

    @GetMapping("about")
    public String about(Model model) {
        log.info("About project page");
        model.addAttribute("year", year);
        return "main/about";
    }

}
