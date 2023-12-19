package com.msaggik.fifthlessoncarservice.entity;

public class OrganizationClient extends Client{

    // конструктор
    public OrganizationClient(int id, String name, int scopeOfWork) {
        super(id, name, scopeOfWork);
    }

    // метод подсчёта стоимости работ
    @Override
    public float costOfWork() {
        return 1400 * super.getScopeOfWork();
    }
}
