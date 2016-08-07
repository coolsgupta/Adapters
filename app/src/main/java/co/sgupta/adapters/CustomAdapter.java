package co.sgupta.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    Context mContext;
    int[] mImages;
    String[] mTitles;
    String[] mDescription;

    CustomAdapter(Context c,String[] titles,int[] images,String[] description){

        super(c,R.layout.single_row,R.id.textView1,titles);

        this.mContext = c;
        this.mImages = images;
        this.mTitles = titles;
        this.mDescription = description;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MyViewHolder holder = null;
        //check for view recycling, convert view  = null if view is created first time else it contains the recycled view
        View row = convertView;
        //use layout inflater only if view is created first time ie no view is available for recycling
        if(row==null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            row = inflater.inflate(R.layout.single_row, parent, false);
            //holder is assigned to the view only when new view is created so prevents multiple lookups in the resource file
            holder = new MyViewHolder(row);

            row.setTag(holder);
        }
        else {
            holder = (MyViewHolder) row.getTag();
        }

        holder.imageView.setImageResource(mImages[position]);
        holder.textView1.setText(mTitles[position]);
        holder.textView2.setText(mDescription[position]);

        /*imageView.setImageResource(mImages[position]);
        textView1.setText(mTitles[position]);
        textView2.setText(mDescription[position]);*/

        return row;
    }
}
