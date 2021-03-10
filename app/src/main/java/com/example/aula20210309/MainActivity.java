package com.example.aula20210309;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    protected Button buttonPlus;
    protected Button buttonSub;
    protected Button buttonMult;
    protected Button buttonDiv;

    protected TextInputEditText numero1;
    protected TextInputEditText numero2;

    protected TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","on Create Called");

        this.buttonPlus = findViewById(R.id.buttonPlus);
        this.buttonSub = findViewById(R.id.buttonSub);
        this.buttonMult = findViewById(R.id.buttonMult);
        this.buttonDiv = findViewById(R.id.buttonDiv);


        this.numero1 = findViewById(R.id.inputNumero1);
        this.numero2 = findViewById(R.id.inputNumero2);
        this.resultado = findViewById(R.id.textoResultado);
    }

    public void buttonOperation(View view){
        if(this.numero1.getText().toString().equals("")){
            Toast.makeText(
                    this,
                    "Número 1 Inválido",
                    Toast.LENGTH_SHORT
            ).show();
        }else if(this.numero2.getText().toString().equals("")){
            Toast.makeText(
                    this,
                    "Número 2 Inválido",
                    Toast.LENGTH_SHORT
            ).show();
        }else{
            int int_num1 = Integer.parseInt(this.numero1.getText().toString());
            int int_num2 = Integer.parseInt(this.numero2.getText().toString());
            switch(String.valueOf(((Button) view).getText())){
                case "+":
                    resultado.setText(this.numero1.getText().toString()+" + "+this.numero2.getText().toString()+" = "+(int_num1+int_num2));
                    break;
                case "-":
                    resultado.setText(this.numero1.getText().toString()+" - "+this.numero2.getText().toString()+" = "+(int_num1-int_num2));
                    break;
                case "X":
                    resultado.setText(this.numero1.getText().toString()+" * "+this.numero2.getText().toString()+" = "+(int_num1*int_num2));
                    break;
                case "/":
                    if(int_num2 > 0){
                        resultado.setText(this.numero1.getText().toString()+" / "+this.numero2.getText().toString()+" = "+(int_num1/int_num2));
                    }else{
                        resultado.setText(this.numero1.getText().toString()+" / "+this.numero2.getText().toString()+" = Infinito");
                        Toast.makeText(
                                this,
                                "Infinito",
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                    break;
            }
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","on Resume Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","on Start Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","on Restart Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","on Pause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","on Stop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","on Destroy Called");
    }
}