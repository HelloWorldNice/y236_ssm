package cn.bdqn.service.impl;

import cn.bdqn.domain.Account;
import cn.bdqn.mapper.AccountMapper;
import cn.bdqn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    @Transactional(readOnly = true,propagation = Propagation.NOT_SUPPORTED)
    public List<Account> queryAll() {
        return accountMapper.selectAll();
    }

    @Override
    public void save(Account account) {
        accountMapper.insert(account);
    }
}
