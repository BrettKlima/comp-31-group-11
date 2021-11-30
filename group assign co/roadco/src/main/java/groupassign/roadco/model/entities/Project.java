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
@Table(name="project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="projectID")
    private Integer projectId;

    @Column(name="projLocation")
    private String proj_location;

    @Column(name="projEstCompleteDate")
    private String proj_est_complete_date;

    @Column(name="projEstCompleteCost")
    private String proj_est_complete_cost;

    @Column(name="projStartDate")
    private String proj_start_date;

    @Column(name="projEndDate")
    private String proj_end_date;

    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client clients;
}
