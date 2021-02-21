package com.example.demo;

import lombok.Data;

@Data
public class RegistData {
	private String name;
	private String password;
	private int gender;
	private int area;
	private int[] interest;
	private String remarks;
}
//@ModelAttributeを付与すると(Controllerｸﾗｽ)、ﾌｫｰﾑ部品のname属性値と
//ﾌｫｰﾑｸﾗｽのﾌﾟﾛﾊﾟﾃｨ名をｷｰにして、ﾌｫｰﾑ部品の値が　「ﾌｫｰﾑｵﾌﾞｼﾞｪｸﾄ(本ｸﾗｽ）」　にﾊﾞｲﾝﾄﾞされる。

//こうすると、ﾌｫｰﾑ部品ごとの引数を並べる必要がないので、ｼﾝﾌﾟﾙに記述できる。