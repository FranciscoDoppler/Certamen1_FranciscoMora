package cl.doppler.certamen1_franciscomora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculoNotas2 extends AppCompatActivity {

    private Button botoNN;
    private String Nombre;
    private TextView tvNombre;
    private int Notas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_notas2);

        tvNombre= (TextView) findViewById(R.id.TVNombre);

        botoNN= (Button) findViewById(R.id.BotonBACK);
        Intent intent2= new Intent(this,MainActivity.class);

        Context context=getApplicationContext();

        Bundle intentN=this.getIntent().getExtras();
        if (intentN!=null){
            Nombre=intentN.getString("nombre");
            Toast.makeText(context,"Estudiante: " +Nombre,Toast.LENGTH_SHORT).show();

        }

        tvNombre.setText("Estudiante : " +System.lineSeparator()+System.lineSeparator() +Nombre);

        botoNN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);
            }
        });
    }
}