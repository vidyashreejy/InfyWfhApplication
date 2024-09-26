package com.Infosys.WFH.service;

import com.Infosys.WFH.models.State;
import com.Infosys.WFH.models.WfhRequest;
import com.Infosys.WFH.repository.WfhRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WfhRequestService {
    @Autowired
    private WfhRequestRepository repository;

    public WfhRequest createRequest(WfhRequest request) {
        return repository.save(request);
    }

    public WfhRequest getRequest(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<WfhRequest> getRequestByEmpId(Long empId) {
        return repository.findByEmpId(empId);
    }

    public WfhRequest updateRequest(Long id, WfhRequest request) {
        WfhRequest existing = getRequest(id);
        existing.setFromDate(request.getFromDate());
        existing.setToDate(request.getToDate());
        existing.setFromTime(request.getFromTime());
        existing.setToTime(request.getToTime());
        existing.setApproverId(request.getApproverId());
        return repository.save(existing);
    }

    public void deleteRequest(Long id) {
        repository.deleteById(id);
    }

    public WfhRequest approveRequest(Long id) {
        WfhRequest request = getRequest(id);
        request.setState(State.APPROVED);
        return repository.save(request);
    }

    public WfhRequest rejectRequest(Long id) {
        WfhRequest request = getRequest(id);
        request.setState(State.REJECTED);
        return repository.save(request);
    }
}
