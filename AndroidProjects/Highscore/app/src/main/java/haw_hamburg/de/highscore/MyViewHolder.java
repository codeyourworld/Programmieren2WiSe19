package haw_hamburg.de.highscore;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    //TODO please declare your views from R.layout.item here
    private final TextView pointsTextView;
    private final TextView nameTextView;
 
    public MyViewHolder(View itemView) {
        super(itemView);

        //TODO please initialize your views from R.layout.item here
        pointsTextView = (TextView) itemView.findViewById(R.id.point_textView);
        nameTextView = (TextView) itemView.findViewById(R.id.name_textView);
        //TODO set listener for views
    }

    //TODO please insert here getter from your views above


    public TextView getPointsTextView() {
        return pointsTextView;
    }

    public TextView getNameTextView() {
        return nameTextView;
    }
}
