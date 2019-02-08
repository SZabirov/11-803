package com.company.lists;

public class Parking {
    private IntList carList;

    public Parking(IntList carList) {
        this.carList = carList;
    }

    void parkCar(int id) {
        carList.add(id);
    }
}
