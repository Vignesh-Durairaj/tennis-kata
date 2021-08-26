package com.test.exercise.boards;

public class ScoreBoardImpl implements ScoreBoard {

    private int p1Points;
    private int p2Points;
    final private int DEUCE_NUMBER = 3;

    ScoreBoardImpl(int p1, int p2) {
        // 1: 0
        p1Points = p1;
        p2Points = p2;
    }

    @Override
    public String getPoints() {
        return null;
    }

    @Override
    public String printScore() {
        int displayScoreP1 = 0;
        int displayScoreP2 = 0;
        // generate random point 1:0 3:0
        if (p1Points < DEUCE_NUMBER && p2Points < DEUCE_NUMBER) {
            displayScoreP1 = p1Points * 15;
            displayScoreP2 = p2Points * 15;
            return displayScoreP1 + ":" + displayScoreP2;
        } else { // one is greater than and equal to 3 then
            if (p1Points == p2Points) {
                return "DEUCE";
            } else if (p1Points > p2Points) {
                if (p1Points == DEUCE_NUMBER) {
                    return "40:" + p2Points * 15;
                } else if (p1Points - p2Points >= 2) {
                    return "P1 WINS";
                } else {
                    return "ADVANCE TO P1";
                }
            } else {
                if (p2Points == DEUCE_NUMBER) {
                    return p1Points * 15 + ":40";
                } else if (p2Points - p1Points >= 2) {
                    return "P2 WINS";
                } else {
                    return "ADVANCE TO P2";
                }
            }
        }       // then switch
    }
}
