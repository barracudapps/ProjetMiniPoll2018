package com.example.baracuda.minipoll.ex;

/*Created by simo 180504
*/
public class NoDemandeAmiException extends Exception {
  public NoDemandeAmiException() { super("NoDemandeAmiException: The ami you try to accept didn't ask you to be Amis.\n"); }
  public NoDemandeAmiException(String message) { super("NoDemandeAmiException: The ami you try to accept didn't ask you to be Amis.\n"+message+"\n"); }
  public NoDemandeAmiException(String message, Throwable cause) { super("NoDemandeAmiException: The ami you try to accept didn't ask you to be Amis.\n"+message+"\n", cause); }
  public NoDemandeAmiException(Throwable cause) { super(cause); }
}
