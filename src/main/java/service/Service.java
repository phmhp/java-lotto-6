package service;

public class Service {

    public int purchaseMoney(String purchaseMoney){
        //parsing

        //예외처리(if ~%2==0 )

        //숫자 변환 후 도메인 로직으로 넘기기
        return divideThousand(totalPurchaseMoney);

    }
    public int divideThousand(int totalPurchaseMoney){
        int amount;
        amount = totalPurchaseMoney/1000;
        return amount;
    }


}
