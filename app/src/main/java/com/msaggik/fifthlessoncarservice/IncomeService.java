package com.msaggik.fifthlessoncarservice;

public class IncomeService extends Income{
    private int numberOfShips; // количество кораблей
    private float maintenanceCostPerShip; // стоимость обслуживания одного судна
    public IncomeService (int id, String nameIncome, int numberOfShips, float maintenanceCostPerShip) {
            super(id, nameIncome);
        this.numberOfShips = numberOfShips;
        this.maintenanceCostPerShip = maintenanceCostPerShip;
    }
    @Override
    public float monthlyIncome() {
        return numberOfShips * maintenanceCostPerShip;
    }
}