package com.im.imparty.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.im.imparty.common.BaseDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@TableName("user")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDomain extends BaseDomain<UserDomain> {

    @TableField("username")
    private String userName;

    private String nickName;

    @TableField("password")
    private String password;

    @TableField("valid_sts")
    private String validSts;

    private String salt;

    private LocalDateTime saltExpiresTime;

    @TableField("wyy_cookie")
    private String wyyCookie;

    @TableField("wyy_user_id")
    private String wyyUserId;

    @TableField("user_avatar_url")
    private String userAvatarUrl;

}
