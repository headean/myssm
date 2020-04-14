package com.maven.test.Dblock;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.maven.dao.mapper.SysLockRecordMapper;
import com.maven.model.SysLockRecord;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Created with IntelliJ IDEA.
 * Description: dblock
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2020-03-12 17:49
 */
@Component
public class Dblock implements Lock {
    private static final String LOCK_NAME = "db_lock_stock";

    @Resource
    private SysLockRecordMapper sysLockRecordMapper;

    @Override
    public void lock() {
        while (true){
            boolean b = tryLock();

            if (b) {
                // add record
                SysLockRecord sysLockRecord = new SysLockRecord() ;
                sysLockRecord.setLockName(LOCK_NAME);
                sysLockRecordMapper.insert(sysLockRecord);
                return;
            } else {
                System.out.println("Waiting thread...");
            }
        }
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    /**
     * try get lock
     * lock_name select db record
     * sql: select * from sys_lock_record where lock_name = 'db_lock_stock'
     * @return
     */
    @Override
    public boolean tryLock() {
        QueryWrapper<SysLockRecord> queryWrapper = new QueryWrapper<SysLockRecord>();
        queryWrapper.eq("lock_name", LOCK_NAME);
        SysLockRecord sysLockRecord = sysLockRecordMapper.selectOne(queryWrapper);

        if (null == sysLockRecord){
            return true;
        }

        return false;
    }

    @Override
    public boolean tryLock(long l, TimeUnit timeUnit) throws InterruptedException {
        return false;
    }

    /**
     * delete db_lock_stock record
     */
    @Override
    public void unlock() {
        QueryWrapper<SysLockRecord> queryWrapper = new QueryWrapper<SysLockRecord>();
        queryWrapper.eq("lock_name", LOCK_NAME);
        sysLockRecordMapper.delete(queryWrapper);
    }

    @Override
    public Condition newCondition() {
        return null;
    }

}
