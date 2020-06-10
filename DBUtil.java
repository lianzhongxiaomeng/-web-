package com.dudu.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dudu.model.Goods;
import com.dudu.model.User;

public class DBUtil {

	public static Map<String, User> userMap = new HashMap<String, User>(); 
	public static List<Goods> goodList = new ArrayList<Goods>();
	
	static {
		addUser(new User("��ڣ����","123",15,"��",true));
		addUser(new User("kukua","123",13,"Ů",true));
		
		goodList.add(new Goods("�㽶","�������㽶",100,400));
		goodList.add(new Goods("ƻ��","�ó�",200,500));
		goodList.add(new Goods("������","�ܺó�",50,200));
		goodList.add(new Goods("����","�ǳ��ó�",60,150));
		goodList.add(new Goods("����","�ܴ�",90,200));
		goodList.add(new Goods("����","�ǳ���",150,300));
		goodList.add(new Goods("���","����",200,350));
		goodList.add(new Goods("����","�ܺÿ�",180,450));
	}
	
	private static void addUser(User user) {
		userMap.put(user.getUsername(), user);
	}
}
