package com.semsun.dubbo.interfaces;

import priv.rlliu.dubbo.service.vo.RecVo;
import priv.rlliu.dubbo.service.vo.ReqVo;

/**
 * 
 * @Description:dubbo测试API 
 * @author Martin
 * @date 2019年1月3日 下午12:50:32
 */
public interface IDubboTestApi {
	
	RecVo test(ReqVo req);
}
