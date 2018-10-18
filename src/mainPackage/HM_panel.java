
package mainPackage;

import java.awt.*;
import javax.swing.*;



public class HM_panel extends JPanel{
    
    private final Color colorFondo = new Color(46,117,182);
    private JPanel laminaSuperior, laminaMedio, laminaInferior;
    private JButton upCount, dwCount, rstCount;
    private JTextField dspMoney;
    private JLabel dspCount;
    private int count, money;
    private String stringCount, stringMoney;
    
    public HM_panel(){
        
        setLayout(new BorderLayout());
      
        
        laminaSuperior = new JPanel();
        laminaMedio = new JPanel();
        laminaInferior = new JPanel();
        
        laminaSuperior.setBackground(Color.white);
        laminaMedio.setBackground(Color.white);
        laminaInferior.setBackground(Color.white);
        
        laminaMedio.setLayout(new BorderLayout());
        laminaInferior.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        add(laminaSuperior,BorderLayout.NORTH);
        add(laminaMedio, BorderLayout.CENTER);
        add(laminaInferior, BorderLayout.SOUTH);
        
        count = 0;
       
        money = 0;
        
        
        iniComponents();
        
        
    }
    
    private void iniComponents(){
        
        upCount = new JButton("+");
        dwCount = new JButton("-");
        rstCount = new JButton("Rst");
        
        laminaSuperior.add(upCount);
        laminaSuperior.add(dwCount);
        laminaSuperior.add(rstCount);
        
        dspCount = new JLabel(Integer.toString(count));
        dspCount.setFont(new Font("Arial", Font.PLAIN, 200));
        dspCount.setHorizontalAlignment(SwingConstants.CENTER);
       
        
        laminaMedio.add(dspCount,BorderLayout.CENTER);
        
        JLabel labelMoney = new JLabel("Money: ");
        
        laminaInferior.add(labelMoney);
        dspMoney = new JTextField(Integer.toString(money)+"$", 10);
        dspMoney.setFont(new Font("Arial",Font.PLAIN,14));
        dspMoney.setHorizontalAlignment(SwingConstants.RIGHT);
        laminaInferior.add(dspMoney);
    }
    
    
    public void countUP(){
        
        count++;
        dspCount.setText(Integer.toString(count));
        
    }
    
}
