package com.yaluzb.guns.modular.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 操作日志
 * </p>
 *
 * @author yaluzb
 * @since 2017-07-11
 */
@Data
@TableName("sys_operation_log")
public class OperationLog extends Model<OperationLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 日志类型
     */
	private String logtype;
    /**
     * 日志名称
     */
	private String logname;
    /**
     * 用户id
     */
	private Integer userid;
    /**
     * 类名称
     */
	private String classname;
    /**
     * 方法名称
     */
	private String method;
    /**
     * 创建时间
     */
	private Date createtime;
    /**
     * 是否成功
     */
	private String succeed;
    /**
     * 备注
     */
	private String message;

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "OperationLog{" +
			"id=" + id +
			", logtype=" + logtype +
			", logname=" + logname +
			", userid=" + userid +
			", classname=" + classname +
			", method=" + method +
			", createtime=" + createtime +
			", succeed=" + succeed +
			", message=" + message +
			"}";
	}
}
