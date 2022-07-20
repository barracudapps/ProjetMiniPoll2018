package com.example.baracuda.minipoll.ex;

/*Created by simo 180504
*/
public class NotConnectedException extends Exception {
  public NotConnectedException() { super("NotConnectedException: Utilisateur/Admin not connected, access denied.\n"); }
  public NotConnectedException(String message) { super("NotConnectedException: Utilisateur/Admin not connected, access denied.\n"+message+"\n"); }
  public NotConnectedException(String message, Throwable cause) { super("NotConnectedException: Utilisateur/Admin not connected, access denied.\n"+message+"\n", cause); }
  public NotConnectedException(Throwable cause) { super(cause); }
}
