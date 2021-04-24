package com.mindorks.framework.zakat_calculator_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button calculateZakatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        initObject();
        calculateZakatButton.setOnClickListener( this );
    }

    private void initObject() {
        calculateZakatButton = findViewById( R.id.calculate_zakat_button );
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculate_zakat_button:
                Toast.makeText( this, "button clicked", Toast.LENGTH_SHORT ).show();
                break;
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.gold:
                if (checked)
                    // Pirates are the best
                    Toast.makeText( this, "Gold", Toast.LENGTH_SHORT ).show();
                    break;
            case R.id.silver:
                if (checked)
                    // Ninjas rule
                    Toast.makeText( this, "Silver", Toast.LENGTH_SHORT ).show();
                    break;
        }

    }
}