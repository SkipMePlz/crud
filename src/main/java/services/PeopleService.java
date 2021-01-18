package services;

import dao.UserDao;
import model.People;

import java.util.List;

public class PeopleService {
    private UserDao userDao = new UserDao();

    public PeopleService() {
    }
    public People findPeople(int id){
       return userDao.findById(id);
    }
    public void savePeople(People people){
        userDao.save(people);
    }
    public void deletePeople(People people){
        userDao.delete(people);
    }
    public void updatePeople(People people){
        userDao.update(people);
    }

}
