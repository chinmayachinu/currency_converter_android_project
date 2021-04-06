package com.infinite.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickConvertRupeeToDollar(View view){
        EditText editText=(EditText)findViewById(R.id.rupeeEditText);
        ImageView imageView = (ImageView) findViewById(R.id.rupeeImageView);
        String editTextString = editText.getText().toString();
        int rupeeEntered=Integer.parseInt(editTextString);
        double toastDollarValueForTheEnteredRupee=  (0.013*rupeeEntered);
        String toastDollarValueForTheEnteredRupeeInString=String.valueOf(toastDollarValueForTheEnteredRupee);
        imageView.setImageResource(R.drawable.download);
        Toast.makeText(getApplicationContext(), toastDollarValueForTheEnteredRupeeInString+"$",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
