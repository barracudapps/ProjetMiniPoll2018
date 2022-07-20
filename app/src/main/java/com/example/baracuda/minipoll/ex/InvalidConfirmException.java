package com.example.baracuda.minipoll.ex;

/*Created by simo 180504
*/
public class InvalidConfirmException extends Exception {
  public InvalidConfirmException() { super("InvalidConfirmException: Invalid mdp confirmation.\n"); }
  public InvalidConfirmException(String message) { super("InvalidConfirmException: Invalid mdp confirmation.\n"+message+"\n"); }
  public InvalidConfirmException(String message, Throwable cause) { super("InvalidConfirmException: Invalid mdp confirmation.\n"+message+"\n", cause); }
  public InvalidConfirmException(Throwable cause) { super(cause); }
}
