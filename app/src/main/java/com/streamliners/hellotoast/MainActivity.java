package com.streamliners.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.streamliners.hellotoast.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        setUpEventHandlers();
    }
    /**
     * Event Handlers
     */

    private void setUpEventHandlers(){
        b.toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });
        b.countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCount();
            }
        });
    }
    /**
     * This function increase the count
     */

    private void showCount() {
        b.countTextView.setText(""+count);
        count++;
    }
    /**
     * This function will show a toast
     */
    private void showToast(){
        Toast toast = Toast.makeText(this,"Hello Toast",Toast.LENGTH_SHORT);
        toast.show();
    }


}