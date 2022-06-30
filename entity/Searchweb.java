package com.searchweb.entity;

public class  Searchweb{

	 int id;
	 String name;
	 String content;
	 String weburl;
	 String value;
	 String home;
	 int hit;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWeburl() {
		return weburl;
	}
	public void setWeburl(String url) {
		this.weburl = url;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	public Searchweb() {
		
	}
	
	public Searchweb(int id, String name, String content, String weburl, String value, String home, int hit) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.weburl = weburl;
		this.value = value;
		this.home = home;
		this.hit = hit;
	}
	  
	 
	
	
	
	 
}


//package com.searchweb.entity;
//
//public class Searchweb {
//	
//	  
//	  private String weburl;
//	  private String name;
//	  private String value;
//	  private String home;
//	  
//	  
//	  public Searchweb() {
//		// TODO Auto-generated constructor stub
//	  }
//	  
//	  public Searchweb( String weburl, String name, String value, String home) {
//		
//		
//		this.weburl = weburl;
//		this.name = name;
//		this.value = value;
//		this.home = home;
//	}
//
//	public String getWeburl() {
//		return weburl;
//	}
//
//	public void setWeburl(String weburl) {
//		this.weburl = weburl;
//	}
//
//	
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	
//	
//	
//	public String getvalue() {
//		return value;
//	}
//
//	public void setvalue(String value) {
//		this.value = value;
//	}
//	
//	
//	
//	
//	
//	public String gethome() {
//		return home;
//	}
//
//	public void sethome(String home) {
//		this.home = home;
//	}
//
//	@Override
//	public String toString() {
//		return "Searchweb [weburl=" + weburl + ", name=" + name + "]";
//	} 
//	  
//
//	
//}