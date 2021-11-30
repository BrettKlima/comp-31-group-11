package groupassign.roadco.model.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EMPLOYEEID")
    private Integer employeeId;

    @Column(name="EMPNAME")
    private String emp_name;

    @Column(name="EMPEMAIL")
    private String emp_email;

    @Column(name="EMPROLE")
    private String emp_role;

    @Column(name="EMPPHONE")
    private String emp_phone;

}
