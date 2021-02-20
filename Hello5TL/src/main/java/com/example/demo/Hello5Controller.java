package com.example.demo;
//!!!実行時、「http://localhost:8080/hello5?name=任意の名前」で実行!!!
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//@RestControllerはテキスト用のもので、

//Thymeleafが処理したﾃﾝﾌﾟﾚｰﾄ（HTML）を返す場合は
//@Controllerを記述する
@Controller
public class Hello5Controller {
	@GetMapping("/hello5")
	public ModelAndView sayHello(@RequestParam("name") String name,
									ModelAndView mv) {
		mv.setViewName("hello");
		mv.addObject("name", name);
		return mv;
		
	}

}
//ModelAndViewオブジェクトは、名前のとおり「モデル」と「ビュー」を保持するクラス
//ビュー名：次に表示する画面の名前を設定　　　モデル：ビュー（画面）で使用するデータ

//ビュー名はModelAndViewの、setViewNameメソッドで設定する。
//Thymeleafは設定されたビュー名に拡張子".html"を追加したファイルをsrc/main/resource/templatesから探し出す。
//上記の記述の場合、次に表示させる画面として「hello.html」を指定したことになる。

//addObjectは、ビューが使うデータを渡す。第2引数がﾋﾞｭｰに渡すﾃﾞｰﾀ（ｵﾌﾞｼﾞｪｸﾄ）
//第1引数は、その名前。hello.htmlに記述したth:text="${name}"のnameに対応するのは、第1引数のほう。