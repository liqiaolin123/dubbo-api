package com.dubbo.user.provider.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * <p>Title:	  dubbo-api <br/> </p>
 * <p>Description TODO <br/> </p>
 * <p>Company:    http://www.hnxianyi.com  <br/> </p>
 *
 * @Author <a href="liqiaolin333@163.com"/>李巧林</a>  <br/>
 * @Date 2018/7/24 18:35
 */
@Data
public class UserLoginResponseDto extends UserLoginBaseDto implements Serializable {
    private static final long serialVersionUID = -141935927715742811L;

    private String realName;
    private String avatar;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserLoginResponseDto that = (UserLoginResponseDto) o;
        return Objects.equals(realName, that.realName) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), realName, avatar, email);
    }
}
