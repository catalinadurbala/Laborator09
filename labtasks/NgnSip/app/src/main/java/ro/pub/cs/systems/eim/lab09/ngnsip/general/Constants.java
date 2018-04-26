package ro.pub.cs.systems.eim.lab09.ngnsip.general;

public interface Constants {

    final public static String TAG = "[NgnSIP]";

    final public static boolean DEBUG = true;

    // TODO exercise 4
    // fill in the USERNAME, IDENTITY_IMPI, IDENTITY_PASSWORD, DOMAIN, NETWORK_REALM

//    final public static String USERNAME = "eim";
//    final public static String IDENTITY_IMPI = "acs2018";
//    final public static String IDENTITY_PASSWORD = "qFh9vdHsy2LJ3gEj";
//    final public static String DOMAIN = " acs2018.onsip.com";
//    final public static String NETWORK_PCSCF_HOST = "sip.onsip.com";
//    final public static int NETWORK_PCSCF_PORT = 5060;
//    final public static String NETWORK_REALM = "acs2018.onsip.com";

    final public static String USERNAME = "informaticamobila2017";
    final public static String IDENTITY_IMPI = "upb";
    final public static String IDENTITY_PASSWORD = "3Z7iQzTcJekRpUnx";
    final public static String DOMAIN = "upb.onsip.com";
    final public static String NETWORK_PCSCF_HOST = "sip.onsip.com";
    final public static int NETWORK_PCSCF_PORT = 5060;
    final public static String NETWORK_REALM = "upb.onsip.com";

    final public static boolean NETWORK_USE_3G = true;
    final public static int NETWORK_REGISTRATION_TIMEOUT = 3600;

    final public static String SIP_ADDRESS = "ro.pub.cs.systems.eim.lab09.ngnsip.SipAddress";

    final public static int ACCEPT_CALL_DELAY_TIME = 2000;
}
