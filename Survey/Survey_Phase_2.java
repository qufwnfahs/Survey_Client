/*     */ package Survey;
/*     */ 
/*     */ import Model.Module_Survey;
/*     */ import com.google.gson.Gson;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.io.IOException;
/*     */ import java.util.Map;
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
/*     */ public class Survey_Phase_2
/*     */   extends JPanel
/*     */ {
/*  53 */   private static JPanel panel = new JPanel();
/*     */   
/*  55 */   private GridBagLayout gbl = new GridBagLayout();
/*  56 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/*     */ 
/*  59 */   private Panel_Top pl_top = new Panel_Top();
/*  60 */   private Panel_Content pl_content = new Panel_Content();
/*     */   
/*     */   public Survey_Phase_2()
/*     */   {
/*  64 */     setLayout(new BorderLayout());
/*  65 */     add(panel, "Center");
/*     */     
/*  67 */     panel.setLayout(this.gbl);
/*     */     
/*  69 */     this.gbc.anchor = 11;
/*  70 */     this.gbc.fill = 2;
/*     */     
/*  72 */     this.gbc.gridx = 0;
/*  73 */     this.gbc.gridy = 0;
/*  74 */     this.gbc.gridwidth = 3;
/*  75 */     this.gbc.gridheight = 1;
/*  76 */     this.gbc.weightx = 1.0D;
/*  77 */     this.gbc.insets = new Insets(0, 0, 0, 0);
/*  78 */     panel.add(this.pl_top, this.gbc);
/*     */     
/*  80 */     this.gbc.fill = 3;
/*     */     
/*  82 */     this.gbc.gridx = 1;
/*  83 */     this.gbc.gridy = 1;
/*  84 */     this.gbc.gridwidth = 1;
/*  85 */     this.gbc.weightx = 0.04D;
/*  86 */     this.gbc.weighty = 1.0D;
/*  87 */     panel.add(this.pl_content, this.gbc);
/*     */   }
/*     */   
/*     */   public static void update(Map<String, String> data) throws IOException
/*     */   {
/*  92 */     String SURVEY_NM = (String)data.get("SURVEY_NM");
/*  93 */     int COLOR_CD = Integer.valueOf((String)data.get("COLOR_CD")).intValue();
/*     */     
/*     */ 
/*  96 */     Module_Survey md_survey = (Module_Survey)new Gson().fromJson((String)data.get("QUE_JSON"), Module_Survey.class);
/*     */     
/*  98 */     panel.setBackground(new Color(Integer.valueOf(md_survey.getSubColor()).intValue(), true));
/*     */     
/* 100 */     Panel_Top.setLabel(SURVEY_NM);
/* 101 */     Panel_Top.setColor(new Color(COLOR_CD, true));
/*     */     
/* 103 */     Panel_Content.createSurvey(md_survey);
/* 104 */     Panel_Content.setColor(new Color(COLOR_CD, true));
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Survey\Survey_Phase_2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */