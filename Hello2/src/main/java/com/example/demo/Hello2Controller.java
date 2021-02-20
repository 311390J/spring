package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//!!!URLは「http://localhost:8080/hello2?name=任意の名前」で実行!!!

@RestController
public class Hello2Controller {
	@GetMapping("/hello2")
	public String sayHello(@RequestParam("name") String name) {
		return "Hello, World" + "こんにちは" + name + "さん";
	}
	
}
//10行目の@RequestParamとは↓
//引数で指定されたﾊﾟﾗﾒｰﾀの値を、ﾒｿｯﾄﾞ実行時にﾘｸｴｽﾄﾊﾟﾗﾒｰﾀから取得し、
//ﾒｿｯﾄﾞ引数へｾｯﾄ（ﾊﾞｲﾝﾄﾞ）する。
//例：http://localhost:8080/hello2?name=Jack
//								　↕一致　　　　↘Jackがｾｯﾄされる
//		  sayHello(@RequestParam("name") String name)
//@RequestParamで欲しいﾊﾟﾗﾒｰﾀを指定して、任意の型で受け取る??