package com.example.baracuda.minipoll.ex;

/*Created by simo 180504
*/
public class NonexistentException extends Exception {
  public NonexistentException() { super("NonexistentException: The object you try to call do not exist in the DB.\n"); }
  public NonexistentException(String message) { super("NonexistentException: The object you try to call do not exist in the DB.\n"+message+"\n"); }
  public NonexistentException(String message, Throwable cause) { super("NonexistentException: The object you try to call do not exist in the DB.\n"+message+"\n", cause); }
  public NonexistentException(Throwable cause) { super(cause); }
}
