
package Logic;

import Data.TxtAccess;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Nikolaj
 */
public class ControllerTest {
    
    Controller cont = new Controller();
    TxtAccess acc = new TxtAccess();
    
    List<Competition> comps;
    
    private int before = 0;
    private int post = 0;
    
    // Test of Show Top 5 Results
    List<String> he = new ArrayList();
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Before
    public void setup() {
        before = acc.getHighestID();
        cont.makeMember("N", LocalDate.of(1994, 03, 02), "hed", "gah", "1325", true, "Crawl");
        //Member insta = new Member("N", LocalDate.of(1994, 03, 02), "hed", "gah", "1325", true, "K");
        cont.makeMember("N2", LocalDate.of(1994, 03, 02), "hed", "gah", "1325", true, "Crawl");
        cont.makeMember("N3", LocalDate.of(1994, 03, 02), "hed", "gah", "1325", true, "Crawl");
        cont.makeMember("N4", LocalDate.of(1994, 03, 02), "hed", "gah", "1325", true, "Crawl");
        cont.makeMember("N5", LocalDate.of(1994, 03, 02), "hed", "gah", "1325", true, "Crawl");
        cont.makeMember("N6", LocalDate.of(1994, 03, 02), "hed", "gah", "1325", true, "Crawl");
        cont.makeMember("N7", LocalDate.of(1994, 03, 02), "hed", "gah", "1325", true, "Crawl");
        cont.makeMember("N8", LocalDate.of(1994, 03, 02), "hed", "gah", "1325", true, "Crawl");
        cont.makeMember("N9", LocalDate.of(1994, 03, 02), "hed", "gah", "1325", true, "Crawl");
        cont.makeMember("N10", LocalDate.of(1994, 03, 02), "hed", "gah", "1325", true, "Crawl");
        post = acc.getHighestID();
        
        // Part of the Test to registrer Competition 
        cont.competitionRegistrer("OLYMPIC", LocalDate.of(2001, Month.MARCH, 15));
    }
    
    @After
    public void tearDown() {
        acc.resetAllFiles();
    }
    
    @Test
    public void showTopFiveTest() {
        String[] teste;
        cont.MakeTrainingResult("1", 100, 1.3, LocalDate.now());
        cont.MakeTrainingResult("2", 100, 1.4, LocalDate.now());
        cont.MakeTrainingResult("3", 100, 1.3, LocalDate.now());
        cont.MakeTrainingResult("4", 100, 1.6, LocalDate.now());
        cont.MakeTrainingResult("5", 100, 1.7, LocalDate.now());
        cont.MakeTrainingResult("6", 100, 1, LocalDate.now());
        
        teste = cont.FindTopFiveId(100);
        System.out.println(Arrays.toString(teste));
    }
    
    
    // Negativ Test over Find Top 5 
    @Test
    public void negativeFindTopFiveTest() {
        String[] test;
        try {
        cont.MakeTrainingResult("6", 100, -4, LocalDate.now());
        test = cont.FindTopFiveId(100);
        System.out.println(Arrays.toString(test));
        } catch(Exception e) {
            // Expected
        }
    }
    
    // Test Of Registrrer Competition in controller and getCompetition in TxtAccess
    @Test
    public void testCompetitionRegistrer() {
        try {
            comps = acc.getCompetitions();
            for(int i = 0; i < comps.size(); ++i) {
                if(comps.get(i).getName().equals("OLYMPIC") && comps.get(i).getLocalDate().equals(LocalDate.of(2001, Month.MARCH, 15))){
                    return;
                }
            }
        } catch(Exception e) {
            // NOT EXPECTED 
            System.out.println("Excepion");
        }
    }
}
