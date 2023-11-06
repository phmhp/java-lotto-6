package controller;

import service.Service;
import service.GetInput;
import view.Instruction;
public class Controller {

    public Controller(){

    }

    public void game(){
        Instruction instruction=new Instruction();
        Service service = new Service();
        GetInput getInput = new GetInput();

        instruction.purchaseMoney(); //구매금액을 입력해 주세요.
        instruction.purchaseAmount(service.purchaseMoney(getInput.inputPurchaseMoney())); //input 구매금액


    }
}
