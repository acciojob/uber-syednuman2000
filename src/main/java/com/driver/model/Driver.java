package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;
    private String moblie;
    private String password;
    @OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
    Cab cab;
    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    List<TripBooking> tripBookingList = new ArrayList<>();

    public Driver() {
    }

    public Driver(int driverId, String moblie, String password, Cab cab, List<TripBooking> tripBookingList) {
        this.driverId = driverId;
        this.moblie = moblie;
        this.password = password;
        this.cab = cab;
        this.tripBookingList = tripBookingList;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}