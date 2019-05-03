/*     */ package Login;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Protocol_Ci;
/*     */ import Main.Main;
/*     */ import Survey.Survey;
/*     */ import Worker.Client;
/*     */ import Worker.MyAccount;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.FocusEvent;
/*     */ import java.awt.event.FocusListener;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.io.IOException;
/*     */ import java.sql.SQLException;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ButtonModel;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.event.ChangeEvent;
/*     */ import javax.swing.event.ChangeListener;
/*     */ 
/*     */ 
/*     */ public class Card_Login
/*     */   extends JPanel
/*     */   implements FocusListener, ActionListener, ChangeListener, KeyListener
/*     */ {
/*  39 */   private GridBagLayout gbl = new GridBagLayout();
/*  40 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*  43 */   private JLabel ll_title = new JLabel();
/*  44 */   private JLabel ll_titleSub = new JLabel();
/*     */   
/*  46 */   private JLabel ll_id = new JLabel();
/*  47 */   private JTextField tf_id = new JTextField();
/*     */   
/*  49 */   private JLabel ll_pw = new JLabel();
/*  50 */   private JPasswordField tf_pw = new JPasswordField();
/*     */   
/*  52 */   private JButton bt_login = new JButton();
/*     */   
/*  54 */   private JLabel ll_forgotYourID = new JLabel();
/*  55 */   private JButton bt_forgotYourID = new JButton();
/*     */   
/*     */   public Card_Login()
/*     */   {
/*  59 */     setLayout(this.gbl);
/*  60 */     setBackground(new Color(54, 57, 63));
/*     */     
/*     */ 
/*  63 */     this.ll_title.setText("정다운마을 설문조사!");
/*  64 */     this.ll_title.setForeground(Color.WHITE);
/*  65 */     this.ll_title.setFont(Enum_Font_Ci.나눔바른고딕26.getFont());
/*     */     
/*  67 */     this.ll_titleSub.setText("May your day be full of good luck!");
/*  68 */     this.ll_titleSub.setForeground(new Color(103, 107, 114));
/*  69 */     this.ll_titleSub.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/*     */     
/*  71 */     this.ll_id.setText("아이디");
/*  72 */     this.ll_id.setForeground(new Color(165, 167, 170));
/*  73 */     this.ll_id.setFont(Enum_Font_Ci.나눔바른고딕15.getFont());
/*  74 */     this.ll_id.setPreferredSize(new Dimension(380, 15));
/*     */     
/*  76 */     this.tf_id.setBackground(new Color(48, 51, 56));
/*  77 */     this.tf_id.setForeground(Color.WHITE);
/*  78 */     this.tf_id.setFont(Enum_Font_Ci.나눔바른고딕16.getFont());
/*  79 */     this.tf_id.addFocusListener(this);
/*  80 */     this.tf_id.setBorder(BorderFactory.createCompoundBorder(null, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
/*  81 */     this.tf_id.setCaretColor(Color.WHITE);
/*  82 */     this.tf_id.setPreferredSize(new Dimension(380, 42));
/*  83 */     this.tf_id.addKeyListener(this);
/*     */     
/*  85 */     this.ll_pw.setText("비밀번호");
/*  86 */     this.ll_pw.setForeground(new Color(165, 167, 170));
/*  87 */     this.ll_pw.setFont(Enum_Font_Ci.나눔바른고딕15.getFont());
/*  88 */     this.ll_pw.setPreferredSize(new Dimension(380, 15));
/*     */     
/*  90 */     this.tf_pw.setBackground(new Color(48, 51, 56));
/*  91 */     this.tf_pw.setForeground(Color.WHITE);
/*  92 */     this.tf_pw.setFont(Enum_Font_Ci.나눔바른고딕16.getFont());
/*  93 */     this.tf_pw.addFocusListener(this);
/*  94 */     this.tf_pw.setBorder(BorderFactory.createCompoundBorder(null, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
/*  95 */     this.tf_pw.setCaretColor(Color.WHITE);
/*  96 */     this.tf_pw.setPreferredSize(new Dimension(380, 42));
/*  97 */     this.tf_pw.setEchoChar('*');
/*  98 */     this.tf_pw.addKeyListener(this);
/*     */     
/* 100 */     this.bt_login.setText("로그인");
/* 101 */     this.bt_login.setForeground(Color.WHITE);
/* 102 */     this.bt_login.setBackground(new Color(114, 137, 218));
/* 103 */     this.bt_login.setBorder(null);
/* 104 */     this.bt_login.setCursor(new Cursor(12));
/* 105 */     this.bt_login.getModel().addChangeListener(this);
/* 106 */     this.bt_login.addActionListener(this);
/* 107 */     this.bt_login.setPreferredSize(new Dimension(380, 46));
/* 108 */     this.bt_login.setFont(Enum_Font_Ci.나눔바른고딕16.getFont());
/*     */     
/* 110 */     this.ll_forgotYourID.setText("계정을 모르시나요?");
/* 111 */     this.ll_forgotYourID.setForeground(new Color(103, 107, 114));
/* 112 */     this.ll_forgotYourID.setFont(Enum_Font_Ci.나눔바른고딕16.getFont());
/*     */     
/* 114 */     this.bt_forgotYourID.setText("계정 찾기");
/* 115 */     this.bt_forgotYourID.setForeground(new Color(114, 137, 218));
/* 116 */     this.bt_forgotYourID.setOpaque(false);
/* 117 */     this.bt_forgotYourID.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(54, 57, 63)));
/* 118 */     this.bt_forgotYourID.getModel().addChangeListener(this);
/* 119 */     this.bt_forgotYourID.addActionListener(this);
/* 120 */     this.bt_forgotYourID.setContentAreaFilled(false);
/* 121 */     this.bt_forgotYourID.setFocusPainted(false);
/* 122 */     this.bt_forgotYourID.setCursor(new Cursor(12));
/* 123 */     this.bt_forgotYourID.setFont(Enum_Font_Ci.나눔바른고딕16.getFont());
/*     */     
/* 125 */     this.gbc.anchor = 11;
/* 126 */     this.gbc.fill = 0;
/*     */     
/* 128 */     this.gbc.gridx = 0;
/* 129 */     this.gbc.gridy = 0;
/* 130 */     this.gbc.gridwidth = 2;
/* 131 */     add(this.ll_title, this.gbc);
/*     */     
/* 133 */     this.gbc.gridy = 1;
/* 134 */     this.gbc.insets = new Insets(20, 0, 0, 0);
/* 135 */     add(this.ll_titleSub, this.gbc);
/*     */     
/* 137 */     this.gbc.gridy = 2;
/* 138 */     this.gbc.insets = new Insets(20, 0, 0, 0);
/* 139 */     add(this.ll_id, this.gbc);
/*     */     
/* 141 */     this.gbc.gridy = 3;
/* 142 */     this.gbc.insets = new Insets(10, 0, 0, 0);
/* 143 */     add(this.tf_id, this.gbc);
/*     */     
/* 145 */     this.gbc.gridy = 4;
/* 146 */     this.gbc.insets = new Insets(20, 0, 0, 0);
/* 147 */     add(this.ll_pw, this.gbc);
/*     */     
/* 149 */     this.gbc.gridy = 5;
/* 150 */     this.gbc.insets = new Insets(10, 0, 0, 0);
/* 151 */     add(this.tf_pw, this.gbc);
/*     */     
/* 153 */     this.gbc.gridy = 6;
/* 154 */     this.gbc.insets = new Insets(25, 0, 0, 0);
/* 155 */     add(this.bt_login, this.gbc);
/*     */     
/* 157 */     this.gbc.gridy = 7;
/* 158 */     this.gbc.gridwidth = 1;
/* 159 */     this.gbc.insets = new Insets(20, 0, 0, 0);
/* 160 */     add(this.ll_forgotYourID, this.gbc);
/*     */     
/* 162 */     this.gbc.gridx = 1;
/* 163 */     this.gbc.insets = new Insets(20, 65386, 0, 0);
/* 164 */     add(this.bt_forgotYourID, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void focusGained(FocusEvent e)
/*     */   {
/* 171 */     JTextField tf = (JTextField)e.getSource();
/*     */     
/* 173 */     tf.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(114, 137, 218)), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
/*     */   }
/*     */   
/*     */ 
/*     */   public void focusLost(FocusEvent e)
/*     */   {
/* 179 */     JTextField tf = (JTextField)e.getSource();
/* 180 */     tf.setBorder(BorderFactory.createCompoundBorder(null, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 186 */     if (e.getSource().equals(this.bt_login))
/*     */     {
/* 188 */       if (this.tf_id.getText().isEmpty())
/*     */       {
/* 190 */         this.tf_id.requestFocus();
/*     */       }
/* 192 */       else if (this.tf_pw.getText().isEmpty())
/*     */       {
/* 194 */         this.tf_pw.requestFocus();
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 199 */         String id = this.tf_id.getText();
/* 200 */         String pw = this.tf_pw.getText();
/*     */         
/*     */         try
/*     */         {
/* 204 */           String response = Client.send(Enum_Protocol_Ci.LOGIN.getCode() + "|" + id + "|" + pw);
/*     */           
/* 206 */           String[] command = response.split("\\|");
/*     */           
/* 208 */           if (command[0].equals(Enum_Protocol_Ci.LOGIN_FAIL.getCode()))
/*     */           {
/* 210 */             JOptionPane optionPane = new JOptionPane();
/* 211 */             JOptionPane.showMessageDialog(null, "일치하는 아이디가 없습니다.");
/*     */           }
/* 213 */           else if (command[0].equals(Enum_Protocol_Ci.LOGIN_PASSWORDISNOTMATCH.getCode()))
/*     */           {
/* 215 */             JOptionPane optionPane = new JOptionPane();
/* 216 */             JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
/*     */           }
/* 218 */           else if (command[0].equals(Enum_Protocol_Ci.LOGIN_CONFIRM.getCode()))
/*     */           {
/* 220 */             JOptionPane optionPane = new JOptionPane();
/* 221 */             JOptionPane.showMessageDialog(null, command[3] + " 님 환영합니다.");
/*     */             
/* 223 */             new MyAccount(command[1], command[2], command[3], command[4], command[5]);
/*     */             
/* 225 */             Main.addCard("Survey", new Survey());
/* 226 */             Main.changeCard("Survey");
/*     */           }
/*     */         }
/*     */         catch (IOException e1)
/*     */         {
/* 231 */           e1.printStackTrace();
/*     */         }
/*     */         catch (SQLException e1) {
/* 234 */           e1.printStackTrace();
/*     */         }
/*     */       }
/*     */     }
/* 238 */     else if (e.getSource().equals(this.bt_forgotYourID))
/*     */     {
/* 240 */       Login.changeCard("Card_Check");
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void stateChanged(ChangeEvent e)
/*     */   {
/* 247 */     ButtonModel model = (ButtonModel)e.getSource();
/*     */     
/* 249 */     if (model.isRollover())
/*     */     {
/* 251 */       if (model.equals(this.bt_login.getModel()))
/*     */       {
/* 253 */         this.bt_login.setBackground(new Color(103, 123, 196));
/*     */       }
/*     */       else
/*     */       {
/* 257 */         this.bt_forgotYourID.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(114, 137, 218)));
/*     */       }
/*     */       
/*     */ 
/*     */     }
/* 262 */     else if (model.equals(this.bt_login.getModel()))
/*     */     {
/* 264 */       this.bt_login.setBackground(new Color(114, 137, 218));
/*     */     }
/*     */     else
/*     */     {
/* 268 */       this.bt_forgotYourID.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(54, 57, 63)));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void keyPressed(KeyEvent e)
/*     */   {
/* 276 */     if (e.getKeyChar() == '\n')
/*     */     {
/* 278 */       this.bt_login.doClick();
/*     */     }
/*     */   }
/*     */   
/*     */   public void keyReleased(KeyEvent arg0) {}
/*     */   
/*     */   public void keyTyped(KeyEvent arg0) {}
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Login\Card_Login.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */