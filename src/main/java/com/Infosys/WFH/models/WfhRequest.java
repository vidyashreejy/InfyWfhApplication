package com.Infosys.WFH.models;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@Table
@Entity
public class WfhRequest {
    private int id;
    private int empId;
    private String empName;
    private Date fromDate;
    private LocalTime fromTime;
    private Date toDate;
    private LocalTime toTime;
    private int approverId;
    private State state;
}
