import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.text.MaskFormatter;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import javax.swing.text.InternationalFormatter;

public class gui extends JFrame implements ActionListener{
	 
	// РћР±СЉСЏРІР»РµРЅРёРµ РѕСЃРЅРѕРІРЅРѕР№ С„РѕСЂРјС‹
	public JFrame fr;
	// РћР±СЉСЏРІР»РµРЅРёРµ РїР°РЅРµР»РµР№
	public JPanel p1, p2, p3, p4, p5, p6;
	// РћР±СЉСЏРІР»РµРЅРёРµ РјРµС‚РѕРє СЃ РЅР°Р·РІР°РЅРёСЏРјРё РґР»СЏ РїР°РЅРµР»РµР№ РІРІРѕРґР° РґР°РЅРЅС‹С…
	public JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l12, l14, l15, l16;
	// РћР±СЉСЏРІР»РµРЅРёРµ РјРµС‚РѕРє СЃ РЅР°Р·РІР°РЅРёСЏРјРё РґР»СЏ РїР°РЅРµР»Рё РІС‹РІРѕРґР° РґР°РЅРЅС‹С…
	public JLabel fin1, fin2, fin3, fin4, fin5, fin6, fin7, fin8, fin9;
	// РћР±СЉСЏРІР»РµРЅРёРµ РјРµС‚РѕРє, РІ РєРѕС‚РѕСЂС‹Рµ Р±СѓРґСѓС‚ РІС‹РІРѕРґРёС‚СЊСЃСЏ РґР°РЅРЅС‹Рµ
	public JLabel res1, res2, res3, res4, res5, res6, res7, res8, res9;
	// РћР±СЉСЏРІР»РµРЅРёРµ РјРµС‚РѕРє РґР»СЏ РїРѕРґРїРёСЃРµР№ Рє РІРІРѕРґРёРјС‹Рј РґР°РЅРЅС‹Рј
	public JLabel i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i14, i15, i16;
	// РћР±СЉСЏРІР»РµРЅРёРµ РјРµС‚РѕРє РґР»СЏ РїРѕРґРїРёСЃРµР№ Рє РІС‹РІРѕРґРёРјС‹Рј РґР°РЅРЅС‹Рј
	public JLabel iRes1, iRes2, iRes3, iRes4, iRes5, iRes6, iRes7, iRes8, iRes9;
	// РћР±СЉСЏРІР»РµРЅРёРµ РїРѕР»РµР№ РґР»СЏ РІРІРѕРґР°
	public JFormattedTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t12, t14, t15, t16;
	// РћР±СЉСЏРІР»РµРЅРёРµ РіСЂР°РЅРёС†
	public Border b1, b2, b3, b4, b6, bG;
	// РћР±СЉСЏРІР»РµРЅРёРµ РєРЅРѕРїРѕРє
	public JButton Confirm, Cancel1, Cancel2;
	
