package com.tuling.mall.feigndemo.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.swing.text.html.parser.Entity;
import java.io.Serializable;

/**
 * 
 * 
 * @author fox
 */
@Data
public class OrderVo  implements Serializable {


	private Integer userId;

	private String commodityCode;
	
	private Integer count;

	private Integer amount;
	
	
	
}
