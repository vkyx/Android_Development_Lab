package com.example.layoutexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToggleButtonClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();
        if(on){

        }
        else{

        }
    }

    public void onSwitchClicked(View view){
        boolean on = ((Switch) view).isChecked();
        if(on){

        }
        else{

        }
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        if (view.getId() == R.id.checkbox_milk) {
            if (checked) {

            } else {

            }
        } else if (view.getId() == R.id.checkbox_sugar) {
            if (checked) {

            } else {

            }
        }
    }

    public void onRadioButtonClicked(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int id = radioGroup.getCheckedRadioButtonId();

        if (id == R.id.radio_cavemen) {

        } else if (id == R.id.radio_astronauts) {

        } else if (id == -1) {

        } else {
            RadioButton radioButton = findViewById(id);

        }
    }

    public void onImageButtonClicked(View view) {

            CharSequence text = "Hello everyone";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
    }



}

