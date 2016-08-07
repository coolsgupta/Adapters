package co.sgupta.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder {

    ImageView imageView;
    TextView textView1;
    TextView textView2;

    public MyViewHolder(View row) {
        imageView = (ImageView) row.findViewById(R.id.imageView);
        textView1 = (TextView) row.findViewById(R.id.textView1);
        textView2 = (TextView) row.findViewById(R.id.textView2);
    }
}
