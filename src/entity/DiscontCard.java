package entity;



public class DiscontCard {

    private User user;
    private double accumulation;


    public DiscontCard() {
    }


    public void setUser(User user) {
        this.user = user;
    }

    public void setAccumulation(double accumulation) {
        this.accumulation = accumulation;
    }

    public User getUser() {
        return user;
    }

    public double getAccumulation() {
        return accumulation;
    }
}
