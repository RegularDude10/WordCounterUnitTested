package com.example.wordscounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Spinner spCounterSelection;
    private EditText txtEnteredText;
    private TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEnteredText = findViewById(R.id.txtEnteredText);
        tvCount = findViewById(R.id.tvCount);
        spCounterSelection = findViewById(R.id.spCounterSelection);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.selectionOption, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCounterSelection.setAdapter(adapter);
    }

    public void onButtonCountClick(View view) {

        if (txtEnteredText.length() == 0)
        {
            Toast.makeText(MainActivity.this,
                    "Empty field is not allowed!",
                    Toast.LENGTH_SHORT).show();
        }
        else {

            if (spCounterSelection.getSelectedItem().toString().equalsIgnoreCase(getResources().getString(R.string.selection_chars))) {
                tvCount.setText(String.valueOf(TextCounter.countChars(txtEnteredText.getText().toString())));
            }
            if (spCounterSelection.getSelectedItem().toString().equalsIgnoreCase(getResources().getString(R.string.selection_words))) {
                tvCount.setText(String.valueOf(TextCounter.countWords(txtEnteredText.getText().toString())));
            }

        }
    }
}