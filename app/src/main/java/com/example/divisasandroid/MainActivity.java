package com.example.divisasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editNumero;
    TextView textViewAmerica, textViewIngles;
    Button btnAmbos, btnReset;
    ImageButton btnAmerica, btnIngles;

    static final double DOLAR = 1.10;
    static final double LIBRA = 0.83;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents(){
        editNumero = findViewById(R.id.editNumero);
        textViewAmerica = findViewById(R.id.textViewAmerica);
        textViewIngles = findViewById(R.id.textViewIngles);
        btnAmbos = findViewById(R.id.btnAmbos);
        btnReset = findViewById(R.id.btnReset);
        btnAmerica = findViewById(R.id.btnAmerica);
        btnIngles = findViewById(R.id.btnIngles);

        btnAmbos.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        btnAmerica.setOnClickListener(this);
        btnIngles.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        double a = Integer.parseInt(editNumero.getText().toString());

        switch (view.getId()){
            case R.id.btnAmbos:
                textViewAmerica.setText(String.valueOf(a * DOLAR));
                textViewIngles.setText(String.valueOf(a * LIBRA));
                break;
            case R.id.btnReset:
                editNumero.setText("");
                textViewAmerica.setText("0.0");
                textViewIngles.setText("0.0");
                break;
            case R.id.btnAmerica:
                textViewAmerica.setText(String.valueOf(a * DOLAR));
                break;
            case R.id.btnIngles:
                textViewIngles.setText(String.valueOf(a * LIBRA));
                break;
            default:
                System.out.println("Definido");
        }

    }
}