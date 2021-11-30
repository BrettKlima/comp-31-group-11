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
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="clientID")
    private Integer clientId;

    @Column(name="clientName")
    private String client_name;

    @Column(name="clientCompany")
    private String client_company;

    @Column(name="clientPhone")
    private String client_phone;

    @Column(name="clientAddress")
    private String client_address;

}
