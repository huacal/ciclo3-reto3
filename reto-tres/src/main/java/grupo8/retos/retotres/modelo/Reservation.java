package grupo8.retos.retotres.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    
    private String startDate;
    private String devolutionDate;
    private String status;


    @ManyToOne
    @JoinColumn(name = "bikeId")
    @JsonIgnoreProperties("reservations")
    private Bike bike;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"reservations","messages"})
    private Client client;


    


    public Integer getIdReservation() {
        return idReservation;
    }


    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }


    public String getStartDate() {
        return startDate;
    }


    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    public String getDevolutionDate() {
        return devolutionDate;
    }


    public void setDevolutionDate(String devolutionDate) {
        this.devolutionDate = devolutionDate;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public Bike getBike() {
        return bike;
    }


    public void setBike(Bike bike) {
        this.bike = bike;
    }


    public Client getClient() {
        return client;
    }


    public void setClient(Client client) {
        this.client = client;
    }


    


}
