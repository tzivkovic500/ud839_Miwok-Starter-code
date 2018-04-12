package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

         /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        words.add(new Word("eight", "kawinta",R.drawable.number_eight));
        words.add(new Word("nine", "wo’e", R.drawable.number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten));

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

