package general;

public class Configs {

    // Geral
    private static final String MAINURL;
    private static final String MAINURL_HOME;
    private static final String ABSPATH;

    private static final String ABSPATH_VIEWS;
    private static final String PATH_VIEWS;

    // URLs
    private static final String URL_ADDRESS_LIST_ALL;
    private static final String URL_ADDRESS_LIST_ONE;
    private static final String URL_ADDRESS_REGISTER;
    private static final String URL_ADDRESS_EDIT;
    private static final String URL_ADDRESS_DELETE;

    // URLs
    private static final String DB_DRIVER;
    private static final String DB_URL;
    private static final String DB_USER;
    private static final String DB_PASS;

    private Configs() {
    }

    static {
        MAINURL = "http://localhost:8084/magna/";
        MAINURL_HOME = "http://localhost:8084/magna/index.jsp?view=home";
        ABSPATH = "C:\\Users\\wolf\\Documents\\NetBeansProjects\\magna\\";

        ABSPATH_VIEWS = "C:\\Users\\wolf\\Documents\\NetBeansProjects\\magna\\web\\views\\";
        PATH_VIEWS = "views/";

        URL_ADDRESS_LIST_ALL = MAINURL + "index.jsp?view=" + "address-list-all";
        URL_ADDRESS_LIST_ONE = MAINURL + "index.jsp?view=" + "address-list-one";
        URL_ADDRESS_REGISTER = MAINURL + "index.jsp?view=" + "address-register";
        URL_ADDRESS_EDIT = MAINURL + "index.jsp?view=" + "address-edit";
        URL_ADDRESS_DELETE = MAINURL + "index.jsp?view=" + "address-delete";

        DB_DRIVER = "com.mysql.jdbc.Driver";
        DB_URL = "jdbc:mysql://localhost:3306/magna?useUnicode=yes&characterEncoding=UTF-8";
        DB_USER = "root";
        DB_PASS = "";
    }

    public static String getMainUrl() {
        return MAINURL;
    }

    public static String getMainUrlHome() {
        return MAINURL_HOME;
    }

    public static String getAbsPath() {
        return ABSPATH;
    }

    public static String getAbsPathViews() {
        return ABSPATH_VIEWS;
    }

    public static String getPathViews() {
        return PATH_VIEWS;
    }

    public static String getUrlAddressListAll() {
        return URL_ADDRESS_LIST_ALL;
    }

    public static String getUrlAddressListOne(int param) {
        return URL_ADDRESS_LIST_ONE + "&id=" + param;
    }

    public static String getUrlAddressRegister() {
        return URL_ADDRESS_REGISTER;
    }

    public static String getUrlAddressEdit(int param) {
        return URL_ADDRESS_EDIT + "&id=" + param;
    }

    public static String getUrlAddressDelete(int param) {
        return URL_ADDRESS_DELETE + "&id=" + param;
    }

    public static String getDbDriver() {
        return DB_DRIVER;
    }

    public static String getDbUrl() {
        return DB_URL;
    }

    public static String getDbUser() {
        return DB_USER;
    }

    public static String getDbPass() {
        return DB_PASS;
    }
}
