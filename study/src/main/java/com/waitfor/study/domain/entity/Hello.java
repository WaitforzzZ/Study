package com.waitfor.study.domain.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Hello
 *
 * @author zhouliang
 * @since 2021-2-7下午 1:46
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "hello")
public class Hello {

    @ApiModelProperty(value = "用户名",required=true,example = "zzz")
    private String username;

    @ApiModelProperty(value = "密码",required=true)
    private String password;
}
