package configss;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public abstract class HibernateUtil {

	private static final SessionFactory SESSION_FACTORY;
	
	static
	{
	  Configuration cfg=new Configuration();
	  cfg.configure("configss\\Hibernatesss.cfg.xml");
	  SESSION_FACTORY=cfg.buildSessionFactory();
	  
	} 
	
	public static SessionFactory getSessionFactory()
	{
		return SESSION_FACTORY;
	}

}
