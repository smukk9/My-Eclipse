package me.Sandeep.sping;

public class Catagories {

	private String cat_name;
	private Book bk;
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public Book getBk() {
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
	public void show(){
		
		System.out.println("Book_catgories:"+ getCat_name());
		System.out.println("book name"+ bk.getBookname() +"\n"+ "price"+bk.getPrice());
	}
}
