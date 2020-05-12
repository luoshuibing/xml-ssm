package free.man.dao;

import free.man.model.Account;

import java.util.List;

/**
 * 账户dao接口
 */
public interface AccountDao {

    //查询所有账户信息
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);

}
