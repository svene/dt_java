package ${packagename};

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			public void run() {
				JFrame frame = new ApplicationFrame().newComponent();

			}
		};
		EventQueue.invokeLater(runnable);
	}
}
