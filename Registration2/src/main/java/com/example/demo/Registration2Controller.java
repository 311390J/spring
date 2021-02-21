package com.example.demo;

import java.util.Arrays;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Registration2Controller {
	@PostMapping("/register")
	public ModelAndView register(@ModelAttribute RegistData registData,
									ModelAndView mv) {//ﾊﾝﾄﾞﾗｰﾒｿｯﾄﾞ
		StringBuilder sb = new StringBuilder();
		sb.append("名前：" + registData.getName());
		sb.append("、パスワード：" + registData.getPassword());
		sb.append("、性別：" + registData.getGender());
		sb.append("、地域：" + registData.getArea());
		sb.append("、興味のある分野：" + Arrays.toString(registData.getInterest()));
		sb.append("、備考：" + registData.getRemarks().replaceAll("\n", ""));
		
		mv.setViewName("result");
		mv.addObject("registData", sb.toString());
		
		return mv;
	}
}
//input.htmlからのフォーム送信は、actionタグで指定されたパスへ送信される。
//今回の場合は、actionとPostMapping共に　「/register」　になっている。
//registerﾒｿｯﾄﾞの引数「@ModelAttribute」のRegistDateは、フォームからの内容を保持している。
//これは、ﾌｫｰﾑｸﾗｽと呼ばれる。ﾌｫｰﾑからのﾃﾞｰﾀを保持するためのｸﾗｽで、Lombokを依存関係とし、@Dataで指定できる。

//registerﾒｿｯﾄﾞでは、引数のRegistDataから、格納されているﾌｫｰﾑからの情報を取得している。
//ﾌｫｰﾑｸﾗｽなしでは、引数に@RequestParamでひとつずつﾌｫｰﾑのﾃﾞｰﾀを指定しなければならなくなる。

//このｸﾗｽでは、ﾌｫｰﾑｸﾗｽからのﾃﾞｰﾀを、getter/setterﾒｿｯﾄﾞでStringBuilderに格納して
//registDataという名前に、StringBuilderの文字列表現を紐づけて、ModelAndViewのｵﾌﾞｼﾞｪｸﾄに格納している。