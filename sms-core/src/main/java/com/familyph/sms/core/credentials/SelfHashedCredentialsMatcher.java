package com.familyph.sms.core.credentials;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;

public class SelfHashedCredentialsMatcher extends HashedCredentialsMatcher{

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token,
			AuthenticationInfo info) {
		// TODO Auto-generated method stub
		return super.doCredentialsMatch(token, info);
	}
	
}
