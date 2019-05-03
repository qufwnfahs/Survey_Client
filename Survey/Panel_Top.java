/*     */ package Survey;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Panel_Top
/*     */   extends JPanel
/*     */ {
/* 111 */   private GridBagLayout gbl = new GridBagLayout();
/* 112 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/* 114 */   private static JPanel panel = new JPanel();
/*     */   
/* 116 */   private static JLabel ll_name = new JLabel();
/*     */   
/*     */   public Panel_Top()
/*     */   {
/* 120 */     setPreferredSize(new Dimension(1079, 150));
/* 121 */     setLayout(new BorderLayout());
/* 122 */     add(panel, "Center");
/*     */     
/* 124 */     panel.setLayout(this.gbl);
/*     */     
/* 126 */     ll_name.setOpaque(true);
/* 127 */     ll_name.setForeground(Color.WHITE);
/* 128 */     ll_name.setFont(Enum_Font_Ci.나눔바른고딕24.getFont());
/* 129 */     ll_name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
/*     */     
/* 131 */     this.gbc.anchor = 17;
/* 132 */     this.gbc.fill = 0;
/*     */     
/* 134 */     this.gbc.gridx = 0;
/* 135 */     this.gbc.gridy = 0;
/* 136 */     this.gbc.weightx = 1.0D;
/* 137 */     this.gbc.insets = new Insets(-35, 35, 0, 0);
/* 138 */     panel.add(ll_name, this.gbc);
/*     */   }
/*     */   
/*     */   public static void setLabel(String name)
/*     */   {
/* 143 */     ll_name.setText(name);
/*     */   }
/*     */   
/*     */   public static void setColor(Color color)
/*     */   {
/* 148 */     panel.setBackground(color);
/* 149 */     ll_name.setBackground(color);
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Survey\Panel_Top.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */