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
@Table(name="PROJECT")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PROJECTID")
    private Integer projectId;

    @Column(name="PROJLOCATION")
    private String proj_Location;

    @Column(name="PROJESTCOMPLETEDATE")
    private String proj_est_complete_date;

    @Column(name="PROJESTCOMPLETECOST")
    private String proj_est_complete_cost;

    @Column(name="PROJSTARTDATE")
    private String proj_start_date;

    @Column(name="PROJENDDATE")
    private String proj_end_date;

    @ManyToOne
    @JoinColumn(name = "CLIENTID", nullable = true)
    private Client clients;
}
