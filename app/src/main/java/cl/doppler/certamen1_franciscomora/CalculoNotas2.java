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
    private TextView tvNombre, tvResultado, tvResultadoFinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_notas2);



        tvNombre= (TextView) findViewById(R.id.TVNombre);
        tvResultado= (TextView) findViewById(R.id.TVResult);
        tvResultadoFinal= (TextView) findViewById(R.id.TVResultadoFinal);

        Intent intent = getIntent();
        int promedioo = intent.getIntExtra("promedio", 0);

        botoNN= (Button) findViewById(R.id.BotonBACK);
        Intent intent2= new Intent(this,MainActivity.class);

        Context context=getApplicationContext();

        Bundle intentN=this.getIntent().getExtras();
        if (intentN!=null){
            Nombre=intentN.getString("nombre");
        }


        tvNombre.setText("Estudiante : " +System.lineSeparator()+System.lineSeparator() +Nombre);
        tvResultado.setText("Promedio : "+System.lineSeparator()+System.lineSeparator() + promedioo);
        tvResultadoFinal.setText(Nombre+ " Su promedio final es: " +System.lineSeparator() + promedioo);

        botoNN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);
            }
        });
    }
}