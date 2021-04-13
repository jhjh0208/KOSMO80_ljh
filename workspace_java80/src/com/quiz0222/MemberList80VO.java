package com.quiz0222;

import com.google.gson.Gson;
import com.vo.Member80VO;

public class MemberList80VO {

	public static void main(String[] args) {
		Member80VO mvo = new Member80VO();
		mvo.setMem_id("apple");
		mvo.setMem_pw("123");
		mvo.setGender(true);
		Gson gson = new Gson();
		String imsi = gson.toJson(mvo);
		System.out.println(imsi);
	}

}
