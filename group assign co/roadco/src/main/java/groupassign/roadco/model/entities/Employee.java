package groupassign.roadco.model.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employeeID")
    private Integer employeeId;

    @Column(name="empName")
    private String emp_name;

    @Column(name="empEmail")
    private String emp_email;

    @Column(name="empRole")
    private String emp_role;

    @Column(name="empPhone")
    private String emp_phone;

    @OneToMany(mappedBy = "schedule")
    private Schedule schedule;

    public Employee(){
        employeeId = 0;
        emp_name="";
        emp_email="";
        emp_role="";
        emp_phone="";
    }
}
