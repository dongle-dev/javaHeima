package P7;

public class Demo5_Phones {
	public static void main(String[] args) {
		Phones p1=new Phones();
		p1.setBrand("����");
		p1.setPrice(50);
		System.out.println("�����ǣ�"+p1.getBrand()+",�۸���:"+p1.getPrice());
		
		Phones p2=new Phones("������",30);
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
		System.out.println("�ֻ��ͺ���:" + brand + ",�۸��ǣ�"+price);
	}
}
