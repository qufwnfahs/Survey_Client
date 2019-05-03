/*    */ package Main;
/*    */ 
/*    */ import Login.Login;
/*    */ import Model.BorderPanel;
/*    */ import Worker.ImageController;
/*    */ import java.awt.CardLayout;
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import java.awt.Container;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.GridBagConstraints;
/*    */ import java.awt.GridBagLayout;
/*    */ import java.io.IOException;
/*    */ import java.sql.SQLException;
/*    */ import javax.swing.BorderFactory;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.JRootPane;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Main
/*    */   extends JFrame
/*    */ {
/* 27 */   private GridBagLayout gbl = new GridBagLayout();
/* 28 */   private GridBagConstraints gbc = new GridBagConstraints();
/*    */   
/* 30 */   private static CardLayout card = new CardLayout();
/*    */   
/*    */ 
/* 33 */   private static JPanel panel_card = new JPanel();
/* 34 */   private BorderPanel borderPanel = new BorderPanel(this, 1);
/*    */   
/*    */   public Main()
/*    */     throws IOException, SQLException
/*    */   {
/* 39 */     setPreferredSize(new Dimension(1500, 835));
/* 40 */     setMinimumSize(new Dimension(1500, 835));
/* 41 */     setDefaultCloseOperation(3);
/* 42 */     setLocationRelativeTo(null);
/* 43 */     setUndecorated(true);
/* 44 */     setIconImage(ImageController.resizeImage(new ImageIcon(getClass().getResource("/Image/poker-chip.png")), 48, 48));
/* 45 */     setTitle("설문조사");
/*    */     
/* 47 */     getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
/* 48 */     getContentPane().setBackground(Color.WHITE);
/* 49 */     setLayout(this.gbl);
/*    */     
/*    */ 
/* 52 */     panel_card.setLayout(card);
/*    */     
/*    */ 
/* 55 */     panel_card.add("Login", new Login());
/*    */     
/* 57 */     this.gbc.anchor = 11;
/* 58 */     this.gbc.fill = 2;
/*    */     
/* 60 */     this.gbc.gridx = 0;
/* 61 */     this.gbc.gridy = 0;
/* 62 */     this.gbc.weightx = 1.0D;
/* 63 */     this.gbc.weighty = 0.001D;
/* 64 */     add(this.borderPanel, this.gbc);
/*    */     
/* 66 */     this.gbc.fill = 1;
/*    */     
/* 68 */     this.gbc.gridy = 1;
/* 69 */     this.gbc.weighty = 0.999D;
/* 70 */     add(panel_card, this.gbc);
/*    */   }
/*    */   
/*    */   public static void addCard(String name, Component c)
/*    */   {
/* 75 */     panel_card.add(name, c);
/*    */   }
/*    */   
/*    */   public static void changeCard(String name)
/*    */   {
/* 80 */     card.show(panel_card, name);
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Main\Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */