package com.example.felixidan.sessionone;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

public class ListViewCustomViewDemoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_custom_view_demo);

        ColorEntry[] array = {
                                new ColorEntry("Red", "#F44336"),
                                new ColorEntry("Pink", "#E91E63"),
                                new ColorEntry("Purple", "#9C27B0"),
                                new ColorEntry("Deep Purple", "#673AB7"),
                                new ColorEntry("Indigo", "#3F51B5"),
                                new ColorEntry("Blue", "#2196F3"),
                                new ColorEntry("Light Blue", "#03A9F4"),
                                new ColorEntry("Cyan", "#00BCD4"),
                                new ColorEntry("Teal", "#009688"),
                                new ColorEntry("Green", "#4CAF50"),
                                new ColorEntry("Light Green", "#8BC34A"),
                                new ColorEntry("Lime", "#CDDC39"),
                                new ColorEntry("Yellow", "#FFEB3B"),
                                new ColorEntry("Amber", "#FFC107"),
                                new ColorEntry("Orange", "#FF9800"),
                                new ColorEntry("Deep Orange", "#FF5722"),
                                new ColorEntry("Brown", "#795548")
                             };

        ColorEntriesAdapter adapter = new ColorEntriesAdapter(this, array);

        ListView list = (ListView)findViewById(R.id.listviewcustomdemo_list);
        list.setAdapter(adapter);
    }

}
