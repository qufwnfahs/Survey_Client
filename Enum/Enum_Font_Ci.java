/*    */ package Enum;
/*    */ 
/*    */ import java.awt.Font;
/*    */ 
/*    */ 
/*    */ public enum Enum_Font_Ci
/*    */ {
/*  8 */   나눔바른고딕14("나눔바른고딕", 0, 14), 
/*  9 */   나눔바른고딕15("나눔바른고딕", 0, 15), 
/* 10 */   나눔바른고딕16("나눔바른고딕", 0, 16), 
/* 11 */   나눔바른고딕17("나눔바른고딕", 0, 17), 
/* 12 */   나눔바른고딕18("나눔바른고딕", 0, 18), 
/* 13 */   나눔바른고딕19("나눔바른고딕", 0, 19), 
/* 14 */   나눔바른고딕20("나눔바른고딕", 0, 20), 
/* 15 */   나눔바른고딕21("나눔바른고딕", 0, 21), 
/* 16 */   나눔바른고딕22("나눔바른고딕", 0, 22), 
/* 17 */   나눔바른고딕23("나눔바른고딕", 0, 23), 
/* 18 */   나눔바른고딕24("나눔바른고딕", 0, 24), 
/* 19 */   나눔바른고딕25("나눔바른고딕", 0, 25), 
/* 20 */   나눔바른고딕26("나눔바른고딕", 0, 26);
/*    */   
/*    */   private final Font font;
/*    */   
/*    */   private Enum_Font_Ci(String fontName, int style, int size)
/*    */   {
/* 26 */     this.font = new Font(fontName, style, size);
/*    */   }
/*    */   
/*    */   public Font getFont()
/*    */   {
/* 31 */     return this.font;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Enum\Enum_Font_Ci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */