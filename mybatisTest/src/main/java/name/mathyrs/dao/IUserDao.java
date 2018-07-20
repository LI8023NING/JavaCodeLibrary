package name.mathyrs.dao;

import name.mathyrs.domain.User;

/*
 *  以下函数均对应XML中 id属性值 
 * 
 * */

public interface IUserDao {
	
    void addUser(User user);

    User selectUserbyName(String userName);

    User selectUser(String userName, String password);

    void updateUser(User user);

    void deleteUser(User user);
}
