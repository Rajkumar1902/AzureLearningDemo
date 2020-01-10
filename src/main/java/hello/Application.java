package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	
	static void startup(){
		for(int i=0; i<1000; i++) {
			if(i%100 == 0) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("waiting for startup......");
			}
		}
		System.out.println("Application started");
	}
	
	@RequestMapping("/")
	public String home() {
	   return "Hello Docker World V4.0";
	}
	
	public static void main(String[] args) {
		Application.startup();
		SpringApplication.run(Application.class, args);
		
	}

}
