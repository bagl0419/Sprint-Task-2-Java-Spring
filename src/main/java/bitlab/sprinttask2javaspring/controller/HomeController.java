package bitlab.sprinttask2javaspring.controller;

import bitlab.sprinttask2javaspring.model.ApplicationRequest;
import bitlab.sprinttask2javaspring.service.ApplicationRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/request/add")
    public String addApplicationRequest(ApplicationRequest applicationRequest) {
        applicationRequestService.addApplicationRequest(applicationRequest);
        return "redirect:/";
    }

    @GetMapping("/request/{id}")
    public String detailsPage(@PathVariable Long id, Model model) {
        ApplicationRequest applicationRequest = applicationRequestService.getRequestById(id);
        model.addAttribute("applicationRequest", applicationRequest);
        return "details";
    }

    @PostMapping("/request/edit")
    public String editRequest(ApplicationRequest applicationRequest) {
        applicationRequest.setHandled(true);
        applicationRequestService.editRequest(applicationRequest);
        return "redirect:/";
    }

    @PostMapping("/request/delete/{id}")
    public String deleteRequest(@PathVariable Long id) {
        applicationRequestService.deleteRequestById(id);
        return "redirect:/";
    }
}
