/*    */ import Main.Main;
/*    */ import Worker.Client;
/*    */ import java.io.IOException;
/*    */ import java.sql.SQLException;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Start
/*    */ {
/*    */   private static Main main;
/* 11 */   private static Client client = new Client(main);
/*    */   
/*    */   public static void main(String[] args) throws IOException, SQLException
/*    */   {
/* 15 */     main = new Main();
/* 16 */     main.setVisible(true);
/* 17 */     client.start();
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Start.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */