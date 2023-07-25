package com.test.exercise.boards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ScoreBoardUnitTest {

	private ScoreBoardPrint sBoardPrint;
	
	@Test
	public void testScoreCardPrintedInTheBoard_zero_to_zero() {
		int p1 = 0;
		int p2 = 0;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "0:0";
		assertEquals(expaction,result);
	}
	
	@Test
	public void testScoreCardPrintedInTheBoard_one_to_zero() {
		int p1 = 1;
		int p2 = 0;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "15:0";
		assertEquals(expaction,result);
	}
	
	@Test
	public void testScoreCardPrintedInTheBoard_one_to_one() {
		int p1 = 1;
		int p2 = 1;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "15:15";
		assertEquals(expaction,result);
	}
	
	@Test
	public void testScoreCardPrintedInTheBoard_one_to_two() {
		int p1 = 1;
		int p2 = 2;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "15:30";
		assertEquals(expaction,result);
	}
	
	@Test
	public void testScoreCardPrintedInTheBoard_one_to_three() {
		int p1 = 1;
		int p2 = 3;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "15:40";
		assertEquals(expaction,result);
	}
	
	@Test
	public void testScoreCardPrintedInTheBoard_three_to_two() {
		int p1 = 3;
		int p2 = 2;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "40:30";
		assertEquals(expaction,result);
	}
	
	@Test
	public void testScoreCardPrintedInTheBoard_three_to_three() {
		int p1 = 3;
		int p2 = 3;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "DEUCE";
		assertEquals(expaction,result);
	}
	
	@Test
	public void testScoreCardPrintedInTheBoard_three_to_four() {
		int p1 = 3;
		int p2 = 4;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "p2 advance";
		assertEquals(expaction,result);
	}
	
	@Test
	public void testScoreCardPrintedInTheBoard_four_to_four() {
		int p1 = 4;
		int p2 = 4;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "DEUCE";
		assertEquals(expaction,result);
	}
	
	@Test
	public void testScoreCardPrintedInTheBoard_five_to_four() {
		int p1 = 5;
		int p2 = 4;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "p1 advance";
		assertEquals(expaction,result);
	}
	
	@Test
	public void testScoreCardPrintedInTheBoard_five_to_five() {
		int p1 = 5;
		int p2 = 5;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "DEUCE";
		assertEquals(expaction,result);
	}
	
	@Test
	public void testScoreCardPrintedInTheBoard_six_to_five() {
		int p1 = 6;
		int p2 = 5;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "p1 advance";
		assertEquals(expaction,result);
	}
	
	@Test
	public void testScoreCardPrintedInTheBoard_seven_to_five() {
		int p1 = 7;
		int p2 = 5;
		sBoardPrint = new ScoreBoardPrint();
		sBoardPrint.setP1(p1);
		sBoardPrint.setP2(p2);
		String result = sBoardPrint.printScore();
		String expaction = "p1 win";
		assertEquals(expaction,result);
	}
}
