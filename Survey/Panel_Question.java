/*     */ package Survey;
/*     */ 
/*     */ import Enum.Enum_Font_Ci;
/*     */ import Enum.Enum_Image_Ci;
/*     */ import Model.Module_Option;
/*     */ import Worker.ImageController;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Enumeration;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRadioButton;
/*     */ import javax.swing.JTextField;
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
/*     */ class Panel_Question
/*     */   extends JPanel
/*     */ {
/* 396 */   private GridBagLayout gbl = new GridBagLayout();
/* 397 */   private GridBagConstraints gbc = new GridBagConstraints();
/*     */   
/* 399 */   private String type = "";
/*     */   
/* 401 */   private JLabel ll_name = new JLabel();
/* 402 */   private JTextField tf_OpenEnded = new JTextField();
/* 403 */   private ButtonGroup group_bt = new ButtonGroup();
/* 404 */   private List<JCheckBox> list_cb = new ArrayList();
/* 405 */   private JComboBox jcb = new JComboBox();
/* 406 */   private List<ButtonGroup> list_bg = new ArrayList();
/* 407 */   private List<ArrayList<JRadioButton>> list_cbg = new ArrayList();
/*     */   
/* 409 */   public String getType() { return this.type; }
/*     */   
/*     */   public Panel_Question(String type)
/*     */   {
/* 413 */     this.type = type;
/*     */     
/* 415 */     setLayout(this.gbl);
/* 416 */     setBackground(Color.WHITE);
/* 417 */     setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(224, 224, 224)));
/*     */     
/* 419 */     this.ll_name.setOpaque(false);
/* 420 */     this.ll_name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
/* 421 */     this.ll_name.setFont(Enum_Font_Ci.나눔바른고딕25.getFont());
/*     */     String str;
/* 423 */     switch ((str = type).hashCode()) {case -2018804923:  if (str.equals("Linear")) {} break; case -768855440:  if (str.equals("OpenEnded")) break; break; case -368370607:  if (str.equals("DropDown")) {} case 175590647:  if ((goto 882) || (str.equals("CheckBoxGird"))) {} break; case 718473776:  if (str.equals("Multiple")) {} case 1033354689:  if ((goto 882) || (str.equals("RadioGrid"))) {} break; case 1601505219:  if (!str.equals("CheckBox"))
/*     */       {
/* 425 */         return;this.tf_OpenEnded.setOpaque(false);
/* 426 */         this.tf_OpenEnded.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(224, 224, 224)), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
/* 427 */         this.tf_OpenEnded.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/*     */         
/* 429 */         this.gbc.anchor = 17;
/* 430 */         this.gbc.fill = 2;
/*     */         
/* 432 */         this.gbc.gridx = 0;
/* 433 */         this.gbc.gridy = 0;
/* 434 */         this.gbc.gridwidth = 1;
/* 435 */         this.gbc.gridheight = 1;
/* 436 */         this.gbc.weightx = 1.0D;
/* 437 */         this.gbc.weighty = 1.0D;
/* 438 */         this.gbc.insets = new Insets(0, 30, 0, 30);
/* 439 */         add(this.ll_name, this.gbc);
/*     */         
/* 441 */         this.gbc.gridx = 0;
/* 442 */         this.gbc.gridy = 1;
/* 443 */         this.gbc.weightx = 1.0D;
/* 444 */         this.gbc.insets = new Insets(-60, 30, 0, 30);
/* 445 */         add(this.tf_OpenEnded, this.gbc);
/* 446 */         return;
/* 447 */         this.gbc.anchor = 17;
/* 448 */         this.gbc.fill = 2;
/*     */         
/* 450 */         this.gbc.gridx = 0;
/* 451 */         this.gbc.gridy = 0;
/* 452 */         this.gbc.gridwidth = 2;
/* 453 */         this.gbc.gridheight = 1;
/* 454 */         this.gbc.weightx = 1.0D;
/* 455 */         this.gbc.weighty = 1.0D;
/* 456 */         this.gbc.insets = new Insets(30, 30, 20, 30);
/* 457 */         add(this.ll_name, this.gbc);
/*     */       } else {
/* 459 */         this.gbc.anchor = 17;
/* 460 */         this.gbc.fill = 2;
/*     */         
/* 462 */         this.gbc.gridx = 0;
/* 463 */         this.gbc.gridy = 0;
/* 464 */         this.gbc.gridwidth = 2;
/* 465 */         this.gbc.gridheight = 1;
/* 466 */         this.gbc.weightx = 1.0D;
/* 467 */         this.gbc.weighty = 1.0D;
/* 468 */         this.gbc.insets = new Insets(30, 30, 20, 30);
/* 469 */         add(this.ll_name, this.gbc);
/* 470 */         return;
/* 471 */         this.gbc.anchor = 17;
/* 472 */         this.gbc.fill = 2;
/*     */         
/* 474 */         this.gbc.gridx = 0;
/* 475 */         this.gbc.gridy = 0;
/* 476 */         this.gbc.gridwidth = 2;
/* 477 */         this.gbc.gridheight = 1;
/* 478 */         this.gbc.weightx = 1.0D;
/* 479 */         this.gbc.weighty = 1.0D;
/* 480 */         this.gbc.insets = new Insets(30, 30, 20, 30);
/* 481 */         add(this.ll_name, this.gbc);
/*     */       }
/*     */       break;
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */   public void setLabel(String type, String name, List<Module_Option> lt_opt)
/*     */   {
/*     */     String str;
/* 491 */     switch ((str = type).hashCode()) {case -2018804923:  if (str.equals("Linear")) {} break; case -768855440:  if (str.equals("OpenEnded")) break; break; case -368370607:  if (str.equals("DropDown")) {} break; case 175599017:  if (str.equals("CheckBoxGrid")) {} break; case 718473776:  if (str.equals("Multiple")) {} break; case 1033354689:  if (str.equals("RadioGrid")) {} break; case 1601505219:  if (!str.equals("CheckBox"))
/*     */       {
/* 493 */         return;this.ll_name.setText(name);
/* 494 */         setPreferredSize(new Dimension(970, 220));
/* 495 */         return;
/* 496 */         this.ll_name.setText(name);
/* 497 */         setPreferredSize(new Dimension(970, 220 + lt_opt.size() * 25));
/*     */         
/* 499 */         for (int i = 0; i < lt_opt.size(); i++)
/*     */         {
/* 501 */           this.gbc.fill = 0;
/*     */           
/* 503 */           this.gbc.gridx = 0;
/* 504 */           this.gbc.gridy += 1;
/* 505 */           this.gbc.gridwidth = 2;
/* 506 */           this.gbc.weightx = 1.0D;
/* 507 */           this.gbc.insets = new Insets(0, 30, 0, 20);
/* 508 */           if (i == lt_opt.size() - 1) { this.gbc.insets = new Insets(0, 30, 30, 20);
/*     */           }
/* 510 */           JRadioButton bt_radio = new JRadioButton();
/* 511 */           bt_radio.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_UNSELECTED.getImageIcon(), 28, 28)));
/* 512 */           bt_radio.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_SELECTED.getImageIcon(), 28, 28)));
/* 513 */           bt_radio.setCursor(new Cursor(12));
/* 514 */           bt_radio.setBackground(Color.WHITE);
/* 515 */           bt_radio.setText(((Module_Option)lt_opt.get(i)).getName());
/* 516 */           bt_radio.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 517 */           bt_radio.setIconTextGap(25);
/*     */           
/* 519 */           this.group_bt.add(bt_radio);
/*     */           
/* 521 */           add(bt_radio, this.gbc);
/*     */         }
/*     */       } else {
/* 524 */         this.ll_name.setText(name);
/* 525 */         setPreferredSize(new Dimension(970, 220 + lt_opt.size() * 25));
/*     */         
/* 527 */         for (int i = 0; i < lt_opt.size(); i++)
/*     */         {
/* 529 */           this.gbc.fill = 0;
/*     */           
/* 531 */           this.gbc.gridx = 0;
/* 532 */           this.gbc.gridy += 1;
/* 533 */           this.gbc.gridwidth = 2;
/* 534 */           this.gbc.weightx = 1.0D;
/* 535 */           this.gbc.insets = new Insets(0, 30, 0, 20);
/* 536 */           if (i == lt_opt.size() - 1) { this.gbc.insets = new Insets(0, 30, 30, 20);
/*     */           }
/* 538 */           JCheckBox bt_cb = new JCheckBox();
/* 539 */           bt_cb.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_UNSELECTED.getImageIcon(), 28, 28)));
/* 540 */           bt_cb.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_SELECTED.getImageIcon(), 28, 28)));
/* 541 */           bt_cb.setCursor(new Cursor(12));
/* 542 */           bt_cb.setBackground(Color.WHITE);
/* 543 */           bt_cb.setText(((Module_Option)lt_opt.get(i)).getName());
/* 544 */           bt_cb.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 545 */           bt_cb.setIconTextGap(25);
/* 546 */           this.list_cb.add(bt_cb);
/*     */           
/* 548 */           add(bt_cb, this.gbc);
/*     */         }
/* 550 */         return;
/* 551 */         this.ll_name.setText(name);
/* 552 */         setPreferredSize(new Dimension(970, 190));
/*     */         
/* 554 */         this.gbc.fill = 0;
/* 555 */         this.gbc.gridy += 1;
/* 556 */         this.gbc.insets = new Insets(0, 30, 35, 30);
/*     */         
/* 558 */         this.jcb.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 559 */         this.jcb.setBackground(Color.WHITE);
/* 560 */         this.jcb.setFocusable(false);
/* 561 */         this.jcb.setCursor(new Cursor(12));
/* 562 */         this.jcb.setRenderer(new ComboBoxRenderer());
/*     */         
/* 564 */         for (int i = 0; i < lt_opt.size(); i++)
/*     */         {
/* 566 */           this.jcb.addItem(((Module_Option)lt_opt.get(i)).getName());
/*     */         }
/* 568 */         add(this.jcb, this.gbc);
/* 569 */         return;
/* 570 */         this.ll_name.setText(name);
/* 571 */         setPreferredSize(new Dimension(970, 260));
/*     */         
/* 573 */         int min = Integer.valueOf(((Module_Option)lt_opt.get(0)).getNumber()).intValue();
/* 574 */         int max = Integer.valueOf(((Module_Option)lt_opt.get(1)).getNumber()).intValue();
/*     */         
/* 576 */         JLabel lbl_min = new JLabel(((Module_Option)lt_opt.get(0)).getName());
/* 577 */         lbl_min.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 578 */         JLabel lbl_max = new JLabel(((Module_Option)lt_opt.get(1)).getName());
/* 579 */         lbl_max.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/*     */         
/* 581 */         this.gbc.anchor = 17;
/* 582 */         this.gbc.fill = 2;
/*     */         
/* 584 */         this.gbc.gridx = 0;
/* 585 */         this.gbc.gridy = 0;
/* 586 */         this.gbc.gridwidth = (max + 2);
/* 587 */         this.gbc.gridheight = 1;
/* 588 */         this.gbc.weightx = 1.0D;
/* 589 */         this.gbc.weighty = 1.0D;
/* 590 */         this.gbc.insets = new Insets(30, 30, 20, 30);
/* 591 */         add(this.ll_name, this.gbc);
/*     */         
/* 593 */         this.gbc.anchor = 10;
/* 594 */         this.gbc.fill = 0;
/*     */         
/* 596 */         this.gbc.gridx = 0;
/* 597 */         this.gbc.gridy = 1;
/* 598 */         this.gbc.gridwidth = 1;
/* 599 */         this.gbc.insets = new Insets(25, 30, 0, 30);
/*     */         
/* 601 */         add(lbl_min, this.gbc);
/*     */         
/* 603 */         this.gbc.gridx = (max + 1);
/* 604 */         this.gbc.gridy = 1;
/* 605 */         this.gbc.insets = new Insets(25, 30, 0, 30);
/* 606 */         add(lbl_max, this.gbc);
/*     */         
/* 608 */         for (int i = min; i <= max; i++)
/*     */         {
/* 610 */           JRadioButton bt_radio = new JRadioButton();
/* 611 */           bt_radio.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_UNSELECTED.getImageIcon(), 28, 28)));
/* 612 */           bt_radio.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_SELECTED.getImageIcon(), 28, 28)));
/* 613 */           bt_radio.setCursor(new Cursor(12));
/* 614 */           bt_radio.setBackground(Color.WHITE);
/* 615 */           bt_radio.setText(String.valueOf(i));
/* 616 */           bt_radio.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 617 */           bt_radio.setVerticalTextPosition(1);
/* 618 */           bt_radio.setHorizontalTextPosition(0);
/* 619 */           bt_radio.setIconTextGap(25);
/*     */           
/* 621 */           this.group_bt.add(bt_radio);
/*     */           
/* 623 */           this.gbc.gridx = i;
/* 624 */           this.gbc.gridy = 1;
/* 625 */           this.gbc.insets = new Insets(0, 0, 30, 0);
/* 626 */           add(bt_radio, this.gbc);
/*     */         }
/* 628 */         return;
/* 629 */         this.ll_name.setText(name);
/*     */         
/* 631 */         List<String> lt_col = new ArrayList();
/* 632 */         List<String> lt_row = new ArrayList();
/*     */         
/* 634 */         for (int i = 0; i < lt_opt.size(); i++)
/*     */         {
/* 636 */           if (((Module_Option)lt_opt.get(i)).getNumber().contains("r"))
/*     */           {
/* 638 */             lt_row.add(((Module_Option)lt_opt.get(i)).getName());
/*     */           }
/* 640 */           else if (((Module_Option)lt_opt.get(i)).getNumber().contains("c"))
/*     */           {
/* 642 */             lt_col.add(((Module_Option)lt_opt.get(i)).getName());
/*     */           }
/*     */         }
/*     */         
/* 646 */         setPreferredSize(new Dimension(970, 260 + lt_row.size() * 25));
/*     */         
/* 648 */         this.gbc.anchor = 17;
/* 649 */         this.gbc.fill = 2;
/*     */         
/* 651 */         this.gbc.gridx = 0;
/* 652 */         this.gbc.gridy = 0;
/* 653 */         this.gbc.gridwidth = (lt_col.size() + 1);
/* 654 */         this.gbc.gridheight = 1;
/* 655 */         this.gbc.weightx = 1.0D;
/* 656 */         this.gbc.weighty = 1.0D;
/* 657 */         this.gbc.insets = new Insets(30, 30, 20, 30);
/* 658 */         add(this.ll_name, this.gbc);
/*     */         
/* 660 */         this.gbc.anchor = 10;
/* 661 */         this.gbc.fill = 0;
/*     */         
/* 663 */         this.gbc.gridx = 0;
/* 664 */         this.gbc.gridy = 1;
/* 665 */         this.gbc.gridwidth = 1;
/* 666 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/*     */         
/* 668 */         add(new JLabel(), this.gbc);
/*     */         
/* 670 */         for (int i = 0; i < lt_col.size(); i++)
/*     */         {
/* 672 */           JLabel lbl = new JLabel((String)lt_col.get(i));
/* 673 */           lbl.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 674 */           this.gbc.gridx = (i + 1);
/* 675 */           this.gbc.insets = new Insets(0, 0, 0, 0);
/*     */           
/* 677 */           add(lbl, this.gbc);
/*     */         }
/*     */         
/* 680 */         for (int i = 0; i < lt_row.size(); i++)
/*     */         {
/* 682 */           JLabel lbl = new JLabel((String)lt_row.get(i));
/* 683 */           lbl.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/*     */           
/* 685 */           this.gbc.gridx = 0;
/* 686 */           this.gbc.gridy += 1;
/*     */           
/* 688 */           add(lbl, this.gbc);
/*     */           
/* 690 */           ButtonGroup group_G = new ButtonGroup();
/*     */           
/* 692 */           for (int j = 0; j < lt_col.size(); j++)
/*     */           {
/* 694 */             JRadioButton bt_radio = new JRadioButton();
/* 695 */             bt_radio.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_UNSELECTED.getImageIcon(), 28, 28)));
/* 696 */             bt_radio.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_RADIO_SELECTED.getImageIcon(), 28, 28)));
/* 697 */             bt_radio.setCursor(new Cursor(12));
/* 698 */             bt_radio.setBackground(Color.WHITE);
/*     */             
/* 700 */             group_G.add(bt_radio);
/*     */             
/* 702 */             this.gbc.gridx += 1;
/*     */             
/* 704 */             add(bt_radio, this.gbc);
/*     */           }
/* 706 */           this.list_bg.add(group_G);
/*     */         }
/* 708 */         this.ll_name.setText(name);
/*     */         
/* 710 */         List<String> lt_col1 = new ArrayList();
/* 711 */         List<String> lt_row1 = new ArrayList();
/*     */         
/* 713 */         for (int i = 0; i < lt_opt.size(); i++)
/*     */         {
/* 715 */           if (((Module_Option)lt_opt.get(i)).getNumber().contains("r"))
/*     */           {
/* 717 */             lt_row1.add(((Module_Option)lt_opt.get(i)).getName());
/*     */           }
/* 719 */           else if (((Module_Option)lt_opt.get(i)).getNumber().contains("c"))
/*     */           {
/* 721 */             lt_col1.add(((Module_Option)lt_opt.get(i)).getName());
/*     */           }
/*     */         }
/*     */         
/* 725 */         setPreferredSize(new Dimension(970, 260 + lt_row1.size() * 25));
/*     */         
/* 727 */         this.gbc.anchor = 17;
/* 728 */         this.gbc.fill = 2;
/*     */         
/* 730 */         this.gbc.gridx = 0;
/* 731 */         this.gbc.gridy = 0;
/* 732 */         this.gbc.gridwidth = (lt_col1.size() + 1);
/* 733 */         this.gbc.gridheight = 1;
/* 734 */         this.gbc.weightx = 1.0D;
/* 735 */         this.gbc.weighty = 1.0D;
/* 736 */         this.gbc.insets = new Insets(30, 30, 20, 30);
/* 737 */         add(this.ll_name, this.gbc);
/*     */         
/* 739 */         this.gbc.anchor = 10;
/* 740 */         this.gbc.fill = 0;
/*     */         
/* 742 */         this.gbc.gridx = 0;
/* 743 */         this.gbc.gridy = 1;
/* 744 */         this.gbc.gridwidth = 1;
/* 745 */         this.gbc.insets = new Insets(0, 30, 0, 0);
/*     */         
/* 747 */         add(new JLabel(), this.gbc);
/*     */         
/* 749 */         for (int i = 0; i < lt_col1.size(); i++)
/*     */         {
/* 751 */           JLabel lbl = new JLabel((String)lt_col1.get(i));
/* 752 */           lbl.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/* 753 */           this.gbc.gridx = (i + 1);
/* 754 */           this.gbc.insets = new Insets(0, 0, 0, 0);
/*     */           
/* 756 */           add(lbl, this.gbc);
/*     */         }
/*     */         
/* 759 */         for (int i = 0; i < lt_row1.size(); i++)
/*     */         {
/* 761 */           JLabel lbl = new JLabel((String)lt_row1.get(i));
/* 762 */           lbl.setFont(Enum_Font_Ci.나눔바른고딕21.getFont());
/*     */           
/* 764 */           this.gbc.gridx = 0;
/* 765 */           this.gbc.gridy += 1;
/*     */           
/* 767 */           add(lbl, this.gbc);
/*     */           
/* 769 */           this.list_cbg.add(new ArrayList());
/*     */           
/* 771 */           for (int j = 0; j < lt_col1.size(); j++)
/*     */           {
/* 773 */             JRadioButton bt_radio = new JRadioButton();
/* 774 */             bt_radio.setIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_UNSELECTED.getImageIcon(), 28, 28)));
/* 775 */             bt_radio.setSelectedIcon(new ImageIcon(ImageController.resizeImage(Enum_Image_Ci.BUTTON_CHECKBOX_SELECTED.getImageIcon(), 28, 28)));
/* 776 */             bt_radio.setCursor(new Cursor(12));
/* 777 */             bt_radio.setBackground(Color.WHITE);
/*     */             
/* 779 */             this.gbc.gridx += 1;
/*     */             
/* 781 */             add(bt_radio, this.gbc);
/*     */             
/* 783 */             ((ArrayList)this.list_cbg.get(i)).add(bt_radio);
/*     */           }
/*     */         }
/*     */       }
/*     */       break; }
/*     */   }
/*     */   
/*     */   public Map<String, String> getAnswer() {
/* 791 */     Map<String, String> answer = new HashMap();
/*     */     
/*     */ 
/*     */     String str;
/*     */     
/* 796 */     switch ((str = this.type).hashCode()) {case -2018804923:  if (str.equals("Linear")) {} break; case -768855440:  if (str.equals("OpenEnded")) break; break; case -368370607:  if (str.equals("DropDown")) {} break; case 175599017:  if (str.equals("CheckBoxGrid")) {} break; case 718473776:  if (str.equals("Multiple")) {} break; case 1033354689:  if (str.equals("RadioGrid")) {} break; case 1601505219:  if (!str.equals("CheckBox"))
/*     */       {
/* 798 */         return answer;answer.put("0", this.tf_OpenEnded.getText());
/* 799 */         return answer;
/* 800 */         int count = -1;
/* 801 */         Enumeration bt_E = this.group_bt.getElements();
/* 802 */         while (bt_E.hasMoreElements())
/*     */         {
/* 804 */           JRadioButton bt = (JRadioButton)bt_E.nextElement();
/* 805 */           count++;
/*     */           
/* 807 */           if (bt.isSelected())
/*     */           {
/* 809 */             answer.put(String.valueOf(count), bt.getText());
/*     */           }
/*     */         }
/*     */       } else {
/* 813 */         for (int i = 0; i < this.list_cb.size(); i++)
/*     */         {
/* 815 */           if (((JCheckBox)this.list_cb.get(i)).isSelected())
/*     */           {
/* 817 */             answer.put(String.valueOf(i), ((JCheckBox)this.list_cb.get(i)).getText());
/*     */           }
/*     */         }
/* 820 */         return answer;
/* 821 */         answer.put(String.valueOf(this.jcb.getSelectedIndex()), this.jcb.getSelectedItem().toString());
/* 822 */         return answer;
/* 823 */         int count = -1;
/* 824 */         Enumeration bt_E = this.group_bt.getElements();
/* 825 */         while (bt_E.hasMoreElements())
/*     */         {
/* 827 */           JRadioButton bt = (JRadioButton)bt_E.nextElement();
/* 828 */           count++;
/*     */           
/* 830 */           if (bt.isSelected())
/*     */           {
/* 832 */             answer.put(String.valueOf(count), bt.getText());
/*     */           }
/*     */         }
/* 835 */         return answer;
/* 836 */         for (int i = 0; i < this.list_bg.size(); i++)
/*     */         {
/* 838 */           ButtonGroup temp = (ButtonGroup)this.list_bg.get(i);
/*     */           
/* 840 */           Enumeration bt_E = temp.getElements();
/*     */           
/* 842 */           int ccount = -1;
/*     */           
/* 844 */           while (bt_E.hasMoreElements())
/*     */           {
/* 846 */             JRadioButton bt = (JRadioButton)bt_E.nextElement();
/* 847 */             ccount++;
/*     */             
/* 849 */             if (bt.isSelected())
/*     */             {
/* 851 */               answer.put(i + "r", ccount + "c");
/*     */             }
/*     */           }
/*     */         }
/* 855 */         return answer;
/* 856 */         for (int i = 0; i < this.list_cbg.size(); i++)
/*     */         {
/* 858 */           for (int j = 0; j < ((ArrayList)this.list_cbg.get(i)).size(); j++)
/*     */           {
/* 860 */             if (((JRadioButton)((ArrayList)this.list_cbg.get(i)).get(j)).isSelected())
/*     */             {
/* 862 */               answer.put(i + "r" + j, "c");
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       break;
/*     */     }
/* 869 */     return answer;
/*     */   }
/*     */ }


/* Location:              C:\Users\Owner\Desktop\정다운마을 설문조사C\!\Survey\Panel_Question.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */