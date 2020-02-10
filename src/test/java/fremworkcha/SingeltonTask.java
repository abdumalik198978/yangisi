package fremworkcha;

import Utilities.Singleton;
import org.testng.annotations.Test;

public class SingeltonTask {
    @Test
    public void set(){
        String str1 = Singleton.getWord();
        String str2 = Singleton.getWord();
        System.out.println("str1: "+ str1 );
        System.out.println("str2: "+ str2);
    }
}
