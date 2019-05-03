/*    */ package Survey;
/*    */ 
/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.CardLayout;
/*    */ import java.awt.Color;
/*    */ import java.io.IOException;
/*    */ import java.sql.SQLException;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ public class Survey_Phase
/*    */   extends JPanel
/*    */ {
/* 14 */   private static CardLayout card = new CardLayout();
/*    */   
/* 16 */   private static JPanel panel_card = new JPanel();
/*    */   
/*    */   public Survey_Phase() throws SQLException, IOException
/*    */   {
/* 20 */     setBackground(Color.WHITE);
/* 21 */     setLayout(new BorderLayout());
/*    */     
/* 23 */     panel_card.setLayout(card);
/*    */     
/* 25 */     panel_card.add("Survey_Phase_1", new Survey_Phase_1());
/* 26 */     panel_card.add("Survey_Phase_2", new Survey_Phase_2());
/*    */     
/* 28 */     add(panel_card);
/*    */   }
/*    */   
/*    */   public static void changeCard(String name)
/*    */   {
/* 33 */     card.show(panel_card, name);
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Survey\Survey_Phase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */