package Singleton;

public class Main {

 public static void main(String[] args) {
   
     Logger logger = Logger.getInstance();

 
     logger.log("Start");
     logger.log("Process");
     logger.log("finish.");
 }
}
