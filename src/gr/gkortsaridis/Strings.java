package gr.gkortsaridis;

/**
 * Created by yoko on 08/04/16.
 */
public class Strings {
    public static String ping_uowm =
            "PING www.icte.uowm.gr (83.212.16.16): 56 data bytes\n" +
            "64 bytes from 83.212.16.16: icmp_seq=0 ttl=57 time=36.899 ms\n" +
            "64 bytes from 83.212.16.16: icmp_seq=1 ttl=57 time=38.450 ms\n" +
            "64 bytes from 83.212.16.16: icmp_seq=2 ttl=57 time=37.638 ms\n" +
            "64 bytes from 83.212.16.16: icmp_seq=3 ttl=57 time=46.282 ms\n" +
            "64 bytes from 83.212.16.16: icmp_seq=4 ttl=57 time=37.792 ms\n" +
            "64 bytes from 83.212.16.16: icmp_seq=5 ttl=57 time=37.888 ms\n" +
            "64 bytes from 83.212.16.16: icmp_seq=6 ttl=57 time=37.231 ms\n" +
            "64 bytes from 83.212.16.16: icmp_seq=7 ttl=57 time=38.025 ms\n" +
            "64 bytes from 83.212.16.16: icmp_seq=8 ttl=57 time=37.254 ms\n" +
            "64 bytes from 83.212.16.16: icmp_seq=9 ttl=57 time=40.753 ms\n" +
            "64 bytes from 83.212.16.16: icmp_seq=10 ttl=57 time=39.415 ms\n" +
            "64 bytes from 83.212.16.16: icmp_seq=11 ttl=57 time=39.582 ms\n" +
            "64 bytes from 83.212.16.16: icmp_seq=12 ttl=57 time=40.756 ms\n" +
            "--- www.icte.uowm.gr ping statistics ---\n" +
            "13 packets transmitted, 13 packets received, 0.0% packet loss\n" +
            "round-trip min/avg/max/stddev = 36.899/39.074/46.282/2.418 ms\n" +
            "\n" +
            "\n" +
            "+++++ NEW MESSAGE +++++\n" +
            "Hey! Congratz on pinging the university domain and finding the IP address. In order to help you, i just sent a VPN program packet on your machine. It is auto-installed. (See i know some stuff too!!!)  Now your IP is 83.212.16.16 as well!!! So why don't you try to spoof some of the IP traffic on the net? From what i hear, Doctor X. likes to spend a large amount of time on a social media website. Maybe you could get a password out from there... ;)\n" +
            "\n\n";

    public static String tcpdump_uowm =
            "15:45:53.050311 IP 192.168.2.105.54423 > 17.248.146.209.https: Flags [S], seq 2974056253, win 65535, options [mss 1460,nop,wscale 5,nop,nop,TS val 628248748 ecr 0,sackOK,eol], length 0\n" +
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

    public static String tcpdump_local =
            "tcpdump: data link type PKTAP\n" +
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

    public static  String email_help =
            "Hello Super Hacker. \n" +
            "\tI have asked around, who is the best hacker i can find? Everybody pointed me to you. I am experiencing a great problem. Our exam period is over. I have failed one of my lessons. I need to pass, in order not to be expelled from my university. \n" +
            "\tMy lesson is called 'Computer and Network Security (ICTE198)'. See the irony? I will need you to hack into my university's mainframe. Use my teacher's account, and log in the database. After that, i just want you to change my grade to 10. WARNING!!! DO NOT CHANGE ANYTHING ELSE!!! I will need you to be as stealth as possible!! So you need to leave everything else untouched!\n" +
            "\tAll of that should be just a piece of cake to you ;) Also i want you to know that the financial issue is not a problem. Just do the job, and after i get my results, you just name your price. \n" +
            "\n" +
            "Best,\n" +
            "Desperate Student\n" +
            "P.S. All i can do now to help you, is to give you the network domain of our university system. www.icte.uowm.gr. \nMaybe you should try to ping it....";

    public static String username_encrypted = "a^@Y?7^P??}o?Du:Gt_??N?^C^B??QdvM???=??3\\@W?m^E?~,Vm.^?^????m^A??^?y?Ne?/.^Z^?t$^?08?^U5^?7?^??$^?g^??{?5?^L";
    public static String password_encrypted = "*kE^? ^C+^G?^????i??^?>c^????^HI^K^?D^??'^NR^?^Ez?7?^\\??2?E0?t^?\"?B^?{\"?^?ei^X?B_!N-^ʠ^?P^?#?e%?^W??^?q^??^K?D??^V?9__?j+O?t.^?YO^?V=&^?=?kMvV?*?#?}?^SJ^?[i^B";
    public static String usernane_decrypted = "doctorx";
    public static String password_decrypted = "i_am_the_man_2016";

    public static String local_help =
            "UoWM Hacker command dictionairy : \n" +
            "ls                     : List all files and folders on directory\n" +
            "cat (file)             : Display the data written inside a file\n" +
            "cd (folder)            : Change your current directory. (cd ../ for previous directory)\n" +
            "ping (domain)          : Ping internet device (FAKE RESULTS)\n" +
            "tcpdump                : Check internet traffic (FAKE RESULTS)\n" +
            "echo (data) > (file)   : write data to file (ONLY WHEN ASKED)\n" +
            "openssl (multiple encrypt/decrupt parameters) : encrypt/decrypt files\n" +
            "ssh (user)@(ip/domain) : ssh to a different machine\n" +
            "clear                  : clear the screen output";

    public static String readmetxt = "This is your Main Console. At every step of the game, you can type 'help' to receive a helping bonus. If you are looking where to begin, try to check your mails ;)";

    public static String home_ls = "Total 5\n" +
            "4 drwxr-xr-x  2 root root   4096 Aug   2  10:37 Downloads\n" +
            "4 drwxr-xr-x  2 root root   4096 Sept  14 13:41 MyMail\n" +
            "4 -rwxr-xr-x  2 root root   4096 Oct   7  16:58 readme.txt\n";

    public static String usernametxt_ls = "4 -rwxr-xr-x  2 root root   4096 Oct   7  16:58 username.txt\n";
    public static String passwordtxt_ls = "4 -rwxr-xr-x  2 root root   4096 Oct   7  16:58 password.txt\n";
    public static String username_decr_ls = "4 -rwxr-xr-x  2 root root   4096 Oct   7  16:58 username_decr.txt\n";
    public static String password_decr_ls = "4 -rwxr-xr-x  2 root root   4096 Oct   7  16:58 password_decr.txt\n";

