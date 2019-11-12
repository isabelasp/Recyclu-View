package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ExibeFruta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_fruta);

        int id = getIntent().getExtras().getInt("id");

        FrutaController frutaController = new FrutaController();

        Fruta fruta = frutaController.FRUTAS[id];

        ImageView imageView = findViewById(R.id.imageView);
        TextView textViewCodigo = findViewById(R.id.textViewCodigo);
        TextView textViewNome = findViewById(R.id.textViewNome);
        TextView textViewPreco = findViewById(R.id.textViewPreco);

        imageView.setImageResource(fruta.getImagem());
        textViewCodigo.setText(Integer.toString(fruta.getCodigo()));
        textViewNome.setText(fruta.getNome());
        textViewPreco.setText(fruta.getPreco().toString());
    }
}
