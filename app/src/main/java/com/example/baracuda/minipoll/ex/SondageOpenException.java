package com.example.baracuda.minipoll.ex;

/*Created by simo 180504
*/
public class SondageOpenException extends Exception {
  public SondageOpenException() { super("SondageOpenException: Sondage open, modifs impossible.\n"); }
  public SondageOpenException(String message) { super("SondageOpenException: Sondage open, modifs impossible.\n"+message+"\n"); }
  public SondageOpenException(String message, Throwable cause) { super("SondageOpenException: Sondage open, modifs impossible.\n"+message+"\n", cause); }
  public SondageOpenException(Throwable cause) { super(cause); }
}
