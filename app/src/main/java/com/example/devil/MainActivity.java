package com.example.devil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.demo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Hello World");
        System.out.println("Second commit");
        System.out.println("Merge");
        System.out.println("Rebase");
        System.out.println("Rebase again");

    }
}