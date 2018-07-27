package com.dubbo.user.provider.service;

import com.dubbo.user.provider.dto.UserLoginRequestDto;
import com.dubbo.user.provider.dto.UserLoginResponseDto;

/**
 * <p>Title:	  dubbo-api <br/> </p>
 * <p>Description TODO <br/> </p>
 * <p>Company:    http://www.hnxianyi.com  <br/> </p>
 *
 * @Author <a href="liqiaolin333@163.com"/>李巧林</a>  <br/>
 * @Date 2018/7/24 18:29
 */
public interface UserLoginService {

    /**
     * 登陸
     *
     * @param requestDto 登陸所需的用戶名和密碼
     * @return 用戶信息
     */
    UserLoginResponseDto doLogin(UserLoginRequestDto requestDto);
}
