package com.Divyanshu.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component
public class ProjectSession 
{
	private Session ses;
	public ProjectSession(SessionFactory fac)
	{
		ses=fac.openSession();
	}
	public Session getSession()
	{
		return ses;
	}
}
