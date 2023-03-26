package com.example.dhvani19;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    public class Practical19 extends AppCompatActivity { TextView txtView;
        @Override
        protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main2);


            txtView = findViewById(R.id.txtTextViewList);
            String selectedCar = getIntent().getStringExtra("car"); String selected_car_details;

            switch(selectedCar){ case "Volvo":
                selected_car_details	=	"Name	:\nThar\n\nLaunched	Date	:\nOctober	4, 2010\n\nCompany :\nMahindra";
                break; case "Thar":
                selected_car_details	=	"Name	:\nBaleno\n\nLaunched	Date	:\nFebruary	23, 2020\n\nCompany :\nMaruti";
                break;


                case "Alcatraz":

                    selected_car_details	=	"Name	:\nAultroz\n\nLaunched	Date	:\nAugust	4, 2000\n\nCompany :\nMahindra";
                    break; case "Jeep":
                    selected_car_details	=	"Name	:\nJeep\n\nLaunched	Date	:\nOctober	2, 2022\n\nCompany :\nMahindra";
                    break; case "Creta":
                    selected_car_details = "Name :\nBreeza\n\nLaunched Date :\nSeptember 27, 2016\n\nCompany :\nToyota";
                    break; case "AUDI":
                    selected_car_details	=	"Name	:\nBMW\n\nLaunched	Date	:\nMarch	10, 2020\n\nCompany :\nHyundai";
                    break; default:

                    selected_car_details = "Name :\nNone\n\nLaunched Date : None\n\nCompany : None";

                    break;

            }
            txtView.setText(selected_car_details);

        }}}
