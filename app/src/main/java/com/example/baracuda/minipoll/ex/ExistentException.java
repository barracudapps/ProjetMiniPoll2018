package com.example.baracuda.minipoll.ex;

/*Created by simo 180504
*/
public class ExistentException extends Exception {
  public ExistentException() { super("ExistentException: The object you try to create alredy exist in the DB.\n"); }
  public ExistentException(String message) { super("ExistentException: The object you try to create alredy exist in the DB.\n"+message+"\n"); }
  public ExistentException(String message, Throwable cause) { super("ExistentException: The object you try to create alredy exist in the DB.\n"+message+"\n", cause); }
  public ExistentException(Throwable cause) { super(cause); }
}
