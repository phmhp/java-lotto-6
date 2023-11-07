package controller;

import domain.AllLotto;
import domain.MatchCountNumber;
import domain.WinningLotto;
import service.Service;
import service.GetInput;
import view.Instruction;
import domain.WinningLotto;
public class Controller {
    public Controller() {

    }

    public void game() {
        Instruction instruction = new Instruction();
        GetInput getInput = new GetInput();
        AllLotto allLotto = new AllLotto();
        Service service = new Service(allLotto);
        WinningLotto winningLotto = new WinningLotto();

        instruction.purchaseMoney(); //구매금액을 입력해 주세요.
        int purchaseMoney= service.purchaseMoney(getInput.inputPurchaseMoney());
        System.out.println("purchaseMoney="+purchaseMoney);
        int amount = service.amountNumber(purchaseMoney);
        instruction.purchaseAmount(amount); //8개를 구매했습니다.
        service.makeLotto(amount);
        instruction.lottoNumberAll(service.sortNumber(allLotto.getLottos()));
        instruction.winnigNumber(); //당첨 번호를 입력해 주세요.
        service.winningNumber(getInput.inputWinningNumber());
        instruction.bonusNumber(); //보너스 번호를 입력해 주세요.
        service.bonusNumber(getInput.inputBonusNumber());
        instruction.winningStatistics(); //당첨 통계
        MatchCountNumber matchCountNumber= service.matchLotto(service.sortNumber(allLotto.getLottos()),winningLotto.getWinningLotto());
        instruction.totalResult(matchCountNumber);
        instruction.benefit(service.profitRate(matchCountNumber,purchaseMoney));

    }
}
