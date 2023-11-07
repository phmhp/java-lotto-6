package service;
import camp.nextstep.edu.missionutils.Console;

public class GetInput {

    public String inputPurchaseMoney(){
        String getMoney;
        int amount;
        getMoney=Console.readLine();
        return getMoney;
    }

    public String inputWinningNumber(){
        String getWinningNumber;
        getWinningNumber = Console.readLine();
        return getWinningNumber;
    }

public String inputBonusNumber(){
        String getBonusNumber;
        getBonusNumber = Console.readLine();
        return getBonusNumber;
}
}
