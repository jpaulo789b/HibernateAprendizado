package execute;



import java.util.Date;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import nfe.Pessoa;

public class Executar {

	
	public static void main(String Args[]){
		
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		
		Pessoa p = new Pessoa();
		p.setCPF("700.88.3951-03");
		p.setCnh("999999-99");
		p.setNome("João Paulo Santos Almeida");
		p.setTitulo("0000");
		
		
		
		session.save(p);
		session.getTransaction().commit();
		session.close();
		
	}
}
