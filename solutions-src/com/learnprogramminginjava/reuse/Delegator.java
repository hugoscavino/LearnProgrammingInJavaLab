package com.learnprogramminginjava.reuse;

public class Delegator {
    private final DelegateFree delegateFree;
    private final DelegatePaidSubscription paidSubscription;

    private final boolean isSubscriber;

    public Delegator(boolean isSubscriber) {
            this.delegateFree = new DelegateFree();
            this.paidSubscription = new DelegatePaidSubscription();
            this.isSubscriber = isSubscriber;
    }

    public void something(){
        if (isSubscriber){
            delegateFree.somethingSimple();
        } else {
            paidSubscription.somethingComplex();
        }

    }

    public static void main(String[] args) {
        Delegator nonSubscriber = new Delegator(false);
        nonSubscriber.something();

        Delegator subscriber = new Delegator(true);
        subscriber.something();
    }
}
