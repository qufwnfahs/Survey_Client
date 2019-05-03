/*    */ package Worker;
/*    */ 
/*    */ public class MyAccount
/*    */ {
/*    */   private static String id;
/*    */   private static String pw;
/*    */   private static String name;
/*    */   private static String phone;
/*    */   private static String group;
/*    */   
/*    */   public MyAccount(String id, String pw, String name, String phone, String group)
/*    */   {
/* 13 */     id = id;
/* 14 */     pw = pw;
/* 15 */     name = name;
/* 16 */     phone = phone;
/* 17 */     group = group;
/*    */   }
/*    */   
/*    */   public static Object getID()
/*    */   {
/* 22 */     return id;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Worker\MyAccount.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */