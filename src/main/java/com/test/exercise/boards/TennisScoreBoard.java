package com.test.exercise.boards;

import java.util.HashMap;
import java.util.Map;

public class TennisScoreBoard implements ScoreBoard {

    private static final Map<Integer, String> SCORE_MAP = new HashMap(){{
        put(0, "0");
        put(1, "15");
        put(2, "30");
        put(3, "40");
    }};

    private final int p1;
    private final int p2;

    public TennisScoreBoard(int p1, int p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String getPoints() {
        return null;
    }

    @Override
    public String printScore() {
        if (p1 >= 3 && p1 == p2) {
            return "DEUCE";
        } else if (p1 >= 3 && p2 >= 3 && p1 > p2 && p1 - p2 == 1) {
            return "P1-ADV";
        } else if (p1 >= 3 && p2 >= 3 && p2 > p1 && p2 - p1 == 1) {
            return "P2-ADV";
        }  else if (p1 >= 3 && p2 >= 3 && p1 > p2 && p1 - p2 == 2) {
            return "P1-WINS";
        } else if (p1 >= 3 && p2 >= 3 && p2 > p1 && p2 - p1 == 2) {
            return "P2-WINS";
        }
        String score1 = SCORE_MAP.get(p1);
        String score2 = SCORE_MAP.get(p2);
        return score1 + ":" + score2;
    }
}
