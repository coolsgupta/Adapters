package co.sgupta.adapters;

import android.app.ListActivity;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    String[] mString = {"a","b","c","d","e","f","g"};
    String[] mTitles;
    String[] mDescriptions;
    int[] mImages ={R.drawable.meme_1,R.drawable.meme_2,R.drawable.meme_3,R.drawable.meme_4,R.drawable.meme_5,R.drawable.meme_6
            ,R.drawable.meme_7,R.drawable.meme_8,R.drawable.meme_9,R.drawable.meme_10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //array adapter


        /*mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mString);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView t = (TextView) view;
                Toast.makeText(MainActivity.this,t.getText()+" "+position,Toast.LENGTH_LONG ).show();
            }
        });*/

       /* mListView = getListView();
        ArrayAdapter<String> adapter  =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mString);
        mListView.setAdapter(adapter);*/
        /*mListView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.single_row,R.id.textViewL,mString);
        mListView.setAdapter(adapter);
        mListView = (ListView) findViewById(R.id.list1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.single_row,R.id.textViewL,mString);
        mListView.setAdapter(adapter1);*/

        //list view with images
        Resources resources = getResources();
        mTitles = resources.getStringArray(R.array.titles);
        mDescriptions = resources.getStringArray(R.array.descriptions);
        mListView = (ListView) findViewById(R.id.list);
        CustomAdapter adapter = new CustomAdapter(this,mTitles,mImages,mDescriptions);
        mListView.setAdapter(adapter);



    }

    /*@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        TextView t = (TextView) v;
        Toast.makeText(MainActivity.this,t.getText()+" + "+position,Toast.LENGTH_LONG ).show();
    }*/

}