package groupassign.roadco.model.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="scheduleID")
    private Integer scheduleID;

    @Column(name="schDay")
    private String sch_day;

    @Column(name="schMonth")
    private String sch_month;

    @Column(name="schYear")
    private String sch_year;

    @Column(name="schStartTime")
    private String sch_start_time;

    @Column(name="schEndTime")
    private String sch_end_time;

    @OneToOne
    @JoinColumn(name = "employeeID", nullable = true)
    private Employee employee;

    @OneToMany
    @JoinColumn(name = "projectID", nullable = true)
    private Project project;
}