	// РњРµС‚РѕРґ, РёРЅРёС†РёР°Р»РёР·РёСЂСѓСЋС‰РёР№ РёРЅС‚РµСЂС„РµР№СЃ
	public void start() {
		
		// Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РѕСЃРЅРѕРІРЅРѕР№ С„РѕСЂРјС‹
		fr = new JFrame("Р Р°СЃС‡С‘С‚");
		
		// Р—Р°РґР°РЅРёРµ РѕРїРµСЂР°С†РёРё Р·Р°РєСЂС‹С‚РёСЏ РґР»СЏ РѕСЃРЅРѕРІРЅРѕР№ С„РѕСЂРјС‹
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Р—Р°РґР°РЅРёРµ РјРµРЅРµРґР¶РµСЂР° СЂР°СЃРїРѕР»РѕР¶РµРЅРёСЏ СЌР»РµРјРµРЅС‚РѕРІ РґР»СЏ РѕСЃРЅРѕРІРЅРѕР№ С„РѕСЂРјС‹
        fr.setLayout(new GridBagLayout());
        
		// Р—Р°РґР°РЅРёСЏ С„РѕСЂРјР°С‚Р° РІРІРѕРґРёРјС‹С… С‡РёСЃРµР» РґР»СЏ РїРѕР»РµР№ РІРІРѕРґР°
        NumberFormat format = DecimalFormat.getInstance();
        format.setMinimumFractionDigits(2);
        format.setMaximumFractionDigits(2);
        format.setRoundingMode(RoundingMode.HALF_UP);
        InternationalFormatter formatter = new InternationalFormatter(format);
        formatter.setAllowsInvalid(false);
        formatter.setMinimum(0.0);
        formatter.setMaximum(999.0);
        
        // Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РєРЅРѕРїРѕРє
        Confirm = new JButton("Р Р°СЃСЃС‡РёС‚Р°С‚СЊ");
        Cancel1 = new JButton("РћС‡РёСЃС‚РёС‚СЊ СЂРµР·СѓР»СЊС‚Р°С‚С‹");
        Cancel2 = new JButton("РћС‡РёСЃС‚РёС‚СЊ РІРІРѕРґ");
        
        /* 	Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ С‚РµРєСЃС‚РѕРІС‹С… РїРѕР»РµР№ РґР»СЏ РІРІРѕРґР° Рё Р·Р°РґР°РЅРёРµ РёРј С„РѕСЂРјР°С‚Р°. Р”Р»СЏ 
         *  С‚РµРєСЃС‚РѕРІРѕРіРѕ РїРѕР»СЏ t2 Р·Р°РґР°РЅ РѕС‚РґРµР»СЊРЅС‹Р№ С„РѕСЂРјР°С‚, РїРѕР·РІРѕР»СЏСЋС‰РёР№ РµРјСѓ РїРѕР»СѓС‡Р°С‚СЊ
         *  РЅР° РІРІРѕРґ С‚РѕР»СЊРєРѕ С†РµР»С‹Рµ С‡РёСЃР»Р° РїРµСЂРІРѕРіРѕ СЂР°Р·СЂСЏРґР°, С‚.Рє. РґР°РЅРЅРѕРµ С‚РµРєСЃС‚РѕРІРѕРµ РїРѕР»Рµ 
         *  РїСЂРµРґРЅР°Р·РЅР°С‡РµРЅРѕ РґР»СЏ СЃРѕС…СЂР°РЅРµРЅРёСЏ РєРѕР»РёС‡РµСЃС‚РІР° РїСЂРѕР¶РёРІР°СЋС‰РёС…, РєРѕС‚РѕСЂРѕРµ РјРѕР¶РµС‚
         *  Р±С‹С‚СЊ С‚РѕР»СЊРєРѕ С†РµР»С‹Рј РїРѕР»РѕР¶РёС‚РµР»СЊРЅС‹Рј С‡РёСЃР»РѕРј.
         */ 
        t1 = new JFormattedTextField(formatter);
        t2 = new JFormattedTextField(createFormatter("#"));
        t3 = new JFormattedTextField(formatter);
        t4 = new JFormattedTextField(formatter);
        t5 = new JFormattedTextField(formatter);
        t6 = new JFormattedTextField(formatter);
        t7 = new JFormattedTextField(formatter);
        t8 = new JFormattedTextField(formatter);
        t9 = new JFormattedTextField(formatter);
        t10 = new JFormattedTextField(formatter);
        t12 = new JFormattedTextField(formatter);
        t14 = new JFormattedTextField(formatter);
        t15 = new JFormattedTextField(formatter);
        t16 = new JFormattedTextField(formatter);
        
        // Р’С‹Р·РѕРІ РјРµС‚РѕРґР°, РѕР±РЅСѓР»СЏСЋС‰РµРіРѕ Р·РЅР°С‡РµРЅРёСЏ С‚РµРєСЃС‚РѕРІС‹С… РїРѕР»РµР№
        another_resetter();
        
        // Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РјРµС‚РѕРє, РёСЃРїРѕР»СЊР·СѓРµРјС‹С… РІ РїР°РЅРµР»СЏС… РІРІРѕРґР° РґР°РЅРЅС‹С…
		l1 = new JLabel("РџР»РѕС‰Р°РґСЊ РєРІР°СЂС‚РёСЂС‹:");
		l2 = new JLabel("РљРѕР»РёС‡РµСЃС‚РІРѕ РїСЂРѕР¶РёРІР°СЋС‰РёС…:");
		l3 = new JLabel("РџР»РѕС‰Р°РґСЊ Р¶РёР»С‹С… Рё РЅРµР¶РёР»С‹С… РїРѕРјРµС‰РµРЅРёР№ РІ РґРѕРјРµ:");
		l4 = new JLabel("РџР»РѕС‰Р°РґСЊ РїРѕРјРµС‰РµРЅРёР№ РѕР±С‰РµСЃС‚РІРµРЅРЅРѕРіРѕ РёРјСѓС‰РµСЃС‚РІР°:");
		l14 = new JLabel("РћР±СЉРµРј С…РѕР». РІРѕРґС‹ РїРѕ РѕР±С‰РµРґРѕРјРѕРІРѕРјСѓ РїСЂРёР±РѕСЂСѓ СѓС‡С‘С‚Р°:");
		l5 = new JLabel("РћР±СЉРµРј С…РѕР». РІРѕРґС‹ РїРѕС‚СЂРµР±Р»РµРЅРЅС‹Р№ РІ РєРІР°СЂС‚РёСЂР°С… РЅРµ РѕР±РѕСЂСѓРґРѕРІР°РЅРЅС‹С… РёРЅРґРІРёРґСѓР°Р»СЊРЅС‹РјРё РїСЂРёР±РѕСЂР°РјРё СѓС‡РµС‚Р°:");
		l6 = new JLabel("РћР±СЉРµРј С…РѕР». РІРѕРґС‹ РїРѕС‚СЂРµР±Р»РµРЅРЅРѕР№ РІ РєРІР°СЂС‚РёСЂР°С… РѕСЃРЅР°С‰РµРЅРЅС‹С… РёРЅРґРІРёРґСѓР°Р»СЊРЅС‹РјРё РїСЂРёР±РѕСЂР°РјРё СѓС‡РµС‚Р°:");
		l15 = new JLabel("РћР±СЉРµРј РіРѕСЂ. РІРѕРґС‹ РїРѕ РѕР±С‰РµРґРѕРјРѕРІРѕРјСѓ РїСЂРёР±РѕСЂСѓ СѓС‡С‘С‚Р°:");
		l16 = new JLabel("РћР±СЉРµРј РіРѕСЂ. РІРѕРґС‹ РїРѕС‚СЂРµР±Р»РµРЅРЅС‹Р№ РІ РЅРµР¶РёР»С‹С… РїРѕРјРµС‰РµРЅРёСЏС…:");
		l7 = new JLabel("РћР±СЉРµРј РіРѕСЂ. РІРѕРґС‹ РїРѕС‚СЂРµР±Р»РµРЅРЅС‹Р№ РІ РєРІР°СЂС‚РёСЂР°С… РЅРµ РѕР±РѕСЂСѓРґРѕРІР°РЅРЅС‹С… РёРЅРґРёРІРёРґСѓР°Р»СЊРЅС‹РјРё РїСЂРёР±РѕСЂР°РјРё СѓС‡РµС‚Р°:");
		l8 = new JLabel("РћР±СЉРµРј РіРѕСЂ. РІРѕРґС‹ РїРѕС‚СЂРµР±Р»РµРЅРЅРѕР№ РІ РєРІР°СЂС‚РёСЂР°С… РѕСЃРЅР°С‰РµРЅРЅС‹С… РёРЅРґРІРёРґСѓР°Р»СЊРЅС‹РјРё РїСЂРёР±РѕСЂР°РјРё СѓС‡РµС‚Р°:");
		l9 = new JLabel("РћР±СЉРµРј СЌР»РµРєС‚СЂРѕСЌРЅРµСЂРіРёРё РїРѕ РѕР±С‰РµРґРѕРјРѕРІРѕРјСѓ РїСЂРёР±РѕСЂСѓ СѓС‡РµС‚Р° (РґРµРЅСЊ):");
		l10 = new JLabel("РћР±СЉРµРј СЌР»РµРєС‚СЂРѕСЌРЅРµСЂРіРёРё РїРѕ РѕР±С‰РµРґРѕРјРѕРІРѕРјСѓ РїСЂРёР±РѕСЂСѓ СѓС‡РµС‚Р° (РЅРѕС‡СЊ):");
		l12 = new JLabel("РћР±СЉРµРј С‚РµРїР»РѕРІРѕР№ СЌРЅРµСЂРіРёРё РїРѕ РѕР±С‰РµРґРѕРјРѕРІРѕРјСѓ РїСЂРёР±РѕСЂСѓ СѓС‡РµС‚Р°:");
		
		// Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РјРµС‚РѕРє, РёСЃРїРѕР»СЊР·СѓРµРјС‹С… РІ РїР°РЅРµР»Рё РІС‹РІРѕРґР° РґР°РЅРЅС‹С…
		fin1 = new JLabel("РҐРѕР». РІРѕРґР° (РёРЅРґРёРІРёРґСѓР°Р»СЊРЅРѕ):");
		fin2 = new JLabel("РҐРѕР». РІРѕРґР° (РѕР±С‰РµРґРѕРјРѕРІРѕРµ):");
		fin3 = new JLabel("Р“РѕСЂ. РІРѕРґР° (РёРЅРґРёРІРёРґСѓР°Р»СЊРЅРѕ):");
		fin4 = new JLabel("Р“РѕСЂ. РІРѕРґР° (РѕР±С‰РµРґРѕРјРѕРІРѕРµ):");
		fin5 = new JLabel("Р’РѕРґРѕРѕС‚РІРµРґРµРЅРёРµ:");
		fin6 = new JLabel("РћС‚РѕРїР»РµРЅРёРµ:");
		fin7 = new JLabel("Р­Р»РµРєС‚СЂСЌРЅРµСЂРіРёСЏ (РѕР±С‰РµРґРѕРјРѕРІР°СЏ):");
		fin8 = new JLabel("Р“Р°Р·РѕСЃРЅР°Р±Р¶РµРЅРёРµ (РёРЅРґРІРёРґСѓР°Р»СЊРЅРѕРµ):");
		fin9 = new JLabel("Р�С‚РѕРіРѕ:");
		
		// Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РјРµС‚РѕРє РґР»СЏ РІС‹РІРѕРґР° РґР°РЅРЅС‹С…
		res1 = new JLabel("0.0");
		res2 = new JLabel("0.0");
		res3 = new JLabel("0.0");
		res4 = new JLabel("0.0");
		res5 = new JLabel("0.0");
		res6 = new JLabel("0.0");
		res7 = new JLabel("0.0");
		res8 = new JLabel("0.0");
		res9 = new JLabel("0.0");
		
		// Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РјРµС‚РѕРє СЃ РїРѕРґРїРёСЃСЏРјРё Рє РІРІРѕРґРёРјС‹Рј РґР°РЅРЅС‹Рј
		i1 = new JLabel("РєРІ.Рј.");
		i2 = new JLabel("С‡РµР».");
		i3 = new JLabel("РєРІ.Рј.");
		i4 = new JLabel("РєРІ.Рј.");
		i5 = new JLabel("РєСѓР±.Рј.");
		i6 = new JLabel("РєСѓР±.Рј.");
		i7 = new JLabel("РєСѓР±.Рј.");
		i8 = new JLabel("РєСѓР±.Рј.");
		i9 = new JLabel("РєСѓР±.Рј.");
		i10 = new JLabel("РєСѓР±.Рј.");
		i11 = new JLabel("РєСѓР±.Рј.");
		i14 = new JLabel("Р“РєР°Р»");
		i15 = new JLabel("РєР’С‚*С‡Р°СЃ");
		i16 = new JLabel("РєР’С‚*С‡Р°СЃ");
		
		// Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РјРµС‚РѕРє СЃ РїРѕРґРїРёСЃСЏРјРё Рє РІС‹РІРѕРґРёРјС‹Рј РґР°РЅРЅС‹Рј
		iRes1 = new JLabel("СЂСѓР±.");
		iRes2 = new JLabel("СЂСѓР±.");
		iRes3 = new JLabel("СЂСѓР±.");
		iRes4 = new JLabel("СЂСѓР±.");
		iRes5 = new JLabel("СЂСѓР±.");
		iRes6 = new JLabel("СЂСѓР±.");
		iRes7 = new JLabel("СЂСѓР±.");
		iRes8 = new JLabel("СЂСѓР±.");
		iRes9 = new JLabel("СЂСѓР±.");
		
		// РџСЂРёРІСЏР·РєР° СЃР»СѓС€Р°С‚РµР»СЏ СЃРѕР±С‹С‚РёР№ Рє РєРЅРѕРїРєР°Рј
        Confirm.addActionListener(this);
        Cancel1.addActionListener(this);
        Cancel2.addActionListener(this);
        
        // Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РїР°РЅРµР»РµР№
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        
        // Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ Р»РёРЅРёРё, РёСЃРїРѕР»СЊР·СѓРµРјРѕР№ РІ РіСЂР°РЅРёС†Р°С…
        bG = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true);
        
        // РЈСЃС‚Р°РЅРѕРІРєР° РјРµРЅРµРґР¶РµСЂР° СЂР°СЃРїРѕР»РѕР¶РµРЅРёСЏ СЌР»РµРјРµРЅС‚РѕРІ РґР»СЏ РїР°РЅРµР»РµР№
        p1.setLayout(new GridBagLayout());
        p2.setLayout(new GridBagLayout());
        p3.setLayout(new GridBagLayout());
        p4.setLayout(new GridBagLayout());
        p5.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        p6.setLayout(new GridBagLayout());
        
        // РЈСЃС‚Р°РЅРѕРІР»РµРЅРёРµ РіСЂР°РЅРёС† РґР»СЏ РґР»СЏ РїР°РЅРµР»РµР№
        b1 = BorderFactory.createTitledBorder(bG, "РћСЃРЅРѕРІРЅС‹Рµ РґР°РЅРЅС‹Рµ", TitledBorder.LEFT, TitledBorder.TOP);
        b2 = BorderFactory.createTitledBorder(bG, "РҐРѕР»РѕРґРЅР°СЏ Рё РіРѕСЂСЏС‡Р°СЏ РІРѕРґР°", TitledBorder.LEFT, TitledBorder.TOP);
        b3 = BorderFactory.createTitledBorder(bG, "РћС‚РѕРїР»РµРЅРёРµ", TitledBorder.LEFT, TitledBorder.TOP);
        b4 = BorderFactory.createTitledBorder(bG, "Р­Р»РµРєС‚СЂРѕСЌРЅРµСЂРіРёСЏ", TitledBorder.LEFT, TitledBorder.TOP);
        b6 = BorderFactory.createTitledBorder(bG, "Р�С‚РѕРіРё СЂР°СЃС‡РµС‚Р°", TitledBorder.LEFT, TitledBorder.TOP);
        
        // РџСЂРёРІСЏР·РєР° РіСЂР°РЅРёС† Рє РїР°РЅРµР»СЏРј
        p1.setBorder(b1);
        p2.setBorder(b2);       
        p3.setBorder(b3);      
        p4.setBorder(b4);       
        p6.setBorder(b6);
        
        
        // Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РєР»Р°СЃСЃР°, СЃ РїРѕРјРѕС‰СЊСЋ РєРѕС‚РѕСЂРѕРіРѕ Р±СѓРґРµС‚ Р·Р°РґР°РЅР° СЃРїРµС†РёС„РёРєР°С†РёСЏ РґР»СЏ РєР°Р¶РґРѕРіРѕ СЌР»РµРјРµРЅС‚Р° РїРµСЂРІРѕР№ РїР°РЅРµР»Рё РІРІРѕРґР°
        GridBagConstraints a1 = new GridBagConstraints();
        // РЈСЃС‚Р°РЅРѕРІРєР° РїСЂР°РІРёР»Р° Р·Р°РїРѕР»РЅРµРЅРёСЏ РґР»СЏ СЃРїРµС†РёС„РёРєР°С‚РѕСЂР°
        a1.fill = GridBagConstraints.HORIZONTAL;
        // РЈСЃС‚Р°РЅРѕРІРєР° С‚РѕС‡РєРё, РѕС‚ РєРѕС‚РѕСЂРѕР№ Р±СѓРґРµС‚ РїСЂРѕРёСЃС…РѕРґРёС‚СЊ РїСЂРѕСЂРёСЃРѕРІРєР° СЌР»РµРјРµРЅС‚РѕРІ РЅР° РїР°РЅРµР»Рё РІРІРѕРґР°
        a1.weightx = 1;
        a1.weighty = 1;
        /*	Р’ РїРѕСЃР»РµРґСѓСЋС‰РµРј С„СЂР°РіРјРµРЅС‚Рµ РєРѕРґР° Р±СѓРґРµС‚ РїСЂРѕРёР·РІРµРґРµРЅР° СѓСЃС‚Р°РЅРѕРІРєР° СЂР°СЃРїРѕР»РѕР¶РµРЅРёСЏ СЌР»РµРјРµРЅС‚РѕРІ РЅР° РїР°РЅРµР»СЏС…,
         *  Р° С‚Р°РєР¶Рµ РґРѕР±Р°РІР»РµРЅРёСЏ РёС… РЅР° РїР°РЅРµР»СЊ. РЈСЃС‚Р°РЅРѕРІРєР° РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ РїСЂРё РїРѕРјРѕС‰Рё РјРµРЅРµРґР¶РµСЂР° СЂР°СЃРїРѕР»РѕР¶РµРЅРёСЏ
         *  СЌР»РµРјРµРЅС‚РѕРІ GridBagLayout, РєРѕС‚РѕСЂС‹Р№ РїРѕР·РІРѕР»СЏРµС‚ РІС‹СЂР°РІРЅРёРІР°С‚СЊ СЌР»РµРјРµРЅС‚С‹ РїРѕ С‚РёРїСѓ СЏС‡РµРµРє С‚Р°Р±Р»РёС†С‹.
         *  РЈСЃС‚Р°РЅРѕРІРєРѕР№ Р·РЅР°С‡РµРЅРёСЏ .gridx РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ РѕРїСЂРµРґР»РµРЅРёРµ РєРѕР»РѕРЅРЅС‹, РІ С‚Рѕ РІСЂРµРјСЏ РєР°Рє .gridy СѓСЃС‚Р°РЅР°РІР»РёРІР°РµС‚
         *  Р·РЅР°С‡РµРЅРёСЏ СЂСЏРґРѕРІ.
         */
        a1.gridx = 0;
        a1.gridy = 0;
        p1.add(l1, a1);
        a1.gridx = 1;
        p1.add(t1, a1);
        a1.gridx = 2;
        p1.add(i1, a1);
        a1.gridx = 0;
        a1.gridy = 1;
        p1.add(l2, a1);
        a1.gridx = 1;
        p1.add(t2, a1);
        a1.gridx = 2;
        p1.add(i2, a1);
        a1.gridx = 0;
        a1.gridy = 2;
        p1.add(l3, a1);
        a1.gridx = 1;
        p1.add(t3, a1);
        a1.gridx = 2;
        p1.add(i3, a1);
        a1.gridx = 0;
        a1.gridy = 3;
        p1.add(l4, a1);
        a1.gridx = 1;
        p1.add(t4, a1);
        a1.gridx = 2;
        p1.add(i4, a1);
        
        /* РЈСЃС‚Р°РЅРѕРІРєР° СЂР°СЃРїРѕР»РѕР¶РµРЅРёР№ СЌР»РµРјРµРЅС‚РѕРІ РґР»СЏ РІС‚РѕСЂРѕР№ РїР°РЅРµР»Рё РІРІРѕРґР° (РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ РїРѕ С‚Р°РєРѕРјСѓ Р¶Рµ
         * РїСЂРёРЅС†РёРїСѓ, С‡С‚Рѕ Рё РґР»СЏ РїРµСЂРІРѕР№ РїР°РЅРµР»Рё, СЃРј. РєРѕРґ РІС‹С€Рµ)
        */
        GridBagConstraints a2 = new GridBagConstraints();
        a2.fill = GridBagConstraints.HORIZONTAL;
        a2.gridx = 0;
        a2.gridy = 0;
        a2.weightx = 1;
        a2.weighty = 1;
        p2.add(l14, a2);
        a2.gridx = 1;
        p2.add(t14, a2);
        a2.gridx = 2;
        p2.add(i5, a2);
        a2.gridx = 0;
        a2.gridy = 1;
        p2.add(l5, a2);
        a2.gridx = 1;
        p2.add(t5, a2);
        a2.gridx = 2;
        p2.add(i6, a2);
        a2.gridx = 0;
        a2.gridy = 2;
        p2.add(l6, a2);
        a2.gridx = 1;
        p2.add(t6, a2);
        a2.gridx = 2;
        p2.add(i7, a2);
        a2.gridx = 0;
        a2.gridy = 3;
        p2.add(l15, a2);
        a2.gridx = 1;
        p2.add(t15, a2);
        a2.gridx = 2;
        p2.add(i8, a2);
        a2.gridx = 0;
        a2.gridy = 4;
        p2.add(l16, a2);
        a2.gridx = 1;
        p2.add(t16, a2);
        a2.gridx = 2;
        p2.add(i9, a2);
        a2.gridx = 0;
        a2.gridy = 5;
        p2.add(l7, a2);
        a2.gridx = 1;
        p2.add(t7, a2);
        a2.gridx = 2;
        p2.add(i10, a2);
        a2.gridx = 0;
        a2.gridy = 6;
        p2.add(l8, a2);
        a2.gridx = 1;
        p2.add(t8, a2);
        a2.gridx = 2;
        p2.add(i11, a2);
        
        /* РЈСЃС‚Р°РЅРѕРІРєР° СЂР°СЃРїРѕР»РѕР¶РµРЅРёР№ СЌР»РµРјРµРЅС‚РѕРІ РґР»СЏ С‚СЂРµС‚СЊРµР№ РїР°РЅРµР»Рё РІРІРѕРґР° (РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ РїРѕ С‚Р°РєРѕРјСѓ Р¶Рµ
         * РїСЂРёРЅС†РёРїСѓ, С‡С‚Рѕ Рё РґР»СЏ РїРµСЂРІРѕР№ РїР°РЅРµР»Рё, СЃРј. РєРѕРґ РІС‹С€Рµ)
        */
        GridBagConstraints a3 = new GridBagConstraints();
        a3.fill = GridBagConstraints.HORIZONTAL;
        a3.gridx = 0;
        a3.gridy = 0;
        a3.weightx = 1;
        a3.weighty = 1;
        p3.add(l12, a3);
        a3.gridx = 1;
        p3.add(t12, a3);
        a3.gridx = 2;
        p3.add(i14, a3);
        
        /* РЈСЃС‚Р°РЅРѕРІРєР° СЂР°СЃРїРѕР»РѕР¶РµРЅРёР№ СЌР»РµРјРµРЅС‚РѕРІ РґР»СЏ С‡РµС‚РІРµСЂС‚РѕР№ РїР°РЅРµР»Рё РІРІРѕРґР° (РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ РїРѕ С‚Р°РєРѕРјСѓ Р¶Рµ
         * РїСЂРёРЅС†РёРїСѓ, С‡С‚Рѕ Рё РґР»СЏ РїРµСЂРІРѕР№ РїР°РЅРµР»Рё, СЃРј. РєРѕРґ РІС‹С€Рµ)
        */
        GridBagConstraints a4 = new GridBagConstraints();
        a4.fill = GridBagConstraints.HORIZONTAL;
        a4.gridx = 0;
        a4.gridy = 0;
        a4.weightx = 1;
        a4.weighty = 1;
        p4.add(l9, a4);
        a4.gridx = 1;
        p4.add(t9, a4);
        a4.gridx = 2;
        p4.add(i15, a4);
        a4.gridx = 0;
        a4.gridy = 1;
        p4.add(l10, a4);
        a4.gridx = 1;
        p4.add(t10, a4);
        a4.gridx = 2; 
        p4.add(i16, a4);
        
