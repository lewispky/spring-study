package com.micro.springstudy.web.jdkproxy;

import com.micro.springstudy.utils.MicroLogFactory;
import com.micro.springstudy.utils.MicroLogUtil;

/*
 * Created by Administrator on 2017/7/8 0008.
 */
public class UserServiceImpl implements UserService {

    private static final MicroLogUtil log = MicroLogFactory.getLogger();

    public void add() {
        log.info("-----------------------add---------------------");
    }
}
