package cn.mpy.readwriteisolate.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 默认情况下，所有的查询都走从库，插入/修改/删除走主库。我们通过方法名来区分操作类型（CRUD）
 * @author x3626
 *
 */
@Aspect
@Component
public class DataSourceAop {

    @Pointcut("!@annotation(cn.mpy.readwriteisolate.annotation.Master) " +
            "&& (execution(* cn.mpy.readwriteisolate.service.*.select*(..)) " +
            "|| execution(* cn.mpy.readwriteisolate.service..*.find*(..)))")
    public void readPointcut() {

    }

    @Pointcut("@annotation(cn.mpy.readwriteisolate.annotation.Master) " +
            "|| execution(* cn.mpy.readwriteisolate.service..*.save*(..)) " +
            "|| execution(* cn.mpy.readwriteisolate.service..*.add*(..)) " +
            "|| execution(* cn.mpy.readwriteisolate.service..*.update*(..)) " +
            "|| execution(* cn.mpy.readwriteisolate.service..*.edit*(..)) " +
            "|| execution(* cn.mpy.readwriteisolate..*.delete*(..)) " +
            "|| execution(* cn.mpy.readwriteisolate..*.remove*(..))")
    public void writePointcut() {

    }

    @Before("readPointcut()")
    public void read() {
        DBContextHolder.slave();
    }

    @Before("writePointcut()")
    public void write() {
        DBContextHolder.master();
    }

}

