package pl.karolciuchy.ciuchyapp.dao.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cloth {

    public Cloth() {

    }

    public Cloth(long id, String sweter, long quantity, double price, double salePrice, String receiveDate, String returnDate){

    }


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;

    private Long quantity;

    private Double price;

    private Double salePrice;

    private String receiveDate;

    private String returnDate;

    public Cloth(Long id, String name, Long quantity, Double price, Double salePrice, String receiveDate, String returnDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.salePrice = salePrice;
        this.receiveDate = receiveDate;
        this.returnDate = returnDate;
    }

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
