package mapka;

//import java.util.Collection;
import java.util.Scanner;

import fields.*;

public class Map {
	public int height;
	public int width;
	public Field[][] grid;
	
	public Map(int x, int y) {
		this.height = x;
		this.width = y;
	}
	//nie bardzo działa teraz:
	public void tellSize() {
		System.out.println("Jestem mapą " + height + "x" + width + ". Mam razem: " + height * width + " pól");
	}
	//do poprawy:
	public static Map newMap() {
		try (Scanner usr_in = new Scanner(System.in)) {
			System.out.println("Siema, podaj rozmiar mapy!");
			System.out.println("Wysokość: ");
			int x = usr_in.nextInt();
			System.out.println("Szerokość: ");
			int y = usr_in.nextInt();
			Map mapunia = new Map(x, y);
			return mapunia;
		}
	}

	public void newGrid(int x, int y) {
		this.height = x;
		this.width = y;
		Field[][] array = new Field[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (i == 0 || j == 0 || i == (height - 1) || j == (width - 1))
					array[i][j] = new WallF();
				else
					array[i][j] = new EmptyF();
			}
		}
		this.grid = array;
	}

	public void drawMap() {
		int i = 0, j = 0;
		while (i < height) {
			while (j < width) {
				grid[i][j].draw(); //jako że Field jest interfacem, mam dostęp do draw() 
				System.out.print("");
				j++;
			}
			j = 0;
			System.out.println();
			i++;
		}

	}
}