    public static String home_mail_1 =
            "_________________________________________________\n" +
            "# | From                        | Subject       |\n" +
            "1 | desperatestudent@uowm.gr    | I_need_help   |\n" +
            "__|_____________________________|_______________|\n" +
            "-Type 'cat (Subject)' to read a mail\n" +
            "-Type 'cd ../' to exit from mail ";

    public static String rsa_hint = "++++NEW MESSAGE+++\n" +
            "Congratulations! You managed to get both the username and password files for Doctor.X's machine! But dont forget they are RSA encrypted!!!\n" +
            "Try the openssl command suite, to decrypt the files.\n" +
            "Dont forget! the location of RSA keys is public/shared/rsa/private.pem and public/shared/rsa/public.pem\n";



    public static String uowm_home_ls =
            "total 10 \n" +
            "drwxr-xr-x \t2\troot\troot\t4096\t7\tApr\t7\t4:02\tbin\n" +
            "drwxr-xr-x \t2\troot\troot\t4096\t7\tApr\t15\t10:02\tetc\n" +
            "drwxr-xr-x \t2\troot\troot\t4096\t7\tMa\t10\t6:14\ttmp\n" +
            "drwxr-xr-x \t2\troot\troot\t4096\t7\tJun\t4\t4:02\tvar\n" +
            "drwxr-xr-x \t2\troot\troot\t4096\t7\tSept\t7\t5:10\tDownloads";


