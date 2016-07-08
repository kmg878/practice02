package prob2;

public class Goods {
	private String name;
	private int number;
	private int count;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Goods(String name,int number,int count){
		this.name=name;
		this.number=number;
		this.count=count;
	}
	public void show() {
		System.out.println(name+"(가격  :"+number+")이 "+count+"입고되었습니다" ); 
	}
	
	
}
