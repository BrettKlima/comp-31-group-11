package groupassign.roadco.model.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="SCHEDULE")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SCHEDULEID")
    private Integer scheduleID;

    @Column(name="SCHDAY")
    private String schDay;

    @Column(name="SCHMONTH")
    private String schMonth;

    @Column(name="SCHYEAR")
    private String schYear;

    @Column(name="SCHSTARTTIME")
    private String schStartTime;

    @Column(name="SCHENDTIME")
    private String schEndTime;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEEID", nullable = true)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "PROJECTID", nullable = true)
    private Project project;
}
