package com.yaluzb.guns.modular.system.transfer;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * 编辑管理员的请求
 *
 * @author yaluzb
 * @Date 2017年1月15日 下午10:29:16
 */
@Data
public class ReqEditManager {

    @NotNull
    private String userId;

    /* 用户姓名 */
    @NotNull
    private String userName;

    private String userPassword;

    @NotNull
    @Length(min = 11, max = 11)
    private String userPhone;

}
