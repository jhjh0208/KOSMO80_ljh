package book.ch6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;


class Outter2{
   Logger logger = LogManager.getLogger(Outter.class);
   int i  = 5;
   Outter2(){
      System.out.println("Outter 호출");
}
   class Inner{
      int j  = 10;
      public void go() {
         logger.info("go ()호출 성공");
      }
      
   }
   public void print() {
      logger.info("print () 호출 성공");
   }
}


public class OutterInnerTest2 {
   Logger logger = LogManager.getLogger(OutterInnerTest2.class);
   //static Logger logger = LogManager.getLogger(OuterInnerTest.class);
   public void methodA() {
      logger.info("methodA 호출 성공");
   }
   public static void main(String[] args) {
      System.setProperty
      (XmlConfigurationFactory.CONFIGURATION_FILE_PROPERTY, "log4j.xml");
      OutterInnerTest2 oi = new OutterInnerTest2();
      oi.methodA();
      Outter2 outter2 = new Outter2();
      outter2.print();
      Outter2.Inner inner = outter2.new Inner(); // 이중 / 삼중 n중 클래스 
      inner.go();

      
   }

}