    public static String uowm_bin_ls =
            "total 9812\n" +
            "1000 -rwxr-xr-x 1 root root 1021112 Oct  7  2014 bash\n" +
            "  32 -rwxr-xr-x 3 root root   31152 Oct 21  2013 bunzip2\n" +
            "1876 -rwxr-xr-x 1 root root 1918032 Nov 14  2013 busybox\n" +
            "  32 -rwxr-xr-x 3 root root   31152 Oct 21  2013 bzcat\n" +
            "   0 lrwxrwxrwx 1 root root   \t6 May  8  2014 bzcmp -> bzdiff\n" +
            "   4 -rwxr-xr-x 1 root root\t2140 Oct 21  2013 bzdiff\n" +
            "   0 lrwxrwxrwx 1 root root   \t6 May  8  2014 bzegrep -> bzgrep\n" +
            "   8 -rwxr-xr-x 1 root root\t4877 Oct 21  2013 bzexe\n" +
            "   0 lrwxrwxrwx 1 root root   \t6 May  8  2014 bzfgrep -> bzgrep\n" +
            "   4 -rwxr-xr-x 1 root root\t3642 Oct 21  2013 bzgrep\n" +
            "  32 -rwxr-xr-x 3 root root   31152 Oct 21  2013 bzip2\n" +
            "  16 -rwxr-xr-x 1 root root   14480 Oct 21  2013 bzip2recover\n" +
            "   0 lrwxrwxrwx 1 root root   \t6 May  8  2014 bzless -> bzmore\n" +
            "   4 -rwxr-xr-x 1 root root\t1297 Oct 21  2013 bzmore\n" +
            "  48 -rwxr-xr-x 1 root root   47904 Mar 10 21:10 cat\n" +
            "  60 -rwxr-xr-x 1 root root   60160 Mar 10 21:10 chgrp\n" +
            "  56 -rwxr-xr-x 1 root root   56032 Mar 10 21:10 chmod\n" +
            "  60 -rwxr-xr-x 1 root root   60160 Mar 10 21:10 chown\n" +
            "  12 -rwxr-xr-x 1 root root   10480 Feb 18  2013 chvt\n" +
            " 128 -rwxr-xr-x 1 root root  130304 Mar 10 21:10 cp\n" +
            " 140 -rwxr-xr-x 1 root root  137304 Feb 18 18:16 cpio\n" +
            " 120 -rwxr-xr-x 1 root root  121272 Feb 19  2014 dash\n" +
            "  60 -rwxr-xr-x 1 root root   60160 Mar 10 21:10 date\n" +
            "  12 -rwxr-xr-x 1 root root   10536 Nov 25  2014 dbus-cleanup-sockets\n" +
            " 424 -rwxr-xr-x 1 root root  434032 Nov 25  2014 dbus-daemon\n" +
            "  12 -rwxr-xr-x 1 root root   10464 Nov 25  2014 dbus-uuidgen\n" +
            "  56 -rwxr-xr-x 1 root root   56136 Mar 10 21:10 dd\n" +
            "  96 -rwxr-xr-x 1 root root   97768 Mar 10 21:10 df\n" +
            " 108 -rwxr-xr-x 1 root root  110080 Mar 10 21:10 dir\n" +
            "  24 -rwxr-xr-x 1 root root   22896 Sep  2  2015 dmesg\n" +
            "   0 lrwxrwxrwx 1 root root   \t8 May  8  2014 dnsdomainname -> hostname\n" +
            "   0 lrwxrwxrwx 1 root root   \t8 May  8  2014 domainname -> hostname\n" +
            "  84 -rwxr-xr-x 1 root root   82256 Feb 18  2013 dumpkeys\n" +
            "  32 -rwxr-xr-x 1 root root   31296 Mar 10 21:10 echo\n" +
            "  48 -rwxr-xr-x 1 root root   47712 Jul 17  2013 ed\n" +
            " 180 -rwxr-xr-x 1 root root  183696 Jan 18  2014 egrep\n" +
            "  28 -rwxr-xr-x 1 root root   27168 Mar 10 21:10 false\n" +
            "  12 -rwxr-xr-x 1 root root   10488 Feb 18  2013 fgconsole\n" +
            " 136 -rwxr-xr-x 1 root root  138352 Jan 18  2014 fgrep\n" +
            "  36 -rwxr-xr-x 1 root root   36144 Sep  2  2015 findmnt\n" +
            "  32 -rwxr-xr-x 1 root root   31864 Nov 29  2012 fuser\n" +
            "  32 -rwsr-xr-x 1 root root   30800 May 15  2015 fusermount\n" +
            " 188 -rwxr-xr-x 1 root root  191952 Jan 18  2014 grep\n" +
            "   4 -rwxr-xr-x 2 root root\t2303 Jan 10  2014 gunzip\n" +
            "   8 -rwxr-xr-x 1 root root\t5937 Jan 10  2014 gzexe\n" +
            "  92 -rwxr-xr-x 1 root root   94048 Jan 10  2014 gzip\n" +
            "  16 -rwxr-xr-x 1 root root   14736 Dec 13  2013 hostname\n" +
            " 304 -rwxr-xr-x 1 root root  307328 Jul 23  2015 ip\n" +
            "  12 -rwxr-xr-x 1 root root   10480 Feb 18  2013 kbd_mode\n" +
            "  24 -rwxr-xr-x 1 root root   23088 Feb 10  2015 kill\n" +
            " 152 -rwxr-xr-x 1 root root  154616 Apr 10  2014 kmod\n" +
            " 152 -rwxr-xr-x 1 root root  153664 Jun 10  2013 less\n" +
            "  12 -rwxr-xr-x 1 root root   10440 Jun 10  2013 lessecho\n" +
            "   0 lrwxrwxrwx 1 root root   \t8 May  8  2014 lessfile -> lesspipe\n" +
            "  16 -rwxr-xr-x 1 root root   15912 Jun 10  2013 lesskey\n" +
            "   8 -rwxr-xr-x 1 root root\t7758 Jun 10  2013 lesspipe\n" +
            "  56 -rwxr-xr-x 1 root root   56072 Mar 10 21:10 ln\n" +
            " 112 -rwxr-xr-x 1 root root  111432 Feb 18  2013 loadkeys\n" +
            "  52 -rwxr-xr-x 1 root root   49168 Jan 27 02:50 login\n" +
            "  92 -rwxr-xr-x 1 root root   92328 Jan 26 10:38 loginctl\n" +
            "  64 -rwxr-xr-x 1 root root   63912 Dec 18  2013 lowntfs-3g\n" +
            " 108 -rwxr-xr-x 1 root root  110080 Mar 10 21:10 ls\n" +
            "  44 -rwxr-xr-x 1 root root   44688 Sep  2  2015 lsblk\n" +
            "   0 lrwxrwxrwx 1 root root   \t4 May  8  2014 lsmod -> kmod\n" +
            "  52 -rwxr-xr-x 1 root root   51936 Mar 10 21:10 mkdir\n" +
            "  36 -rwxr-xr-x 1 root root   35456 Mar 10 21:10 mknod\n" +
            "  40 -rwxr-xr-x 1 root root   39648 Mar 10 21:10 mktemp\n" +
            "  40 -rwxr-xr-x 1 root root   39600 Sep  2  2015 more\n" +
            "  96 -rwsr-xr-x 1 root root   94792 Sep  2  2015 mount\n" +
            "  12 -rwxr-xr-x 1 root root   10456 Feb 17 06:59 mountpoint\n" +
            "   0 lrwxrwxrwx 1 root root  \t20 May  8  2014 mt -> /etc/alternatives/mt\n" +
            "  68 -rwxr-xr-x 1 root root   68760 Feb 18 18:16 mt-gnu\n" +
            " 120 -rwxr-xr-x 1 root root  122088 Mar 10 21:10 mv\n" +
            " 188 -rwxr-xr-x 1 root root  192008 Oct  1  2012 nano\n" +
            "   0 lrwxrwxrwx 1 root root  \t20 May  8  2014 nc -> /etc/alternatives/nc\n" +
            "  32 -rwxr-xr-x 1 root root   31248 Dec  4  2012 nc.openbsd\n" +
            "   0 lrwxrwxrwx 1 root root  \t24 May  8  2014 netcat -> /etc/alternatives/netcat\n" +
            " 120 -rwxr-xr-x 1 root root  119624 Aug  5  2014 netstat\n" +
            "   0 lrwxrwxrwx 1 root root   \t8 May  8  2014 nisdomainname -> hostname\n" +
            "  60 -rwxr-xr-x 1 root root   59848 Dec 18  2013 ntfs-3g\n" +
            "  12 -rwxr-xr-x 1 root root   10312 Dec 18  2013 ntfs-3g.probe\n" +
            "  68 -rwxr-xr-x 1 root root   67608 Dec 18  2013 ntfs-3g.secaudit\n" +
            "  20 -rwxr-xr-x 1 root root   18432 Dec 18  2013 ntfs-3g.usermap\n" +
            "  28 -rwxr-xr-x 1 root root   26728 Dec 18  2013 ntfscat\n" +
            "  32 -rwxr-xr-x 1 root root   30752 Dec 18  2013 ntfsck\n" +
            "  32 -rwxr-xr-x 1 root root   30824 Dec 18  2013 ntfscluster\n" +
            "  36 -rwxr-xr-x 1 root root   34920 Dec 18  2013 ntfscmp\n" +
            "  24 -rwxr-xr-x 1 root root   22528 Dec 18  2013 ntfsdump_logfile\n" +
            "  40 -rwxr-xr-x 1 root root   39024 Dec 18  2013 ntfsfix\n" +
            "  56 -rwxr-xr-x 1 root root   55416 Dec 18  2013 ntfsinfo\n" +
            "  32 -rwxr-xr-x 1 root root   31928 Dec 18  2013 ntfsls\n" +
            "  28 -rwxr-xr-x 1 root root   26672 Dec 18  2013 ntfsmftalloc\n" +
            "  32 -rwxr-xr-x 1 root root   30824 Dec 18  2013 ntfsmove\n" +
            "  36 -rwxr-xr-x 1 root root   34856 Dec 18  2013 ntfstruncate\n" +
            "  44 -rwxr-xr-x 1 root root   43632 Dec 18  2013 ntfswipe\n" +
            "   0 lrwxrwxrwx 1 root root   \t6 May  8  2014 open -> openvt\n" +
            "  20 -rwxr-xr-x 1 root root   18912 Feb 18  2013 openvt\n" +
            "   0 lrwxrwxrwx 1 root root  \t14 Feb 17 06:59 pidof -> /sbin/killall5\n" +
            "  44 -rwsr-xr-x 1 root root   44168 May  8  2014 ping\n" +
            "  44 -rwsr-xr-x 1 root root   44680 May  8  2014 ping6\n" +
            "  36 -rwxr-xr-x 1 root root   35448 Dec  2  2014 plymouth\n" +
            "  32 -rwxr-xr-x 1 root root   31608 Dec  2  2014 plymouth-upstart-bridge\n" +
            "  92 -rwxr-xr-x 1 root root   93232 Feb 10  2015 ps\n" +
            "  32 -rwxr-xr-x 1 root root   31392 Mar 10 21:10 pwd\n" +
            "   0 lrwxrwxrwx 1 root root   \t4 Oct  7  2014 rbash -> bash\n" +
            "  40 -rwxr-xr-x 1 root root   39528 Mar 10 21:10 readlink\n" +
            "   4 -rwxr-xr-x 1 root root  \t89 Jul 17  2013 red\n" +
            "  60 -rwxr-xr-x 1 root root   60160 Mar 10 21:10 rm\n" +
            "  44 -rwxr-xr-x 1 root root   43648 Mar 10 21:10 rmdir\n" +
            "   0 lrwxrwxrwx 1 root root   \t4 Oct  1  2012 rnano -> nano\n" +
            "   4 -rwxr-xr-x 1 root root \t254 Jul 18  2014 running-in-container\n" +
            "  20 -rwxr-xr-x 1 root root   19248 Aug 28  2013 run-parts\n" +
            "  72 -rwxr-xr-x 1 root root   73352 Feb 13  2014 sed\n" +
            "  40 -rwxr-xr-x 1 root root   39896 Feb 18  2013 setfont\n" +
            "  12 -rwxr-xr-x 1 root root   12052 Jan 29  2014 setupcon\n" +
            "   0 lrwxrwxrwx 1 root root   \t4 May  8  2014 sh -> dash\n" +
            "   0 lrwxrwxrwx 1 root root   \t4 May  8  2014 sh.distrib -> dash\n" +
            "  32 -rwxr-xr-x 1 root root   31296 Mar 10 21:10 sleep\n" +
            "  76 -rwxr-xr-x 1 root root   76624 Jul 23  2015 ss\n" +
            "   0 lrwxrwxrwx 1 root root   \t7 Nov 14  2013 static-sh -> busybox\n" +
            "  68 -rwxr-xr-x 1 root root   68256 Mar 10 21:10 stty\n" +
            "  40 -rwsr-xr-x 1 root root   36936 Jan 27 02:50 su\n" +
            "  28 -rwxr-xr-x 1 root root   27200 Mar 10 21:10 sync\n" +
            "  20 -rwxr-xr-x 1 root root   18816 Sep  2  2015 tailf\n" +
            " 348 -rwxr-xr-x 1 root root  353840 Feb  4  2014 tar\n" +
            "  12 -rwxr-xr-x 1 root root   10344 Aug 28  2013 tempfile\n" +
            "  60 -rwxr-xr-x 1 root root   60224 Mar 10 21:10 touch\n" +
            "  28 -rwxr-xr-x 1 root root   27168 Mar 10 21:10 true\n" +
            " 244 -rwxr-xr-x 1 root root  248040 Jan 26 10:38 udevadm\n" +
            "  16 -rwxr-xr-x 1 root root   14336 May 15  2015 ulockmgr_server\n" +
            "  68 -rwsr-xr-x 1 root root   69120 Sep  2  2015 umount\n" +
            "  32 -rwxr-xr-x 1 root root   31360 Mar 10 21:10 uname\n" +
            "   4 -rwxr-xr-x 2 root root\t2303 Jan 10  2014 uncompress\n" +
            "   4 -rwxr-xr-x 1 root root\t2762 Feb 18  2013 unicode_start\n" +
            " 108 -rwxr-xr-x 1 root root  110080 Mar 10 21:10 vdir\n" +
            "   4 -rwxr-xr-x 1 root root \t946 Aug 28  2013 which\n" +
            "  28 -rwxr-xr-x 1 root root   27368 Mar 23  2014 whiptail\n" +
            "   0 lrwxrwxrwx 1 root root   \t8 May  8  2014 ypdomainname -> hostname\n" +
            "   4 -rwxr-xr-x 1 root root\t1939 Jan 10  2014 zcat\n" +
            "   4 -rwxr-xr-x 1 root root\t1779 Jan 10  2014 zcmp\n" +
            "   8 -rwxr-xr-x 1 root root\t5766 Jan 10  2014 zdiff\n" +
            "   4 -rwxr-xr-x 1 root root \t142 Jan 10  2014 zegrep\n" +
            "   4 -rwxr-xr-x 1 root root \t142 Jan 10  2014 zfgrep\n" +
            "   4 -rwxr-xr-x 1 root root\t2133 Jan 10  2014 zforce\n" +
            "   8 -rwxr-xr-x 1 root root\t5940 Jan 10  2014 zgrep\n" +
            "   4 -rwxr-xr-x 1 root root\t2039 Jan 10  2014 zless\n" +
            "   4 -rwxr-xr-x 1 root root\t1912 Jan 10  2014 zmore\n" +
            "   8 -rwxr-xr-x 1 root root\t5049 Jan 10  2014 znew";

