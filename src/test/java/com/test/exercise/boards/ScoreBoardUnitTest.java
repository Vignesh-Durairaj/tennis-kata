package com.test.exercise.boards;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ScoreBoardUnitTest {

    ScoreBoard scoreBoard;

    @Before
    public void setUp() {
        scoreBoard = new ScoreBoardImpl(0, 0);
    }

    @Test
    public void testScoreCardPrintedInTheBoardCase1() {
        scoreBoard = new ScoreBoardImpl(0, 0);
        String scores = scoreBoard.printScore();
        System.out.println(scores);
        Assert.assertNotNull(scores);
        Assert.assertEquals("0:0", scores);
    }

    @Test
    public void testScoreCardPrintedInTheBoardCase2() {
        scoreBoard = new ScoreBoardImpl(1, 0);
        String scores = scoreBoard.printScore();
        System.out.println(scores);
        Assert.assertNotNull(scores);
        Assert.assertEquals("15:0", scores);
    }

    @Test
    public void testScoreCardPrintedInTheBoardCase3() {
        scoreBoard = new ScoreBoardImpl(2, 3);
        String scores = scoreBoard.printScore();
        System.out.println(scores);
        Assert.assertNotNull(scores);
        Assert.assertEquals("30:40", scores);
    }

    @Test
    public void testScoreCardPrintedInTheBoardCase4() {
        scoreBoard = new ScoreBoardImpl(2, 2);
        String scores = scoreBoard.printScore();
        System.out.println(scores);
        Assert.assertNotNull(scores);
        Assert.assertEquals("30:30", scores);
    }

    @Test
    public void testScoreCardPrintedInTheBoardCase5() {
        scoreBoard = new ScoreBoardImpl(3, 3);
        String scores = scoreBoard.printScore();
        System.out.println(scores);
        Assert.assertNotNull(scores);
        Assert.assertEquals("DEUCE", scores);
    }

    @Test
    public void testScoreCardPrintedInTheBoardCase6() {
        scoreBoard = new ScoreBoardImpl(5, 4);
        String scores = scoreBoard.printScore();
        System.out.println(scores);
        Assert.assertNotNull(scores);
        Assert.assertEquals("ADVANCE TO P1", scores);
    }

    @Test
    public void testScoreCardPrintedInTheBoardCase7() {
        scoreBoard = new ScoreBoardImpl(6, 7);
        String scores = scoreBoard.printScore();
        System.out.println(scores);
        Assert.assertNotNull(scores);
        Assert.assertEquals("ADVANCE TO P2", scores);
    }

    @Test
    public void testScoreCardPrintedInTheBoardCase8() {
        scoreBoard = new ScoreBoardImpl(6, 8);
        String scores = scoreBoard.printScore();
        System.out.println(scores);
        Assert.assertNotNull(scores);
        Assert.assertEquals("P2 WINS", scores);
    }
}
