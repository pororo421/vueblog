package com.markerhub.util;

import com.markerhub.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.Account;

public class ShiroUtil {

    public static AccountProfile getProfile(){
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
