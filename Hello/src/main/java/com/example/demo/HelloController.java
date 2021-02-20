package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestControllerのとは↓
//ｺﾝﾄﾛｰﾗｰｸﾗｽのﾒｿｯﾄﾞでの処理結果を、そのままﾌﾞﾗｳｻﾞへﾚｽﾎﾟﾝｽ
@RestController
public class HelloController {
	//@GetMappingとは↓
	//Getﾘｸｴｽﾄに対応するﾒｿｯﾄﾞを指定する
	//引数にはURLのﾊﾟｽ名を記述。Getﾘｸｴｽﾄで/helloが送られると
	//直後のsayHello()が自動的に呼び出されるようにしてくれる。
	@GetMapping("/hello")
	public String sayHello() {
		return "こんにちは";
	}

}
