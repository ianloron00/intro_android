package com.example.simulator_dio;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.simulator_dio.databinding.ActivityMainBinding;

public class MainActivityJava extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState ) {
        super.onCreate( saveInstanceState );

        binding = ActivityMainBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot() );
    }

}
