package com.soule.evtm.controller;

import java.net.URL;
import java.net.URLClassLoader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import org.apache.derby.impl.tools.sysinfo.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soule.evtm.dao.ContactDao;

public class MainApp extends Application {
	

    private static final Logger log = LoggerFactory.getLogger(MainApp.class);
    
    private Stage primaryStage;
    private BorderPane rootLayout;
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

    
    
    public void start(Stage stage) throws Exception {
    		this.primaryStage = stage;
    		this.primaryStage.setTitle("Event Management");
    	
        log.info("Starting Hello JavaFX and Maven demonstration application");

        try {
        	
            String rootFile = "/fxml/RootLayout.fxml";
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource(rootFile));
            rootLayout = (BorderPane)loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
        loadApplication();
    }
    
    private void loadApplication(){
    	String fxmlFile = "/fxml/events-main.fxml";
    	try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource(fxmlFile));
			AnchorPane mainAppPane = (AnchorPane)loader.load();
			rootLayout.setCenter(mainAppPane);
			rootLayout.setBottom(null);
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
