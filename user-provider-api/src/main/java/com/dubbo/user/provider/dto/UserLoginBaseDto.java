package com.dubbo.user.provider.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>Title:	  dubbo-api <br/> </p>
 * <p>Description TODO <br/> </p>
 * <p>Company:    http://www.hnxianyi.com  <br/> </p>
 *
 * @Author <a href="liqiaolin333@163.com"/>李巧林</a>  <br/>
 * @Date 2018/7/24 18:29
 */
@Data
public class UserLoginBaseDto implements Serializable {
    private static final long serialVersionUID = 3640880551245098175L;

    private String userName;
    private String passWord;
}
