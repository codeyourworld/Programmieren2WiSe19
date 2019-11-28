package haw_hamburg.de.highscore;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    //reference to the data
    //TODO put other Objects to the list and rename it
    private ArrayList<Score> scores;

    //TODO put other Objects to the list and rename it
    public MyAdapter (ArrayList<Score> scores) {
        this.scores = scores;
    }

    //here the adapter creates a graphical element which looks like
    //described in R.layout.item
    //this element calls view holder, it holds a view / an item of the list
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //TODO please enter your xml-file name where R.layout.item is
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //here are the views from R.layout.item connected to the data
        //TODO please call the view methods of MyViewHolder
        //TODO fill the views with data from your arraylist
        holder.getPointsTextView().setText(String.valueOf(scores.get(position).getPoints()));
        holder.getPointsTextView().setVisibility(View.INVISIBLE);
        holder.getNameTextView().setText(scores.get(position).getName());
    }

    @Override
    public int getItemCount() {
        //TODO return the size of your arraylist
        return scores.size();
    }
}
