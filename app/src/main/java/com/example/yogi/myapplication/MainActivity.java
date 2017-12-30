package com.example.yogi.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    /*public void Login(View butt1){

        EditText name = (EditText)findViewById(R.id.name);
        EditText pass = (EditText)findViewById(R.id.password);
        EditText email = (EditText)findViewById(R.id.email);
        Toast.makeText(this, "Hacked ez lulz "+pass.getText().toString(), Toast.LENGTH_SHORT).show();
        Log.i("Login Info","Username  "+name.getText().toString()+"\npassword: "+pass.getText().toString()+"\nemail: "+email.getText().toString());
    }
    public void reset(View butt2){
        Toast.makeText(this, "Fields Cleared", Toast.LENGTH_LONG).show();
        EditText name = (EditText)findViewById(R.id.name);
        EditText pass = (EditText)findViewById(R.id.password);
        EditText email = (EditText)findViewById(R.id.email);
        name.setText("");
        pass.setText("");
        email.setText("");
    }
*/
    public void mark(View view){
        ImageView imag = (ImageView) findViewById(R.id.im1);
        imag.animate().alpha(1f).setDuration(1000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
