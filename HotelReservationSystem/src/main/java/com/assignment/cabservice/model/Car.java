package com.assignment.cabservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private Integer id;
    private String model;
    private String color;
    private Integer seatingCapacity;
    private boolean availableForBooking;
    private Integer driverId;

    public Car() {}
    public Car(Integer id, String model, String color, Integer seatingCapacity, boolean availableForBooking,Integer driverId) {
        this.id = id;
        this.model = model;				// model=hotel
        this.color = color;			//color= location
        this.seatingCapacity = seatingCapacity;	//seating capacity= rooms
        this.availableForBooking=availableForBooking;	
        this.driverId = driverId;		//driverId= charges
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(Integer seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public boolean isAvailableForBooking() {
        return availableForBooking;
    }

    public void setAvailableForBooking(boolean availableForBooking) {
        this.availableForBooking = availableForBooking;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", Hotel='" + model + '\'' +
                ", Ac/NonAc='" + color + '\'' +
                ", Rooms=" + seatingCapacity + '\''+
                ", Available for Booking?=" + availableForBooking +
                ", charges per room=" + driverId +
                '}';
    }
}
