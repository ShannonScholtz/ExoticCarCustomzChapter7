package ExoticCarCustomz.services;

import ExoticCarCustomz.domain.AudioEquipment;
import org.aspectj.lang.annotation.Before;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/08.
 */
public class TestAudioEquipmentServices {

    /*@BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
    }


    public static ApplicationContext ctx;
    public AudioEquipmentServices aes;

    @Test
    public void highestBrandTest(){
        aes = ctx.getBean( AudioEquipmentServices.class);
        AudioEquipment a1 = new AudioEquipment
                .Builder(("Sony Xplode 1600watt 12\" Subwoofer"))
                .Price(1200.00)
                .build();
        AudioEquipment a2 = new AudioEquipment
                .Builder(("Kenwood 1000watt 12\" Subwoofer"))
                .Price(600.00)
                .build();
        AudioEquipment a3 = new AudioEquipment
                .Builder(("Kickers 1000watt 12\" Subwoofer"))
                .Price(2000.00)
                .build();

        List<AudioEquipment>  w = new ArrayList<AudioEquipment>();
        w.add(a1);
        w.add(a2);
        w.add(a3);

        Assert.assertEquals(aes.getAudioEquipment(w) , a3);

    }*/

}
