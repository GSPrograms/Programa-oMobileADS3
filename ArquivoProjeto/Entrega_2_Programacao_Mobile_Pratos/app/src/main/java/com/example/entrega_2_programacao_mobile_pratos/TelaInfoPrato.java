package com.example.entrega_2_programacao_mobile_pratos;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.entrega_2_programacao_mobile_pratos.R;

public class TelaInfoPrato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_infoprato);

        // Declaração dos componentes
        TextView TituloPrato, DescriPrato;
        ImageView ImagemPratola;

        // ligação entre os elementos
        TituloPrato = findViewById(R.id.tituloPrato6);
        DescriPrato = findViewById(R.id.DescricaoPrato);
        ImagemPratola = findViewById(R.id.ImagemPratoMenu);



        // recebe as informações enviadas pela Intent da tela anterior
        String nomeRecebido = getIntent().getStringExtra("nome");                                 // Nome da Prato
        String DescricaoRecebida = getIntent().getStringExtra("DescricaoPrato");                 // Descrição da Prato
        int Imagem = getIntent().getIntExtra("IdImagem", 0);                          // Imagem da Prato

        // exibe os dados nos componentes
        TituloPrato.setText(nomeRecebido);
        DescriPrato.setText(DescricaoRecebida);
        ImagemPratola.setImageResource(Imagem);

    }
}
