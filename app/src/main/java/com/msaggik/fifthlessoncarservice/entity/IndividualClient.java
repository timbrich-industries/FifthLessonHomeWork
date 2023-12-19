package com.msaggik.fifthlessoncarservice.entity;

public class IndividualClient extends Client {

    // поля
    private float discount; // скидка

    // конструктор
    public IndividualClient(int id, String name, int scopeOfWork, float discount) {
        super(id, name, scopeOfWork);
        this.discount = discount;
    }

    // геттеры и сеттеры
    public float getDiscount() {
        return discount;
    }
    public void setDiscount(float discount) {
        this.discount = discount;
    }

    // метод подсчёта стоимости работ
    @Override
    public float costOfWork() {
        return 1200 * super.getScopeOfWork() * (100 - discount)/100;
    }
}
