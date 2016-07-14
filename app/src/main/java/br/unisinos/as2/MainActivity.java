package br.unisinos.as2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnAdd, btnEdit, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (ImageButton) findViewById(R.id.btnAdd);
        btnEdit = (ImageButton) findViewById(R.id.btnEdit);
        btnDelete = (ImageButton) findViewById(R.id.btnDelete);

    }
}
