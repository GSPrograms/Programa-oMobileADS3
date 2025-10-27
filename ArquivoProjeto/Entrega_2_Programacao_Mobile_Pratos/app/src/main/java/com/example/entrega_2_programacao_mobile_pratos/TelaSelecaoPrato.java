package com.example.entrega_2_programacao_mobile_pratos;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
public class TelaSelecaoPrato extends AppCompatActivity {

    PratoArray prato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecionar);

        prato = new PratoArray("Prato", "pratada");

        Button botao1 = findViewById(R.id.botaoPrato);
        botao1.setOnClickListener(view ->
                AbrirDetalhesPrato(prato));
    }

    private void AbrirDetalhesPrato(PratoArray prato) {
        Intent irTelaInfo = new Intent(TelaSelecaoPrato.this, TelaInfoPrato.class);
        irTelaInfo.putExtra("nome", prato.getNomePrato());
        irTelaInfo.putExtra("descricao", prato.getDescricaoPrato());
        startActivity(irTelaInfo);
    }
}
