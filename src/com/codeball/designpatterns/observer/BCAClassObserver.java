package com.codeball.designpatterns.observer;
public class BCAClassObserver extends Observer{

   public BCAClassObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "MCA class progress updated to: " + subject.getProgress()); 
   }
}