        // РЈСЃС‚Р°РЅРѕРІРєР° СЂР°Р·РјРµСЂРѕРІ РґР»СЏ РєРЅРѕРїРѕРє
        Confirm.setSize(150, 40);
        Cancel1.setSize(150, 40);
        Cancel2.setSize(150, 40);
        
        // Р”РѕР±Р°РІР»РµРЅРёРµ РєРЅРѕРїРѕРє РЅР° РїР°РЅРµР»СЊ
        p5.add(Confirm);
        p5.add(Cancel1);
        p5.add(Cancel2);
        
        /* РЈСЃС‚Р°РЅРѕРІРєР° СЂР°СЃРїРѕР»РѕР¶РµРЅРёР№ СЌР»РµРјРµРЅС‚РѕРІ РґР»СЏ РїР°РЅРµР»Рё СЂРµР·СѓР»СЊС‚Р°С‚РѕРІ (РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ РїРѕ С‚Р°РєРѕРјСѓ Р¶Рµ
         * РїСЂРёРЅС†РёРїСѓ, С‡С‚Рѕ Рё РґР»СЏ РїРµСЂРІРѕР№ РїР°РЅРµР»Рё РІРІРѕРґР°, СЃРј. РєРѕРґ РІС‹С€Рµ)
        */
        GridBagConstraints resGBC = new GridBagConstraints();
        resGBC.fill = GridBagConstraints.HORIZONTAL;
        resGBC.gridx = 0;
        resGBC.gridy = 0;
        resGBC.weightx = 1;
        resGBC.weighty = 1;
        p6.add(fin1, resGBC);
        resGBC.gridx = 1;
        p6.add(res1, resGBC);
        resGBC.gridx = 2;
        p6.add(iRes1, resGBC);
        resGBC.gridx = 0;
        resGBC.gridy = 1;
        p6.add(fin2, resGBC);
        resGBC.gridx = 1;
        p6.add(res2, resGBC);
        resGBC.gridx = 2;
        p6.add(iRes2, resGBC);
        resGBC.gridx = 0;
        resGBC.gridy = 2;
        p6.add(fin3, resGBC);
        resGBC.gridx = 1;
        p6.add(res3, resGBC);
        resGBC.gridx = 2;
        p6.add(iRes3, resGBC);
        resGBC.gridx = 0;
        resGBC.gridy = 3;
        p6.add(fin4, resGBC);
        resGBC.gridx = 1;
        p6.add(res4, resGBC);
        resGBC.gridx = 2;
        p6.add(iRes4, resGBC);
        resGBC.gridx = 0;
        resGBC.gridy = 4;
        p6.add(fin5, resGBC);
        resGBC.gridx = 1;
        p6.add(res5, resGBC);
        resGBC.gridx = 2;
        p6.add(iRes5, resGBC);
        resGBC.gridx = 0;
        resGBC.gridy = 5;
        p6.add(fin6, resGBC);
        resGBC.gridx = 1;
        p6.add(res6, resGBC);
        resGBC.gridx = 2;
        p6.add(iRes6, resGBC);
        resGBC.gridx = 0;
        resGBC.gridy = 6;
        p6.add(fin7, resGBC);
        resGBC.gridx = 1;
        p6.add(res7, resGBC);
        resGBC.gridx = 2;
        p6.add(iRes7, resGBC);
        resGBC.gridx = 0;
        resGBC.gridy = 7;
        p6.add(fin8, resGBC);
        resGBC.gridx = 1;
        p6.add(res8, resGBC);
        resGBC.gridx = 2;
        p6.add(iRes8, resGBC);
        resGBC.gridx = 0;
        resGBC.gridy = 8;
        p6.add(fin9, resGBC);
        resGBC.gridx = 1;
        p6.add(res9, resGBC);
        resGBC.gridx = 2;
        p6.add(iRes9, resGBC);
        
        /* РЈСЃС‚Р°РЅРѕРІРєР° СЂР°СЃРїРѕР»РѕР¶РµРЅРёСЏ РїР°РЅРµР»РµР№ РЅР° РіР»Р°РІРЅРѕР№ С„РѕСЂРјРµ (РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ РїРѕ С‚Р°РєРѕРјСѓ Р¶Рµ
         * РїСЂРёРЅС†РёРїСѓ, С‡С‚Рѕ Рё РґР»СЏ РїР°РЅРµР»РµР№ РІРІРѕРґР°, СЃРј. РєРѕРґ РІС‹С€Рµ)
        */
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        fr.add(p1, c);
        c.gridx = 0;
        c.gridy = 1;
        fr.add(p2,c);
        c.gridx = 0;
        c.gridy = 2;
        fr.add(p3,c);
        c.gridx = 0;
        c.gridy = 3;
        fr.add(p4,c);
        c.gridx = 0;
        c.gridy = 4;
        fr.add(p5,c);
        c.gridx = 0;
        c.gridy = 5;
        fr.add(p6,c);
        
