package com.example.baracuda.minipoll.ex;

/*Created by simo 180504
*/
public class CriticalException extends Exception {
  public CriticalException() { super("CriticalException: A critical exception happend, the value returned or set is probably wrong.\nPlease delete object you just set or don't take count of the value you just get\n"); }
  public CriticalException(String message) { super("CriticalException: A critical exception happend, the value returned or set or setted is probably wrong.\nPlease delete object you just set or don't take count of the value you just get\n"+message+"\n"); }
  public CriticalException(String message, Throwable cause) { super("CriticalException: A critical exception happend, the value returned or set is probably wrong.\nPlease delete object you just set or don't take count of the value you just get\n"+message+"\n", cause); }
  public CriticalException(Throwable cause) { super(cause); }
}
