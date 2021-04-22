package kz.funkner.funknercalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button but1 = findViewById(R.id.number_one);
        final Button but2 = findViewById(R.id.number_two);
        final Button but3 = findViewById(R.id.number_three);
        final Button but4 = findViewById(R.id.number_four);
        final Button but5 = findViewById(R.id.number_five);
        final Button but6 = findViewById(R.id.number_six);
        final Button but7 = findViewById(R.id.number_seven);
        final Button but8 = findViewById(R.id.number_eight);
        final Button but9 = findViewById(R.id.number_nine);
        final Button but0 = findViewById(R.id.number_zero);
        final Button butDot = findViewById(R.id.dot_button);
        Button butClear = findViewById(R.id.clear_button);
        Button butClearAll = findViewById(R.id.clear_all_button);
        final Button butSum = findViewById(R.id.plus_button);
        final Button butSubtract = findViewById(R.id.number_subtract);
        final Button butMultiply = findViewById(R.id.number_multiply);
        final Button butDivide = findViewById(R.id.number_divide);
        Button butResult = findViewById(R.id.result_button);

        final TextView resultText = findViewById(R.id.result_text);

        final StringBuilder upperText = new StringBuilder();

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(but1.getText().toString());
                resultText.setText(upperText);
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                upperText.append(but2.getText().toString());
                resultText.setText(upperText);
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(but3.getText().toString());
                resultText.setText(upperText);
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(but4.getText().toString());
                resultText.setText(upperText);
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(but5.getText().toString());
                resultText.setText(upperText);
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(but6.getText().toString());
                resultText.setText(upperText);
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(but7.getText().toString());
                resultText.setText(upperText);
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(but8.getText().toString());
                resultText.setText(upperText);
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(but9.getText().toString());
                resultText.setText(upperText);
            }
        });

        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(but0.getText().toString());
                resultText.setText(upperText);
            }
        });

        butDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(butDot.getText().toString());
                resultText.setText(upperText);

            }
        });

        butSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(" ").append(butSum.getText().toString()).append(" ");
                resultText.setText(upperText);

            }
        });

        butDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(" ").append(butDivide.getText().toString()).append(" ");
                resultText.setText(upperText);

            }
        });

        butMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(" ").append(butMultiply.getText().toString()).append(" ");
                resultText.setText(upperText);

            }
        });

        butSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upperText.append(" ").append(butSubtract.getText().toString()).append(" ");
                resultText.setText(upperText);

            }
        });

        butResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}