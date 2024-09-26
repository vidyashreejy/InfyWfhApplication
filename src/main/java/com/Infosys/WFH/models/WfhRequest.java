package com.Infosys.WFH.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "WfhRequest")
public class WfhRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    private Long empId;
    private String empName;
    private Date fromDate;
    private LocalTime fromTime;
    private Date toDate;
    private LocalTime toTime;
    private Long approverId;
    @Enumerated
    private State state;
}
