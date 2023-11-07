package domain;

public class MatchCountNumber {
    private int threeMatch=0;
    private int fourMatch=0;
    private int fiveMatch=0;
    private int fiveBonusMatch=0;
    private int sixMatch=0;

    public MatchCountNumber(){
    }

    public int getThreeMatch(){
        return threeMatch;
    }
    public int getFourMatch(){
        return fourMatch;
    }
    public int getFiveMatch(){
        return fiveMatch;
    }
    public int getFiveBonusMatch(){
        return fiveBonusMatch;
    }
    public int getSixMatch(){
        return sixMatch;
    }
    public void threeMatchPlus(){
        threeMatch++;
    }
    public void fourMatchPlus(){
        fourMatch++;
    }
    public void fiveMatchPlus(){
        fiveMatch++;
    }
    public void fiveBonusMatchPlus(){
        fiveBonusMatch++;
    }
    public void sixMatchPlus(){
        sixMatch++;
    }
}
