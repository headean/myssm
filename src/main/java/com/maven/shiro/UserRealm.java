package com.maven.shiro;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.maven.model.User;
import com.maven.service.IUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2020-04-12 4:24
 */
public class UserRealm extends AuthorizingRealm {
    @Autowired
    IUserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        /**
         * 1.token为用户输入的表单(AuthenticationToken）
         * 2.从数据库获取用户账户(QueryWrapper)
         * 3.用户账户认证信息(SimpleAuthenticationInfo第三个参数为盐)
         * 4.获取数据库信息和token用户信息比对认证(QueryWrapper,token)
         */
        //QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        //queryWrapper.eq("sys_user_no", token.getPrincipal());
        //queryWrapper.eq("sys_user_pwd", token.getCredentials());
        //User user = userService.getOne(queryWrapper);
        //String user = "0001";
        //String password = "123456";

        // 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，可以自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(token.getPrincipal(), token.getCredentials(), null, getName());
        //SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, token.getCredentials(), null, getName());

        return authenticationInfo;
    }
}
