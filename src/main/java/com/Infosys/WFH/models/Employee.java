package com.Infosys.WFH.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private int emp_id;
    private String emp_name;
    private String email;
    private boolean isApprover;
}
