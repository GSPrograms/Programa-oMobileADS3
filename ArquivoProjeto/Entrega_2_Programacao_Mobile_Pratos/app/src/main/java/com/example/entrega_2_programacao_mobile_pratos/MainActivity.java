package com.example.entrega_2_programacao_mobile_pratos;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.os.Looper;
import com.example.entrega_2_programacao_mobile_pratos.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Layout qual layout usa nessa Activity
        setContentView(R.layout.activity_main);
            Intent intent = new Intent(MainActivity.this, TelaSelecaoPrato.class);
            // Inicia a nova Activity
            startActivity(intent);
    }
}
