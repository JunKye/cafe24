package net.utility;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MyAuthenticator extends Authenticator {
	// 사용하고자 하는 메일 서버에서 인증받을 계정/비번
	private PasswordAuthentication pa;

	public MyAuthenticator() {
		pa = new PasswordAuthentication("soldesk@pretyimo.cafe24.com", "soldesk6901");
	}
	
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		//return super.getPasswordAuthentication();
		return pa;
	}
	
}// class end
