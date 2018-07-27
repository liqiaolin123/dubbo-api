package com.dubbo.user.provider.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserLoginRequestDto extends UserLoginBaseDto implements Serializable {
    private static final long serialVersionUID = 3145317575380915153L;
}
