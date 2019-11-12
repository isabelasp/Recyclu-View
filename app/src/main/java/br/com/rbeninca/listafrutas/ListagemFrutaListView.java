package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListagemFrutaListView extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_fruta_list_view);

        listView=findViewById(R.id.listView);

        FrutaController frutaController = new FrutaController();

        FrutaAdapter  frutaAdapter =new FrutaAdapter(
                getApplicationContext(),
                R.layout.template_item_fruta,
                frutaController.FRUTAS
        );

        listView.setAdapter(frutaAdapter);


    }
}
