package controller;

import java.io.File;

import general.Configs;

public class Main {

    public static String setView(String page) {

        String path = Configs.getAbsPathViews() + page + ".jsp";

        File file = new File(path);

        if (file.exists()) {
            return Configs.getPathViews() + page + ".jsp";
        } else {
            return Configs.getPathViews() + "404.jsp";
        }
    }

    public static String getView(String page) {
        return Main.setView(page);
    }
}
