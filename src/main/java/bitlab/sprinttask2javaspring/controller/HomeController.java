package bitlab.sprinttask2javaspring.controller;

import bitlab.sprinttask2javaspring.model.ApplicationRequest;
import bitlab.sprinttask2javaspring.service.ApplicationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@org.springframework.stereotype.Controller
public class HomeController {
    @Autowired
    private ApplicationRequestService applicationRequestService;

    @GetMapping
    public String homePage(Model model) {
        List<ApplicationRequest> applicationRequests = applicationRequestService.getSortedRequests();
        model.addAttribute("applicationRequests", applicationRequests);
        return "home";
    }
}
