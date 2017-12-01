package general;

public class Configs {

    private static final String MAINURL;
    private static final String MAINURL_HOME;
    private static final String ABSPATH;

    private static final String ABSPATH_VIEWS;
    private static final String PATH_VIEWS;

    private Configs() {
    }

    static {
        MAINURL = "http://localhost:8084/magna/";
        MAINURL_HOME = "http://localhost:8084/magna/index.jsp?view=home";
        ABSPATH = "C:\\Users\\wolf\\Documents\\NetBeansProjects\\magna\\";

        ABSPATH_VIEWS = "C:\\Users\\wolf\\Documents\\NetBeansProjects\\magna\\web\\views\\";
        PATH_VIEWS = "views/";
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
}