    public static String uown_etc_ls =
            "total 832\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 May  8  2014 acpi\n" +
            " 4 -rw-r--r-- 1 root root\t2981 Apr 17  2014 adduser.conf\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:34 alternatives\n" +
            " 4 -rwxr-xr-x 8 root root\t4096 Apr  1 09:34 apache2\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 May  8  2014 apm\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 Nov  6 18:06 apparmor\n" +
            " 4 -rwxr-xr-x 8 root root\t4096 Apr  1 09:36 apparmor.d\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 Jan 22 17:26 apport\n" +
            " 4 -rwxr-xr-x 6 root root\t4096 Mar 19 16:53 apt\n" +
            " 4 -rw-r----- 1 root daemon   144 Oct 21  2013 at.deny\n" +
            " 4 -rw-r--r-- 1 root root\t2177 Apr  9  2014 bash.bashrc\n" +
            " 4 -rw-r--r-- 1 root root  \t45 Mar 22  2014 bash_completion\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:34 bash_completion.d\n" +
            " 4 -rw-r--r-- 1 root root \t356 Jan  1  2012 bindresvport.blacklist\n" +
            " 4 -rw-r--r-- 1 root root \t321 Apr 16  2014 blkid.conf\n" +
            " 0 lrwxrwxrwx 1 root root  \t15 Sep  2  2015 blkid.tab -> /dev/.blkid.tab\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Oct 10  2014 byobu\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 May  8  2014 ca-certificates\n" +
            "12 -rw-r--r-- 1 root root\t8948 Feb 29 13:09 ca-certificates.conf\n" +
            " 8 -rw-r--r-- 1 root root\t8052 Apr  7  2015 ca-certificates.conf.dpkg-old\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 calendar\n" +
            " 4 -rwxr-s--- 2 root dip \t4096 Nov  6 18:06 chatscripts\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 console-setup\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:34 cron.d\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:34 cron.daily\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 cron.hourly\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 cron.monthly\n" +
            " 4 -rw-r--r-- 1 root root \t722 Feb  9  2013 crontab\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Nov  6 18:05 cron.weekly\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:37 dbconfig-common\n" +
            " 4 -rwxr-xr-x 4 root root\t4096 Dec 29  2014 dbus-1\n" +
            " 4 -rw-r--r-- 1 root root\t2969 Feb 23  2014 debconf.conf\n" +
            " 4 -rw-r--r-- 1 root root  \t11 Feb 20  2014 debian_version\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:34 default\n" +
            " 4 -rw-r--r-- 1 root root \t604 Nov  7  2013 deluser.conf\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 depmod.d\n" +
            " 4 -rwxr-xr-x 4 root root\t4096 Jan 22 17:08 dhcp\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Jan 22 17:25 dnsmasq.d\n" +
            " 4 -rwxr-xr-x 4 root root\t4096 Jan 22 17:07 dpkg\n" +
            " 4 -rw-r--r-- 1 root root  \t96 Apr 17  2014 environment\n" +
            " 4 -rwxr-xr-x 4 root root\t4096 Apr  1 09:37 fonts\n" +
            " 4 -rw-r--r-- 1 root root \t533 Feb 29 13:17 fstab\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr 16  2014 fstab.d\n" +
            " 4 -rw-r--r-- 1 root root \t132 May 16  2013 ftpusers\n" +
            " 4 -rw-r----- 1 root fuse \t280 May 24  2013 fuse.conf\n" +
            " 4 -rw-r--r-- 1 root root\t2584 Oct 10  2012 gai.conf\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 Mar 19 16:54 ghostscript\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 groff\n" +
            " 4 -rw-r--r-- 1 root root \t709 Apr  1 09:47 group\n" +
            " 4 -rw------- 1 root root \t698 Apr  1 09:36 group-\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Jan 22 17:25 grub.d\n" +
            " 4 -rw-r----- 1 root shadow   588 Apr  1 09:47 gshadow\n" +
            " 4 -rw------- 1 root root \t580 Apr  1 09:36 gshadow-\n" +
            " 8 -rw-r--r-- 1 root root\t4781 Nov 15  2013 hdparm.conf\n" +
            " 4 -rw-r--r-- 1 root root  \t92 Feb 20  2014 host.conf\n" +
            " 4 -rw-r--r-- 1 root root  \t11 Mar 19 11:50 hostname\n" +
            " 4 -rw-r--r-- 1 root root \t190 Mar 19 11:50 hosts\n" +
            " 4 -rw-r--r-- 1 root root \t411 May  8  2014 hosts.allow\n" +
            " 4 -rw-r--r-- 1 root root \t711 May  8  2014 hosts.deny\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 May  8  2014 ifplugd\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:47 init\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:36 init.d\n" +
            " 4 -rwxr-xr-x 5 root root\t4096 Mar 27 20:16 initramfs-tools\n" +
            " 4 -rw-r--r-- 1 root root\t1721 Mar 28  2014 inputrc\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 May  8  2014 insserv\n" +
            " 4 -rw-r--r-- 1 root root \t771 May 19  2013 insserv.conf\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May 19  2013 insserv.conf.d\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Nov  6 18:06 iproute2\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 iscsi\n" +
            " 4 -rw-r--r-- 1 root root  \t26 Feb 16 18:43 issue\n" +
            " 4 -rw-r--r-- 1 root root  \t19 Feb 16 18:43 issue.net\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 kbd\n" +
            " 4 -rwxr-xr-x 4 root root\t4096 May  8  2014 kernel\n" +
            " 4 -rw-r--r-- 1 root root \t144 May  8  2014 kernel-img.conf\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Mar 28  2014 landscape\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Nov  6 18:06 ldap\n" +
            "24 -rw-r--r-- 1 root root   20921 Apr  1 09:37 ld.so.cache\n" +
            " 4 -rw-r--r-- 1 root root  \t34 Apr 17  2014 ld.so.conf\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Feb 29 13:08 ld.so.conf.d\n" +
            " 4 -rw-r--r-- 1 root root \t267 Feb 20  2014 legal\n" +
            " 4 -rw-r--r-- 1 root root \t191 Dec  4  2013 libaudit.conf\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 libnl-3\n" +
            " 4 -rwxr-xr-x 4 root root\t4096 Apr  1 09:37 lighttpd\n" +
            " 4 -rw-r--r-- 1 root root\t2570 Aug  5  2010 locale.alias\n" +
            " 4 -rw-r--r-- 1 root root\t2245 Apr  1 09:31 localtime\n" +
            " 4 -rwxr-xr-x 5 root root\t4096 Apr  1 09:36 logcheck\n" +
            "12 -rw-r--r-- 1 root root   10551 Feb 17  2014 login.defs\n" +
            " 4 -rw-r--r-- 1 root root \t703 Jan 22  2014 logrotate.conf\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:47 logrotate.d\n" +
            " 4 -rw-r--r-- 1 root root \t105 Feb 16 18:29 lsb-release\n" +
            "16 -rw-r--r-- 1 root root   14867 Mar 20  2014 ltrace.conf\n" +
            " 4 -rw-r--r-- 1 root root \t111 Apr  3  2014 magic\n" +
            " 4 -rw-r--r-- 1 root root \t111 Apr  3  2014 magic.mime\n" +
            " 4 -rw-r--r-- 1 root root\t3002 Apr  1 09:31 mailcap\n" +
            " 4 -rw-r--r-- 1 root root \t449 May 13  2013 mailcap.order\n" +
            " 8 -rw-r--r-- 1 root root\t5173 Apr 10  2014 manpath.config\n" +
            "24 -rw-r--r-- 1 root root   23922 May 13  2013 mime.types\n" +
            " 4 -rw-r--r-- 1 root root \t956 Feb 19  2014 mke2fs.conf\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Feb 29 13:08 modprobe.d\n" +
            " 4 -rw-r--r-- 1 root root \t255 May  8  2014 modules\n" +
            " 4 -rw-r--r-- 1 root root \t733 Apr  1 09:29 mtab\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 Apr  1 09:36 mysql\n" +
            "12 -rw-r--r-- 1 root root\t8453 Oct  1  2012 nanorc\n" +
            " 4 -rwxr-xr-x 7 root root\t4096 Mar 19 11:50 network\n" +
            " 4 -rwxr-xr-x 6 root root\t4096 Jan 22 17:25 NetworkManager\n" +
            " 4 -rw-r--r-- 1 root root  \t91 Feb 20  2014 networks\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 newt\n" +
            " 4 -rw-r--r-- 1 root root \t475 Feb 20  2014 nsswitch.conf\n" +
            " 4 -rw-r--r-- 1 root root\t1936 Oct  9  2013 ntp.conf\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr 17  2014 opt\n" +
            " 4 -rw-r--r-- 1 root root \t249 Feb 16 18:43 os-release\n" +
            " 4 -rw-r--r-- 1 root root \t552 Feb  1  2014 pam.conf\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:47 pam.d\n" +
            " 4 -rw-r--r-- 1 root root\t1346 Apr  1 09:47 passwd\n" +
            " 4 -rw------- 1 root root\t1333 Apr  1 09:47 passwd-\n" +
            " 4 -rwxr-xr-x 4 root root\t4096 May  8  2014 perl\n" +
            " 4 -rwxr-xr-x 5 root root\t4096 Apr  1 09:34 php5\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 Apr  1 09:37 phpmyadmin\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 pki\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 May  8  2014 pm\n" +
            " 4 -rwxr-xr-x 5 root root\t4096 May  8  2014 polkit-1\n" +
            " 4 -rw-r--r-- 1 root root \t350 May  8  2014 popularity-contest.conf\n" +
            " 4 -rwxr-xr-x 8 root root\t4096 Nov  6 18:06 ppp\n" +
            " 4 -rw-r--r-- 1 root root \t665 Feb 20  2014 profile\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Nov  6 18:06 profile.d\n" +
            " 4 -rw-r--r-- 1 root root\t2932 Dec 30  2013 protocols\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 python\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Nov  6 18:06 python2.7\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 python3\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Nov  6 18:06 python3.4\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:34 rc0.d\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:34 rc1.d\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:34 rc2.d\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:34 rc3.d\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:34 rc4.d\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:34 rc5.d\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  1 09:34 rc6.d\n" +
            " 4 -rwxr-xr-x 1 root root \t306 Apr 17  2014 rc.local\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Mar 19 16:55 rcS.d\n" +
            " 4 -rwxr-xr-x 4 root root\t4096 Oct 10  2014 resolvconf\n" +
            " 0 lrwxrwxrwx 1 root root  \t29 May  8  2014 resolv.conf -> ../run/resolvconf/resolv.conf\n" +
            " 4 -rwxr-xr-x 1 root root \t268 Feb  4  2014 rmt\n" +
            " 4 -rw-r--r-- 1 root root \t887 Dec 30  2013 rpc\n" +
            " 4 -rw-r--r-- 1 root root\t1320 Aug 19  2014 rsyslog.conf\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 rsyslog.d\n" +
            " 4 -rw-r--r-- 1 root root\t3663 Mar 20  2012 screenrc\n" +
            " 4 -rw-r--r-- 1 root root\t4038 Feb 17  2014 securetty\n" +
            " 4 -rwxr-xr-x 4 root root\t4096 Mar 27 20:15 security\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 selinux\n" +
            "20 -rw-r--r-- 1 root root   19558 Dec 30  2013 services\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 sgml\n" +
            " 4 -rw-r----- 1 root shadow   947 Apr  1 09:47 shadow\n" +
            " 4 -rw------- 1 root root \t947 Apr  1 09:47 shadow-\n" +
            " 4 -rw-r--r-- 1 root root \t103 May  8  2014 shells\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Oct 10  2014 skel\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Mar 19 11:50 ssh\n" +
            " 4 -rwxr-xr-x 4 root root\t4096 Mar 27 20:16 ssl\n" +
            " 4 -rw-r--r-- 1 root root  \t18 Nov  6 18:06 subgid\n" +
            " 0 -rw------- 1 root root   \t0 May  8  2014 subgid-\n" +
            " 4 -rw-r--r-- 1 root root  \t18 Nov  6 18:06 subuid\n" +
            " 0 -rw------- 1 root root   \t0 May  8  2014 subuid-\n" +
            " 4 -r--r----- 1 root root \t745 Feb 10  2014 sudoers\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Nov  6 18:06 sudoers.d\n" +
            " 4 -rw-r--r-- 1 root root\t2084 Apr  1  2013 sysctl.conf\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Apr  7  2015 sysctl.d\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 Feb 29 13:08 systemd\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 terminfo\n" +
            " 4 -rw-r--r-- 1 root root  \t14 Apr  1 09:31 timezone\n" +
            " 4 -rw-r--r-- 1 root root\t1260 Jul  1  2013 ucf.conf\n" +
            " 4 -rwxr-xr-x 4 root root\t4096 Feb 29 13:08 udev\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 May  8  2014 ufw\n" +
            " 4 -rw-r--r-- 1 root root \t321 Jun 20  2013 updatedb.conf\n" +
            " 4 -rwxr-xr-x 3 root root\t4096 Nov  6 18:07 update-manager\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Feb 29 13:07 update-motd.d\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 update-notifier\n" +
            " 4 -rw-r--r-- 1 root root \t222 Apr 12  2014 upstart-xsessions\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 vim\n" +
            " 8 -rw-r--r-- 1 root root\t5653 Apr  1 09:48 vsftpd.conf\n" +
            " 0 lrwxrwxrwx 1 root root  \t23 May  8  2014 vtrgb -> /etc/alternatives/vtrgb\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 w3m\n" +
            " 8 -rw-r--r-- 1 root root\t4812 Feb  7  2014 wgetrc\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 Jan 22 17:08 wpa_supplicant\n" +
            " 4 -rwxr-xr-x 7 root root\t4096 Mar 19 16:55 X11\n" +
            " 4 -rwxr-xr-x 2 root root\t4096 May  8  2014 xml\n" +
            " 4 -rw-r--r-- 1 root root \t349 Jun 26  2012 zsh_command_not_found";

