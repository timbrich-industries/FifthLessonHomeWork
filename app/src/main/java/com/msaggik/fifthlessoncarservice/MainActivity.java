package com.msaggik.fifthlessoncarservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.msaggik.fifthlessoncarservice.entity.Client;
import com.msaggik.fifthlessoncarservice.entity.IndividualClient;
import com.msaggik.fifthlessoncarservice.entity.OrganizationClient;


public class MainActivity extends AppCompatActivity {
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.output);
        Income rent = new IncomeRent(1, "Аренда площадей порта", 170000);
        Income service = new IncomeService(2, "Обслуживание морских судов", 125, 3_500);
        float totalCost = rent.monthlyIncome() + service.monthlyIncome();
        output.setText("Морской порт за месяц заработает " + totalCost + " монет");

    }
    }
