package com.example.accpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;

import com.example.accpractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLifecycleOwner(this);

        CounterViewModel viewModel = ViewModelProviders.of(this).get(CounterViewModel.class);

        //binding.countTextView.setText(viewModel.counter.getValue() + "");

        binding.setViewModel(viewModel);

        /*
        binding.fadAdd.setOnClickListener( v -> {
            //counter++
            //viewModel.counter++;
            viewModel.increase();
            //binding.countTextView.setText(viewModel.counter.getValue() + "");
        });

        binding.fadRemove.setOnClickListener( v -> {
            //counter--
            //viewModel.counter--;
            viewModel.decrease();
            //binding.countTextView.setText(viewModel.counter.getValue() + "");
        });

         */

        /*
        viewModel.counter.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                // UI 업데이트
                binding.countTextView.setText(viewModel.counter.getValue() + "");
            }
        });
         */
    }
}