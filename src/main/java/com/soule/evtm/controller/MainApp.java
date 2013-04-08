package com.soule.evtm.controller;

import java.net.URL;
import java.net.URLClassLoader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soule.evtm.dao.ContactDao;

public class MainApp extends Application {
	

    private static final Logger log = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws Exception {
    	
    	launch(args);
//      ApplicationContext ctx = new ClassPathXmlApplicationContext("/configuration/beans/AppConfig.xml");
//    	ClassLoader cl = ClassLoader.getSystemClassLoader();
//    	
//    	ContactDao dao = ctx.getBean("contactDao",ContactDao.class);
//    	dao.findAll();
//    	
//        URL[] urls = ((URLClassLoader)cl).getURLs();
// 
//        for(URL url: urls){
//        	System.out.println(url.getFile());
//        }
    }

    private AnchorPane rootLayout;
    public void start(Stage stage) throws Exception {

        log.info("Starting Hello JavaFX and Maven demonstration application");

        String fxmlFile = "/fxml/events-main.fxml";
        log.debug("Loading FXML for main view from: {}", fxmlFile);
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource(fxmlFile));
        rootLayout = (AnchorPane)loader.load();

       
       

        Scene scene = new Scene(rootLayout);
        stage.setScene(scene);
        stage.show();
        stage.show();
    }
}
