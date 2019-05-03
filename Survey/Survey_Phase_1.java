/*     */ package Survey;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Image_Ci;
/*     */ import Enum.Enum_Protocol_Ci;
/*     */ import Model.JDUComboBoxRenderer;
/*     */ import Model.Module_Group;
/*     */ import Model.User;
/*     */ import Worker.Client;
/*     */ import Worker.ImageController;
/*     */ import Worker.MyAccount;
/*     */ import com.google.gson.Gson;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.ItemEvent;
/*     */ import java.awt.event.ItemListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.io.IOException;
/*     */ import java.sql.SQLException;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.DefaultListCellRenderer;
/*     */ import javax.swing.DefaultListModel;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.ListModel;
/*     */ import javax.swing.event.ListSelectionEvent;
/*     */ import javax.swing.event.ListSelectionListener;
/*     */ import javax.swing.table.DefaultTableCellRenderer;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import javax.swing.table.JTableHeader;
/*     */ import javax.swing.table.TableColumn;
/*     */ import javax.swing.table.TableColumnModel;
/*     */ import javax.swing.table.TableModel;
/*     */ 
/*     */ public class Survey_Phase_1 extends JPanel implements ActionListener, java.awt.event.MouseListener, ListSelectionListener, ItemListener
/*     */ {
/*  56 */   private GridBagLayout gbl = new GridBagLayout();
/*  57 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*  59 */   private JButton prev_bt = new JButton();
/*  60 */   private JButton next_bt = new JButton();
/*  61 */   private JButton reset_bt = new JButton();
/*     */   
/*  63 */   private JComboBox<String> cb = new JComboBox();
/*     */   
/*  65 */   private static JTable tb_survey = new JTable();
/*     */   
/*  67 */   private static String[] columnNames = { "번호", "설문 이름", "시작 일자", "종료 일자", "", "", "" };
/*     */   
/*  69 */   private static List<DefaultTableModel> list_all = new ArrayList();
/*  70 */   private static List<DefaultTableModel> list_surveyed = new ArrayList();
/*  71 */   private static List<DefaultTableModel> list_notSurveyed = new ArrayList();
/*     */   
/*  73 */   private static List<DefaultListModel> list_lt_all = new ArrayList();
/*  74 */   private static List<DefaultListModel> list_lt_surveyed = new ArrayList();
/*  75 */   private static List<DefaultListModel> list_lt_notSurveyed = new ArrayList();
/*     */   
/*  77 */   private static DefaultTableCellRenderer tCellRenderer = new DefaultTableCellRenderer();
/*  78 */   private static DefaultListCellRenderer lCellRenderer = new DefaultListCellRenderer();
/*     */   
/*  80 */   private static JList jlist = new JList();
/*     */   static final int modelSize = 10;
/*     */   
/*     */   public Survey_Phase_1()
/*     */     throws SQLException, IOException
/*     */   {
/*  86 */     setBackground(Color.WHITE);
/*  87 */     setLayout(this.gbl);
/*     */     
/*  89 */     this.cb.addItem("모든 항목");
/*  90 */     this.cb.addItem("내가 완료한 항목");
/*  91 */     this.cb.addItem("내가 완료하지 않은 항목");
/*  92 */     this.cb.addItemListener(this);
/*  93 */     this.cb.setRenderer(new JDUComboBoxRenderer());
/*  94 */     this.cb.setFont(Enum_Font_Ci.나눔바른고딕18.getFont());
/*  95 */     this.cb.setBackground(Color.WHITE);
/*  96 */     this.cb.setOpaque(true);
/*  97 */     this.cb.setPreferredSize(new Dimension(230, 50));
/*     */     
/*  99 */     this.prev_bt.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_PREV_IMAGE.getImageIcon(), 28, 28)));
/* 100 */     this.prev_bt.setOpaque(false);
/* 101 */     this.prev_bt.setBackground(Color.WHITE);
/* 102 */     this.prev_bt.setBorder(null);
/* 103 */     this.prev_bt.setCursor(new Cursor(12));
/* 104 */     this.prev_bt.addActionListener(this);
/*     */     
/* 106 */     this.next_bt.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_NEXT_IMAGE.getImageIcon(), 28, 28)));
/* 107 */     this.next_bt.setOpaque(true);
/* 108 */     this.next_bt.setBackground(Color.WHITE);
/* 109 */     this.next_bt.setBorder(null);
/* 110 */     this.next_bt.setCursor(new Cursor(12));
/* 111 */     this.next_bt.addActionListener(this);
/*     */     
/* 113 */     this.reset_bt.setText("초기화");
/* 114 */     this.reset_bt.setOpaque(true);
/* 115 */     this.reset_bt.setBackground(new Color(39, 86, 155));
/* 116 */     this.reset_bt.setForeground(Color.WHITE);
/* 117 */     this.reset_bt.setFont(new Font("나눔바른고딕", 1, 20));
/* 118 */     this.reset_bt.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RENEW_IMAGE_WHITE.getImageIcon(), 28, 28)));
/* 119 */     this.reset_bt.setCursor(new Cursor(12));
/* 120 */     this.reset_bt.addActionListener(this);
/* 121 */     this.reset_bt.setPreferredSize(new Dimension(140, 50));
/*     */     
/* 123 */     tb_survey = new JTable();
/* 124 */     tb_survey.setDefaultEditor(Object.class, null);
/* 125 */     tb_survey.setRowHeight(37);
/* 126 */     tb_survey.setFont(new Font("나눔바른고딕", 0, 16));
/* 127 */     tb_survey.setAutoResizeMode(4);
/* 128 */     tb_survey.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(122, 138, 153)));
/* 129 */     tb_survey.addMouseListener(this);
/* 130 */     tb_survey.setPreferredSize(new Dimension(980, 370));
/*     */     
/* 132 */     tb_survey.getTableHeader().setPreferredSize(new Dimension(980, 42));
/* 133 */     tb_survey.getTableHeader().setFont(new Font("나눔바른고딕", 0, 18));
/* 134 */     tb_survey.getTableHeader().setReorderingAllowed(false);
/* 135 */     tb_survey.getTableHeader().setResizingAllowed(false);
/* 136 */     tb_survey.getTableHeader().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(122, 138, 153)));
/*     */     
/* 138 */     tCellRenderer.setHorizontalAlignment(0);
/* 139 */     lCellRenderer.setHorizontalAlignment(0);
/*     */     
/* 141 */     jlist.setVisibleRowCount(1);
/* 142 */     jlist.setLayoutOrientation(2);
/* 143 */     jlist.setSelectionMode(1);
/* 144 */     jlist.setFont(new Font("나눔바른고딕", 0, 21));
/* 145 */     jlist.setFixedCellWidth(30);
/* 146 */     jlist.setSelectionBackground(Color.WHITE);
/* 147 */     jlist.setCursor(new Cursor(12));
/* 148 */     jlist.setCellRenderer(lCellRenderer);
/* 149 */     jlist.setSelectionForeground(Color.BLUE);
/* 150 */     jlist.addListSelectionListener(this);
/*     */     
/* 152 */     JPanel pl = new JPanel();
/* 153 */     pl.setBackground(Color.WHITE);
/* 154 */     pl.add(this.prev_bt, "East");
/* 155 */     pl.add(jlist, "Center");
/* 156 */     pl.add(this.next_bt, "West");
/*     */     
/* 158 */     this.gbc.anchor = 17;
/* 159 */     this.gbc.fill = 0;
/*     */     
/* 161 */     this.gbc.gridx = 0;
/* 162 */     this.gbc.gridy = 0;
/* 163 */     this.gbc.weighty = 1.0D;
/* 164 */     this.gbc.insets = new Insets(30, 0, 0, 0);
/* 165 */     add(this.cb, this.gbc);
/*     */     
/* 167 */     this.gbc.anchor = 13;
/*     */     
/* 169 */     this.gbc.gridx = 2;
/* 170 */     this.gbc.insets = new Insets(30, 0, 0, 0);
/* 171 */     add(this.reset_bt, this.gbc);
/*     */     
/* 173 */     this.gbc.anchor = 10;
/*     */     
/* 175 */     this.gbc.gridx = 0;
/* 176 */     this.gbc.gridy = 1;
/* 177 */     this.gbc.gridwidth = 3;
/* 178 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 179 */     add(tb_survey.getTableHeader(), this.gbc);
/*     */     
/* 181 */     this.gbc.gridy = 2;
/* 182 */     this.gbc.insets = new Insets(-85, 0, 0, 0);
/* 183 */     add(tb_survey, this.gbc);
/*     */     
/* 185 */     this.gbc.fill = 1;
/*     */     
/* 187 */     this.gbc.gridx = 0;
/* 188 */     this.gbc.gridy = 3;
/* 189 */     this.gbc.gridwidth = 3;
/* 190 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/* 191 */     add(pl, this.gbc);
/*     */     
/* 193 */     updateSurvey();
/*     */   }
/*     */   
/*     */   public static void updateSurvey()
/*     */     throws IOException
/*     */   {
/* 199 */     String json = Client.send(Enum_Protocol_Ci.GET_T001.getCode());
/* 200 */     List<Map<String, String>> list = (List)new Gson().fromJson(json, List.class);
/*     */     
/*     */ 
/* 203 */     list_all.clear();
/* 204 */     list_surveyed.clear();
/* 205 */     list_notSurveyed.clear();
/* 206 */     list_lt_all.clear();
/* 207 */     list_lt_surveyed.clear();
/* 208 */     list_lt_notSurveyed.clear();
/*     */     
/*     */ 
/*     */ 
/* 212 */     List<Object[]> model_all = new ArrayList();
/* 213 */     List<Object[]> model_surveyd = new ArrayList();
/* 214 */     List<Object[]> model_unSurveyd = new ArrayList();
/*     */     
/* 216 */     for (int i = 0; i < list.size(); i++)
/*     */     {
/* 218 */       String IDF_CD = (String)((Map)list.get(i)).get("IDF_CD");
/* 219 */       String SURVEY_NM = (String)((Map)list.get(i)).get("SURVEY_NM");
/* 220 */       String START_DT = (String)((Map)list.get(i)).get("START_DT");
/* 221 */       String END_DT = (String)((Map)list.get(i)).get("END_DT");
/* 222 */       List<String> SURVEYD_JSON = (List)new Gson().fromJson((String)((Map)list.get(i)).get("SURVEYD_JSON"), List.class);
/* 223 */       Module_Group GROUP_JSON = (Module_Group)new Gson().fromJson((String)((Map)list.get(i)).get("GROUP_JSON"), Module_Group.class);
/*     */       
/* 225 */       boolean isSURVEYD = SURVEYD_JSON.contains(MyAccount.getID());
/*     */       
/* 227 */       boolean isGROUPED = true;
/*     */       
/* 229 */       if (GROUP_JSON.getUser().isEmpty())
/*     */       {
/* 231 */         isGROUPED = false;
/*     */       }
/*     */       else
/*     */       {
/* 235 */         for (int j = 0; j < GROUP_JSON.getUser().size(); j++)
/*     */         {
/* 237 */           if (((User)GROUP_JSON.getUser().get(j)).getID().equals(MyAccount.getID()))
/*     */           {
/* 239 */             isGROUPED = false;
/* 240 */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 245 */       model_all.add(new Object[] { Integer.valueOf(model_all.size() + 1), SURVEY_NM, START_DT, END_DT, Boolean.valueOf(isSURVEYD), IDF_CD, Boolean.valueOf(isGROUPED) });
/*     */       
/* 247 */       if (isSURVEYD)
/*     */       {
/* 249 */         model_surveyd.add(new Object[] { Integer.valueOf(model_surveyd.size() + 1), SURVEY_NM, START_DT, END_DT, Boolean.valueOf(isSURVEYD), IDF_CD, Boolean.valueOf(isGROUPED) });
/*     */       }
/*     */       else
/*     */       {
/* 253 */         model_unSurveyd.add(new Object[] { Integer.valueOf(model_unSurveyd.size() + 1), SURVEY_NM, START_DT, END_DT, Boolean.valueOf(isSURVEYD), IDF_CD, Boolean.valueOf(isGROUPED) });
/*     */       }
/*     */     }
/*     */     
/* 257 */     DefaultTableModel dtm_all = new DefaultTableModel(columnNames, 0);
/* 258 */     DefaultListModel lt_all = new DefaultListModel();
/*     */     
/* 260 */     int allCount = 1;
/*     */     
/* 262 */     for (int i = 0; i < model_all.size(); i++)
/*     */     {
/* 264 */       if (i % 10 == 0)
/*     */       {
/* 266 */         dtm_all = new DefaultTableModel(columnNames, 0);
/* 267 */         list_all.add(dtm_all);
/*     */         
/* 269 */         if (allCount % 5 == 1)
/*     */         {
/* 271 */           lt_all = new DefaultListModel();
/* 272 */           list_lt_all.add(lt_all);
/*     */         }
/* 274 */         lt_all.addElement(Integer.valueOf(allCount++));
/*     */       }
/*     */       
/* 277 */       dtm_all.addRow(new Object[] { ((Object[])model_all.get(i))[0], ((Object[])model_all.get(i))[1], ((Object[])model_all.get(i))[2], ((Object[])model_all.get(i))[3], ((Object[])model_all.get(i))[4], ((Object[])model_all.get(i))[5], ((Object[])model_all.get(i))[6] });
/*     */     }
/*     */     
/* 280 */     DefaultTableModel dtm_surveyd = new DefaultTableModel(columnNames, 0);
/* 281 */     DefaultListModel lt_surveyd = new DefaultListModel();
/*     */     
/* 283 */     int surveyedCount = 1;
/*     */     
/* 285 */     for (int i = 0; i < model_surveyd.size(); i++)
/*     */     {
/* 287 */       if (i % 10 == 0)
/*     */       {
/* 289 */         dtm_surveyd = new DefaultTableModel(columnNames, 0);
/* 290 */         list_surveyed.add(dtm_surveyd);
/*     */         
/* 292 */         if (surveyedCount % 5 == 1)
/*     */         {
/* 294 */           lt_surveyd = new DefaultListModel();
/* 295 */           list_lt_surveyed.add(lt_surveyd);
/*     */         }
/* 297 */         lt_surveyd.addElement(Integer.valueOf(surveyedCount++));
/*     */       }
/*     */       
/* 300 */       dtm_surveyd.addRow(new Object[] { ((Object[])model_surveyd.get(i))[0], ((Object[])model_surveyd.get(i))[1], ((Object[])model_surveyd.get(i))[2], ((Object[])model_surveyd.get(i))[3], ((Object[])model_surveyd.get(i))[4], ((Object[])model_surveyd.get(i))[5], ((Object[])model_surveyd.get(i))[6] });
/*     */     }
/*     */     
/* 303 */     DefaultTableModel dtm_unsurveyd = new DefaultTableModel(columnNames, 0);
/* 304 */     DefaultListModel lt_unsurveyd = new DefaultListModel();
/*     */     
/* 306 */     int notSurveyedCount = 1;
/*     */     
/* 308 */     for (int i = 0; i < model_unSurveyd.size(); i++)
/*     */     {
/* 310 */       if (i % 10 == 0)
/*     */       {
/* 312 */         dtm_unsurveyd = new DefaultTableModel(columnNames, 0);
/* 313 */         list_notSurveyed.add(dtm_unsurveyd);
/*     */         
/* 315 */         if (notSurveyedCount % 5 == 1)
/*     */         {
/* 317 */           lt_unsurveyd = new DefaultListModel();
/* 318 */           list_lt_notSurveyed.add(lt_unsurveyd);
/*     */         }
/* 320 */         lt_unsurveyd.addElement(Integer.valueOf(notSurveyedCount++));
/*     */       }
/*     */       
/* 323 */       dtm_unsurveyd.addRow(new Object[] { ((Object[])model_unSurveyd.get(i))[0], ((Object[])model_unSurveyd.get(i))[1], ((Object[])model_unSurveyd.get(i))[2], ((Object[])model_unSurveyd.get(i))[3], ((Object[])model_unSurveyd.get(i))[4], ((Object[])model_unSurveyd.get(i))[5], ((Object[])model_unSurveyd.get(i))[6] });
/*     */     }
/*     */     
/* 326 */     tb_survey.setModel((TableModel)list_all.get(0));
/* 327 */     jlist.setModel((ListModel)list_lt_all.get(0));
/*     */     
/* 329 */     columnSort();
/*     */   }
/*     */   
/*     */   public static void columnSort()
/*     */   {
/* 334 */     tb_survey.getColumnModel().getColumn(0).setPreferredWidth(100);
/* 335 */     tb_survey.getColumnModel().getColumn(1).setPreferredWidth(480);
/* 336 */     tb_survey.getColumnModel().getColumn(2).setPreferredWidth(200);
/* 337 */     tb_survey.getColumnModel().getColumn(3).setPreferredWidth(200);
/*     */     
/* 339 */     tb_survey.getColumnModel().getColumn(0).setCellRenderer(tCellRenderer);
/* 340 */     tb_survey.getColumnModel().getColumn(1).setCellRenderer(tCellRenderer);
/* 341 */     tb_survey.getColumnModel().getColumn(2).setCellRenderer(tCellRenderer);
/* 342 */     tb_survey.getColumnModel().getColumn(3).setCellRenderer(tCellRenderer);
/*     */     
/* 344 */     while (tb_survey.getColumnModel().getColumnCount() > 4)
/*     */     {
/* 346 */       tb_survey.removeColumn(tb_survey.getColumnModel().getColumn(4));
/*     */     }
/*     */   }
/*     */   
/*     */   public void actionPerformed(ActionEvent arg0)
/*     */   {
/*     */     String str1;
/* 353 */     if (arg0.getSource().equals(this.prev_bt))
/*     */     {
/* 355 */       if (jlist.getSelectedValue() != null)
/*     */       {
/* 357 */         String idxString = (String)this.cb.getSelectedItem();
/*     */         
/* 359 */         switch ((str1 = idxString).hashCode()) {case -1733898044:  if (str1.equals("모든 항목")) break; break; case -1241631958:  if (str1.equals("내가 완료하지 않은 항목")) {} break; case 338155516:  if (!str1.equals("내가 완료한 항목"))
/*     */           {
/* 361 */             return;int idx = ((Integer)jlist.getSelectedValue()).intValue();
/* 362 */             int idx_lt = idx / 5;
/* 363 */             int idx_si = jlist.getSelectedIndex();
/*     */             
/* 365 */             if (idx == 1)
/*     */             {
/* 367 */               return;
/*     */             }
/* 369 */             if (idx % 5 == 1)
/*     */             {
/* 371 */               jlist.setModel((ListModel)list_lt_all.get(idx_lt - 1));
/* 372 */               jlist.setSelectedIndex(4);
/*     */             }
/*     */             else
/*     */             {
/* 376 */               jlist.setSelectedIndex(idx_si - 1);
/*     */             }
/*     */           } else {
/* 379 */             int idx1 = ((Integer)jlist.getSelectedValue()).intValue();
/* 380 */             int idx_lt1 = idx1 / 5;
/* 381 */             int idx_si1 = jlist.getSelectedIndex();
/*     */             
/* 383 */             if (idx1 == 1)
/*     */             {
/* 385 */               return;
/*     */             }
/* 387 */             if (idx1 % 5 == 1)
/*     */             {
/* 389 */               jlist.setModel((ListModel)list_lt_surveyed.get(idx_lt1 - 1));
/* 390 */               jlist.setSelectedIndex(4);
/*     */             }
/*     */             else
/*     */             {
/* 394 */               jlist.setSelectedIndex(idx_si1 - 1);
/*     */               
/* 396 */               return;
/* 397 */               int idx11 = ((Integer)jlist.getSelectedValue()).intValue();
/* 398 */               int idx_lt11 = idx11 / 5;
/* 399 */               int idx_si11 = jlist.getSelectedIndex();
/*     */               
/* 401 */               if (idx11 == 1)
/*     */               {
/* 403 */                 return;
/*     */               }
/* 405 */               if (idx11 % 5 == 1)
/*     */               {
/* 407 */                 jlist.setModel((ListModel)list_lt_notSurveyed.get(idx_lt11 - 1));
/* 408 */                 jlist.setSelectedIndex(4);
/*     */               }
/*     */               else
/*     */               {
/* 412 */                 jlist.setSelectedIndex(idx_si11 - 1);
/*     */               }
/*     */             }
/*     */           }
/*     */           break; }
/*     */       }
/* 418 */     } else if (arg0.getSource().equals(this.next_bt))
/*     */     {
/* 420 */       if (jlist.getSelectedValue() != null)
/*     */       {
/* 422 */         String idxString = (String)this.cb.getSelectedItem();
/*     */         
/* 424 */         switch ((str1 = idxString).hashCode()) {case -1733898044:  if (str1.equals("모든 항목")) break; break; case -1241631958:  if (str1.equals("내가 완료하지 않은 항목")) {} break; case 338155516:  if (!str1.equals("내가 완료한 항목"))
/*     */           {
/* 426 */             return;int idx = ((Integer)jlist.getSelectedValue()).intValue();
/* 427 */             int idx_lt = idx / 5;
/* 428 */             int idx_si = jlist.getSelectedIndex();
/*     */             
/* 430 */             if ((idx % 5 == 0) && (list_lt_all.size() == idx_lt))
/*     */             {
/* 432 */               return;
/*     */             }
/* 434 */             if (idx % 5 == 0)
/*     */             {
/* 436 */               jlist.setModel((ListModel)list_lt_all.get(idx_lt));
/* 437 */               jlist.setSelectedIndex(0);
/*     */             }
/*     */             else
/*     */             {
/* 441 */               jlist.setSelectedIndex(idx_si + 1);
/*     */             }
/*     */           } else {
/* 444 */             int idx1 = ((Integer)jlist.getSelectedValue()).intValue();
/* 445 */             int idx_lt1 = idx1 / 5;
/* 446 */             int idx_si1 = jlist.getSelectedIndex();
/*     */             
/* 448 */             if ((idx1 % 5 == 0) && (list_lt_surveyed.size() == idx_lt1))
/*     */             {
/* 450 */               return;
/*     */             }
/* 452 */             if (idx1 % 5 == 0)
/*     */             {
/* 454 */               jlist.setModel((ListModel)list_lt_surveyed.get(idx_lt1));
/* 455 */               jlist.setSelectedIndex(0);
/*     */             }
/*     */             else
/*     */             {
/* 459 */               jlist.setSelectedIndex(idx_si1 + 1);
/*     */               
/* 461 */               return;
/* 462 */               int idx11 = ((Integer)jlist.getSelectedValue()).intValue();
/* 463 */               int idx_lt11 = idx11 / 5;
/* 464 */               int idx_si11 = jlist.getSelectedIndex();
/*     */               
/* 466 */               if ((idx11 % 5 == 0) && (list_lt_notSurveyed.size() == idx_lt11))
/*     */               {
/* 468 */                 return;
/*     */               }
/* 470 */               if (idx11 % 5 == 0)
/*     */               {
/* 472 */                 jlist.setModel((ListModel)list_lt_notSurveyed.get(idx_lt11));
/* 473 */                 jlist.setSelectedIndex(0);
/*     */               }
/*     */               else
/*     */               {
/* 477 */                 jlist.setSelectedIndex(idx_si11 + 1);
/*     */               }
/*     */             }
/*     */           }
/*     */           break; }
/*     */       }
/* 483 */     } else if (arg0.getSource().equals(this.reset_bt))
/*     */     {
/*     */       try
/*     */       {
/* 487 */         updateSurvey();
/*     */       }
/*     */       catch (IOException e)
/*     */       {
/* 491 */         e.printStackTrace();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void valueChanged(ListSelectionEvent arg0)
/*     */   {
/* 499 */     if ((!arg0.getValueIsAdjusting()) && (jlist.getSelectedValue() != null))
/*     */     {
/* 501 */       String idxString = (String)this.cb.getSelectedItem();
/*     */       String str1;
/* 503 */       switch ((str1 = idxString).hashCode()) {case -1733898044:  if (str1.equals("모든 항목")) break; break; case -1241631958:  if (str1.equals("내가 완료하지 않은 항목")) {} break; case 338155516:  if (!str1.equals("내가 완료한 항목"))
/*     */         {
/* 505 */           return;int idx = ((Integer)jlist.getSelectedValue()).intValue();
/* 506 */           tb_survey.setModel((TableModel)list_all.get(idx - 1));
/* 507 */           columnSort();
/*     */         } else {
/* 509 */           int idx1 = ((Integer)jlist.getSelectedValue()).intValue();
/* 510 */           tb_survey.setModel((TableModel)list_surveyed.get(idx1 - 1));
/* 511 */           columnSort();
/* 512 */           return;
/* 513 */           int idx11 = ((Integer)jlist.getSelectedValue()).intValue();
/* 514 */           tb_survey.setModel((TableModel)list_notSurveyed.get(idx11 - 1));
/* 515 */           columnSort();
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         break;
/*     */       }
/*     */       
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mouseClicked(MouseEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mouseEntered(MouseEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void mouseExited(MouseEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void mousePressed(MouseEvent arg0) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void mouseReleased(MouseEvent arg0)
/*     */   {
/* 548 */     if (arg0.getClickCount() == 2)
/*     */     {
/* 550 */       int row = tb_survey.rowAtPoint(arg0.getPoint());
/* 551 */       int col = tb_survey.columnAtPoint(arg0.getPoint());
/*     */       
/* 553 */       if ((row >= 0) && (col >= 0))
/*     */       {
/* 555 */         String START_DT = (String)tb_survey.getModel().getValueAt(row, 2);
/* 556 */         String END_DT = (String)tb_survey.getModel().getValueAt(row, 3);
/* 557 */         boolean isSURVEYD = ((Boolean)tb_survey.getModel().getValueAt(row, 4)).booleanValue();
/* 558 */         String IDF_CD = (String)tb_survey.getModel().getValueAt(row, 5);
/* 559 */         boolean isGROUPED = ((Boolean)tb_survey.getModel().getValueAt(row, 6)).booleanValue();
/*     */         
/*     */ 
/* 562 */         String target_START = START_DT + " 00:00:00";
/* 563 */         String target_END = END_DT + " 23:59:59";
/*     */         
/* 565 */         SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.KOREA);
/*     */         
/*     */ 
/* 568 */         Date date_CURRENT = new Date();
/* 569 */         Date date_START = null;
/* 570 */         Date date_END = null;
/*     */         try
/*     */         {
/* 573 */           date_START = format.parse(target_START);
/* 574 */           date_END = format.parse(target_END);
/*     */         }
/*     */         catch (ParseException e)
/*     */         {
/* 578 */           e.printStackTrace();
/*     */         }
/*     */         
/*     */ 
/* 582 */         if ((date_CURRENT.getTime() < date_START.getTime()) || (date_CURRENT.getTime() > date_END.getTime()))
/*     */         {
/* 584 */           JOptionPane.showMessageDialog(null, "시작되기 전 또는 만료된 설문지입니다.");
/*     */         }
/* 586 */         else if (isSURVEYD)
/*     */         {
/* 588 */           JOptionPane.showMessageDialog(null, "이미 완료한 설문지입니다.");
/*     */         }
/* 590 */         else if (isGROUPED)
/*     */         {
/* 592 */           JOptionPane.showMessageDialog(null, "이 설문지의 참여대상이 아닙니다.");
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 597 */           String json = "";
/*     */           try
/*     */           {
/* 600 */             json = Client.send(Enum_Protocol_Ci.GET_T003_BYCODE.getCode() + "|" + IDF_CD);
/* 601 */             Map<String, String> data = (Map)new Gson().fromJson(json, Map.class);
/* 602 */             Survey_Phase_2.update(data);
/*     */           }
/*     */           catch (IOException e)
/*     */           {
/* 606 */             e.printStackTrace();
/*     */           }
/* 608 */           Survey_Phase.changeCard("Survey_Phase_2");
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void itemStateChanged(ItemEvent e)
/*     */   {
/* 618 */     if (e.getStateChange() == 1)
/*     */     {
/* 620 */       String item = e.getItem().toString();
/*     */       String str1;
/* 622 */       switch ((str1 = item).hashCode()) {case -1733898044:  if (str1.equals("모든 항목")) break; break; case -1241631958:  if (str1.equals("내가 완료하지 않은 항목")) {} break; case 338155516:  if (!str1.equals("내가 완료한 항목")) {
/*     */           return;
/* 624 */           if (!list_all.isEmpty()) { tb_survey.setModel((TableModel)list_all.get(0));columnSort();jlist.setModel((ListModel)list_lt_all.get(0));
/* 625 */           } else { tb_survey.setModel(new DefaultTableModel(columnNames, 0));columnSort();jlist.setModel(new DefaultListModel());
/*     */           }
/* 627 */         } else if (!list_surveyed.isEmpty()) { tb_survey.setModel((TableModel)list_surveyed.get(0));columnSort();jlist.setModel((ListModel)list_lt_surveyed.get(0));
/* 628 */         } else { tb_survey.setModel(new DefaultTableModel(columnNames, 0));columnSort();jlist.setModel(new DefaultListModel());
/* 629 */           return;
/* 630 */           if (!list_notSurveyed.isEmpty()) { tb_survey.setVisible(true);tb_survey.setModel((TableModel)list_notSurveyed.get(0));columnSort();jlist.setModel((ListModel)list_lt_notSurveyed.get(0));
/* 631 */           } else { tb_survey.setModel(new DefaultTableModel(columnNames, 0));columnSort();jlist.setModel(new DefaultListModel());
/*     */           }
/*     */         }
/*     */         break;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Survey\Survey_Phase_1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */