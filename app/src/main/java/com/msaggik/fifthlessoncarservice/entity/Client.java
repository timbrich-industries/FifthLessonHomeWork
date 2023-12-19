package com.msaggik.fifthlessoncarservice.entity;

public class Client {
    // поля
    private int id; // идентификатор клиента
    private String name; // название клиента
    private int scopeOfWork; // объём работ

    // конструктор
    public Client(int id, String name, int scopeOfWork) {
        this.id = id;
        this.name = name;
        this.scopeOfWork = scopeOfWork;
    }

    // геттеры и сеттеры
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScopeOfWork() {
        return scopeOfWork;
    }
    public void setScopeOfWork(int scopeOfWork) {
        this.scopeOfWork = scopeOfWork;
    }

    // метод подсчёта стоимости работ
    public float costOfWork() {
        return -1;
    }
}
