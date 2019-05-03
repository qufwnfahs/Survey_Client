/*    */ package Model;
/*    */ 
/*    */ import Enum.Enum_Font_Ci;
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import java.awt.FlowLayout;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.plaf.basic.BasicComboBoxEditor;
/*    */ 
/*    */ 
/*    */ public class JDUComboBoxEditor
/*    */   extends BasicComboBoxEditor
/*    */ {
/* 15 */   private JLabel label = new JLabel();
/* 16 */   private JPanel panel = new JPanel();
/*    */   private Object selectedItem;
/*    */   
/*    */   public JDUComboBoxEditor()
/*    */   {
/* 21 */     this.label.setOpaque(false);
/* 22 */     this.label.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 23 */     this.label.setForeground(Color.BLACK);
/*    */     
/* 25 */     this.panel.setLayout(new FlowLayout(0, 5, 2));
/* 26 */     this.panel.add(this.label);
/* 27 */     this.panel.setBackground(Color.GREEN);
/*    */   }
/*    */   
/*    */   public Component getEditorComponent()
/*    */   {
/* 32 */     return this.panel;
/*    */   }
/*    */   
/*    */   public Object getItem() {
/* 36 */     return "[" + this.selectedItem.toString() + "]";
/*    */   }
/*    */   
/*    */   public void setItem(Object item) {
/* 40 */     this.selectedItem = item;
/* 41 */     this.label.setText(item.toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Model\JDUComboBoxEditor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */