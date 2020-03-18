package com.maven.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.maven.model.SysLockRecord;
import org.mybatis.spring.annotation.MapperScan;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author headean
 * @since 2020-03-12
 */
@MapperScan
public interface SysLockRecordMapper extends BaseMapper<SysLockRecord> {
    //boolean selectStock(String lockName);
}
