package com.devcolibri.translator.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.devcolibri.translator.R;

public class AddWordActivity extends AppCompatActivity {
    private EditText wordEditText;
    private EditText translationEditText;
    private Button addWordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        getSupportActionBar().setTitle(R.string.add_word_screen);

        wordEditText = findViewById(R.id.word_edit_text);
        translationEditText = findViewById(R.id.translation_edit_text);
        addWordButton = findViewById(R.id.add_word_button);

        addWordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word = wordEditText.getText().toString();
                String translation = translationEditText.getText().toString();

                String string = "Вы добавили слово: " + word + " : " + translation;
                Toast.makeText(AddWordActivity.this, string, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
