/*     */ package Survey;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Image_Ci;
/*     */ import Enum.Enum_Protocol_Ci;
/*     */ import Model.Module_Client_Question;
/*     */ import Model.Module_Client_Section;
/*     */ import Model.Module_Client_Survey;
/*     */ import Model.Module_Question;
/*     */ import Model.Module_Section;
/*     */ import Model.Module_Survey;
/*     */ import Worker.Client;
/*     */ import Worker.ImageController;
/*     */ import Worker.MyAccount;
/*     */ import com.google.gson.Gson;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.IOException;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollBar;
/*     */ import javax.swing.JScrollPane;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Panel_Content
/*     */   extends JPanel
/*     */   implements ActionListener
/*     */ {
/* 156 */   private static GridBagLayout gbl = new GridBagLayout();
/* 157 */   private static GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/* 159 */   private static JPanel panel = new JPanel();
/* 160 */   private JScrollPane scroll_content = new JScrollPane(panel);
/*     */   
/* 162 */   private static JButton bt_prev = new JButton();
/* 163 */   private static JButton bt_next = new JButton();
/*     */   
/* 165 */   private static LinkedList list = new LinkedList();
/*     */   
/* 167 */   private static Module_Client_Survey M_C_S = new Module_Client_Survey();
/*     */   
/*     */   private static String IDF_CD;
/*     */   
/*     */   public Panel_Content()
/*     */   {
/* 173 */     this.scroll_content.setVerticalScrollBarPolicy(22);
/* 174 */     this.scroll_content.setHorizontalScrollBarPolicy(31);
/* 175 */     this.scroll_content.getVerticalScrollBar().setUnitIncrement(16);
/* 176 */     this.scroll_content.getVerticalScrollBar().setBackground(new Color(241, 241, 241));
/*     */     
/* 178 */     bt_prev.setText("이전");
/* 179 */     bt_prev.setOpaque(true);
/* 180 */     bt_prev.setForeground(Color.WHITE);
/* 181 */     bt_prev.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 182 */     bt_prev.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_PREV_IMAGE_WHITE.getImageIcon(), 28, 28)));
/* 183 */     bt_prev.setHorizontalAlignment(2);
/* 184 */     bt_prev.setCursor(new Cursor(12));
/* 185 */     bt_prev.setPreferredSize(new Dimension(110, 50));
/* 186 */     bt_prev.addActionListener(this);
/*     */     
/* 188 */     bt_next.setText("완료");
/* 189 */     bt_next.setOpaque(true);
/* 190 */     bt_next.setForeground(Color.WHITE);
/* 191 */     bt_next.setFont(Enum_Font_Ci.나눔바른고딕20.getFont());
/* 192 */     bt_next.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_NEXT_IMAGE_WHITE.getImageIcon(), 28, 28)));
/* 193 */     bt_next.setHorizontalTextPosition(2);
/* 194 */     bt_next.setHorizontalAlignment(4);
/* 195 */     bt_next.setCursor(new Cursor(12));
/* 196 */     bt_next.setPreferredSize(new Dimension(110, 50));
/* 197 */     bt_next.addActionListener(this);
/*     */     
/* 199 */     setPreferredSize(new Dimension(1060, 0));
/* 200 */     setLayout(new BorderLayout());
/* 201 */     add(this.scroll_content, "Center");
/*     */     
/* 203 */     panel.setBackground(Color.WHITE);
/* 204 */     panel.setLayout(gbl);
/*     */   }
/*     */   
/*     */   public static void createSurvey(Module_Survey md_survey)
/*     */   {
/* 209 */     panel.removeAll();
/* 210 */     list.clear();
/*     */     
/* 212 */     IDF_CD = md_survey.getCode();
/*     */     
/*     */ 
/* 215 */     gbc.gridx = 0;
/* 216 */     gbc.gridy = -1;
/* 217 */     gbc.fill = 0;
/* 218 */     gbc.anchor = 11;
/*     */     
/* 220 */     for (int i = 0; i < md_survey.getSection().size(); i++)
/*     */     {
/* 222 */       Panel_Section pl_section = new Panel_Section();
/* 223 */       pl_section.setLabel("섹션    " + (i + 1) + "      ", 
/* 224 */         ((Module_Section)md_survey.getSection().get(i)).getName(), 
/* 225 */         new Color(Integer.valueOf(md_survey.getMainColor()).intValue(), true));
/*     */       
/* 227 */       gbc.gridy += 1;
/* 228 */       gbc.ipadx = 50;
/* 229 */       gbc.ipady = 50;
/* 230 */       gbc.gridwidth = 2;
/* 231 */       gbc.insets = new Insets(50, 0, 0, 0);
/*     */       
/* 233 */       panel.add(pl_section, gbc);
/* 234 */       list.add(pl_section);
/*     */       
/* 236 */       for (int j = 0; j < ((Module_Section)md_survey.getSection().get(i)).getQuestion().size(); j++)
/*     */       {
/* 238 */         Panel_Question pl_question = new Panel_Question(((Module_Question)((Module_Section)md_survey.getSection().get(i)).getQuestion().get(j)).getType());
/* 239 */         pl_question.setLabel(((Module_Question)((Module_Section)md_survey.getSection().get(i)).getQuestion().get(j)).getType(), "질문  " + (j + 1) + "  :  " + ((Module_Question)((Module_Section)md_survey.getSection().get(i)).getQuestion().get(j)).getName(), ((Module_Question)((Module_Section)md_survey.getSection().get(i)).getQuestion().get(j)).getOption());
/*     */         
/* 241 */         gbc.gridy += 1;
/* 242 */         gbc.ipadx = 50;
/* 243 */         gbc.ipady = 50;
/* 244 */         gbc.gridwidth = 2;
/* 245 */         gbc.insets = new Insets(0, 0, 0, 0);
/*     */         
/* 247 */         panel.add(pl_question, gbc);
/* 248 */         list.add(pl_question);
/*     */       }
/*     */     }
/*     */     
/* 252 */     gbc.anchor = 13;
/*     */     
/* 254 */     gbc.gridy += 1;
/* 255 */     gbc.ipadx = 0;
/* 256 */     gbc.ipady = 0;
/* 257 */     gbc.gridwidth = 1;
/* 258 */     gbc.weightx = 0.5D;
/* 259 */     gbc.insets = new Insets(50, 0, 50, 30);
/* 260 */     panel.add(bt_prev, gbc);
/*     */     
/* 262 */     gbc.anchor = 17;
/*     */     
/* 264 */     gbc.gridx += 1;
/* 265 */     gbc.insets = new Insets(50, 30, 50, 0);
/* 266 */     panel.add(bt_next, gbc);
/*     */   }
/*     */   
/*     */   public static void save_Client_Survey()
/*     */   {
/* 271 */     M_C_S = new Module_Client_Survey();
/*     */     
/* 273 */     Iterator it = list.iterator();
/*     */     
/* 275 */     int sectionCount = 0;
/* 276 */     int questionCount = 0;
/*     */     
/* 278 */     while (it.hasNext())
/*     */     {
/* 280 */       Object j = it.next();
/*     */       
/* 282 */       if ((j instanceof Panel_Section))
/*     */       {
/* 284 */         sectionCount++;
/* 285 */         M_C_S.getSection().add(new Module_Client_Section());
/*     */       }
/* 287 */       else if ((j instanceof Panel_Question))
/*     */       {
/* 289 */         Panel_Question qpl = (Panel_Question)j;
/*     */         
/* 291 */         Module_Client_Question mcq = new Module_Client_Question();
/* 292 */         mcq.setType(qpl.getType());
/* 293 */         mcq.setAnswer(qpl.getAnswer());
/*     */         
/* 295 */         ((Module_Client_Section)M_C_S.getSection().get(sectionCount - 1)).getQuestion().add(mcq);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setColor(Color color)
/*     */   {
/* 302 */     bt_prev.setBackground(color);
/* 303 */     bt_next.setBackground(color);
/*     */   }
/*     */   
/*     */ 
/*     */   public void actionPerformed(ActionEvent arg0)
/*     */   {
/* 309 */     if (arg0.getSource().equals(bt_prev))
/*     */     {
/* 311 */       Survey_Phase.changeCard("Survey_Phase_1");
/*     */     }
/* 313 */     else if (arg0.getSource().equals(bt_next))
/*     */     {
/* 315 */       save_Client_Survey();
/*     */       
/* 317 */       String ID = (String)MyAccount.getID();
/* 318 */       String gson = new Gson().toJson(M_C_S);
/*     */       
/*     */       try
/*     */       {
/* 322 */         Client.send(Enum_Protocol_Ci.PUSH_T010.getCode() + "|" + IDF_CD + "|" + ID + "|" + gson);
/* 323 */         Survey_Phase_1.updateSurvey();
/*     */       }
/*     */       catch (IOException e)
/*     */       {
/* 327 */         e.printStackTrace();
/*     */       }
/* 329 */       Survey_Phase.changeCard("Survey_Phase_1");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Survey\Panel_Content.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */