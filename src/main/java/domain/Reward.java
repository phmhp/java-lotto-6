package domain;

public enum Reward {
    THREE_MATCH(5000),
    FOUR_MATCH(50000),
    FIVE_MATCH(1500000),
    FIVE_BONUS_MATCH(30000000),
    SIX_MATCH(2000000000);

    private final int rewardMoney;

    Reward(int rewardMoney) {
        this.rewardMoney=rewardMoney;
    }
    public int getRewardMoney() {
        return rewardMoney;
    }
}
