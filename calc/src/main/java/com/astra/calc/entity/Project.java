package com.astra.calc.entity;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "materials_cost")
    private double materialsCost;

    @Column(name = "transport_cost")
    private double transportCost;

    @Column(name = "work_hours")
    private int workHours;

    @Column(name = "another_cost")
    private double anotherCost;

    @Column(name = "manufacturing_cost")
    private double manufacturingCost;

    @Column(name = "price_dap")
    private double priceDAP;

    @Column(name = "price_per_hour")
    private double pricePerHour;

    public Project() {
    }

    public Project(int id, double materialsCost, double transportCost, int workHours, double anotherCost, double priceDAP, double manufacturingCost, double pricePerHour) {
        this.id = id;
        this.materialsCost = materialsCost;
        this.transportCost = transportCost;
        this.workHours = workHours;
        this.anotherCost = anotherCost;
        this.priceDAP = priceDAP;
        this.manufacturingCost = manufacturingCost;
        this.pricePerHour = pricePerHour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMaterialsCost() {
        return materialsCost;
    }

    public void setMaterialsCost(double materialsCost) {
        this.materialsCost = materialsCost;
    }

    public double getTransportCost() {
        return transportCost;
    }

    public void setTransportCost(double transportCost) {
        this.transportCost = transportCost;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getAnotherCost() {
        return anotherCost;
    }

    public void setAnotherCost(double anotherCost) {
        this.anotherCost = anotherCost;
    }

    public double getManufacturingCost() {
        return manufacturingCost;
    }

    public void setManufacturingCost(double manufacturingCost) {
        this.manufacturingCost = manufacturingCost;
    }

    public double getPriceDAP() {
        return priceDAP;
    }

    public void setPriceDAP(double priceDAP) {
        this.priceDAP = priceDAP;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", materialsCost=" + materialsCost +
                ", transportCost=" + transportCost +
                ", workHours=" + workHours +
                ", anotherCost=" + anotherCost +
                ", manufacturingCost=" + manufacturingCost +
                ", priceDAP=" + priceDAP +
                ", pricePerHour=" + pricePerHour +
                '}';
    }
}
