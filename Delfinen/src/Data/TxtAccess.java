/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Logic.Member;
import Logic.Controller;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import textreader.TextReader;
import static textreader.TextWriter.textWriterTwo;

/**
 *
 * @author Malte
 */
public class TxtAccess implements DataAccess {

    private final String IDpath = "ID.txt";
    private final String membersPath = "members.txt";
    private final String paymentPath = "payments.txt";

    // Assigns a new ID to the given Member.
    public void assignID(Member member) throws IOException {
        // Finds highest current ID and adds 1.
        int newID = getHighestID() + 1;
        // Puts that at the end of all current IDs.
        String total = getAllIDs() + " " + newID;
        // Rewrites the ID file.
        textWriterTwo(total, IDpath);
        // Assigns the new ID to the member.
        member.setID(newID);
    }

    // Removes the given ID from the ID.txt file.
    public void deleteID(int ID) throws FileNotFoundException, IOException {
        String total = "";
        File file = new File(IDpath);
        Scanner s = new Scanner(new BufferedReader(new FileReader(file)));
        while (s.hasNext()) {
            String next = s.next();
            if (ID == Integer.parseInt(next)) {
            } else {
                total += " " + next;
            }
        }
        // Rewrites the ID file.
        textWriterTwo(total, IDpath);

    }

    // Returns the highest integer in the ID .txt file.
    @Override
    public int getHighestID() {
        int res = 0;
        try {
            Scanner s = new Scanner(new BufferedReader(new FileReader(IDpath)));
            while (s.hasNext()) {
                int temp = Integer.parseInt(s.next());
                if (temp > res) {
                    res = temp;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TxtAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    // Used by the Kasserer. You input a Member ID
    // and the payment is put into the payments.txt file.
    public void payment(Integer ID) {
        boolean run = true;

        String payment = "";
        String total = "";
        int pay = 0;
        try {
            Scanner s = new Scanner(new BufferedReader(new FileReader(this.paymentPath)));
            while (s.hasNext()) {
                String next = s.nextLine();
                if (run == true && next.startsWith(ID + "")) {
                    payment = next.substring(ID.toString().length() + 1);
                    pay = Integer.parseInt(payment) + 1;
                    total += ID + " " + pay + "\n";
                    run = false;
                } else {
                    total += next + "\n";
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Member.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        try {
            textWriterTwo(total, this.paymentPath);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Returns a member. Hand it an ID.
    @Override
    public Member getMember(String ID) {
        try {
            Gson gson = new Gson();
            List<Member> members = new ArrayList<>();
            String json = TextReader.textReader(this.membersPath);
            members = gson.fromJson(json, List.class);

            for (Member i : members) {
                if (ID.equals(i.getID())) {
                    return i;
                } else {
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TxtAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String getAllIDs() {
        String res = "";
        try {
            Scanner s = new Scanner(new BufferedReader(new FileReader(IDpath)));
            while (s.hasNextLine()) {
                res += s.nextLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
