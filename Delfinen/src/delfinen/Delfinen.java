package delfinen;

import Data.Competition;
import Data.TxtAccess;
import Logic.CompRes;
import Logic.Member;
import Logic.Controller;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.List;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Malte, Mikkel, Benjamin, Nikolaj
 */
public class Delfinen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller c = new Controller();
        TxtAccess at = new TxtAccess();
//        Member M = new Member("1", LocalDate.now(), true, "butterfly");
//         Member M1 = new Member("2", LocalDate.now(), true, "butterfly");
//          Member M2 = new Member("3", LocalDate.now(), true, "butterfly");
//           Member M3 = new Member("4", LocalDate.now(), true, "butterfly");
//            Member M4 = new Member("5", LocalDate.now(), true, "butterfly");
//            c.makePlayer("1", LocalDate.now(), "ds", "fsd", "fsd", true, "butterfly");
//            c.makePlayer("2", LocalDate.now(), "ds", "fsd", "fsd", true, "butterfly");
//            c.makePlayer("3", LocalDate.now(), "ds", "fsd", "fsd", true, "butterfly");
//            c.makePlayer("4", LocalDate.now(), "ds", "fsd", "fsd", true, "butterfly");
//            c.makePlayer("5", LocalDate.now(), "ds", "fsd", "fsd", true, "butterfly");
        Competition comp = new Competition("comp", LocalDate.now());
        CompRes CR = new CompRes("1", comp, 1);
        CompRes CR2 = new CompRes("2", comp, 2);
        CompRes CR3 = new CompRes("3", comp, 3);
        CompRes CR4 = new CompRes("4", comp, 4);
        CompRes CR5 = new CompRes("5", comp, 5);
        at.compResToFile(CR5);
           at.compResToFile(CR);
              at.compResToFile(CR2);
                 at.compResToFile(CR3);
                    at.compResToFile(CR4);
////        
        
//        c.MakeTraningResult("aa", 2, 2.1, LocalDate.now());
//        c.MakeTraningResult("aa", 2, 3.1, LocalDate.now());
//        c.MakeTraningResult("ab", 2, 4.1, LocalDate.now());
//        c.MakeTraningResult("ac", 2, 5.1, LocalDate.now());
//        c.MakeTraningResult("ad", 2, 6.1, LocalDate.now());
//        c.MakeTraningResult("ag", 6, 12.1, LocalDate.now());
//        c.MakeTraningResult("asa", 2, 13.1, LocalDate.now());
//        c.MakeTraningResult("aas", 2, 14.1, LocalDate.now());
//        c.MakeTraningResult("hades", 6, 15.1, LocalDate.now());
////////  System.out.println(Arrays.toString(c.FindTopFiveIdComp("JuniorButterfly")));

//        TxtAccess cont = new TxtAccess();
//        System.out.println(cont.getAllIDs());
//        System.out.println(cont.getHighestID());
//        
        // git
//        System.out.println("Hello Git!");
//        System.out.println("new state!");
//        System.out.println("I Want My Comp To Run Faster");
//        Controller cp = new Controller();
//        cp.makePlayer("Hanrik", LocalDate.of(1994, 04, 10), "address", "email", "number", true);
//        cp.changeMember(13, false, desiplin);
//        List<Member> list = new ArrayList<>();
//        Member m = new Member("Hanrik", LocalDate.of(1994, 04, 10), true, 'M');
//         Member m1 = new Member("Hanrik1", LocalDate.of(1994, 04, 10), true, 'M');
//         Member m2 = new Member("Hanrik2", LocalDate.of(1994, 04, 10), true, 'M');
//          Member m3 = new Member("Hanrik3", LocalDate.of(1994, 04, 10), true, 'M');
//           Member m4 = new Member("Hanrik4", LocalDate.of(1994, 04, 10), true, 'M');
//           list.add(m);
//           list.add(m1);
//           list.add(m2);
//           list.add(m3);
//           list.add(m4);
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String json = gson.toJson(list);
//        System.out.println(json);
//        
//        List<Member> list2 = gson.fromJson(json, List.class);
//        
//        for(Member x : list2){
//            if(x.getID() == "Hej"){
//                
//            }
//        }
    }

}
