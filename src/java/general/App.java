package general;

import java.io.File;
import java.util.ArrayList;

public final class App {

    private String view;
    private ArrayList<String> msgError;
    private ArrayList<String> msgSuccess;

    public App() {
        this.msgError = new ArrayList<>();
        this.msgSuccess = new ArrayList<>();
    }

    public App(String view) {
        this();
        this.setView(view);
    }

    public String getView() {
        return this.view;
    }

    public void setView(String view) {

        String path = Configs.getAbsPathViews() + view + ".jsp";

        File file = new File(path);

        if (file.exists()) {
            this.view = Configs.getPathViews() + view + ".jsp";
        } else {
            this.view = Configs.getPathViews() + "404.jsp";
        }
    }

    public boolean isLoggedIn(Object id) {
        return id != null;
    }

    public void addMsgError(String message) {
        this.msgError.add(message);
    }

    public int getSizeMsgError() {
        return this.msgError.size();
    }

    public void addMsgSuccess(String message) {
        this.msgSuccess.add(message);
    }

    public int getSizeMsgSuccess() {
        return this.msgSuccess.size();
    }

    public String getMsgHTMLError() {

        String html = "";

        if (!this.msgError.isEmpty()) {

            html += "<div class=\"alert -danger\"><ul>";
            html = msgError.stream().map((msg) -> "<li>" + msg + "</li>").reduce(html, String::concat);
            html += "</ul></div>";
        }

        return html;
    }

    public String getMsgHTMLSuccess() {

        String html = "";

        if (!this.msgSuccess.isEmpty()) {

            html += "<div class=\"alert -success\"><ul>";
            html = msgSuccess.stream().map((msg) -> "<li>" + msg + "</li>").reduce(html, String::concat);
            html += "</ul></div>";
        }

        return html;
    }

    public String getMsgHTML() {

        String html = "";

        html = this.getMsgHTMLError();
        html += this.getMsgHTMLSuccess();

        return html;
    }
}
