package gr.gkortsaridis;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

/**
 * Created by yoko on 18/03/16.
 */
public class HackForm extends JFrame {
    private JTextField input;
    private JTextPane output;
    private JPanel rootPanel;

    private String whereLocal = "home";
    private String whereUown  = "home";
    private String hacker_name = "hacker";
    private String path = "/"+hacker_name+"/ > ";
    private String where = "local";

    private boolean ssh = false;

    Properties prop = new Properties();
    OutputStream output1 = null;
    InputStream input1 = null;

    public HackForm(){
        super("UoWM Hacker");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);

        input.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String command = e.getActionCommand();
                output.setText(output.getText().toString() + command);
                input.setText("");
                String command_reply = checkInput(command);
                if(!command_reply.equals(""))appendOutput(command_reply);
                if(!ssh)appendOutput(hacker_name+"@"+where+"/"+whereLocal+" >");
            }
        });

        output.setText("~~WELCOME HACKER~~\nEvery time try the command 'help' to get a list of possible commands\n");
        appendOutput(hacker_name+"@"+where+"/"+whereLocal+" >");

        setVisible(true);
    }

    private void save(String name, String data){
        try {
            output1 = new FileOutputStream("config.properties");
            // set the properties value
            prop.setProperty(name, data);
            // save properties to project root folder
            prop.store(output1, null);

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output1 != null) {
                try {
                    output1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private String load(String name){
        try {

            input1 = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input1);

            // get the property value and print it out
            return prop.getProperty(name,"");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (NullPointerException ex) {
            return "";
        }
        finally {
            if (input1 != null) {
                try {
                    input1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return "ERROR";
    }

    private void appendOutput(String out){
        output.setText(output.getText().toString() + "\n" + out);
    }
    private String checkInput(String command){

        if(command.equals("exit")){
            if(where.equals("local")) System.exit(0);
            else{
                where = "local";
                hacker_name = "hacker";
                return "";
            }
        }
        else if(command.equals("clear")){
            output.setText("");
            return "";
        }
        else if(command.equals("pwd")){
            if(where.equals("local"))
                return where+"/"+whereLocal;
            else if(where.equals("uowm")){
                return where+"/"+whereUown;
            }
        }
        else if(where.equals("local")) return checkLocal(command);
        else if(where.equals("uowm")) return checkUowm(command);

        return "Unknown command '"+command+"'";
    }

    private String checkLocal(String command){
        String[] splited = command.split(" ");

        if(!ssh) {
            if (splited[0].equals("")) return "";
            if (splited[0].equals("ls")) {
                String reply = "";
                if (whereLocal.equals("home")) {
                    reply = "Total 5\n" +
                            "4 drwxr-xr-x  2 root root   4096 Aug   2  10:37 Downloads\n" +
                            "4 drwxr-xr-x  2 root root   4096 Sept  14 13:41 MyMail\n" +
                            "4 -rwxr-xr-x  2 root root   4096 Sept  14 13:01 username.txt\n" +
                            "4 -rwxr-xr-x  2 root root   4096 Sept  14 13:05 password.txt\n" +
                            "4 -rwxr-xr-x  2 root root   4096 Oct   7  16:58 readme.txt\n";

                    if (load("usernametxt").equals("true")) {
                        reply += "4 -rwxr-xr-x  2 root root   4096 Oct   7  16:58 username.txt\n";
                    }
                    if (load("passwordtxt").equals("true")) {
                        reply += "4 -rwxr-xr-x  2 root root   4096 Oct   7  16:58 password.txt\n";
                    }
                    if (load("usernamedecr").equals("true")) {
                        reply += "4 -rwxr-xr-x  2 root root   4096 Oct   7  16:58 username_decr.txt\n";
                    }
                    if (load("passworddecr").equals("true")) {
                        reply += "4 -rwxr-xr-x  2 root root   4096 Oct   7  16:58 password_decr.txt\n";
                    }
                    return reply;
                } else if (whereLocal.equals("Downloads")) {
                    reply = "Total 0";
                    return reply;
                } else if (whereLocal.equals("MyMail")) {
                    reply = "_________________________________________________\n" +
                            "# | From                        | Subject       |\n" +
                            "1 | desperatestudent@uowm.gr    | I_need_help   |\n" +
                            "__|_____________________________|_______________|\n" +
                            "-Type 'cat (Subject)' to read a mail\n" +
                            "-Type 'cd ../' to exit from mail ";
                    return reply;
                }
            } else if (splited[0].equals("cd")) {

                if (whereLocal.equals("home")) {
                    if (splited[1].equals("Downloads")) {
                        whereLocal = "Downloads";
                        return "";
                    } else if (splited[1].equals("MyMail")) {
                        whereLocal = "MyMail";
                        return "";
                    } else return "No Folder/link named '" + splited[1] + "' found.";

                } else if (whereLocal.equals("Downloads")) {
                    if (splited[1].equals("../")) {
                        whereLocal = "home";
                        return "";
                    } else {
                        return "No Folder/link named '" + splited[1] + "' found.";
                    }
                } else if (whereLocal.equals("MyMail")) {
                    if (splited[1].equals("../")) {
                        whereLocal = "home";
                        return "";
                    } else {
                        return "No Folder/link named '" + splited[1] + "' found.";
                    }
                }
            } else if (splited[0].equals("help")) {
                return "HELP FOR HOME";
            } else if (splited[0].equals("cat")) {

                if (whereLocal.equals("home")) {
                    if (splited[1].equals("readme.txt")) {
                        return "This is your Main Console. At every step of the game, you can type 'help' to receive a helping bonus. Are you really stuck on a level? Type 'hint' to tell you exactly what your next command should be. Although, beware. You can only use hint 3 times in the whole game. ";
                    } else if (splited[1].equals("Downloads") || splited[1].equals("MyMail")) {
                        return splited[1] + " is a folder. You cannot use cat";
                    } else if (splited[1].equals("username.txt")) {
                        if (load("usernametxt").equals("true")) {
                            return "a^@Y?7^P??}o?Du:Gt_??N?^C^B??QdvM???=??3\\@W?m^E?~,Vm.^?^????m^A??^?y?Ne?/.^Z^?t$^?08?^U5^?7?^??$^?g^??{?5?^L";
                        } else return "Could not find '" + splited[1] + "'";
                    } else if (splited[1].equals("password.txt")) {
                        if (load("passwordtxt").equals("true")) {
                            return "*kE^? ^C+^G?^????i??^?>c^????^HI^K^?D^??'^NR^?^Ez?7?^\\??2?E0?t^?\"?B^?{\"?^?ei^X?B_!N-^ʠ^?P^?#?e%?^W??^?q^??^K?D??^V?9__?j+O?t.^?YO^?V=&^?=?kMvV?*?#?}?^SJ^?[i^B";
                        } else return "Could not find '" + splited[1] + "'";
                    } else if (splited[1].equals("username_decr.txt")) {
                        if (load("usernamedecr").equals("true")) {
                            return "doctorx";
                        } else return "Could not find '" + splited[1] + "'";
                    } else if (splited[1].equals("password_decr.txt")) {
                        if (load("passworddecr").equals("true")) {
                            return "i_am_the_man_2016";
                        } else return "Could not find '" + splited[1] + "'";
                    } else {
                        return "Could not find '" + splited[1] + "'";
                    }
                } else if (whereLocal.equals("MyMail")) {

                    if (splited[1].equals("I_need_help")) {
                        String reply = "Hello Super Hacker. \n" +
                                "\tI have asked around, who is the best hacker i can find? Everybody pointed me to you. I am experiencing a great problem. Our exam period is over. I have failed one of my lessons. I need to pass, in order not to be expelled from my university. \n" +
                                "\tMy lesson is called 'Computer and Network Security (ICTE198)'. See the irony? I will need you to hack into my university's mainframe. Use my teacher's account, and log in the database. After that, i just want you to change my grade to 10. WARNING!!! DO NOT CHANGE ANYTHING ELSE!!! I will need you to be as stealth as possible!! So you need to leave everything else untouched!\n" +
                                "\tAll of that should be just a piece of cake to you ;) Also i want you to know that the financial issue is not a problem. Just do the job, and after i get my results, you just name your price. \n" +
                                "\n" +
                                "Best,\n" +
                                "Desperate Student\n" +
                                "P.S. All i can do now to help you, is to give you the network domain of our university system. www.icte.uowm.gr. \nMaybe you should try to ping it....";
                        return reply;
                    } else return "No Subject name '" + splited[1] + "' found";
                }


            } else if (splited[0].equals("ping")) {
                if (splited[1].equals("www.icte.uowm.gr")) {
                    save("uni_vpn", "true");
                    return Strings.ping_uowm;
                } else {
                    return "ping: cannot resolve " + splited[1] + ": Unknown host";
                }
            } else if (splited[0].equals("tcpdump")) {
                if (load("uni_vpn").equals("true")) {
                    return "15:45:53.050311 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [S], seq 2974056253, win 65535, options [mss 1460,nop,wscale 5,nop,nop,TS val 628248748 ecr 0,sackOK,eol], length 0\n" +
                            "15:45:53.151545 IP 17.248.146.209.https > 192.168.2.105.54423: Flags [S.], seq 1155957342, ack 2974056254, win 14480, options [mss 1440,sackOK,TS val 840442276 ecr 628248748,nop,wscale 7], length 0\n" +
                            "15:45:53.151605 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [.], ack 1, win 4105, options [nop,nop,TS val 628248849 ecr 840442276], length 0\n" +
                            "15:45:53.152776 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [P.], seq 1:239, ack 1, win 4105, options [nop,nop,TS val 628248850 ecr 840442276], length 238\n" +
                            "15:45:53.241922 IP 17.248.146.209.https > 192.168.2.105.54423: Flags [.], ack 239, win 122, options [nop,nop,TS val 840442380 ecr 628248850], length 0\n" +
                            "15:45:53.241925 IP 17.248.146.209.https > 192.168.2.105.54423: Flags [.], seq 1:1429, ack 239, win 122, options [nop,nop,TS val 840442382 ecr 628248850], length 1428\n" +
                            "15:45:53.243303 IP 17.248.146.209.https > 192.168.2.105.54423: Flags [.], seq 1429:2857, ack 239, win 122, options [nop,nop,TS val 840442382 ecr 628248850], length 1428\n" +
                            "15:45:53.243339 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [.], ack 2857, win 4051, options [nop,nop,TS val 628248940 ecr 840442382], length 0\n" +
                            "15:45:53.244034 IP 17.248.146.209.https > 192.168.2.105.54423: Flags [P.], seq 2857:3836, ack 239, win 122, options [nop,nop,TS val 840442382 ecr 628248850], length 979\n" +
                            "15:45:53.244070 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [.], ack 3836, win 4065, options [nop,nop,TS val 628248940 ecr 840442382], length 0\n" +
                            "15:45:53.258261 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [P.], seq 239:314, ack 3836, win 4096, options [nop,nop,TS val 628248954 ecr 840442382], length 75\n" +
                            "15:45:53.258280 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [P.], seq 314:320, ack 3836, win 4096, options [nop,nop,TS val 628248954 ecr 840442382], length 6\n" +
                            "15:45:53.258292 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [P.], seq 320:365, ack 3836, win 4096, options [nop,nop,TS val 628248954 ecr 840442382], length 45\n" +
                            "15:45:53.344741 IP 17.248.146.209.https > 192.168.2.105.54423: Flags [.], ack 320, win 122, options [nop,nop,TS val 840442485 ecr 628248954], length 0\n" +
                            "\n" +
                            "15:45:53.289264 IP edge-star-shv-01-frt3.facebook.com.https&username=a^@Y?7^P??}o?Du:Gt_??N?^C^B??QdvM???=??3\\@W?m^E?~,Vm.^?^????m^A??^?y?Ne?/.^Z^?t?^?^C^??0?^F\\?#:k?k[?^?z^??^N4?^G?^^??E?^\\1?^%\n" +
                            "^?08?^U5^?7?^??$^?g^??{?5?^L > 192.168.2.105.54196: Flags [P.], seq 63490:6452, ack 3149, win 1122, options [nop,nop,TS val 3937194488 ecr 623859856], length 42\n" +
                            "\n" +
                            "15:45:53.344744 IP 17.248.146.209.https > 192.168.2.105.54423: Flags [P.], seq 3836:3887, ack 365, win 122, options [nop,nop,TS val 840442486 ecr 628248954], length 51\n" +
                            "15:45:53.344788 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [.], ack 3887, win 4094, options [nop,nop,TS val 628249039 ecr 840442486], length 0\n" +
                            "15:45:53.345857 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [P.], seq 365:1223, ack 3887, win 4096, options [nop,nop,TS val 628249040 ecr 840442486], length 858\n" +
                            "15:45:53.345947 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [.], seq 1223:2651, ack 3887, win 4096, options [nop,nop,TS val 628249040 ecr 840442486], length 1428\n" +
                            "15:45:53.345949 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [P.], seq 2651:2901, ack 3887, win 4096, options [nop,nop,TS val 628249040 ecr 840442486], length 250\n" +
                            "15:45:53.441273 ARP, Request who-has 192.168.2.103 tell 192.168.2.1, length 28\n" +
                            "\n" +
                            "15:46:04.282864 IP edge-star-shv-01-frt3.facebook.com.https&password=*kE^? ^C+^G?^????i??^?>c^????^HI^K^?D^??'^NR^?^Ez?7?^\\??2?E0?t^?\"?B^?{\"?^?ei^X?B_!N-^ʠ^?P^?#?e%?^W??^?q^??^K?D??^V?9__?j+O?t.^?YO$ > 192.168.2.105.54196: Flags [P.], seq 6410:6452, ack 3149, win 1122, options [nop,nop,TS val 3937194488 ecr 628259856], length 42\n" +
                            "\n" +
                            "15:45:53.461646 IP 17.248.146.209.https > 192.168.2.105.54423: Flags [.], ack 2651, win 158, options [nop,nop,TS val 840442591 ecr 628249040], length 0\n" +
                            "15:45:53.511487 IP 17.248.146.209.https > 192.168.2.105.54423: Flags [.], ack 2901, win 180, options [nop,nop,TS val 840442634 ecr 628249040], length 0\n" +
                            "15:45:53.565468 IP 17.248.146.209.https > 192.168.2.105.54423: Flags [P.], seq 3887:5091, ack 2901, win 180, options [nop,nop,TS val 840442706 ecr 628249040], length 1204\n" +
                            "15:45:53.565512 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [.], ack 5091, win 4058, options [nop,nop,TS val 628249257 ecr 840442706], length 0\n" +
                            "15:45:53.566851 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [F.], seq 2901, ack 5091, win 4096, options [nop,nop,TS val 628249258 ecr 840442706], length 0\n" +
                            "15:45:53.661555 IP 17.248.146.209.https > 192.168.2.105.54423: Flags [F.], seq 5091, ack 2902, win 180, options [nop,nop,TS val 840442791 ecr 628249258], length 0\n" +
                            "15:45:53.661760 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [.], ack 5092, win 4096, options [nop,nop,TS val 628249352 ecr 840442791], length 0\n" +
                            "15:45:54.092077 IP 192.168.2.105.mdns > 224.0.0.251.mdns: 0 PTR (QM)? 6.b.2.c.f.4.e.f.f.f.3.c.b.3.c.a.0.0.0.0.0.0.0.0.0.0.0.0.0.8.e.f.ip6.arpa. (90)\n +" +
                            "\n" +
                            "\n" +
                            "+++++ NEW MESSAGE +++++\n" +
                            "Congratulations! I knew you had it in you! You were in the right place at the right time! Doctor X. logged in on his social media account! Search the tcpdump output, and find his username and password! Although beware, from what i hear they are RSA encrypted...\n" +
                            "BUT more good news are coming! Since you are in the university network, all RSA encryptions are encrypted using a single private and public key!! Their location is /public/shared/rsa/public.pem and /public/shared/rsa/private.pem . You cannot cd or cat to those files, but all your commands can use them as input...!\n" +
                            "When you find Doctor's Username and Password, You need to go to your HOME folder, and create two new files with those EXACT commands.\n" +
                            "echo XXXXXXXXXX > username.txt \n" +
                            "echo YYYYYYYYYY > password.txt \n" +
                            "replace XXXXX and YYYYY with the TIMESTAMP of the Packets of Username and Password." +
                            "\n\n";
                } else {
                    return "tcpdump: data link type PKTAP\n" +
                            "tcpdump: verbose output suppressed, use -v or -vv for full protocol decode\n" +
                            "listening on pktap, link-type PKTAP (Packet Tap), capture size 262144 bytes\n" +
                            "18:21:21.841569 IP 192.168.2.102.mdns > 224.0.0.251.mdns: 0 PTR (QM)? 122.208.25.218.in-addr.arpa. (45)\n" +
                            "18:21:22.545658 IP 192.168.2.101.49673 > 192.168.2.1.domain: 51664+ PTR? 102.2.168.192.in-addr.arpa. (44)\n" +
                            "18:21:22.578586 IP 192.168.2.1.domain > 192.168.2.101.49673: 51664 NXDomain* 0/1/0 (103)\n" +
                            "18:21:22.579906 IP 192.168.2.101.65018 > 192.168.2.1.domain: 48864+ PTR? 251.0.0.224.in-addr.arpa. (42)\n" +
                            "18:21:22.611917 IP 192.168.2.1.domain > 192.168.2.101.65018: 48864 NXDomain 0/1/0 (99)\n" +
                            "18:21:23.284645 ARP, Request who-has 192.168.2.101 tell 192.168.2.1, length 28\n" +
                            "18:21:23.284658 ARP, Reply 192.168.2.101 is-at 3c:15:c2:d1:79:1e (oui Unknown), length 28\n" +
                            "18:21:23.616682 IP 192.168.2.101.60759 > 192.168.2.1.domain: 19509+ PTR? 1.2.168.192.in-addr.arpa. (42)\n" +
                            "18:21:23.649802 IP 192.168.2.1.domain > 192.168.2.101.60759: 19509 NXDomain* 0/1/0 (101)\n" +
                            "18:21:23.684672 IP6 fe80::ac3b:c3ff:fe4f:c2b6 > ff02::1: ICMP6, router advertisement, length 24\n" +
                            "18:21:23.786671 IP 192.168.2.101.63871 > cache.google.com.https: Flags [.], ack 892400009, win 4096, length 0\n" +
                            "18:21:23.841168 IP cache.google.com.https > 192.168.2.101.63871: Flags [.], ack 1, win 260, options [nop,nop,TS val 224858385 ecr 764473471], length 0\n" +
                            "18:21:24.100783 IP 192.168.2.101.56301 > cache.google.com.https: UDP, length 753\n" +
                            "18:21:24.145278 IP cache.google.com.https > 192.168.2.101.56301: UDP, length 1350\n" +
                            "18:21:24.622866 IP 192.168.2.101.56301 > cache.google.com.https: UDP, length 43\n" +
                            "18:21:25.290840 IP 192.168.2.101.56301 > cache.google.com.https: UDP, length 55\n" +
                            "18:21:29.988349 IP 192.168.2.101.58132 > 192.168.2.1.domain: 32618+ PTR? 3.192.60.179.in-addr.arpa. (43)\n" +
                            "18:21:30.024037 IP 192.168.2.1.domain > 192.168.2.101.58132: 32618 1/0/0 PTR edge-star-shv-01-cdg2.facebook.com. (91)\n" +
                            "18:21:30.203912 IP 192.168.56.1.mdns > 224.0.0.251.mdns: 0 PTR (QU)? e.1.9.7.1.d.e.f.f.f.2.c.5.1.e.3.0.0.0.0.0.0.0.0.0.0.0.0.0.8.e.f.ip6.arpa. (90)\n" +
                            "18:21:30.203950 IP 192.168.2.101.mdns > 224.0.0.251.mdns: 0 PTR (QU)? e.1.9.7.1.d.e.f.f.f.2.c.5.1.e.3.0.0.0.0.0.0.0.0.0.0.0.0.0.8.e.f.ip6.arpa. (90)\n" +
                            "18:21:30.204021 IP6 georges-macbook-pro-3.local.mdns > ff02::fb.mdns: 0 PTR (QU)? e.1.9.7.1.d.e.f.f.f.2.c.5.1.e.3.0.0.0.0.0.0.0.0.0.0.0.0.0.8.e.f.ip6.arpa. (90)\n" +
                            "18:21:30.377102 IP 192.168.2.101.mdns > 224.0.0.251.mdns: 0*- [0q] 1/0/1 (Cache flush) PTR Georges-MacBook-Pro-3.local. (143)\n" +
                            "18:21:30.377189 IP6 georges-macbook-pro-3.local.mdns > ff02::fb.mdns: 0*- [0q] 1/0/1 (Cache flush) PTR Georges-MacBook-Pro-3.local. (143)\n" +
                            "18:21:30.378172 IP 192.168.2.101.54916 > 192.168.2.1.domain: 44410+ PTR? b.f.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.2.0.f.f.ip6.arpa. (90)\n" +
                            "18:21:30.401216 IP 192.168.2.101.63895 > cache.google.com.https: Flags [F.], seq 2811419375, ack 3277120306, win 4105, options [nop,nop,TS val 764615642 ecr 224852958], length 0\n" +
                            "18:21:30.402083 IP 192.168.2.101.57556 > 192.168.2.1.domain: 58259+ A? r1---sn-a5meknes.googlevideo.com. (50)\n" +
                            "18:21:30.411833 IP 192.168.2.1.domain > 192.168.2.101.54916: 44410 NXDomain 0/1/0 (160)\n" +
                            "18:21:30.434106 IP 192.168.2.1.domain > 192.168.2.101.57556: 58259 2/0/0 CNAME r1.sn-a5meknes.googlevideo.com., A 173.194.12.55 (95)\n" +
                            "18:21:30.436555 IP 192.168.2.101.63900 > 173.194.12.55.https: Flags [S], seq 85788325, win 65535, options [mss 1460,nop,wscale 5,nop,nop,TS val 764615677 ecr 0,sackOK,eol], length 0\n" +
                            "18:21:30.442447 IP 192.168.2.101.61981 > 173.194.12.55.https: UDP, length 1350\n" +
                            "18:21:30.442819 IP 192.168.2.101.61981 > 173.194.12.55.https: UDP, length 578\n" +
                            "18:21:30.452844 IP cache.google.com.https > 192.168.2.101.63895: Flags [F.], seq 1, ack 1, win 227, options [nop,nop,TS val 224865000 ecr 764615642], length 0\n" +
                            "18:21:30.452943 IP 192.168.2.101.63895 > cache.google.com.https: Flags [.], ack 2, win 4105, options [nop,nop,TS val 764615693 ecr 224865000], length 0\n" +
                            "18:21:30.596608 IP 192.168.2.101.61981 > 173.194.12.55.https: UDP, length 1350";
                }

            } else if (splited[0].equals("echo")) {
                if (splited[splited.length - 1].equals("username.txt")) {
                    if (splited[1].equals("15:45:53.289264")) {
                        save("usernametxt", "true");
                        if (load("passwordtxt").equals("true")) {
                            return "username.txt file created succesfully!\n" +
                                    "\n" +
                                    "++++NEW MESSAGE+++\n" +
                                    "Congratulations! You managed to get both the username and password files for Doctor.X's machine! But dont forget they are RSA encrypted!!!\n" +
                                    "Try the openssl command suite, to decrypt the files.\n" +
                                    "Dont forget! the location of RSA keys is public/shared/rsa/private.pem and public/shared/rsa/public.pem\n";
                        } else {
                            return "username.txt file created succesfully!";
                        }
                    } else {
                        return "Incorrect datetime for Username packet... Try again. File nto created";
                    }
                } else if (splited[splited.length - 1].equals("password.txt")) {

                    if (splited[1].equals("15:46:04.282864")) {
                        save("passwordtxt", "true");
                        if (load("usernametxt").equals("true")) {

                            return "password.txt file created succesfully!\n" +
                                    "\n" +
                                    "++++NEW MESSAGE+++\n" +
                                    "Congratulations! You managed to get both the username and password files for Doctor.X's machine! But dont forget they are RSA encrypted!!!\n" +
                                    "Try the openssl command suite, to decrypt the files.\n" +
                                    "Dont forget! the location of RSA keys is public/shared/rsa/private.pem and public/shared/rsa/public.pem\n\n";
                        } else {
                            return "password.txt file created succesfully!";
                        }

                    } else {
                        return "Incorrect datetime for Password packet... Try again. File nto created";
                    }
                }
            } else if (splited[0].equals("openssl")) {

                if (splited[1].equals("rsauth") && splited[2].equals("-decrypt") && splited[3].equals("-inkey") && splited[4].equals("public/shared/rsa/private.pem") && splited[5].equals("-in") && splited[7].equals("-out")) {
                    //openssl rsautl -decrypt -inkey pri_key.pem -in lab2.rsa -out lab2
                    if (splited[6].equals("username.txt")) {
                        //splited[8] = output file name
                        save("usernamedecr", "true");
                        return "Success! File decrypted! new file name : username_decr.txt";
                    } else if (splited[6].equals("password.txt")) {
                        save("passworddecr", "true");
                        return "Success! File decrypted! new file name : password_decr.txt";
                    } else {
                        return "Wrong command input for openssl";
                    }
                } else return "Wrong parameters for openssl decryption";
            } else if (splited[0].equals("ssh")) {
                String[] temp = splited[1].split("@");
                if (temp[1].equals("83.212.16.16") || temp[1].equals("www.icte.uowm.gr")) {
                    if (temp[0].equals("doctorx")) {
                        ssh = true;
                        return temp[0] + "@" + temp[1] + "'s password: ";
                    } else return "There is no user named : " + temp[0];

                } else {
                    return "ssh: Could not resolve hostname " + temp[1] + ": nodename nor servname provided, or not known";
                }
            } else {
                return "No command named '" + splited[0] + "' found.";
            }
        }else{
            //Perimeno password SSH
            if(splited[0].equals("i_am_the_man_2016")){
                where = "uowm";
                hacker_name = "doctor_x";
                ssh = false;
                Calendar calendar = Calendar.getInstance();
                Date date = calendar.getTime();
                String day = new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime());
                String month = new SimpleDateFormat("MMMM").format(calendar.getTime());
                int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                String time = dateFormat.format(date);
                return "Welcome to Ubuntu 14.04.4 LTS (GNU/Linux 3.13.0-79-generic x86_64)\n" +
                        "\n" +
                        " * Documentation:  https://help.ubuntu.com/\n" +
                        "\n" +
                        "  System information as of "+day+" "+month+" "+dayOfMonth+" "+time+" EEST 2016\n" +
                        "\n" +
                        "  System load:  0.0               Processes:           100\n" +
                        "  Usage of /:   4.5% of 58.93GB   Users logged in:     0\n" +
                        "  Memory usage: 14%               IP address for eth1: 83.212.16.16\n" +
                        "  Swap usage:   0%\n" +
                        "\n" +
                        "  Graph this data and manage this system at:\n" +
                        "    https://landscape.canonical.com/";
            }else{
                ssh = false;
                return "Wrong password!";
            }
        }


        return "HACKER YOU!!";
    }
    private String checkUowm(String command){
        String[] splited = command.split(" ");

        if (splited[0].equals("")) return "";
        else if (splited[0].equals("ls")) {
            if(whereUown.equals("home")){
                return "HOME UOWM";
            }
        }



        return "Unknown command "+splited[0];
    }

}