    public static String uowm_tmp_ls = "total 4\n" +
            "4 -rwxr-xr-x 2 root root 4096 Apr  1 09:29 hsperfdata_root";


    public static String uowm_var_ls =
            "total 44\n" +
            "4 -rwxr-xr-x  2 root root   4096 Apr  2 06:41 backups\n" +
            "4 -rwxr-xr-x 12 root root   4096 Apr  1 09:36 cache\n" +
            "4 -rwxrwxrwt  2 root root   4096 May  8  2014 crash\n" +
            "4 -rwxr-xr-x 48 root root   4096 Apr  1 09:36 lib\n" +
            "4 -rwxrwsr-x  2 root staff  4096 Apr 11  2014 local\n" +
            "0 lrwxrwxrwx  1 root root  \t9 May  8  2014 lock -> /run/lock\n" +
            "4 -rwxrwxr-x 13 root syslog 4096 Apr  7 06:42 log\n" +
            "4 -rwxrwsr-x  2 root mail   4096 Apr 17  2014 mail\n" +
            "4 -rwxr-xr-x  2 root root   4096 Apr 17  2014 opt\n" +
            "0 lrwxrwxrwx  1 root root  \t4 May  8  2014 run -> /run\n" +
            "4 -rwxr-xr-x  5 root root   4096 May  8  2014 spool\n" +
            "4 -rwxrwxrwt  2 root root   4096 Mar 27 20:17 tmp\n" +
            "4 -rwxrwxrwx  3 root root   4096 Apr  1 09:34 www";


