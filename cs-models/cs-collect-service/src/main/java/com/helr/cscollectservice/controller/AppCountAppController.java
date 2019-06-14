package com.helr.cscollectservice.controller;

import com.helr.common.result.ResultData;
import com.helr.common.result.ResultFactory;
import com.helr.cscollectservice.config.RabbitMqConfig;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * 应用启动/退出统计数据APP接口
 * @author wanglan
 * @date 2017年12月4日 --- 上午10:44:46
 *
 */

@RestController
@RequestMapping("/app/appCount")
public class AppCountAppController {

	@Value("${server.port}")
	private String port;

	@Autowired
	private AmqpTemplate amqpTemplate;

	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 新增应用启动/退出数据
	 * @return
	 */
	@RequestMapping(value="/add", method= RequestMethod.POST)
	public ResultData add(String param){
		return ResultFactory.getSuccessResult("add success port:" + port);
	}

	/**
	 * 新增应用启动/退出数据
	 * @return
	 */
	@RequestMapping(value="/rabbit", method= RequestMethod.POST)
	public ResultData rabbit(String msg){
		amqpTemplate.convertAndSend(RabbitMqConfig.DIRECT_EXCHANGE,
				RabbitMqConfig.VISIT_MSG2,
				msg);
		return ResultFactory.getSuccessResult("add rabbit port:" + port);
	}
}