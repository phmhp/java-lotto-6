package service;

import camp.nextstep.edu.missionutils.Randoms;
import domain.*;

import java.util.*;

import domain.WinningLotto;

public class Service {
    private Lotto lotto;
    private AllLotto allLotto;
    private List<Integer> winningLotto = new ArrayList<>();
    private int bonusNumber;
    MatchCountNumber matchCountNumber = new MatchCountNumber();

    public Service(AllLotto allLotto) {
        this.allLotto = allLotto;
        this.bonusNumber = bonusNumber;
    }

    //https://www.freecodecamp.org/korean/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
    public int purchaseMoney(String purchaseMoney) {
        int totalPurchaseMoney = 0;

        totalPurchaseMoney = Integer.parseInt(purchaseMoney);

        //예외처리

        //숫자 변환 후 도메인 로직으로 넘기기
        return totalPurchaseMoney;


    }

    public int amountNumber(int purchaseMoney) {
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

    public void winningNumber(String winningNumberInput) {
        //parsing
        for (String element : winningNumberInput.split(",")) {
            winningLotto.add(Integer.parseInt(element));
            //System.out.println(element);
        }
        System.out.println(winningLotto);
        //예외처리

    }

    public void bonusNumber(String bonusNumberInput) {
        //예외처리
        bonusNumber = Integer.parseInt(bonusNumberInput);
    }

    public List<Lotto> sortNumber(List<Lotto> lottos) {

        List<Lotto> sortedLottos = new ArrayList<>();

        for (Lotto lotto : lottos) {

            //System.out.println(lotto.getLottoNumber());
            Collections.sort(lotto.getLottoNumber());
            //System.out.println(lotto.getLottoNumber());

        }


        return lottos;
    }


    public MatchCountNumber matchLotto(List<Lotto> lottos) {
        //비교해서 개수 알아내기
        for (Lotto one : lottos) {
           // System.out.println("test here" + one.getLottoNumber());
            int matchNum = matchOneLotto(one);
            if (matchNum == 5) {
                countBonusPlusOne(one);
                //continue;
            } else if (matchNum != 5) {
                updateMatchNumber(matchNum);
            }
            //updateMatchNumber(matchOneLotto(one));
        }
        return matchCountNumber;
    }

    public int matchOneLotto(Lotto oneLotto) {
        int count = 0;
        boolean same = false;

        for (int element : oneLotto.getLottoNumber()) {
            same = compareWinningNumber(element);
            if (same == true) {
                count++;
            }
        }
        return count;
    }

    public void updateMatchNumber(int matchNum) {
        int count = matchNum;


        if (count < 3) {
            ;
        } else if (count >= 3) {
            countPlusOne(count);
        }
    }

    public void countPlusOne(int count) {

        if (count == 3) {
            System.out.println("three"+count);
            matchCountNumber.threeMatchPlus();
        } else if (count == 4) {
            System.out.println("four"+count);
            matchCountNumber.fourMatchPlus();
        } else if (count == 6) {
            System.out.println("six"+count);
            matchCountNumber.sixMatchPlus();
        }


    }

    public void countBonusPlusOne(Lotto fiveLotto) {
        boolean bonusTF = fiveBonus(fiveLotto);
        if (bonusTF == true) {
            matchCountNumber.fiveBonusMatchPlus();
        } else if (bonusTF == false) {
            matchCountNumber.fourMatchPlus();
        }
    }


    public boolean compareWinningNumber(int element) {
        for (int winningElement : winningLotto) {
            if (element == winningElement) {
                return true;
            }
        }
        return false;
    }




    public boolean fiveBonus(Lotto lotto) {
        //보너스 번호랑 비교
        for (int lottoNumber : lotto.getLottoNumber()) {
            if (bonusNumber == lottoNumber) {
                return true;
            }
        }
        return false;
    }

    public int profitRate(MatchCountNumber matchCountNumber, int purchaseMoney) {
        //enum으로 설정한 값
        int sum = 0;

        sum += Reward.THREE_MATCH.getRewardMoney() * matchCountNumber.getThreeMatch();
        sum += Reward.FOUR_MATCH.getRewardMoney() * matchCountNumber.getFourMatch();
        sum += Reward.FIVE_MATCH.getRewardMoney() * matchCountNumber.getFiveMatch();
        sum += Reward.FIVE_BONUS_MATCH.getRewardMoney() * matchCountNumber.getFiveBonusMatch();
        sum += Reward.SIX_MATCH.getRewardMoney() * matchCountNumber.getSixMatch();

        if (sum ==0) return 0;

        return ( sum/purchaseMoney) * 100;
    }
}



