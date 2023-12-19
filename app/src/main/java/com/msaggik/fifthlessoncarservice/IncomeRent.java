package com.msaggik.fifthlessoncarservice;

public class IncomeRent extends Income{
// поле

    private float incomeRentMonthly;
// конструктор

    public IncomeRent(int id, String nameIncome, float incomeRentMonthly) {
        super(id, nameIncome);
        this.incomeRentMonthly = incomeRentMonthly;
    }
// метод расчёта дохода

    @Override
    public float monthlyIncome() {
        return incomeRentMonthly;
    }
}