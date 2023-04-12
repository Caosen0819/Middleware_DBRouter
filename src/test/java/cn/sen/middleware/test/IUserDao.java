package cn.sen.middleware.test;

import cn.sen.middleware.db.router.annotation.DBRouter;

/**
 * @Author caosen
 * @Date 2023/3/31 20:33
 */
public interface IUserDao {

    @DBRouter(Key = "userId")
    void insertUser(String req);
}
