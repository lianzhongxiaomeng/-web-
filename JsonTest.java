package com.dudu.util;

import com.alibaba.fastjson.JSON;
import com.dudu.model.Goods;

public class JsonTest {
	public static void main(String[] args) {
//		Goods goods = new Goods("�㽶","�������㽶",100,400);
//		String jsonString = JSON.toJSONString(goods);
//		System.out.println(jsonString);
		
		String s  = "{\"des\":\"�������㽶\",\"inventory\":400,\"name\":\"�㽶\",\"price\":100}";
		Goods parseObject = JSON.parseObject(s, Goods.class);
		System.out.println(parseObject);
	}
}
