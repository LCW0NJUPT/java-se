package d1804;

import java.util.ArrayList;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test1 {
	@Test
	public void a() throws Exception {
		// http://www.baidu.com
		String s = 
			Jsoup.connect("http://www.baidu.com") 
			     .execute()
			     .body();
		System.out.println(s);
	}
	
	@Test
	public void b() throws Exception {
		String s = 
		 Jsoup.connect("https://item.jd.com/44076405947.html")
		      .execute()
		      .body();
		System.out.println(s);
	} 
	
	@Test
	public void c() throws Exception {
		//树根
		Document doc = 
		  Jsoup.connect("https://item.jd.com/44076405947.html")
		       .get();
		Elements div = doc.select("div.sku-name");
		String s = div.text();
		System.out.println(s);
		
		String price = 
		  doc.select("span.price").text();
		System.out.println("价格："+price);
	}
	
	@Test
	public void d() throws Exception {
		String s = 
		Jsoup.connect("https://p.3.cn/prices/mgets?skuIds=44076405947")
		     .ignoreContentType(true)
			 .execute()
			 .body();
		
		System.out.println(s);
		
		// [{"cbf":"0","id":"J_44076405947","m":"10999.00","op":"6999.00","p":"6288.00"}]
		/*
		 * 把json格式字符串，解析处理成一个对象
		 * ArrayList<HashMap<String, String>>
		 * 
		 * jackson 开源工具包，json解析处理工具
		 */
		ObjectMapper m = new ObjectMapper();
		
		ArrayList<HashMap<String, String>> list =
		 m.readValue(s, ArrayList.class);   
		
		String p = list.get(0).get("p");
		System.out.println(p);
		     
	}
	
}







