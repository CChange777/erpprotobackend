package com.wecreate;

import com.wecreate.entities.Stakeholder;
import com.wecreate.repositories.StakeholderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;

//@SpringBootApplication
//@EnableMongoRepositories
//@Transactional
public class ManualTests implements CommandLineRunner {

    Logger logger = Logger.getLogger(ManualTests.class.toString());

//    @Autowired
//    StakeholderRepository stakeholderRepository;

    public static void main(String[] args) {
        SpringApplication.run(ManualTests.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
//        this.stakeholderRepository.deleteAll();
//        logger.info("Saving Werner...");
//        this.stakeholderRepository.save(new Stakeholder("Werner", "Wertitsch", "Viehtriftgasse"));
//        logger.info("Saving Bernd...");
//        this.stakeholderRepository.save(new Stakeholder("Bernd", "Steurer", "Simonsgasse"));
//
//        logger.info("Finding by '...'");
//        List<Stakeholder> list = stakeholderRepository.findByFirstNameContainsOrLastNameContains("er", "er");
//        for(Stakeholder current:list) {
//            logger.info(current.toString());
//        }


    }
}
