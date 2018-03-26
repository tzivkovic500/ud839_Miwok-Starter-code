package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("mustard yellow", "chiwiiṭә"));
        words.add(new Word("dusty yellow", "ṭopiisә"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "ṭakaakki"));
        words.add(new Word("gray", "ṭopoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));

        // Verify the contents of the list by printing out each element to the logs
        //Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
        //Log.v("NumbersActivity", "Word at index 1: " + words.get(1));
        //Log.v("NumbersActivity", "Word at index 2: " + words.get(2));
        //Log.v("NumbersActivity", "Word at index 3: " + words.get(3));
        //Log.v("NumbersActivity", "Word at index 4: " + words.get(4));
        //Log.v("NumbersActivity", "Word at index 5: " + words.get(5));
        //Log.v("NumbersActivity", "Word at index 6: " + words.get(6));
        //Log.v("NumbersActivity", "Word at index 7: " + words.get(7));
        //Log.v("NumbersActivity", "Word at index 8: " + words.get(8));
        //Log.v("NumbersActivity", "Word at index 9: " + words.get(9));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }
}
