/*     */ package Worker;
/*     */ 
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.net.Socket;
/*     */ import java.net.UnknownHostException;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JOptionPane;
/*     */ 
/*     */ public class Client
/*     */   extends Thread
/*     */ {
/*  15 */   final int port = 9999;
/*     */   
/*     */   private static Socket socket;
/*     */   
/*     */   private static DataInputStream in;
/*     */   private static DataOutputStream out;
/*     */   private static JFrame main;
/*     */   
/*     */   public Client(JFrame main)
/*     */   {
/*  25 */     main = main;
/*     */     
/*     */     try
/*     */     {
/*  29 */       socket = new Socket("localhost", 9999);
/*     */       
/*     */ 
/*     */ 
/*  33 */       in = new DataInputStream(socket.getInputStream());
/*     */       
/*     */ 
/*     */ 
/*  37 */       out = new DataOutputStream(socket.getOutputStream());
/*     */       
/*  39 */       new Util_Person_Cl(null).start();
/*     */     }
/*     */     catch (UnknownHostException e)
/*     */     {
/*  43 */       e.printStackTrace();
/*  44 */       JOptionPane.showMessageDialog(main, "서버가 오프라인입니다. 프로그램을 종료합니다.");
/*  45 */       System.exit(1);
/*     */     }
/*     */     catch (IOException e)
/*     */     {
/*  49 */       e.printStackTrace();
/*  50 */       JOptionPane.showMessageDialog(main, "서버가 오프라인입니다. 프로그램을 종료합니다.");
/*  51 */       System.exit(1);
/*     */     }
/*     */   }
/*     */   
/*     */   private class Util_Person_Cl extends Thread
/*     */   {
/*     */     private Util_Person_Cl() {}
/*     */     
/*     */     public void run() {
/*     */       try {
/*  61 */         while (Client.socket.isConnected()) {}
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  66 */         System.out.println("Disconnected");
/*     */       }
/*     */       catch (Throwable e)
/*     */       {
/*  70 */         System.exit(1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static String send(String ToSend)
/*     */   {
/*  77 */     String line = null;
/*     */     try
/*     */     {
/*  80 */       out.writeUTF(ToSend);
/*  81 */       line = in.readUTF();
/*     */     }
/*     */     catch (IOException e)
/*     */     {
/*  85 */       e.printStackTrace();
/*  86 */       JOptionPane.showMessageDialog(main, "서버와의 연결이 끊겼습니다. 프로그램을 종료합니다.");
/*  87 */       System.exit(1);
/*     */     }
/*     */     
/*  90 */     return line;
/*     */   }
/*     */   
/*     */   public static void closing() throws IOException
/*     */   {
/*  95 */     if (MyAccount.getID() != null)
/*     */     {
/*  97 */       send("P006|" + MyAccount.getID());
/*     */     }
/*     */     
/* 100 */     in.close();
/* 101 */     out.close();
/* 102 */     socket.close();
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Worker\Client.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */