package domain;

import java.util.ArrayList;
import java.util.List;

public class WinningLotto {
    List<Integer> winningLottoNumber = new ArrayList<>();

    int bonusNumber;
    public void WinningLotto(){

    }


    //public List<Lotto> getWinningLotto(){ return winningLotto;    }

    public int getBonusNumber(){
        return bonusNumber;
    }



    public void addWinningLottoElement(String element){
        winningLottoNumber.add(Integer.parseInt(element));
    }
    public List<Integer> getWinningLotto(){
        return winningLottoNumber;
    }
}
