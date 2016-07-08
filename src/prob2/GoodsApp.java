package prob2;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int COUNT_GOODS =3;
		
		Goods[] arrayGoods = new Goods[COUNT_GOODS];
		
		for(int i=0;i<COUNT_GOODS;i++){
			String[] info = scanner.nextLine().split(" ");
//			for(String s:info){
//				System.out.println(s);
//			}
			
			Goods goods = new Goods(info[0],Integer.parseInt(info[1]),Integer.parseInt(info[2]));
		
			arrayGoods[i]=goods;
			
		}
		for(int i=0;i<arrayGoods.length;i++){
			arrayGoods[i].show();
		}
		
	}

}
