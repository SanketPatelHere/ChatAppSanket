package com.example.chatappsanket;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //sha1 = 4D:CA:FD:C5:86:D7:DA:4D:32:5F:84:6F:B0:6D:0E:5F:D2:65:C5:8B
    //database url = https://chatappsanket.firebaseio.com
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
