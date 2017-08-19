package ua.nure.pashneva.SummaryTask4.util;

public class Path {

    // pages
    public static final String PAGE_LOGIN = "loginView.jsp";
    public static final String PAGE_REGISTER_CLIENT = "registerClientView.jsp";
    public static final String PAGE_EDIT_USER = "/WEB-INF/jsp/admin/editUserView.jsp";
    public static final String PAGE_ERROR_PAGE = "/WEB-INF/jsp/error_page.jsp";
    public static final String PAGE_LIST_MENU = "/WEB-INF/jsp/client/list_menu.jsp";
    public static final String PAGE_LIST_ORDERS = "/WEB-INF/jsp/admin/list_orders.jsp";
    public static final String PAGE_USER_INFO = "/WEB-INF/jsp/userInfoView.jsp";
    public static final String PAGE_CHANGE_LOCALE = "/WEB-INF/jsp/changeLocale.jsp";
    public static final String PAGE_HOME = "homeView.jsp";
    public static final String PAGE_ABOUT_US = "aboutView.jsp";
    public static final String PAGE_SETTINGS = "settingsView.jsp";

    // commands
    public static final String COMMAND_LIST_ORDERS = "/controller?command=listOrders";
    public static final String COMMAND_LIST_MENU = "/controller?command=listMenu";
    public static final String COMMAND_HOME = "controller?command=getHomePageCommand";
    public static final String COMMAND_USER_INFO = "controller?command=userInfoCommand";

    private Path() {
    }
}
