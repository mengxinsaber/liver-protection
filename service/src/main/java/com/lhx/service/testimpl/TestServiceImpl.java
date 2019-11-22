package com.lhx.service.testimpl;

import com.lhx.dao.TestDao;
import com.lhx.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Name com.lhx.service.testimpl.TestServiceImpl
 * @Description * @Author lhx
 * @Version 2019/11/23 0:55
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestDao testDao;

    @Override
    public String getUser() {
        return testDao.getUser().getName();
    }
}
