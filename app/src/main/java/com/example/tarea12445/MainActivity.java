package com.example.tarea12445;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.tarea12445.R;

public class MainActivity extends AppCompatActivity {
    private EditText numero1,numero2;
    private int resultado=0;
    private Double resultado2=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1=(EditText) findViewById(R.id.numero_1);
        numero2=(EditText) findViewById(R.id.numero_2);
    }
    public void suma(View view){
        resultado=(Integer.parseInt(numero1.getText().toString())) + (Integer.parseInt(numero2.getText().toString()));
        Intent intent=new Intent(this,ActivityResultado.class);
        intent.putExtra("respuesta",String.valueOf(resultado));
        startActivity(intent);
        numero1.setText("");
        numero2.setText("");
    }
    public void resta(View view){
        resultado=(Integer.parseInt(numero1.getText().toString())) - (Integer.parseInt(numero2.getText().toString()));
        Intent intent=new Intent(this,ActivityResultado.class);
        intent.putExtra("respuesta",String.valueOf(resultado));
        startActivity(intent);
        numero1.setText("");
        numero2.setText("");
    }
    public void multiplicaion(View view){
        resultado=(Integer.parseInt(numero1.getText().toString())) * (Integer.parseInt(numero2.getText().toString()));
        Intent intent=new Intent(this,ActivityResultado.class);
        intent.putExtra("respuesta",String.valueOf(resultado));
        startActivity(intent);
        numero1.setText("");
        numero2.setText("");
    }
    public void division(View view){
        resultado2=(Double.parseDouble(numero1.getText().toString())) / (Double.parseDouble(numero2.getText().toString()));
        Intent intent=new Intent(this,ActivityResultado.class);
        intent.putExtra("respuesta",String.valueOf(resultado2));
        startActivity(intent);
        numero1.setText("");
        numero2.setText("");
    }
}