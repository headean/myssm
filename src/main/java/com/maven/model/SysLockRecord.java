package com.maven.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author headean
 * @since 2020-03-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysLockRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * db lock name
     */
    private String lockName;


}
