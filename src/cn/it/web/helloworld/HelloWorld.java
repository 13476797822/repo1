package cn.it.web.helloworld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/helloworld")
public class HelloWorld {

	@RequestMapping("/getName")
	public String getName() {
		
		System.out.println("你好,做修改");
		System.out.println("111");
		System.out.println("012");
		System.out.println("123");
		System.out.println("234");
		System.out.println("345");
		
		
		
		
		xscds
//		int i=1/0;
		System.out.println("456");
		System.out.println("567");
		System.out.println("678");
		System.out.println("789");
		return "itheima";
	}
}
