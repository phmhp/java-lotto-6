package service;
import camp.nextstep.edu.missionutils.Console;

public class GetInput {
    private Validate validate = new Validate();

    public String inputPurchaseMoney(){
        String getMoney="";
        getMoney=Console.readLine();
        System.out.println("GetInput-here");

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
