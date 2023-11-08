package service;

public class Validate {

    public void Validate() {
    }

    public String purchaseMoneyValidate(String purchaseMoneyInput) {
        String success="success";
        try {
            //boolean validatePass = false;
System.out.println("try-here");
            int purchaseMoney = Integer.parseInt(purchaseMoneyInput);

            //□ 아무 값도 입력하지않았을 때
            if (purchaseMoneyInput.isEmpty()) {
                throw new IllegalArgumentException("[ERROR] 구입금액을 입력해주세요.");
            }
            //□ 구입 금액이 숫자가 아닐 때
            if (!purchaseMoneyInput.matches("\\d+")) {
                throw new IllegalArgumentException("[ERROR] 구입 금액은 숫자를 입력해주세요.");
            }
            //□ 구입 금액 입력 시 1000원으로 나누어 떨어지지 않을 때
            if (purchaseMoney % 1000 != 0) {
                throw new IllegalArgumentException("[ERROR] 구입금액이 1000원단위여야합니다.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] 구입 금액을 다시 입력해주세요.");

            return e.getMessage();
        }
        System.out.println("here4");

        return success;
    }
}