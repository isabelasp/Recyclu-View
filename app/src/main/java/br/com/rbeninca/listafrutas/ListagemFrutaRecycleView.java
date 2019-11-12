package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListagemFrutaRecycleView extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_fruta_recycle_view);


        recyclerView = findViewById(R.id.recylerView);

        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this);
        recyclerView.setLayoutManager(layoutManager);

        FrutaController frutaController = new FrutaController();

        FrutaAdapterRecyclerView frutaAdapterRecycleView = new FrutaAdapterRecyclerView(
                getApplicationContext(),
                R.layout.template_item_fruta,
                frutaController.FRUTAS
        );

        recyclerView.setAdapter(frutaAdapterRecycleView);

    }
}
