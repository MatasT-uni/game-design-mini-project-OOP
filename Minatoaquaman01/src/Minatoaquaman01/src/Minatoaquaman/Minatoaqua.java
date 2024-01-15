package Minatoaquaman;

import javax.swing.*;

public class Minatoaqua extends JFrame {
		public Minatoaqua() {
			add(new Model());
		}
		
		
		public static void main(String[] args) {
			Minatoaqua aqua = new Minatoaqua();
			aqua.setVisible(true);
			aqua.setTitle("MinatoAquaman");
			aqua.setSize(380,420);
			aqua.setDefaultCloseOperation(EXIT_ON_CLOSE);
			aqua.setLocationRelativeTo(null);
		}
	}

           