    public static String uowm_downloads_ls =
            "total 10\n" +
            "4 -rwxr-xr-x  2 root root   4096 Jan  2 06:41 eud_program.pdf\n" +
            "4 -rwxr-xr-x  2 root root   4096 Feb10 8:20 Thesis_statements.pdf\n" +
            "4 -rwxr-xr-x  2 root root   4096 Apr  2 06:41 passwords_rsa_encrypted.txt\n" +
            "4 -rwxr-xr-x  2 root root   4096 Apr  2 06:41 Lab_ergasthria.txt\n" +
            "4 -rwxr-xr-x  2 root root   4096 Jun  5 10:10 theory_final.pdf";

    public static String uowm_passwords_1 =
            "^O^LT?i^X??jk?^F?^?\\6?e^?^Z?;?^S?^^^?^L?\"?{%.)^B֭poɽ?ee)?l^H]rLq?}?o?^?`ºb???8E^[^?m ~X?^?~X?^??ʩ;^?HW^C^G^?T???D0:^?^W^?..??lr??m??^?q??U^H3?W?^?'1(p^????C%^?^?UΩ^Yq^K&1%????^K^ڧn_b?^?^E??W^[?p{?^W?2?^B^E^??9$C?n;#U^Ww?4??D??=A^?{?0?Pd;~^??B^ZF{??ln?v?^?>?^]6V?=^??^Wu?^E^?^?&??^?vZ\n" +
            "\n" +
            "+++NEW MESSAGE++++\n" +
            "Great job! You found the passwords_rsa_encrypted.txt file! (Although it wasn't so hard to find as i see) You know the drill. Decrypt it and gain access to the main database!!\n" +
            "The end is near...! I am already imagining my grade being changed to a 10!\n" +
            "Although beware, from what i hear doctor.x sometimes encryptes his files with the private key and some other times, he chooses the public key of the unversity!\n" +
            "Just a reminder, the keys' folder is : public/shared/rsa/private.pem and public/shared/rsa/public.pem";

