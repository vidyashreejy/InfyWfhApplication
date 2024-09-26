package com.Infosys.WFH.controller;

import com.Infosys.WFH.models.WfhRequest;
import com.Infosys.WFH.service.WfhRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private WfhRequestService wfhRequestService;

    @PutMapping("/approve/{id}")
    public ResponseEntity<WfhRequest> approveRequest(@PathVariable Long id) {
        return ResponseEntity.ok(wfhRequestService.approveRequest(id));
    }

    @PutMapping("/reject/{id}")
    public ResponseEntity<WfhRequest> rejectRequest(@PathVariable Long id) {
        return ResponseEntity.ok(wfhRequestService.rejectRequest(id));
    }
}
