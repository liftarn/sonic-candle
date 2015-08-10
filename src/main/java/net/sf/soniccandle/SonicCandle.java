package net.sf.soniccandle;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.SwingUtilities;

import net.sf.soniccandle.ui.MainWindow;

public class SonicCandle {

	private static final GraphicsDevice gdScreen = GraphicsEnvironment.getLocalGraphicsEnvironment()
			.getDefaultScreenDevice();
	public static final int SCREEN_WIDTH = gdScreen.getDisplayMode().getWidth();
	public static final int SCREEN_HEIGHT = gdScreen.getDisplayMode().getHeight();

	public static void main(String[] args) {
		System.out.println("Initializing...");

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				initApplication();
			}
		});

	}

	private static void initApplication() {
		MainWindow mw = new MainWindow();
		mw.show();
	}

}
