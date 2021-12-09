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
    public Integer employeeId;

    @Column(name="EMPLOYEEFIRSTNAME")
    public String employeeFirstName;

    @Column(name="EMPLOYEELASTNAME")
    public String employeeLastName;

    @Column(name="EMPLOYEEEMAIL")
    public String employeeEmail;

    @Column(name="EMPLOYEEROLE")
    public String employeeRole;

    @Column(name="EMPLOYEEPHONE")
    public String employeePhone;


}
