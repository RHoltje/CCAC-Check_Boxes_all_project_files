package com.cit135.mycheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox CheckBoxFrankieBunz;
    private CheckBox CheckBoxMinneos;
    private CheckBox CheckBoxChinaPalace;

    private Button submitButton;
    private TextView showTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBoxFrankieBunz = (CheckBox) findViewById(R.id.chkBoxFrankieBunz);
        CheckBoxMinneos = (CheckBox) findViewById(R.id.chkBoxMinneos);
        CheckBoxChinaPalace = (CheckBox) findViewById(R.id.chkBoxChinaPalace);

        showTextView = (TextView) findViewById(R.id.TextViewResults);

        submitButton = (Button) findViewById(R.id.btnSubmit);

        submitButton.setOnClickListener(new View.OnClickListener()
        {

            @Override
                public void onClick(View v)
                {
                    showTextView.setVisibility(View.VISIBLE);


                   StringBuilder stringBuilder = new StringBuilder();
                   stringBuilder.append(CheckBoxFrankieBunz.getText().toString() + "state is:" + CheckBoxFrankieBunz.isChecked() + "\n" );
                   stringBuilder.append(CheckBoxMinneos.getText().toString() + "state is:" + CheckBoxMinneos.isChecked() + "\n" );
                   stringBuilder.append(CheckBoxChinaPalace.getText().toString() + "state is:" + CheckBoxChinaPalace.isChecked() + "\n" );

                   showTextView.setText(stringBuilder);

                }

        });
    }
}
