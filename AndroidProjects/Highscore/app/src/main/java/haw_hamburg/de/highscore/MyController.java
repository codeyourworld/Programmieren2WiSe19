package haw_hamburg.de.highscore;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;

public class MyController {

    private LinearLayoutManager layoutManager;
    private ArrayList<Score> scores = new ArrayList<>();
    private RecyclerView recyclerView;
    private MyAdapter adapter;

    public MyController(Activity activity) {
        //TODO init data
        for(int i = 0; i < 50; i++) {
            scores.add(new Score("User " + i, i % 10));
        }

        Collections.sort(scores);

        //TODO set layout manager to reycler
        layoutManager = new LinearLayoutManager(activity);

        //TODO the recyclerView has to be declared in
        //TODO activity main.xml for this example
        recyclerView = (RecyclerView) activity.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);

        //TODO give the adapter the reference of the data
        adapter = new MyAdapter(scores);

        // Set CustomAdapter as the adapter for RecyclerView.
        //TODO Connect recyclerView and adapter
        recyclerView.setAdapter(adapter);

    }

    //if a user can add a emotion call this method
    //TODO change this method to an object which fits for you
    public void addScore(Score score) {
        scores.add(score);
        adapter.notifyDataSetChanged();
    }
}
