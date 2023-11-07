package domain;

public class MatchCountNumber {
    private int threeMatch = 0;
    private int fourMatch = 0;
    private int fiveMatch = 0;
    private int fiveBonusMatch = 0;
    private int sixMatch = 0;

    public MatchCountNumber() {
    }

    public int getThreeMatch() {
        return threeMatch;
    }

    public int getFourMatch() {
        return fourMatch;
    }

    public int getFiveMatch() {
        return fiveMatch;
    }

    public int getFiveBonusMatch() {
        return fiveBonusMatch;
    }

    public int getSixMatch() {
        return sixMatch;
    }


    public void threeMatchPlus() {
        System.out.println("세개일치"+getThreeMatch());
        threeMatch++;
        System.out.println("세개일치"+getThreeMatch());
    }

    public void fourMatchPlus() {
        System.out.println("네개일치"+getFourMatch());
        fourMatch++;
        System.out.println("네개일치"+getFourMatch());
    }

    public void fiveMatchPlus() {
        System.out.println("다섯개일치"+getFiveMatch());
        fiveMatch++;
        System.out.println("다섯개일치"+getFiveMatch());
    }

    public void fiveBonusMatchPlus() {
        System.out.println("다섯개보너스일치"+getFiveBonusMatch());
        fiveBonusMatch++;
        System.out.println("다섯개보너스일치"+getFiveBonusMatch());
    }

    public void sixMatchPlus() {
        System.out.println("여섯개일치"+getSixMatch());
        sixMatch++;
        System.out.println("여섯개일치"+getSixMatch());

    }
}
