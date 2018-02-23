package lab4;

import java.net.BindException;

import lab4.client.*;
import lab4.data.GomokuGameState;
import lab4.gui.GomokuGUI;

public class GomokuMain {

	public static void main(String[] args) {

		int port = 8000 + (int) (Math.random() * 100);
				
		GomokuClient client = new GomokuClient(port);
		new GomokuGUI(new GomokuGameState(client, port), client);
	}
}