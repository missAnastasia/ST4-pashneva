package ua.nure.pashneva.SummaryTask4.db.dao;

public abstract class DAOFactory {

    private static DAOFactory instance;
    private static String daoFactoryFCN;

    protected DAOFactory() {
    }

    public static synchronized DAOFactory getInstance() throws Exception {
        if (instance == null) {
            Class<?> clazz = Class.forName(DAOFactory.daoFactoryFCN);
            instance = (DAOFactory) clazz.newInstance();
        }
        return instance;
    }

    public static void setDaoFactoryFCN(String daoFactoryFCN) {
        instance = null;
        DAOFactory.daoFactoryFCN = daoFactoryFCN;
    }

    public abstract UserDAO getUserDAO();
    public abstract LanguageDAO getLanguageDAO();
    public abstract CarDAO getCarDAO();
}