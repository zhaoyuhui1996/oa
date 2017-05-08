package service;

import po.User;

/**
 * Created by ideapad on 5/6/2017.
 */
public interface LoginService {
    User selectByUserId(String s);
}
