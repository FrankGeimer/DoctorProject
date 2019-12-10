package com.wildcodeschool.myDoctorProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyDoctorProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDoctorProjectApplication.class, args);
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String index1() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String index2() {
		return "Patrick Troughton";
	}

	@RequestMapping("/doctor/10")
	@ResponseBody
	public String index3() {
		return "David Tennant";
	}

	@RequestMapping("/doctor/13")
	@ResponseBody
	public String index4() {
		return "Jodie Whittaker";
	}

	@RequestMapping("/")
	@ResponseBody
	public String index5() {
		return "<ul>"
				+ "<li><a href='/doctor/1'>Doktor1</a></li>"
				+ "<li><a href='/doctor/2'>Doktor2</a></li>"
				+ "<li><a href='/doctor/10'>Doktor10</a></li>"
				+ "<li><a href='/doctor/13'>Doktor13</a></li>"
				+ "</ul>";
		
	}
}
