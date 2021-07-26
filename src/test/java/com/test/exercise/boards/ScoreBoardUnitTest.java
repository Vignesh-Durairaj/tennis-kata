package com.test.exercise.boards;

import org.junit.jupiter.api.Test;

public class ScoreBoardUnitTest {

	ScoreBoard scoreBoard;
	
	@Test
	void testScoreCardPrintedInTheBoard() {
		scoreBoard.printScore();
	}
}
