package com.devcolibri.translator;

import java.util.Arrays;
import java.util.List;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.LinearLayout;

import com.devcolibri.translator.adapter.WordAdapter;
import com.devcolibri.translator.entity.Word;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FloatingActionButton addWordButton;
    private WordAdapter wordAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.words_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        wordAdapter = new WordAdapter();
        recyclerView.setAdapter(wordAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        wordAdapter.setWords(getWords());

        addWordButton = findViewById(R.id.add_word_button);
    }


    private List<Word> getWords() {
        return Arrays.asList(
            new Word("Mum", "Мама"),
            new Word("Dad", "Папа"),
            new Word("Brother", "Брат"),
            new Word("Sister", "Сестра")
        );
    }
}
