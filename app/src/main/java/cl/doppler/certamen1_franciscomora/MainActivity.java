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
    private EditText nota1, nota2, nota3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1=(EditText) findViewById(R.id.ETNota1);
        nota2=(EditText) findViewById(R.id.ETNota2);
        nota3=(EditText) findViewById(R.id.ETNota3);

        etNombre=(EditText) findViewById(R.id.ETNombre);

        botoN =(Button) findViewById(R.id.BotonSIG);
        Intent intent1=new Intent(this,CalculoNotas2.class);

        botoN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent1.putExtra("nombre", etNombre.getText().toString());
                startActivity(intent1);
            }
        });
    }
}