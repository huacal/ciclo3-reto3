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
@Table(name="message")
public class Message implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;

    
    private String messageText;
   

    @ManyToOne
    /*
    * El valor name = clientId sera el nombre del campo que aparecera en la base de datos como llave foranea
    * en la tabla mensaje
    */
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties("messages")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "bikeId")
    @JsonIgnoreProperties({"messages","reservations"})
    private Bike bike;


    public Integer getIdMessage() {
        return idMessage;
    }
    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }
    public String getMessageText() {
        return messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Bike getBike() {
        return bike;
    }
    public void setBike(Bike bike) {
        this.bike = bike;
    }
}
