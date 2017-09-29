package test.json;

import java.util.ArrayList;

import org.json.JSONArray;

import model.MemberVO;

public class TestJSONArray {
	public static void main(String[] args) {
		JSONArray json = new JSONArray();
		json.put("백반");
		json.put("돈까스");
		json.put("짜장면");
		System.out.println(json.toString());
		System.out.println("******************");
		//
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(new MemberVO("java", "광유", "수원"));
		list.add(new MemberVO("jquery", "아이유", "종로"));
		list.add(new MemberVO("jdbc", "공유", "일산"));
	}
}
