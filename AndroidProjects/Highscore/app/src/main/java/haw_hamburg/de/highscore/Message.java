package haw_hamburg.de.highscore;

import android.support.annotation.NonNull;

//TODO remove this class through another data class
public class Score implements Comparable<Score>{

    private String name;
    private int points;
    private int id;
    private static int nextID = 1;

    public Score(String name, int points) {
        this.name = name;
        this.points = points;
        id = nextID;
        nextID++;
    }

    public Score() {
        this("Name", 0);
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(@NonNull Score score) {
        if(points > score.points) {
            return -1;
        }
        else if(points < score.points) {
            return 1;
        }

        return name.compareTo(score.name);
    }
}