    public static String database_username = "Salted__;4?G:^Udn?$l2???^?J?`?x?^?^?";
    public static String database_password = "Salted__?^G6^??^]H?^?^[^[?1?????c^D?!^?S[^K?^?i?b";

    public static String database_username_decr = "doctoras_ex";
    public static String database_password_decr = "crack_me_hacker";

    public static String uowm_passwords_2 =
            "Hahaha!! You thought you were gonna crack my passwords that easy? So you know RSA... Let's see how you handle s-DES algorithm... \n" +
            "\n" +
            "Username : "+database_username+"\n" +
            "Password : "+database_password+"\n" +
            "\n" +
            "\n" +
            "\n" +
            "+++NEW MESSAGE+++\n" +
            "Coungratulations one again for reaching so far. So Doctor.X likes games... But a simple DES algorithm is not going to be a problem for you i guess ;) Bare in mind that sDES algorithm, encrypts data using a passphrase given from Doctor.X, but let's not forget that Doc is not the brightest mind. We have already seen that he uses the same password for his social account, and for his ssh connections! So who knows where else he might be using it? ;)\n" +
            "Type the command 'create_files' to create two individual files with the encrypted username and password. After that, you will be able to decrypt them." ;

    public static String database_welcome =
            "Welcome to the MySQL monitor.  Commands end with ; or \\g.\n" +
            "Your MySQL connection id is 120\n" +
            "Server version: 5.5.47-0ubuntu0.14.04.1 (Ubuntu)\n" +
            "\n" +
            "Copyright (c) 2000, 2015, Oracle and/or its affiliates. All rights reserved.\n" +
            "\n" +
            "Oracle is a registered trademark of Oracle Corporation and/or its\n" +
            "affiliates. Other names may be trademarks of their respective\n" +
            "owners.";

    public static String show_databases =
            "+-----------------------+\n" +
            "| Database              |\n" +
            "+-----------------------+\n" +
            "| Grades                |\n" +
            "+-----------------------+\n" +
            "1 row in set (0.00 sec)";

    public static String show_tables =
            "+--------------------------------------------------------+\n" +
            "|                    Tables in Grades                    |\n" +
            "+--------------------------------------------------------+\n" +
            "| ΜΚ21_Applied_Mathematics_II                            |\n" +
            "| ΜΚ26_Mathematical_Modelling_and_Numerical_Analysis     |\n" +
            "| ΜΚ25_Electronics_I                                     |\n" +
            "| MK24_Computer_Networks_II                              |\n" +
            "| Υ5_Mobile_Communication_Νetworks                       |\n" +
            "| Υ6_Optical_Communications_and_Networks                 |\n" +
            "| ΜΚ30_Electronics_II                                    |\n" +
            "| Υ11_Computer_and_Network_Security                      |\n" +
            "| ΜΚ37_Analysis_and_Design_of_Algorithms                 |\n" +
            "+--------------------------------------------------------+\n" +
            "10 rows in set (0.02 sec)";


