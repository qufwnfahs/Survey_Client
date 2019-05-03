/*    */ package Model;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Module_Survey
/*    */ {
/*    */   private String name;
/*    */   private String idf_cd;
/*    */   private String start_dt;
/*    */   private String end_dt;
/*    */   private String mainColor;
/*    */   private String subColor;
/* 14 */   private List<Module_Section> lt_sec = new ArrayList();
/*    */   
/* 16 */   public String getName() { return this.name; }
/* 17 */   public String getCode() { return this.idf_cd; }
/* 18 */   public String getStart() { return this.start_dt; }
/* 19 */   public String getEnd() { return this.end_dt; }
/* 20 */   public String getMainColor() { return this.mainColor; }
/* 21 */   public String getSubColor() { return this.subColor; }
/* 22 */   public List<Module_Section> getSection() { return this.lt_sec; }
/*    */   
/* 24 */   public void setName(String name) { this.name = name; }
/* 25 */   public void setCode(String idf_cd) { this.idf_cd = idf_cd; }
/* 26 */   public void setStart(String start_dt) { this.start_dt = start_dt; }
/* 27 */   public void setEnd(String end_dt) { this.end_dt = end_dt; }
/* 28 */   public void setMainColor(String mainColor) { this.mainColor = mainColor; }
/* 29 */   public void setSubColor(String subColor) { this.subColor = subColor; }
/* 30 */   public void setSection(List<Module_Section> lt_sec) { this.lt_sec = lt_sec; }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Model\Module_Survey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */