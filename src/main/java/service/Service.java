package service;

import camp.nextstep.edu.missionutils.Randoms;
import domain.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import domain.WinningLotto;
public class Service {
    private Lotto lotto;
    private AllLotto allLotto;
    private List<Integer> winningLotto=new ArrayList<>();
    MatchCountNumber matchCountNumber=new MatchCountNumber();

    public Service( AllLotto allLotto) {
        this.allLotto = allLotto;
    }
//https://www.freecodecamp.org/korean/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
    public int purchaseMoney(String purchaseMoney) {
        int totalPurchaseMoney=0;

        totalPurchaseMoney=Integer.parseInt(purchaseMoney);

        //예외처리

        //숫자 변환 후 도메인 로직으로 넘기기
        return totalPurchaseMoney;


    }
    public int amountNumber(int purchaseMoney){
        return divideThousand(purchaseMoney);
    }

    public int divideThousand(int totalPurchaseMoney) {
        return totalPurchaseMoney / 1000;
    }


    public void makeLotto(int amount) {

        for (int i = 0; i < amount; i++) {
            List<Integer> numbers = new ArrayList<>();
            numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);


            allLotto.addLotto(numbers);
        }

    }
    public void winningNumber(String winningNumberInput){
        //parsing
        for (String element :winningNumberInput.split(",")){
            winningLotto.add(Integer.parseInt(element));
            //System.out.println(element);
        }
        System.out.println(winningLotto);
        //예외처리

    }

    public void bonusNumber(String bonusNumber){

    }
    public List<Lotto> sortNumber(List<Lotto> lottos){

        List<Lotto> sortedLottos = new ArrayList<>();
        //sort , add

        return sortedLottos;
    }

    public MatchCountNumber matchLotto(List<Lotto> lottos,List<Integer> winningLotto){
         //비교해서 개수 알아내기
          for (Lotto one : lottos) {
            updateMatchNumber(matchOneLotto(one));
          }
          return matchCountNumber;
    }
public void updateMatchNumber(int matchNum){
    int count = matchNum;

    if (count==5){fiveBonus(lotto);}
    else if (count == 3) {matchCountNumber.threeMatchPlus();}
    else if (count == 4) {matchCountNumber.fourMatchPlus();}
    else if (count == 6) {matchCountNumber.sixMatchPlus();}

}
    public int matchOneLotto(Lotto lotto){
        int count=0;
        //비교
        return count;
         }

    public int profitRate(MatchCountNumber matchCountNumber, int purchaseMoney){
    //enum으로 설정한 값
        int sum=0;
        sum+=Reward.THREE_MATCH.getRewardMoney()*matchCountNumber.getThreeMatch();
        sum+=Reward.FOUR_MATCH.getRewardMoney()*matchCountNumber.getFourMatch();
        sum+=Reward.FIVE_MATCH.getRewardMoney()*matchCountNumber.getFiveMatch();
        sum+=Reward.FIVE_BONUS_MATCH.getRewardMoney()*matchCountNumber.getFiveBonusMatch();
        sum+=Reward.SIX_MATCH.getRewardMoney()*matchCountNumber.getSixMatch();

        return (purchaseMoney/sum)*100;
    }
    public void fiveBonus(Lotto lotto){
        //보너스 번호랑 비교
    }
}



