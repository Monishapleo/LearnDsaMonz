package com.learn.dsa.inheritence;

public class PremiumUser extends User {
    String subscriptionData;

    public PremiumUser(int id, String name, int age, String subscriptionData) {
        super(id, name, age);
        this.subscriptionData = subscriptionData;
    }

    public void getData(){
        getUserData();
        System.out.println("Subscription added : "+subscriptionData);
    }
    public static void main(String[] args) {
        PremiumUser premiumUser = new PremiumUser(128,"Monz",26,"Spotify and netflix");
        premiumUser.getData();
    }
}
