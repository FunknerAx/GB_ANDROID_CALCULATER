package kz.funkner.funknercalculater.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import kz.funkner.funknercalculater.R;
import kz.funkner.funknercalculater.domain.CalculaterImpl;
import kz.funkner.funknercalculater.domain.Operation;

public class MainActivity extends AppCompatActivity implements CalculaterView {
    TextView resultText;
    private CalculaterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new CalculaterPresenter(this, new CalculaterImpl());

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

        resultText = findViewById(R.id.result_text);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addNumber(but1.getText().toString());
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addNumber(but2.getText().toString());
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addNumber(but3.getText().toString());
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addNumber(but4.getText().toString());
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addNumber(but5.getText().toString());
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addNumber(but6.getText().toString());
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addNumber(but7.getText().toString());
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addNumber(but8.getText().toString());
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addNumber(but9.getText().toString());
            }
        });

        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addNumber(but0.getText().toString());
            }
        });

        butDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.addNumber(butDot.getText().toString());

            }
        });

        //Операции
        butSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.updateArrayValues();
                presenter.addOperation(Operation.SUM);

            }
        });

        butDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.updateArrayValues();
                presenter.addOperation(Operation.DIV);

            }
        });

        butMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.updateArrayValues();
                presenter.addOperation(Operation.MUL);

            }
        });

        butSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.updateArrayValues();
                presenter.addOperation(Operation.SUB);

            }
        });

        butResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.getResult();
            }
        });

        butClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clearAll();
            }
        });

        butClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clearLastChar();
            }
        });

    }

    @Override
    public void showResult(String value) {
        resultText.setText(value);
    }

}