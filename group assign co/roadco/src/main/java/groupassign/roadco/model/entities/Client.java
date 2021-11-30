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
@Table(name="CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CLIENTID")
    private Integer clientId;

    @Column(name="CLIENT")
    private String clientName;

    @Column(name="CLIENTCOMPANY")
    private String clientCompany;

    @Column(name="CLIENTPHONE")
    private String clientPhone;

    @Column(name="CLIENTADDRESS")
    private String clientAddress;

    public Client() {
        clientId = 0;
        clientName = "";
        clientCompany = "";
        clientPhone = "";
        clientAddress = "";
    }

}
