/*     */ package Model;
/*     */ 
/*     */ import Worker.Client;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.io.IOException;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ButtonPanel
/*     */   extends JPanel
/*     */ {
/*     */   private JLabel close;
/*     */   private JLabel maximize;
/*     */   private JLabel minimization;
/*  26 */   private boolean isMaximized = false;
/*     */   
/*     */   private final JFrame frame;
/*     */   
/*     */   private int isMain;
/*     */   
/*     */   public ButtonPanel(final JFrame frame, final int isMain)
/*     */   {
/*  34 */     this.frame = frame;
/*  35 */     this.isMain = isMain;
/*     */     
/*  37 */     this.close = new JLabel(" X ");
/*  38 */     this.close.setFont(new Font("Sanserif", 0, 25));
/*  39 */     this.close.setOpaque(true);
/*  40 */     this.close.setBackground(new Color(32, 34, 37));
/*  41 */     this.close.setForeground(new Color(165, 166, 167));
/*  42 */     this.close.setCursor(new Cursor(12));
/*     */     
/*  44 */     this.maximize = new JLabel(" □ ");
/*  45 */     this.maximize.setFont(new Font("Sanserif", 0, 25));
/*  46 */     this.maximize.setOpaque(true);
/*  47 */     this.maximize.setBackground(new Color(32, 34, 37));
/*  48 */     this.maximize.setForeground(new Color(165, 166, 167));
/*  49 */     this.maximize.setCursor(new Cursor(12));
/*     */     
/*  51 */     this.minimization = new JLabel(" ㅡ ");
/*  52 */     this.minimization.setFont(new Font("Sanserif", 0, 25));
/*  53 */     this.minimization.setOpaque(true);
/*  54 */     this.minimization.setBackground(new Color(32, 34, 37));
/*  55 */     this.minimization.setForeground(new Color(165, 166, 167));
/*  56 */     this.minimization.setCursor(new Cursor(12));
/*     */     
/*  58 */     setLayout(new FlowLayout(2));
/*  59 */     setBackground(new Color(32, 34, 37));
/*     */     
/*  61 */     add(this.minimization);
/*  62 */     add(this.maximize);
/*  63 */     add(this.close);
/*     */     
/*  65 */     this.minimization.addMouseListener(new MouseAdapter() {
/*     */       public void mouseEntered(MouseEvent e) {
/*  67 */         ButtonPanel.this.minimization.setBackground(new Color(43, 44, 47));
/*  68 */         ButtonPanel.this.minimization.setForeground(Color.white);
/*     */       }
/*     */       
/*     */       public void mouseExited(MouseEvent e) {
/*  72 */         ButtonPanel.this.minimization.setBackground(new Color(32, 34, 37));
/*  73 */         ButtonPanel.this.minimization.setForeground(new Color(165, 166, 167));
/*     */       }
/*     */       
/*     */       public void mouseReleased(MouseEvent e) {
/*  77 */         frame.setState(1);
/*     */       }
/*     */       
/*  80 */     });
/*  81 */     this.maximize.addMouseListener(new MouseAdapter() {
/*     */       public void mouseEntered(MouseEvent e) {
/*  83 */         ButtonPanel.this.maximize.setBackground(new Color(43, 44, 47));
/*  84 */         ButtonPanel.this.maximize.setForeground(Color.white);
/*     */       }
/*     */       
/*     */       public void mouseExited(MouseEvent e) {
/*  88 */         ButtonPanel.this.maximize.setBackground(new Color(32, 34, 37));
/*  89 */         ButtonPanel.this.maximize.setForeground(new Color(165, 166, 167));
/*     */       }
/*     */       
/*     */       public void mouseReleased(MouseEvent e) {
/*  93 */         GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */     });
/* 111 */     this.close.addMouseListener(new MouseAdapter() {
/*     */       public void mouseEntered(MouseEvent e) {
/* 113 */         ButtonPanel.this.close.setBackground(new Color(240, 71, 71));
/* 114 */         ButtonPanel.this.close.setForeground(Color.white);
/*     */       }
/*     */       
/*     */       public void mouseExited(MouseEvent e) {
/* 118 */         ButtonPanel.this.close.setBackground(new Color(32, 34, 37));
/* 119 */         ButtonPanel.this.close.setForeground(new Color(165, 166, 167));
/*     */       }
/*     */       
/*     */       public void mouseReleased(MouseEvent e)
/*     */       {
/* 124 */         if (isMain == 1)
/*     */         {
/*     */           try
/*     */           {
/* 128 */             Client.closing();
/*     */           }
/*     */           catch (IOException e1)
/*     */           {
/* 132 */             e1.printStackTrace();
/*     */           }
/*     */           
/* 135 */           System.exit(0);
/*     */         }
/*     */         else
/*     */         {
/* 139 */           frame.dispose();
/*     */         }
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Model\ButtonPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */