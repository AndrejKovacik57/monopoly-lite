package sk.stuba.fei.uim.oop;


public  class ChanceCards {
    protected boolean used;
    protected int reward;
    protected int cost;
    protected int probability;

    public boolean getUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }


}

