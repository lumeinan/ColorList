package sg.edu.rp.c346.colorlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvBoxArrangement;
    ArrayList<Colour> boxArrangeList;
    CustomAdapter caBoxArrangement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvBoxArrangement=(ListView)findViewById(R.id.listViewColour);
        boxArrangeList = new ArrayList<Colour>();

        caBoxArrangement = new CustomAdapter(this, R.layout.colour_row, boxArrangeList);
        lvBoxArrangement.setAdapter(caBoxArrangement);


        Colour item1 = new Colour("blue");
        boxArrangeList.add(item1);
        Colour item2 = new Colour("orange");
        boxArrangeList.add(item2);
        Colour item3 = new Colour("brown");
        boxArrangeList.add(item3);




    }
}
