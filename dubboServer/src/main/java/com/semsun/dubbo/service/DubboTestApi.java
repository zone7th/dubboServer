package com.semsun.dubbo.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.common.json.JSONObject;
import com.semsun.dubbo.interfaces.IDubboTestApi;

import priv.rlliu.dubbo.service.vo.RecVo;
import priv.rlliu.dubbo.service.vo.ReqVo;

@Service("dubboTestApi")
public class DubboTestApi implements IDubboTestApi {

	public RecVo test(ReqVo req) {
		
		try {
			System.out.println(JSON.json(req));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RecVo recVo =  new RecVo();
  		recVo.setIsSuccess("TRUE");
  		return recVo;
	}
}
