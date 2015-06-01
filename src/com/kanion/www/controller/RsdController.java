package com.kanion.www.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.kanion.www.model.RsdExtraction;

/**
 * 
 * @author zhangsi
 *
 */

@Controller
@RequestMapping("rsd")
public class RsdController {
	
	//获取中间体
	@RequestMapping("/rsdExtraction")
	@ResponseBody
	public String rsdExtraction(HttpServletRequest request,HttpServletResponse response){
		String pihao[]={"Z131101","Z131102","Z131103","Z131104","Z131105","Z131106",
				"Z131107","Z131108","Z131109","Z131110","Z131111","Z131112","Z131113",
				"Z131114","Z131115","Z131116","Z131117","Z131118","Z131119","Z131120",
				"Z131121","Z131122","Z131123","Z131124","Z131125"};
		double value []= {478,490,473,490,480,490,480,485,475,480,470,484,489,499,483,
				490,480,470,485,490,477,480,472,480,490};
		JSONArray jsonArray = new JSONArray();
		for(int i = 0;i < 25;i++) {
			RsdExtraction rsdExtraction = new RsdExtraction();
			rsdExtraction.setPinming("金青");
			rsdExtraction.setZhongjianti("金青回收浸膏重量(Kg)");
			rsdExtraction.setPihao(pihao[i]);
			rsdExtraction.setPihaoValue(value[i]);
			jsonArray.add(rsdExtraction);
		}
		return jsonArray.toString();
	}
}