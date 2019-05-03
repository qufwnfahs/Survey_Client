/*    */ package Login;
/*    */ 
/*    */ import Enum.Enum_Image_Ci;
/*    */ import java.awt.CardLayout;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.GridBagConstraints;
/*    */ import java.awt.GridBagLayout;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.IOException;
/*    */ import javax.imageio.ImageIO;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Login
/*    */   extends JPanel
/*    */ {
/* 19 */   private GridBagLayout gbl = new GridBagLayout();
/* 20 */   private GridBagConstraints gbc = new GridBagConstraints();
/*    */   
/* 22 */   private static CardLayout card = new CardLayout();
/*    */   
/*    */ 
/* 25 */   private static JPanel panel_card = new JPanel();
/*    */   private BufferedImage img;
/*    */   
/*    */   public Login()
/*    */     throws IOException
/*    */   {
/* 31 */     setLayout(this.gbl);
/*    */     
/* 33 */     this.img = ImageIO.read(getClass().getResource(Enum_Image_Ci.FRAME_LOGIN_BACKGROUND.getFileName()));
/*    */     
/*    */ 
/* 36 */     panel_card.setLayout(card);
/* 37 */     panel_card.setPreferredSize(new Dimension(460, 442));
/*    */     
/*    */ 
/* 40 */     panel_card.add("Card_Login", new Card_Login());
/* 41 */     panel_card.add("Card_Check", new Card_Check());
/*    */     
/* 43 */     this.gbc.anchor = 10;
/* 44 */     this.gbc.fill = 0;
/*    */     
/* 46 */     this.gbc.gridx = 0;
/* 47 */     this.gbc.gridy = 0;
/* 48 */     add(panel_card, this.gbc);
/*    */   }
/*    */   
/*    */ 
/*    */   public void paintComponent(Graphics g)
/*    */   {
/* 54 */     super.paintComponent(g);
/* 55 */     g.drawImage(
/* 56 */       this.img, 0, 0, 1500, 800, null);
/*    */   }
/*    */   
/*    */   public static void changeCard(String name)
/*    */   {
/* 61 */     card.show(panel_card, name);
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Login\Login.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */