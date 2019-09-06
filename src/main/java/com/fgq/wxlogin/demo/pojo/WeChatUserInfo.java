package com.fgq.wxlogin.demo.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Package: com.fgq.wxlogin.demo.pojo
 * @ClassName: WeChatUserInfo
 * @Author: fgq
 * @Description:
 * @Date: 2019/9/4 17:18
 */
@Data
public class WeChatUserInfo implements Serializable {
    String openid;
    String nickname;
    Integer sex;
    String province;
    String city;
    String country;
    String headimgurl;
    String privilege;
    String unionid;

}
