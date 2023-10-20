package br.ulbra.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtEvento, edtValor, edtPessoas;
    Button btnCalcular;
    TextView txtResult, txtResultado;
    double v1, v2, divisao;
    String evento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEvento = (EditText)findViewById(R.id.edtEvento);
        edtValor = (EditText)findViewById(R.id.edtValor);
        edtPessoas = (EditText)findViewById(R.id.edtPessoas);
        txtResultado = (TextView)findViewById(R.id.txtResultado);
        txtResult = (TextView) findViewById(R.id.txtResposta);
        btnCalcular = (Button)findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evento = edtEvento.getText().toString();
                v1 = Double.parseDouble(edtValor.getText().toString());
                v2 = Integer.parseInt(edtPessoas.getText().toString());
                divisao = v1 / v2;
                txtResult.setText("O evento "+evento
                        +" no valor de R$"+v1+" reais, rachado entre "
                        +v2+" pessoas, terá o valor de R$"+divisao+" por pessoa.");
            }
        });
    }
}