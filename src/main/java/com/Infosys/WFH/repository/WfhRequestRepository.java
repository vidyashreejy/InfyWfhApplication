package com.Infosys.WFH.repository;

import com.Infosys.WFH.models.WfhRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WfhRequestRepository extends JpaRepository<WfhRequest, Long> {
    List<WfhRequest> findByEmpId(Long empId);
}
