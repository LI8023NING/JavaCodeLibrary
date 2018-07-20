package name.mathyrs.dao;

import name.mathyrs.domain.User;

/*
 *  ���º�������ӦXML�� id����ֵ 
 * 
 * */

public interface IUserDao {
	
    void addUser(User user);

    User selectUserbyName(String userName);

    User selectUser(String userName, String password);

    void updateUser(User user);

    void deleteUser(User user);
}
