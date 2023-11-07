package domain;

import java.util.ArrayList;
import java.util.List;

public class AllLotto {
    private List<Lotto> lottos =new ArrayList<>() ;
    //private Lotto lotto;

    public void AllLotto(List<Lotto> lottos){
        this.lottos=lottos;
        //this.lotto = lotto;
    }

    public List<Lotto> getLottos(){
        return lottos;
    }

    public void addLotto(List<Integer> numbers){
        Lotto lotto = new Lotto(numbers);
        lottos.add(lotto);
    }
}
