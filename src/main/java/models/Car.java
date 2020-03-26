package models;

public class Car {

    private Integer id;
    private String make;
    private String model;
    private Integer year;
    private String color;
    private String vin;


    public Car(Integer id, String make, String model, Integer year, String color, String vin){
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.vin = vin;
    }

    public Integer getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getVin() {
        return vin;
    }
}
