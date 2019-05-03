/*     */ package Login;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Protocol_Ci;
/*     */ import Worker.Client;
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
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ButtonModel;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.event.ChangeEvent;
/*     */ import javax.swing.event.ChangeListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Card_Check
/*     */   extends JPanel
/*     */   implements FocusListener, ChangeListener, ActionListener, KeyListener
/*     */ {
/*  35 */   private GridBagLayout gbl = new GridBagLayout();
/*  36 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*  38 */   private JLabel ll_title = new JLabel();
/*     */   
/*  40 */   private JLabel ll_name = new JLabel();
/*  41 */   private JTextField tf_name = new JTextField();
/*     */   
/*  43 */   private JLabel ll_phone = new JLabel();
/*  44 */   private JTextField tf_phone = new JTextField();
/*     */   
/*  46 */   private JButton bt_check = new JButton();
/*     */   
/*  48 */   private JButton bt_back = new JButton();
/*     */   
/*     */   public Card_Check()
/*     */   {
/*  52 */     setLayout(this.gbl);
/*  53 */     setBackground(new Color(54, 57, 63));
/*     */     
/*     */ 
/*  56 */     this.ll_title.setText("내 계정 찾기");
/*  57 */     this.ll_title.setForeground(Color.WHITE);
/*  58 */     this.ll_title.setFont(Enum_Font_Ci.나눔바른고딕26.getFont());
/*     */     
/*  60 */     this.ll_name.setText("이름");
/*  61 */     this.ll_name.setForeground(new Color(165, 167, 170));
/*  62 */     this.ll_name.setFont(Enum_Font_Ci.나눔바른고딕15.getFont());
/*  63 */     this.ll_name.setPreferredSize(new Dimension(380, 15));
/*     */     
/*  65 */     this.tf_name.setBackground(new Color(48, 51, 56));
/*  66 */     this.tf_name.setForeground(Color.WHITE);
/*  67 */     this.tf_name.setFont(Enum_Font_Ci.나눔바른고딕16.getFont());
/*  68 */     this.tf_name.addFocusListener(this);
/*  69 */     this.tf_name.setBorder(BorderFactory.createCompoundBorder(null, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
/*  70 */     this.tf_name.setCaretColor(Color.WHITE);
/*  71 */     this.tf_name.setPreferredSize(new Dimension(380, 42));
/*  72 */     this.tf_name.addKeyListener(this);
/*     */     
/*  74 */     this.ll_phone.setText("전화번호 (- 없이)");
/*  75 */     this.ll_phone.setForeground(new Color(165, 167, 170));
/*  76 */     this.ll_phone.setFont(Enum_Font_Ci.나눔바른고딕15.getFont());
/*  77 */     this.ll_phone.setPreferredSize(new Dimension(380, 15));
/*     */     
/*  79 */     this.tf_phone.setBackground(new Color(48, 51, 56));
/*  80 */     this.tf_phone.setForeground(Color.WHITE);
/*  81 */     this.tf_phone.setFont(Enum_Font_Ci.나눔바른고딕16.getFont());
/*  82 */     this.tf_phone.addFocusListener(this);
/*  83 */     this.tf_phone.setBorder(BorderFactory.createCompoundBorder(null, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
/*  84 */     this.tf_phone.setCaretColor(Color.WHITE);
/*  85 */     this.tf_phone.setPreferredSize(new Dimension(380, 42));
/*  86 */     this.tf_phone.addKeyListener(this);
/*     */     
/*  88 */     this.bt_check.setText("조회하기");
/*  89 */     this.bt_check.setForeground(Color.WHITE);
/*  90 */     this.bt_check.setBackground(new Color(114, 137, 218));
/*  91 */     this.bt_check.setBorder(null);
/*  92 */     this.bt_check.setCursor(new Cursor(12));
/*  93 */     this.bt_check.getModel().addChangeListener(this);
/*  94 */     this.bt_check.addActionListener(this);
/*  95 */     this.bt_check.setPreferredSize(new Dimension(380, 46));
/*  96 */     this.bt_check.setFont(Enum_Font_Ci.나눔바른고딕16.getFont());
/*     */     
/*  98 */     this.bt_back.setText("돌아가기");
/*  99 */     this.bt_back.setForeground(new Color(114, 137, 218));
/* 100 */     this.bt_back.setOpaque(false);
/* 101 */     this.bt_back.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(54, 57, 63)));
/* 102 */     this.bt_back.getModel().addChangeListener(this);
/* 103 */     this.bt_back.addActionListener(this);
/* 104 */     this.bt_back.setContentAreaFilled(false);
/* 105 */     this.bt_back.setFocusPainted(false);
/* 106 */     this.bt_back.setCursor(new Cursor(12));
/* 107 */     this.bt_back.setFont(Enum_Font_Ci.나눔바른고딕16.getFont());
/*     */     
/* 109 */     this.gbc.anchor = 11;
/* 110 */     this.gbc.fill = 0;
/*     */     
/* 112 */     this.gbc.gridx = 0;
/* 113 */     this.gbc.gridy = 0;
/* 114 */     this.gbc.gridwidth = 2;
/* 115 */     add(this.ll_title, this.gbc);
/*     */     
/* 117 */     this.gbc.gridy = 1;
/* 118 */     this.gbc.insets = new Insets(63, 0, 0, 0);
/* 119 */     add(this.ll_name, this.gbc);
/*     */     
/* 121 */     this.gbc.gridy = 2;
/* 122 */     this.gbc.insets = new Insets(10, 0, 0, 0);
/* 123 */     add(this.tf_name, this.gbc);
/*     */     
/* 125 */     this.gbc.gridy = 3;
/* 126 */     this.gbc.insets = new Insets(20, 0, 0, 0);
/* 127 */     add(this.ll_phone, this.gbc);
/*     */     
/* 129 */     this.gbc.gridy = 4;
/* 130 */     this.gbc.insets = new Insets(10, 0, 0, 0);
/* 131 */     add(this.tf_phone, this.gbc);
/*     */     
/* 133 */     this.gbc.gridy = 5;
/* 134 */     this.gbc.insets = new Insets(25, 0, 0, 0);
/* 135 */     add(this.bt_check, this.gbc);
/*     */     
/* 137 */     this.gbc.gridy = 6;
/* 138 */     this.gbc.insets = new Insets(20, 65216, 0, 0);
/* 139 */     add(this.bt_back, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void focusGained(FocusEvent e)
/*     */   {
/* 146 */     JTextField tf = (JTextField)e.getSource();
/*     */     
/* 148 */     tf.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(114, 137, 218)), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
/*     */   }
/*     */   
/*     */ 
/*     */   public void focusLost(FocusEvent e)
/*     */   {
/* 154 */     JTextField tf = (JTextField)e.getSource();
/* 155 */     tf.setBorder(BorderFactory.createCompoundBorder(null, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent e)
/*     */   {
/* 161 */     if (e.getSource().equals(this.bt_check))
/*     */     {
/* 163 */       if (this.tf_name.getText().isEmpty())
/*     */       {
/* 165 */         this.tf_name.requestFocus();
/*     */       }
/* 167 */       else if (this.tf_phone.getText().isEmpty())
/*     */       {
/* 169 */         this.tf_phone.requestFocus();
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 174 */         String name = this.tf_name.getText();
/* 175 */         String phone = this.tf_phone.getText();
/*     */         
/* 177 */         String response = Client.send(Enum_Protocol_Ci.CHECK.getCode() + "|" + name + "|" + phone);
/*     */         
/* 179 */         String[] command = response.split("\\|");
/*     */         
/* 181 */         if (command[0].equals(Enum_Protocol_Ci.CHECK_FAIL.getCode()))
/*     */         {
/* 183 */           JOptionPane optionPane = new JOptionPane();
/* 184 */           JOptionPane.showMessageDialog(null, "일치하는 계정이 없습니다.");
/*     */         }
/* 186 */         else if (command[0].equals(Enum_Protocol_Ci.CHECK_PHONENUMBERISNOTMATCH.getCode()))
/*     */         {
/* 188 */           JOptionPane optionPane = new JOptionPane();
/* 189 */           JOptionPane.showMessageDialog(null, "전화번호가 다릅니다.");
/*     */         }
/* 191 */         else if (command[0].equals(Enum_Protocol_Ci.CHECK_CONFIRM.getCode()))
/*     */         {
/* 193 */           JOptionPane optionPane = new JOptionPane();
/* 194 */           JOptionPane.showMessageDialog(null, "아이디 | " + command[1] + ", 비밀번호 | " + command[2]);
/*     */         }
/*     */       }
/*     */     }
/* 198 */     else if (e.getSource().equals(this.bt_back))
/*     */     {
/* 200 */       Login.changeCard("Card_Login");
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void stateChanged(ChangeEvent e)
/*     */   {
/* 207 */     ButtonModel model = (ButtonModel)e.getSource();
/*     */     
/* 209 */     if (model.isRollover())
/*     */     {
/* 211 */       if (model.equals(this.bt_check.getModel()))
/*     */       {
/* 213 */         this.bt_check.setBackground(new Color(103, 123, 196));
/*     */       }
/*     */       else
/*     */       {
/* 217 */         this.bt_back.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(114, 137, 218)));
/*     */       }
/*     */       
/*     */ 
/*     */     }
/* 222 */     else if (model.equals(this.bt_check.getModel()))
/*     */     {
/* 224 */       this.bt_check.setBackground(new Color(114, 137, 218));
/*     */     }
/*     */     else
/*     */     {
/* 228 */       this.bt_back.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(54, 57, 63)));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void keyPressed(KeyEvent e)
/*     */   {
/* 236 */     if (e.getKeyChar() == '\n')
/*     */     {
/* 238 */       this.bt_check.doClick();
/*     */     }
/*     */   }
/*     */   
/*     */   public void keyReleased(KeyEvent arg0) {}
/*     */   
/*     */   public void keyTyped(KeyEvent arg0) {}
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Login\Card_Check.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */