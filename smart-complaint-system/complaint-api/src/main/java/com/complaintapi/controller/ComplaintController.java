
package com.complaintapi.controller;

import com.complaintapi.model.Complaint;
import com.complaintapi.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {

    @Autowired
    private ComplaintRepository repository;

    @GetMapping
    public List<Complaint> getAllComplaints() {
        return repository.findAll();
    }

    @PostMapping
    public Complaint createComplaint(@RequestBody Complaint complaint) {
        complaint.setStatus("Pending");
        return repository.save(complaint);
    }

    @PutMapping("/{id}")
    public Complaint updateStatus(@PathVariable Long id, @RequestBody Complaint updated) {
        Complaint comp = repository.findById(id).orElseThrow();
        comp.setStatus(updated.getStatus());
        return repository.save(comp);
    }
}
