package com.Infosys.WFH.controller;

import com.Infosys.WFH.models.WfhRequest;
import com.Infosys.WFH.service.WfhRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wfh")
public class WfhRequestController {

    @Autowired
    private WfhRequestService wfhRequestService;

    @PostMapping("/create")
    public ResponseEntity<WfhRequest> createRequest(@RequestBody WfhRequest request) {
        return ResponseEntity.ok(wfhRequestService.createRequest(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<WfhRequest> getRequest(@PathVariable Long id) {
        return ResponseEntity.ok(wfhRequestService.getRequest(id));
    }

    @GetMapping("/by-empId")
    public ResponseEntity<List<WfhRequest>> getRequestByEmpId(@RequestParam Long empId) {
        return ResponseEntity.ok(wfhRequestService.getRequestByEmpId(empId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<WfhRequest> updateRequest(@PathVariable Long id, @RequestBody WfhRequest request) {
        return ResponseEntity.ok(wfhRequestService.updateRequest(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRequest(@PathVariable Long id) {
        wfhRequestService.deleteRequest(id);
        return ResponseEntity.ok().build();
    }
}

