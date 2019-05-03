/*     */ package Survey;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Image_Ci;
/*     */ import Worker.ImageController;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.CardLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseListener;
/*     */ import java.io.IOException;
/*     */ import java.sql.SQLException;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Survey
/*     */   extends JPanel
/*     */   implements MouseListener
/*     */ {
/*  32 */   private GridBagLayout gbl = new GridBagLayout();
/*  33 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*  35 */   private static CardLayout card = new CardLayout();
/*     */   
/*     */ 
/*  38 */   private static JPanel panel_card = new JPanel();
/*  39 */   private JPanel panel_button = new JPanel();
/*     */   
/*  41 */   private JLabel bt_survey = new JLabel();
/*     */   
/*     */   public Survey() throws SQLException, IOException
/*     */   {
/*  45 */     setBackground(Color.WHITE);
/*  46 */     setLayout(new BorderLayout());
/*     */     
/*     */ 
/*  49 */     this.panel_button.setLayout(this.gbl);
/*  50 */     this.panel_button.setPreferredSize(new Dimension(220, 800));
/*  51 */     this.panel_button.setBackground(new Color(39, 86, 155));
/*     */     
/*  53 */     panel_card.setLayout(card);
/*  54 */     panel_card.setPreferredSize(new Dimension(1279, 800));
/*     */     
/*  56 */     add(this.panel_button, "West");
/*  57 */     add(panel_card, "East");
/*     */     
/*  59 */     panel_card.add("Survey_Phase", new Survey_Phase());
/*     */     
/*     */ 
/*     */ 
/*  63 */     this.bt_survey.setText("설문조사");
/*  64 */     this.bt_survey.setIconTextGap(12);
/*  65 */     this.bt_survey.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/*  66 */     this.bt_survey.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_SURVEY_IMAGE.getImageIcon(), 28, 28)));
/*  67 */     this.bt_survey.setOpaque(true);
/*  68 */     this.bt_survey.setBackground(new Color(39, 86, 155));
/*  69 */     this.bt_survey.setForeground(Color.WHITE);
/*  70 */     this.bt_survey.setHorizontalTextPosition(4);
/*  71 */     this.bt_survey.setHorizontalAlignment(2);
/*  72 */     this.bt_survey.setCursor(new Cursor(12));
/*  73 */     this.bt_survey.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 0));
/*  74 */     this.bt_survey.addMouseListener(this);
/*  75 */     this.bt_survey.setPreferredSize(new Dimension(110, 55));
/*     */     
/*  77 */     this.gbc.anchor = 11;
/*  78 */     this.gbc.fill = 2;
/*     */     
/*  80 */     this.gbc.gridx = 0;
/*  81 */     this.gbc.gridy = 0;
/*  82 */     this.gbc.gridwidth = 1;
/*  83 */     this.gbc.weightx = 1.0D;
/*  84 */     this.gbc.weighty = 1.0D;
/*  85 */     this.panel_button.add(this.bt_survey, this.gbc);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mouseClicked(MouseEvent e) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void mouseEntered(MouseEvent e)
/*     */   {
/*  97 */     JLabel lbl = (JLabel)e.getSource();
/*  98 */     lbl.setBackground(new Color(60, 109, 182));
/*     */   }
/*     */   
/*     */ 
/*     */   public void mouseExited(MouseEvent e)
/*     */   {
/* 104 */     JLabel lbl = (JLabel)e.getSource();
/* 105 */     lbl.setBackground(new Color(39, 86, 155));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mousePressed(MouseEvent e) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void mouseReleased(MouseEvent arg0)
/*     */   {
/* 117 */     card.show(panel_card, "Survey_Phase");
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Survey\Survey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */