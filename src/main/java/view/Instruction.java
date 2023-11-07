package view;

import domain.AllLotto;
import domain.Lotto;
import domain.MatchCountNumber;

import java.util.List;

public class Instruction {

    //구입 금액 입력 요청 문구 출력
    public void purchaseMoney() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    //공백 출력
    public void blankLine() {
        System.out.println("");
    }

    //구입 수량 출력 문구
    public void purchaseAmount(int amount) {
        blankLine();
        System.out.println(amount + "개를 구매했습니다.");
    }

    //구입 수량만큼 발행된 로또 번호 출력
    public void lottoNumberAll(List<Lotto> allLotto) {
        for (Lotto oneLotto:allLotto){
            System.out.println(oneLotto);
        }
        //TODO:구현 예정
    }

    public void winnigNumber() {
        System.out.println("당첨 번호를 입력해 주세요.");
    }

    public void bonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
    }

    public void winningStatistics() {
        System.out.println("당첨 통계");
        dashLine();
    }

    public void dashLine() {
        System.out.println("---");
    }

    public void threeMatchCount(int threeNumber) {
        System.out.println("3개 일치 (5,000원) - " + threeNumber + "개");
    }

    public void fourMatchCount(int fourNumber) {
        System.out.println("4개 일치 (50,000원) - " + fourNumber + "개");
    }

    public void fiveMatchCount(int fiveNumber) {
        System.out.println("5개 일치 (1,500,000원) - " + fiveNumber + "개");
    }

    public void fiveBonusMatchCount(int fiveBonusNumber) {
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + fiveBonusNumber + "개");
    }

    public void sixBonusMatchCount(int sixNumber) {
        System.out.println("6개 일치 (2,000,000,000원) - " + sixNumber + "개");
    }

    public void totalResult(MatchCountNumber matchCountNumber){
        threeMatchCount(matchCountNumber.getThreeMatch());
        fourMatchCount(matchCountNumber.getFourMatch());
        fiveMatchCount(matchCountNumber.getFiveMatch());
        fiveBonusMatchCount(matchCountNumber.getFiveBonusMatch());
        sixBonusMatchCount(matchCountNumber.getSixMatch());
    }
    public void benefit(int percent) {
        System.out.println("총 수익률은 " + percent + "%입니다.");
    }
}
