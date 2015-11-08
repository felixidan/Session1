package com.example.felixidan.sessionone;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewDemoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_demo);

        String[] myArray = {
                                "There's a lady who's sure ",
                                "all that glitters is gold",
                                "And she's buying a stairway to heaven.",
                                "When she gets there she knows, ",
                                "if the stores are all closed",
                                "With a word ",
                                "she can get what she came for.",
                                "Ooh, ooh, ",
                                "and she's buying a stairway to heaven.",
                                "There's a sign on the wall ",
                                "but she wants to be sure",
                                "'Cause you know sometimes ",
                                "words have two meanings.",
                                "In a tree by the brook, ",
                                "there's a songbird who sings,",
                                "Sometimes all of our thoughts ",
                                "are misgiven."
                           };

        ArrayAdapter<String> myAdapter =
                            new ArrayAdapter<String>
                                    (this,
                                     android.R.layout.simple_list_item_1,
                                     myArray);



        ListView list = (ListView)findViewById(R.id.listviewdemo_list);
        list.setAdapter(myAdapter);
    }
}
