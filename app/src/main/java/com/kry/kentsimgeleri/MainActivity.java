package com.kry.kentsimgeleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.kry.kentsimgeleri.databinding.ActivityMain2Binding;
import com.kry.kentsimgeleri.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    ArrayList<Landmark> landmarkArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();
        Landmark pisa = new Landmark("Pisa","Itals",R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffed","France",R.drawable.eiffel);
        Landmark colosseum = new Landmark("Colosseum","Italy",R.drawable.colesseo);
        Landmark londonBridge = new Landmark("London Bridge","UK",R.drawable.londonbridge);
landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(londonBridge);


    }
}