        // Р’РєР»СЋС‡РµРЅРёРµ РѕС‚РѕР±СЂР°Р¶РµРЅРёСЏ РѕСЃРЅРѕРІРЅРѕР№ С„РѕСЂРјС‹
        fr.setVisible(true);
        // РћС‚РєР»СЋС‡РµРЅРёРµ РёР·РјРµРЅРµРЅРёСЏ СЂР°Р·РјРµСЂРѕРІ С„РѕСЂРјС‹
        fr.setResizable(false);
        // РЈСЃС‚Р°РЅРѕРІРєР° РѕРїС‚РёРјР°Р»СЊРЅРѕРіРѕ РјРµС‚РѕРґР° РјР°СЃС€С‚Р°Р±РёСЂРѕРІР°РЅРёСЏ РґР»СЏ С„РѕСЂРјС‹
        fr.pack();
        
	}
	
	// РњРµС‚РѕРґ, РѕР±СЂР°Р±Р°С‚С‹РІР°СЋС‰РёР№ РЅР°Р¶Р°С‚РёРµ РєРЅРѕРїРѕРє
    public void actionPerformed(ActionEvent e) {
    	// Р”РµР№СЃС‚РІРёСЏ, РІС‹РїРѕР»РЅСЏРµРјС‹Рµ РІ СЃР»СѓС‡Р°Рµ РЅР°Р¶Р°С‚РёСЏ РїРѕР»СЊР·РѕРІР°С‚РµР»РµРј РєРЅРѕРїРєРё СЂР°СЃС‡РµС‚Р° (Confirm)
    	if(e.getSource() == Confirm)
    	{
    	// Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РєР»Р°СЃСЃР° СЃ С„СѓРЅРєС†РёСЏРјРё СЂР°СЃС‡РµС‚Р°
    	functions s = new functions();
    	// Р’С‹Р·РѕРІ РјРµС‚РѕРґР°, РѕР±РЅСѓР»СЏСЋС‰РµРіРѕ Р·РЅР°С‡РµРЅРёСЏ, РЅР°С…РѕРґРёРІС€РёРµСЃСЏ РґРѕ СЌС‚РѕРіРѕ РІ РіСЂР°С„Рµ СЂРµР·СѓР»СЊС‚Р°С‚РѕРІ
    	resetter();
    	// РЎРѕР·РґР°РЅРёСЏ С‡РёСЃР»РѕРІРѕРіРѕ С„РѕСЂРјР°С‚Р° РґР»СЏ РІС‹РІРѕРґРёРјС‹С… РґР°РЅРЅС‹С…
		DecimalFormat format = new DecimalFormat("0.##");
		// РћР±СЉСЏРІР»РµРЅРёРµ РїРµСЂРµРјРµРЅРЅС‹С…, РІ РєРѕС‚РѕСЂС‹Рµ Р±СѓРґРµС‚ Р·Р°РїРёСЃС‹РІР°С‚СЊ СЂРµР·СѓР»СЊС‚Р°С‚ (С‚СЂРµР±СѓРµС‚СЃСЏ РґР»СЏ СЂР°СЃС‡РµС‚Р° РёС‚РѕРіРѕРІРѕР№ СЃСѓРјРјС‹)
		double result1;
		double result2;
		double result3;
		double result4;
		double result5;
		double result6;
		double result7;
		double result8;
		
		/* РЎС‡РёС‚С‹РІР°РЅРёРµ РґР°РЅРЅС‹С… РёР· С‚РµРєСЃС‚РѕРІС‹С… РїРѕР»РµР№. РњРµС‚РѕРґ fixDouble(String) РёСЃРїСЂР°РІР»СЏРµС‚ РІ РїРѕР»СѓС‡РµРЅРЅС‹С…
		 * Р·РЅР°С‡РµРЅРёСЏС… Р·Р°РїСЏС‚С‹Рµ РЅР° С‚РѕС‡РєРё РґР»СЏ РїРѕСЃР»РµРґСѓСЋС‰РµРіРѕ РєРѕСЂСЂРµРєС‚РЅРѕРіРѕ РїРµСЂРµРІРѕРґР° РґР°РЅРЅС‹С… РІ С„РѕСЂРјР°С‚ double.
		 * РњРµС‚РѕРґ Double.parseDouble(String) РїСЂРѕРёР·РІРѕРґРёС‚ РЅРµРїРѕСЃСЂРµРґСЃС‚РІРµРЅРЅРѕ СЃР°Рј РїРµСЂРµРІРѕРґ РёР· СЃС‚СЂРѕРєРё РІ С„РѕСЂРјР°С‚ doouble.
		 * Р�СЃРєР»СЋС‡РµРЅРёРµРј СЏРІР»СЏРµС‚СЃСЏ СЃС‡РёС‚С‹РІР°РЅРёРµ СЃ РїРѕР»СЏ t2, РіРґРµ РµРґРёРЅСЃС‚РІРµРЅРЅС‹Рј РІРѕР·РјРѕР¶РЅС‹Рј Р·РЅР°С‡РµРЅРёРµРј РјРѕР¶РµС‚ Р±С‹С‚СЊ С†РµР»РѕРµ С‡РёСЃР»Рѕ,
		 * РґР»СЏ РЅРµРіРѕ РїРµСЂРµРІРѕРґ РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ СЃСЂР°Р·Сѓ РїСЂРё РїРѕРјРѕС‰Рё РјРµС‚РѕРґР° Integer.parseInt(String)
		 */
		double ts1 = Double.parseDouble(fixDouble(t1.getText()));
		int ts2 = Integer.parseInt(t2.getText());
		double ts3 = Double.parseDouble(fixDouble(t3.getText()));
		double ts4 = Double.parseDouble(fixDouble(t4.getText()));
		double ts5 = Double.parseDouble(fixDouble(t5.getText()));
		double ts6 = Double.parseDouble(fixDouble(t6.getText()));
		double ts7 = Double.parseDouble(fixDouble(t7.getText()));
		double ts8 = Double.parseDouble(fixDouble(t8.getText()));
		double ts9 = Double.parseDouble(fixDouble(t9.getText()));
		double ts10 = Double.parseDouble(fixDouble(t10.getText()));
		double ts12 = Double.parseDouble(fixDouble(t12.getText()));
		double ts14 = Double.parseDouble(fixDouble(t14.getText()));
		double ts15 = Double.parseDouble(fixDouble(t15.getText()));
		double ts16 = Double.parseDouble(fixDouble(t16.getText()));
		
    	/*	Р Р°СЃС‡РµС‚ Рё Р·Р°РїРёСЃСЊ СЂРµР·СѓР»СЊС‚Р°С‚РѕРІ СЂР°СЃС‡РµС‚Р° РёРЅРґРёРІРёРґСѓР°Р»СЊРЅРѕРіРѕ РїРѕРєР°Р·Р°РЅРёСЏ С…РѕР»РѕРґРЅРѕР№ РІРѕРґС‹ (РјРµС‚РѕРґ cold_water()),
    	 *  РіРѕСЂСЏС‡РµР№ РІРѕРґС‹ (РјРµС‚РѕРґ hot_water()), РІРѕРґРѕРѕС‚РІРµРґРµРЅРёСЏ (РјРµС‚РѕРґ vodootvod()), РіР°Р·РѕСЃРЅР°Р±Р¶РµРЅРёСЏ (РјРµС‚РѕРґ gaz()).
    	 *  Р Р°СЃС‡РµС‚ РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ Р»РёС€СЊ РІ С‚РѕРј СЃР»СѓС‡Р°Рµ, РµСЃР»Рё РїРѕР»СЊР·РѕРІР°С‚РµР»РµРј Р±С‹Р»Рѕ РІРІРµРґРµРЅРѕ РјРёРЅРёРјР°Р»СЊРЅРѕРµ РєРѕР»РёС‡РµСЃС‚РІРѕ РґР°РЅРЅС‹С…,
    	 *  С‚СЂРµР±СѓРµРјС‹С… РґР»СЏ СЂР°СЃС‡РµС‚Р°. Р’ РїСЂРѕС‚РёРІРЅРѕРј СЃР»СѓС‡Р°Рµ СЂР°СЃС‡РµС‚ РїСЂРѕРёР·РІРµРґРµРЅ РЅРµ Р±СѓРґРµС‚.
    	 */
		if (ts2 != 0) {
    		res1.setText(s.cold_water(ts2));
    		res3.setText(s.hot_water(ts2));
    		res5.setText(s.vodootvod(ts2));
    		res8.setText(s.gaz(ts2));
    	}
		/*	Р Р°СЃС‡РµС‚ Рё Р·Р°РїРёСЃСЊ СЂРµР·СѓР»СЊС‚Р°С‚Р° СЂР°СЃС‡РµС‚Р° РІ РјРµС‚РєРё РѕР±С‰РµРґРѕРјРѕРІРѕРіРѕ РїРѕРєР°Р·Р°РЅРёСЏ С…РѕР»РѕРґРЅРѕР№ РІРѕРґС‹ (РјРµС‚РѕРґ cold_water_mutual()).
    	 *  Р Р°СЃС‡РµС‚ РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ Р»РёС€СЊ РІ С‚РѕРј СЃР»СѓС‡Р°Рµ, РµСЃР»Рё РїРѕР»СЊР·РѕРІР°С‚РµР»РµРј Р±С‹Р»Рѕ РІРІРµРґРµРЅРѕ РјРёРЅРёРјР°Р»СЊРЅРѕРµ РєРѕР»РёС‡РµСЃС‚РІРѕ РґР°РЅРЅС‹С…,
    	 *  С‚СЂРµР±СѓРµРјС‹С… РґР»СЏ СЂР°СЃС‡РµС‚Р°. Р’ РїСЂРѕС‚РёРІРЅРѕРј СЃР»СѓС‡Р°Рµ СЂР°СЃС‡РµС‚ РїСЂРѕРёР·РІРµРґРµРЅ РЅРµ Р±СѓРґРµС‚.
    	 */
    	if (ts14 != 0 || ts5 != 0 || ts6 != 0 || ts3 != 0 || ts1 != 0) {
        	res2.setText(s.cold_water_mutual(ts14,ts6,ts5,ts3,ts1));
        }
    	/*	Р Р°СЃС‡РµС‚ Рё Р·Р°РїРёСЃСЊ СЂРµР·СѓР»СЊС‚Р°С‚Р° СЂР°СЃС‡РµС‚Р° РІ РјРµС‚РєРё РѕР±С‰РµРґРѕРјРѕРІРѕРіРѕ РїРѕРєР°Р·Р°РЅРёСЏ РіРѕСЂСЏС‡РµР№ РІРѕРґС‹ (РјРµС‚РѕРґ hot_water_mutual()).
    	 *  Р Р°СЃС‡РµС‚ РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ Р»РёС€СЊ РІ С‚РѕРј СЃР»СѓС‡Р°Рµ, РµСЃР»Рё РїРѕР»СЊР·РѕРІР°С‚РµР»РµРј Р±С‹Р»Рѕ РІРІРµРґРµРЅРѕ РјРёРЅРёРјР°Р»СЊРЅРѕРµ РєРѕР»РёС‡РµСЃС‚РІРѕ РґР°РЅРЅС‹С…,
    	 *  С‚СЂРµР±СѓРµРјС‹С… РґР»СЏ СЂР°СЃС‡РµС‚Р°. Р’ РїСЂРѕС‚РёРІРЅРѕРј СЃР»СѓС‡Р°Рµ СЂР°СЃС‡РµС‚ РїСЂРѕРёР·РІРµРґРµРЅ РЅРµ Р±СѓРґРµС‚.
    	 */
    	if (ts15 != 0 || ts16 != 0 || ts8 != 0 || ts7 != 0 || ts3 != 0 || ts1 != 0) {
    		res4.setText(s.hot_water_mutual(ts15,ts16,ts8,ts7,ts3,ts1));
    	}
    	/*	Р Р°СЃС‡РµС‚ Рё Р·Р°РїРёСЃСЊ СЂРµР·СѓР»СЊС‚Р°С‚Р° СЂР°СЃС‡РµС‚Р° РІ РјРµС‚РєРё РїРѕРєР°Р·Р°РЅРёР№ РѕС‚РѕРїР»РµРЅРёСЏ (РјРµС‚РѕРґ otoplenie()).
    	 *  Р Р°СЃС‡РµС‚ РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ Р»РёС€СЊ РІ С‚РѕРј СЃР»СѓС‡Р°Рµ, РµСЃР»Рё РїРѕР»СЊР·РѕРІР°С‚РµР»РµРј Р±С‹Р»Рѕ РІРІРµРґРµРЅРѕ РјРёРЅРёРјР°Р»СЊРЅРѕРµ РєРѕР»РёС‡РµСЃС‚РІРѕ РґР°РЅРЅС‹С…,
    	 *  С‚СЂРµР±СѓРµРјС‹С… РґР»СЏ СЂР°СЃС‡РµС‚Р°. Р’ РїСЂРѕС‚РёРІРЅРѕРј СЃР»СѓС‡Р°Рµ СЂР°СЃС‡РµС‚ РїСЂРѕРёР·РІРµРґРµРЅ РЅРµ Р±СѓРґРµС‚.
    	 */
    	if (ts12 != 0 || ts3 != 0 || ts1 != 0) {
    		res6.setText(s.otoplenie(ts12, ts3, ts1));
    	}
    	/*	Р Р°СЃС‡РµС‚ Рё Р·Р°РїРёСЃСЊ СЂРµР·СѓР»СЊС‚Р°С‚Р° СЂР°СЃС‡РµС‚Р° РІ РјРµС‚РєРё СЌР»РµРєС‚СЂРѕСЌРЅРµСЂРіРёРё (РјРµС‚РѕРґ electro()).
    	 *  Р Р°СЃС‡РµС‚ РїСЂРѕРёР·РІРѕРґРёС‚СЃСЏ Р»РёС€СЊ РІ С‚РѕРј СЃР»СѓС‡Р°Рµ, РµСЃР»Рё РїРѕР»СЊР·РѕРІР°С‚РµР»РµРј Р±С‹Р»Рѕ РІРІРµРґРµРЅРѕ РјРёРЅРёРјР°Р»СЊРЅРѕРµ РєРѕР»РёС‡РµСЃС‚РІРѕ РґР°РЅРЅС‹С…,
    	 *  С‚СЂРµР±СѓРµРјС‹С… РґР»СЏ СЂР°СЃС‡РµС‚Р°. Р’ РїСЂРѕС‚РёРІРЅРѕРј СЃР»СѓС‡Р°Рµ СЂР°СЃС‡РµС‚ РїСЂРѕРёР·РІРµРґРµРЅ РЅРµ Р±СѓРґРµС‚.
    	 */
    	if (ts9 != 0 || ts10 != 0 || ts3 != 0 || ts1 != 0) {
    		res7.setText(s.electro(ts9, ts10, ts3, ts1));
    	}
    	
    	/*	Р’ СЃР»РµРґСѓСЋС‰РµРј С„СЂР°РіРјРµРЅС‚Рµ РєРѕРґР° РїСЂРѕРёСЃС…РѕРґРёС‚ СЃС‡РёС‚С‹РІР°РЅРёРµ РіРѕС‚РѕРІС‹С… СЂРµР·СѓР»СЊС‚Р°С‚РѕРІ СЂР°СЃС‡РµС‚Р° РґР»СЏ РёС… СЃСѓРјРјРёСЂРѕРІР°РЅРёСЏ,
    	 *  РїСЂРѕРІРµСЂСЏРµС‚СЃСЏ РЅР°Р»РёС‡РёРµ РІ РјРµС‚РєРµ Р·РЅР°С‡РµРЅРёСЏ, РІ СЃР»СѓС‡Р°Рµ РµРіРѕ РѕС‚СЃСѓС‚СЃС‚РІРёСЏ РІ РїРµСЂРµРјРµРЅРЅСѓСЋ Р·Р°РїРёСЃС‹РІР°РµС‚СЃСЏ РЅРѕР»СЊ.
    	 */
		if (res1.getText() != "") {
			result1 = Double.parseDouble(fixDouble(res1.getText()));
		}
		else {
			result1 = 0;
		}
		if (res2.getText() != "") {
			result2 = Double.parseDouble(fixDouble(res2.getText()));
		}
		else {
			result2 = 0;
		}
		if (res3.getText() != "") {
			result3 = Double.parseDouble(fixDouble(res3.getText()));
		}
		else {
			result3 = 0;
		}
		if (res4.getText() != "") {
			result4 = Double.parseDouble(fixDouble(res4.getText()));
		}
		else {
			 result4 = 0;
		}
		if (res5.getText() != "") {
			 result5 = Double.parseDouble(fixDouble(res5.getText()));
		}
		else {
			 result5 = 0;
		}
		if (res6.getText() != "") {
			 result6 = Double.parseDouble(fixDouble(res6.getText()));
		}
		else {
			 result6 = 0;
		}
		if (res7.getText() != "") {
			 result7 = Double.parseDouble(fixDouble(res7.getText()));
		}
		else {
			 result7 = 0;
		}
		if (res8.getText() != "") {
			 result8 = Double.parseDouble(fixDouble(res8.getText()));
		}
		else {
			 result8 = 0;
		}
		
		// РЎСѓРјРјРёСЂРѕРІР°РЅРёРµ РІСЃРµС… РїСЂРѕРІРµРґРµРЅРЅС‹С… СЂР°СЃС‡РµС‚РѕРІ Рё РІС‹РІРѕРґ РёС… РїРѕР»СЊР·РѕРІР°С‚РµР»СЋ
    	res9.setText(s.sum(result1, result2, result3, result4, result5, result6, result7, result8));
    }
    	// РћР±СЂР°Р±РѕС‚РєР° РЅР°Р¶Р°С‚РёСЏ РєРЅРѕРїРєРё РѕС‡РёСЃС‚РєРё СЂРµР·СѓР»СЊС‚Р°С‚РѕРІ СЂР°СЃС‡РµС‚Р°
    	else if(e.getSource() == Cancel1)
        {
    		// Р’С‹Р·С‹РІР°РµС‚СЃСЏ РјРµС‚РѕРґ, РѕС‡РёС‰Р°СЋС‰РёР№ Р·РЅР°С‡РµРЅРёСЏ РІ РјРµС‚РєР°С…
    		resetter();
        }
    	// РћР±СЂР°Р±РѕС‚РєР° РЅР°Р¶Р°С‚РёСЏ РєРЅРѕРїРєРё РѕС‡РёСЃС‚РєРё РІРІРѕРґРёРјС‹С… РґР°РЅРЅС‹С…
    	else if(e.getSource() == Cancel2) {
    		// Р’С‹Р·С‹РІР°РµС‚СЃСЏ РјРµС‚РѕРґ, РѕС‡РёС‰Р°СЋС‰РёР№ Р·РЅР°С‡РµРЅРёСЏ РІРІРµРґРЅРЅС‹С… РїРѕР»СЊР·РѕРІР°С‚РµР»РµРј РґР°РЅРЅС‹С…
    		another_resetter();
    	}
    }
    
    /* РњРµС‚РѕРґ, РїРѕР·РІРѕР»СЏСЋС‰РёР№ СЃРѕР·РґР°С‚СЊ С„РѕСЂРјР°С‚ СЃС‚РєСЂРѕРєРё, РёСЃРїРѕР»СЊР·СѓРµС‚СЃСЏ РґР»СЏ Р·Р°РґР°РЅРёСЏ С„РѕСЂРјР°С‚Р°
    *  С†РµР»РѕРіРѕ С‡РёСЃР»Р° РІ РѕРґРЅРѕРј РёР· С‚РµРєСЃС‚РѕРІС‹С… РїРѕР»РµР№ (t2)
    */
    MaskFormatter createFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s); 
        } catch (java.text.ParseException exc) {
            System.exit(0);
        }
        return formatter;
    }
    
    // РњРµС‚РѕРґ, РѕС‡РёС‰Р°СЋС‰РёР№ Р·РЅР°С‡РµРЅРёСЏ РІ РјРµС‚РєР°С…, СЃРѕРґРµСЂР¶Р°С‰РёС… СЂРµР·СѓР»СЊС‚Р°С‚С‹ РІС‹С‡РёСЃР»РµРЅРёСЏ
    public void resetter() {
		res1.setText("");
		res2.setText("");
		res3.setText("");
		res4.setText("");
		res5.setText("");
		res6.setText("");
		res7.setText("");
		res8.setText("");
		res9.setText("");
    }
    
    // РњРµС‚РѕРґ, РѕС‡РёС‰Р°СЋС‰РёР№ Р·РЅР°С‡РµРЅРёСЏ РІ С‚РµРєСЃС‚РѕРІС‹С… РїРѕР»СЏС…
    public void another_resetter() {
    	t1.setValue(0);
        t2.setValue(0);
        t3.setValue(0);
        t4.setValue(0);
        t5.setValue(0);
        t6.setValue(0);
        t7.setValue(0);
        t8.setValue(0);
        t9.setValue(0);
        t10.setValue(0);
        t12.setValue(0);
        t14.setValue(0);
        t15.setValue(0);
        t16.setValue(0);
    }
    
    /* РњРµС‚РѕРґ, РёР·РјРµРЅСЏСЋС‰РёР№ РІСЃРµ Р·Р°РїСЏС‚С‹Рµ РІ СЃС‚СЂРѕРєРµ РЅР° С‚РѕС‡РєРё, РёСЃРїРѕР»СЊР·СѓРµС‚СЃСЏ РґР»СЏ РїСЂР°РІРёР»СЊРЅРѕРіРѕ
     * РєРѕРЅРІРµСЂС‚РёСЂРѕРІР°РЅРёСЏ СЃС‚СЂРѕРєРё РІ С„РѕСЂРјР°С‚ double
     */
    public String fixDouble(String s) {
    	s = s.replaceAll(",", ".");
    	return s;
    }
}