    public static String y11_select =
            "+-----------------+--------------+--------------+----------+\n" +
            "|       name      |     surname  |     AM       |   grade  |\n" +
            "|       kapios    |    dhsgvshd  |    647       |   5      |\n" +
            "|       katis     |    agnwstos  |    555       |   4      |\n" +
            "|       kanenas   |    giotis    |    355       |   3      |\n" +
            "|       spiros    |    krokos    |    321       |   2      |\n" +
            "|    desperate    |   student    |    350       |   3      |\n" +
            "+-----------------+--------------+--------------+----------+";

    public static String mk21_select =
            "+-----------------+--------------+--------------+----------+\n" +
                    "|       name      |     surname  |     AM       |   grade  |\n" +
                    "|       kapios    |    dhsgvshd  |    647       |   5      |\n" +
                    "|       katis     |    agnwstos  |    555       |   1      |\n" +
                    "|       kanenas   |    giotis    |    355       |   1      |\n" +
                    "|       spiros    |    krokos    |    321       |   0      |\n" +
                    "|    desperate    |   student    |    350       |   1      |\n" +
                    "+-----------------+--------------+--------------+----------+";

    public static String mk26_select =
            "+-----------------+--------------+--------------+----------+\n" +
                    "|       name      |     surname  |     AM       |   grade  |\n" +
                    "|       kapios    |    dhsgvshd  |    647       |   7      |\n" +
                    "|       katis     |    agnwstos  |    555       |   6      |\n" +
                    "|       kanenas   |    giotis    |    355       |   3      |\n" +
                    "|       spiros    |    krokos    |    321       |   2      |\n" +
                    "|    desperate    |   student    |    350       |   8      |\n" +
                    "+-----------------+--------------+--------------+----------+";

    public static String mk25_select =
            "+-----------------+--------------+--------------+----------+\n" +
                    "|       name      |     surname  |     AM       |   grade  |\n" +
                    "|       kapios    |    dhsgvshd  |    647       |   6      |\n" +
                    "|       katis     |    agnwstos  |    555       |   6      |\n" +
                    "|       kanenas   |    giotis    |    355       |   6      |\n" +
                    "|       spiros    |    krokos    |    321       |   5      |\n" +
                    "|    desperate    |   student    |    350       |   5      |\n" +
                    "+-----------------+--------------+--------------+----------+";

    public static String mk24_select =
            "+-----------------+--------------+--------------+----------+\n" +
                    "|       name      |     surname  |     AM       |   grade  |\n" +
                    "|       kapios    |    dhsgvshd  |    647       |   10     |\n" +
                    "|       katis     |    agnwstos  |    555       |   9      |\n" +
                    "|       kanenas   |    giotis    |    355       |   9      |\n" +
                    "|       spiros    |    krokos    |    321       |   9      |\n" +
                    "|    desperate    |   student    |    350       |   10     |\n" +
                    "+-----------------+--------------+--------------+----------+";

    public static String y5_select =
            "+-----------------+--------------+--------------+----------+\n" +
                    "|       name      |     surname  |     AM       |   grade  |\n" +
                    "|       kapios    |    dhsgvshd  |    647       |   0      |\n" +
                    "|       katis     |    agnwstos  |    555       |   1      |\n" +
                    "|       kanenas   |    giotis    |    355       |   1      |\n" +
                    "|       spiros    |    krokos    |    321       |   1      |\n" +
                    "|    desperate    |   student    |    350       |   0      |\n" +
                    "+-----------------+--------------+--------------+----------+";

    public static String y6_select =
            "+-----------------+--------------+--------------+----------+\n" +
                    "|       name      |     surname  |     AM       |   grade  |\n" +
                    "|       kapios    |    dhsgvshd  |    647       |   10     |\n" +
                    "|       katis     |    agnwstos  |    555       |   10     |\n" +
                    "|       kanenas   |    giotis    |    355       |   10     |\n" +
                    "|       spiros    |    krokos    |    321       |   10     |\n" +
                    "|    desperate    |   student    |    350       |   10     |\n" +
                    "+-----------------+--------------+--------------+----------+";

    public static String mk30_select =
            "+-----------------+--------------+--------------+----------+\n" +
                    "|       name      |     surname  |     AM       |   grade  |\n" +
                    "|       kapios    |    dhsgvshd  |    647       |   1      |\n" +
                    "|       katis     |    agnwstos  |    555       |   2      |\n" +
                    "|       kanenas   |    giotis    |    355       |   3      |\n" +
                    "|       spiros    |    krokos    |    321       |   2      |\n" +
                    "|    desperate    |   student    |    350       |   0      |\n" +
                    "+-----------------+--------------+--------------+----------+";

    public static String y11_select_changed =
            "+-----------------+--------------+--------------+----------+\n" +
                    "|       name      |     surname  |     AM       |   grade  |\n" +
                    "|       kapios    |    dhsgvshd  |    647       |   5      |\n" +
                    "|       katis     |    agnwstos  |    555       |   4      |\n" +
                    "|       kanenas   |    giotis    |    355       |   3      |\n" +
                    "|       spiros    |    krokos    |    321       |   2      |\n" +
                    "|    desperate    |   student    |    350       |   10     |\n" +
                    "+-----------------+--------------+--------------+----------+";

    public static String mk37_select =
            "+-----------------+--------------+--------------+----------+\n" +
                    "|       name      |     surname  |     AM       |   grade  |\n" +
                    "|       kapios    |    dhsgvshd  |    647       |   7      |\n" +
                    "|       katis     |    agnwstos  |    555       |   1      |\n" +
                    "|       kanenas   |    giotis    |    355       |   8      |\n" +
                    "|       spiros    |    krokos    |    321       |   2      |\n" +
                    "|    desperate    |   student    |    350       |   9      |\n" +
                    "+-----------------+--------------+--------------+----------+";

    public static String end_message =
            "Query OK, 1 row affected (0.02 sec)\n" +
            "\n" +
            "\n" +
            "+++NEW MESSAGE+++\n" +
            "CONGRATULATIONS!!!! I KNEW IT FROM THE BEGINNING!!! You were the one i should point from the job! Thanks a lot!! Next time we meet, i will carry a briefcase bucket-load of money for you!\n" +
            "\n" +
            "...Until next time...!!!";


}
