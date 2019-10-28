package P7;

public class Demo5_Phones {
	public static void main(String[] args) {
		Phones p1=new Phones();
		p1.setBrand("大牌");
		p1.setPrice(50);
		System.out.println("牌子是："+p1.getBrand()+",价格是:"+p1.getPrice());
		
		Phones p2=new Phones("红辣椒",30);
		p2.show();
	}
}

class Phones{
	private String brand;
	private int price;
	
	public Phones() {}
	
	public Phones(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void show() {
		System.out.println("手机型号是:" + brand + ",价格是："+price);
	}
}
