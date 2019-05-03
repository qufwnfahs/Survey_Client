/*     */ package Survey;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
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
/*     */ class Panel_Section
/*     */   extends JPanel
/*     */ {
/* 337 */   private GridBagLayout gbl = new GridBagLayout();
/* 338 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/* 341 */   private JLabel ll_no = new JLabel();
/* 342 */   private JLabel tf_name = new JLabel();
/*     */   
/*     */   public Panel_Section()
/*     */   {
/* 346 */     setLayout(this.gbl);
/* 347 */     setMinimumSize(new Dimension(970, 220));
/* 348 */     setPreferredSize(new Dimension(970, 220));
/* 349 */     setMaximumSize(new Dimension(970, 220));
/* 350 */     setBackground(Color.WHITE);
/* 351 */     setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(224, 224, 224)));
/*     */     
/*     */ 
/* 354 */     this.ll_no.setOpaque(true);
/* 355 */     this.ll_no.setForeground(Color.WHITE);
/* 356 */     this.ll_no.setMinimumSize(new Dimension(140, 55));
/* 357 */     this.ll_no.setPreferredSize(new Dimension(140, 55));
/* 358 */     this.ll_no.setFont(Enum_Font_Ci.나눔바른고딕23.getFont());
/* 359 */     this.ll_no.setHorizontalAlignment(4);
/*     */     
/* 361 */     this.tf_name.setFont(Enum_Font_Ci.나눔바른고딕26.getFont());
/* 362 */     this.tf_name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
/*     */     
/*     */ 
/* 365 */     this.gbc.anchor = 17;
/* 366 */     this.gbc.fill = 0;
/*     */     
/* 368 */     this.gbc.gridx = 0;
/* 369 */     this.gbc.gridy = 0;
/* 370 */     this.gbc.gridwidth = 1;
/* 371 */     this.gbc.gridheight = 1;
/* 372 */     this.gbc.weightx = 1.0D;
/* 373 */     this.gbc.weighty = 1.0D;
/* 374 */     this.gbc.insets = new Insets(30, 0, 30, 0);
/* 375 */     add(this.ll_no, this.gbc);
/*     */     
/* 377 */     this.gbc.fill = 1;
/*     */     
/* 379 */     this.gbc.gridx = 0;
/* 380 */     this.gbc.gridy = 1;
/* 381 */     this.gbc.insets = new Insets(20, 20, 80, 20);
/* 382 */     add(this.tf_name, this.gbc);
/*     */   }
/*     */   
/*     */   public void setLabel(String name, String title, Color color)
/*     */   {
/* 387 */     this.ll_no.setText(name);
/* 388 */     this.ll_no.setBackground(color);
/* 389 */     this.tf_name.setText(title);
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Survey\Panel_Section.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */