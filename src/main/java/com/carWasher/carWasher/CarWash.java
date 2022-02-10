package com.carWasher.carWasher;

import com.carWasher.carWasher.model.Car;
import com.carWasher.carWasher.model.Driver;

import java.util.Date;

public class CarWash {
    private Driver driver;
    private Car car;
    private Date date;
    private int price;

    public CarWash() {
    }

    public CarWash(Driver driver, Car car, Date date, int price) {
        this.driver = driver;
        this.car = car;
        this.date = date;
        this.price = price;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarWash{" +
                "driver=" + driver +
                ", car=" + car +
                ", date=" + date +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarWash carWash = (CarWash) o;

        if (price != carWash.price) return false;
        if (driver != null ? !driver.equals(carWash.driver) : carWash.driver != null) return false;
        if (car != null ? !car.equals(carWash.car) : carWash.car != null) return false;
        return date != null ? date.equals(carWash.date) : carWash.date == null;
    }

    @Override
    public int hashCode() {
        int result = driver != null ? driver.hashCode() : 0;
        result = 31 * result + (car != null ? car.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }
}
