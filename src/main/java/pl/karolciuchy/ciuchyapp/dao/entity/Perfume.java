package pl.karolciuchy.ciuchyapp.dao.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Perfume {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Date getRecieveDate() {
        return recieveDate;
    }

    public void setRecieveDate(Date recieveDate) {
        this.recieveDate = recieveDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;
    private Long quantity;
    private Integer price;
    private Integer sellPrice;
    private Date recieveDate;
    private Date returnDate;

    public Perfume() {

    }

    public Perfume(Long id, String name, Long quantity, Integer price, Integer sellPrice, Date recieveDate, Date returnDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.sellPrice = sellPrice;
        this.recieveDate = recieveDate;
        this.returnDate = returnDate;
    }
}
