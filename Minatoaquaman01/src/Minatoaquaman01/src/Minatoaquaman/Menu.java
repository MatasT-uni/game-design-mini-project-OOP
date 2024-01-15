package Minatoaquaman;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Graphics2D;

public class Menu {
    public Rectangle playButton = new Rectangle(Model.WIDTH /2+120,150,100,50);

    public void render(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Font fnt0 = new Font("arial", Font.BOLD,50);
        g.setFont(fnt0);
        g.setColor(Color.white);
        g.drawString("SPACE GAME",Model.WIDTH / 2 ,100);

        Font ft1 = new Font("arial", Font.BOLD,30);
        g.setFont(ft1);
        g.drawString("Play",playButton.x+19,playButton.y+30);
        g2d.draw(playButton);

    
    }
}
