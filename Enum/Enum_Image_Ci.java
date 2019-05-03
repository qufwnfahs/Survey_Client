/*    */ package Enum;
/*    */ 
/*    */ import javax.swing.ImageIcon;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum Enum_Image_Ci
/*    */ {
/* 10 */   FRAME_LOGIN_BACKGROUND("/Image/cris-tagupa-1095254-unsplash.jpg"), 
/* 11 */   BUTTON_SURVEY_IMAGE("/Image/baseline_assignment_white_36dp.png"), 
/* 12 */   BUTTON_PREV_IMAGE("/Image/sharp_keyboard_arrow_left_black_36dp.png"), 
/* 13 */   BUTTON_NEXT_IMAGE("/Image/sharp_keyboard_arrow_right_black_36dp.png"), 
/* 14 */   BUTTON_RADIO_UNSELECTED("/Image/round_radio_button_unchecked_black_18dp.png"), 
/* 15 */   BUTTON_RADIO_SELECTED("/Image/round_radio_button_checked_black_36dp.png"), 
/* 16 */   BUTTON_CHECKBOX_UNSELECTED("/Image/outline_check_box_outline_blank_black_18dp.png"), 
/* 17 */   BUTTON_CHECKBOX_SELECTED("/Image/baseline_check_box_black_18dp.png"), 
/* 18 */   BUTTON_NEXT_IMAGE_WHITE("/Image/outline_keyboard_arrow_right_white_36dp.png"), 
/* 19 */   BUTTON_PREV_IMAGE_WHITE("/Image/outline_keyboard_arrow_left_white_36dp.png"), 
/* 20 */   BUTTON_RENEW_IMAGE_WHITE("/Image/outline_autorenew_white_36dp.png"), 
/* 21 */   BUTTON_DROPDOWN("/Image/dropdown.png");
/*    */   
/*    */   private final ImageIcon imgIcon;
/*    */   private final String fileName;
/*    */   
/*    */   private Enum_Image_Ci(String fileName)
/*    */   {
/* 28 */     this.imgIcon = new ImageIcon(getClass().getResource(fileName));
/* 29 */     this.fileName = fileName;
/*    */   }
/*    */   
/*    */   public ImageIcon getImageIcon()
/*    */   {
/* 34 */     return this.imgIcon;
/*    */   }
/*    */   
/*    */   public String getFileName()
/*    */   {
/* 39 */     return this.fileName;
/*    */   }
/*    */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Enum\Enum_Image_Ci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */