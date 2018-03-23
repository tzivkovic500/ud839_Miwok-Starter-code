package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

         /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

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

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);


        }
    }

