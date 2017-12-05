package general;

public class Configs {

    private static final String MAINURL;
    private static final String MAINURL_HOME;
    private static final String ABSPATH;

    private static final String ABSPATH_VIEWS;
    private static final String PATH_VIEWS;

    private static final String URL_ADDRESS_LIST_ALL;
    private static final String URL_ADDRESS_LIST_ONE;
    private static final String URL_ADDRESS_REGISTER;
    private static final String URL_ADDRESS_EDIT;
    private static final String URL_ADDRESS_DELETE;

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

    public static String getUrlAddressListOne(String param) {
        return URL_ADDRESS_LIST_ONE + "&id=" + param;
    }

    public static String getUrlAddressRegister() {
        return URL_ADDRESS_REGISTER;
    }

    public static String getUrlAddressEdit(String param) {
        return URL_ADDRESS_EDIT + "&id=" + param;
    }

    public static String getUrlAddressDelete(String param) {
        return URL_ADDRESS_DELETE + "&id=" + param;
    }
}
