package bitlab.sprinttask2javaspring.service;

import bitlab.sprinttask2javaspring.model.ApplicationRequest;
import bitlab.sprinttask2javaspring.repository.ApplicationRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationRequestService {
    @Autowired
    private ApplicationRequestRepository applicationRequestRepository;
    public List<ApplicationRequest> getSortedRequests() {
        return applicationRequestRepository.findAll();
    }

    public ApplicationRequest addApplicationRequest(ApplicationRequest applicationRequest) {
       return applicationRequestRepository.save(applicationRequest);
    }

    public ApplicationRequest getRequestById(Long id) {
        return applicationRequestRepository.findById(id).orElse(null);
    }

    public ApplicationRequest editRequest(ApplicationRequest applicationRequest) {
        return applicationRequestRepository.save(applicationRequest);
    }

    public void deleteRequestById(Long id) {
        applicationRequestRepository.deleteById(id);
    }
}

