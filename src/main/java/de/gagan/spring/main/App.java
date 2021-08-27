package de.gagan.spring.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import de.gagan.spring.dao.OfferDao;
import de.gagan.spring.domain.Offer;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		OfferDao p  = (OfferDao)context.getBean("offerDao");
		
		List<Offer> offers = p.getOffers();
		
		for (Offer o : offers)
		{
			System.out.println(o);
		}
		
		Offer off = p.getOffer(2);
		System.out.println(off.toString());
		
		System.out.println(p);
		
		((ClassPathXmlApplicationContext)context).close();
		
		
	}

}
