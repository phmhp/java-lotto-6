package controller;

import domain.*;
import service.Service;
import service.GetInput;
import service.Validate;
import view.Instruction;
import domain.WinningLotto;

import java.util.List;

public class Controller {
    public Controller() {

    }

    public void game() {
        Instruction instruction = new Instruction();
        GetInput getInput = new GetInput();
        AllLotto allLotto = new AllLotto();
        Service service = new Service(allLotto);
        WinningLotto winningLotto = new WinningLotto();
        Validate validate = new Validate();
        String purchaseMoneyInut = "";
        String loopOrNot="";
        int purchaseMoney = 0;
        //boolean purchaseOk = false;
        while ( !loopOrNot.equals("success")) {

                instruction.purchaseMoney(); //구매금액을 입력해 주세요.
                purchaseMoneyInut = getInput.inputPurchaseMoney();
                //예외처리
                loopOrNot=validate.purchaseMoneyValidate(purchaseMoneyInut);
                System.out.println(loopOrNot);
                System.out.println(loopOrNot.equals("success"));

        }
        purchaseMoney = service.purchaseMoney(purchaseMoneyInut);

        System.out.println("purchaseMoney=" + purchaseMoney);
        int amount = service.amountNumber(purchaseMoney);
        instruction.purchaseAmount(amount); //8개를 구매했습니다.
        service.makeLotto(amount);
        List<Lotto> lottoAll = service.sortNumber(allLotto.getLottos());
        instruction.lottoNumberAll(lottoAll);

        boolean winningNumberOk = false;
        while (winningNumberOk == false) {
            instruction.winnigNumber(); //당첨 번호를 입력해 주세요.
            service.winningNumber(getInput.inputWinningNumber());
        }

        boolean bonusNumberOk = false;
        while (bonusNumberOk == false) {
            instruction.bonusNumber(); //보너스 번호를 입력해 주세요.
            service.bonusNumber(getInput.inputBonusNumber());
        }


        instruction.winningStatistics(); //당첨 통계
        MatchCountNumber matchCountNumber = service.matchLotto(lottoAll);
        instruction.totalResult(matchCountNumber);
        instruction.benefit(service.profitRate(matchCountNumber, purchaseMoney));

    }

}
