package com.test.exercise.boards;

public class ScoreBoardPrint implements ScoreBoard{

	private int p1;
	private int p2;
	
	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}
	
	public String convert(int p1, int p2) {
		
		if(p1==3 && p2==3) {
			return "DEUCE";
		}else if(p1 <= 3 && p2 <= 3 ) {
			String p1Str = "" + ((p1*15 >= 45) ? 40 : p1*15);
			String p2Str = "" + ((p2*15 >= 45) ? 40 : p2*15);
			return p1Str + ":" + p2Str;
		}else {
			return (p1 - p2 == 1) ? "p1 advance" : (p1 - p2 > 1) ? "p1 win" : (p2 - p1 == 1) ? "p2 advance" : (p2 - p1 > 1) ? "p2 win" : "DEUCE";
		}
		
		
		
	}
    
	@Override
	public String printScore() {
		// TODO Auto-generated method stub
		return convert(p1,p2);
	}

}
