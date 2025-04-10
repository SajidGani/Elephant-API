package com.csc340.Elephants.API;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // This will return the custom error page
        return "error-page"; // Refers to error-page.ftl template
    }

    public String getErrorPath() {
        return "/error";
    }
}
