package net.degiere.message.domain;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Demonstration of pre-populating a database at startup.
 * See: http://forum.springsource.org/showthread.php?84312-How-to-store-sample-data
 */
@Component
public class DataSeeder implements ApplicationListener<ContextRefreshedEvent> {

	private static Logger logger = Logger.getLogger(DataSeeder.class);
	
	public DataSeeder() {
		logger.info("instantiating...");
	}
	
    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
		logger.info("preloading data...");
		if (0 == Message.countMessages()) {
			Message t1 = new Message();
			t1.setContent("Hello World!");
			t1.setModified(new Date());
			t1.persist();
			logger.info("persisted: :" + t1);

			Message t2 = new Message();
			t2.setContent("See you later alligator...");
			t2.setModified(new Date());
			t2.persist();
			logger.info("persisted: :" + t2);
		}
    }

}