/*    */ package Model;
/*    */ 
/*    */ import Enum.Enum_Font_Ci;
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import javax.swing.BorderFactory;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JList;
/*    */ import javax.swing.ListCellRenderer;
/*    */ 
/*    */ public class JDUComboBoxRenderer
/*    */   extends JLabel
/*    */   implements ListCellRenderer
/*    */ {
/*    */   public JDUComboBoxRenderer()
/*    */   {
/* 17 */     setOpaque(true);
/* 18 */     setForeground(Color.YELLOW);
/*    */   }
/*    */   
/*    */ 
/*    */   public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
/*    */   {
/* 24 */     setText(value.toString());
/* 25 */     setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/* 26 */     setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
/* 27 */     setBackground(Color.WHITE);
/*    */     
/* 29 */     if (isSelected)
/*    */     {
/* 31 */       list.setSelectionBackground(Color.WHITE);
/*    */     }
/* 33 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Model\JDUComboBoxRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */