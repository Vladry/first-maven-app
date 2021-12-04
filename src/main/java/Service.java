import dao.UserDaoJdbc;
import domains.Group;
import domains.User;

public class Service {
    public static void main(String[] args){
        User u0 = new User (null, "Garik", "Nemtsov", "G.Nem",
                "G.Nem@ukr.net", "visitor", 26, Group.IT);
        User u1 = new User (null, "Vlad", "Ryab", "Sly",
                "rvy@ukr.net", "admin", 30, Group.IT);
        User u2 = new User (null, "Petro", "Mychailov", "PM",
                "PM@ukr.net", "visitor", 40, Group.ADMINISTRATION);
        User u3 = new User (null, "Semyon", "Pupkin", "SPup",
                "SPup@ukr.net", "student", 20, Group.OPERATIONS);
        User u4 = new User (null, "Vasya", "Urlov", "V-Urlov",
                "V-Urlov@ukr.net", "student", 20, Group.IT);
        User u5 = new User (null, "Max", "Gremen", "M_Grem",
                "M_Grem@ukr.net", "visitor", 40, Group.ADMINISTRATION);
        User u6 = new User (null, "Boris", "Moiseev", "BorMois",
                "BorMois@ukr.net", "student", 20, Group.IT);
        User u7 = new User (null, "Nikolay", "Vtoroy", "N.Vtor",
                "N.Vtor@ukr.net", "student", 20, Group.OPERATIONS);

        UserDaoJdbc userDaoJdbc = new UserDaoJdbc();
        System.out.println("создаём 8шт юзеров");
        userDaoJdbc.clearDB();
        userDaoJdbc.create(u0);
        userDaoJdbc.create(u1);
        userDaoJdbc.create(u2);
        userDaoJdbc.create(u3);
        userDaoJdbc.create(u4);
        userDaoJdbc.create(u5);
        userDaoJdbc.create(u6);
        userDaoJdbc.create(u7);

    }
}
