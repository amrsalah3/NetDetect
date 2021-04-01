package com.narify.netdetectsample;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.narify.netdetect.NetDetect;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test(View view) {
        NetDetect.check((isConnected -> Toast.makeText(this, isConnected + "", Toast.LENGTH_SHORT).show()));
    }
}