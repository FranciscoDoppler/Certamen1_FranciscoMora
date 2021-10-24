package cl.doppler.certamen1_franciscomora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button botoN;
    private EditText etNombre;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.ETNota1),
                        editText1 = findViewById(R.id.ETNota2),
                         editText2 = findViewById(R.id.ETNota3);


        etNombre=(EditText) findViewById(R.id.ETNombre);
        botoN =(Button) findViewById(R.id.BotonSIG);

        Intent intent1=new Intent(this,CalculoNotas2.class);

        botoN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numero1sT = editText.getText().toString(),
                        numero2sT = editText1.getText().toString(),
                         numero3sT = editText2.getText().toString();

                if (numero1sT.equals("") || numero2sT.equals("") || numero3sT.equals("")) {return;}

                int nota1 = Integer.parseInt(numero1sT),
                        nota2 = Integer.parseInt(numero2sT),
                         nota3 = Integer.parseInt(numero3sT);

                int promedio = (nota1+nota2+nota3)/3;

                intent1.putExtra("promedio",promedio);
                intent1.putExtra("nombre", etNombre.getText().toString());
                startActivity(intent1);
            }
        });
    }
}