package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello3Controller {
	//{name}部は、URLﾊﾟｽから値を取り出す部分を指定するもの。{}で囲う。
	//「URIﾃﾝﾌﾟﾚｰﾄ変数」という。
	//この場合、URLﾊﾟｽを/hello3/Jackとすると、nameでJackが取り出せる。
	@GetMapping("/hello3/{name}")
	public String sayHello(@PathVariable("name") String name) {
		//@PathVariableは、URIテンプレート変数の値を、ﾒｿｯﾄﾞ引数にｾｯﾄできる。
		//GetMappingの"{}"部を、ﾒｿｯﾄﾞ変数にｾｯﾄする。
		//@PathVariableの名前は、URIﾃﾝﾌﾟﾚｰﾄ変数と一致させなければならない。
		return "Hello, World" + "こんにちは" + name + "さん";
	}
}
