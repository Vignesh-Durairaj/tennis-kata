package com.test.exercise.boards;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreBoardUnitTest {

	ScoreBoard scoreBoard;
	
	@Test
	void testScoreCardPrintedInTheBoard() {
		scoreBoard.printScore();
	}


	@ParameterizedTest
	@CsvSource({
		"0, 0, 0:0",
		"1, 0, 15:0",
		"2, 0, 30:0",
		"2, 1, 30:15",
		"2, 2, 30:30",
		"3, 2, 40:30",
		"3, 3, DEUCE",
		"3, 4, P2-ADV",
		"4, 4, DEUCE",
		"5, 4, P1-ADV",
		"6, 4, P1-WINS"
	})
	void givenPoints_whenPrintScore_thenPrintPoints(int p1, int p2, String expected) {
		//given scores
		scoreBoard = new TennisScoreBoard(p1, p2);
		//when
		String actual = scoreBoard.printScore();
		//then
		assertThat(actual).isEqualTo(expected);
	}
}
