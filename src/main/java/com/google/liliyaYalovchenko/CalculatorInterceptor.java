package com.google.liliyaYalovchenko;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

import java.util.Arrays;


public class CalculatorInterceptor implements MethodInterceptor {

   private static final Logger log = Logger.getLogger(CalculatorInterceptor.class);

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info(invocation.getMethod().getName() + " method start executing. Inputs: " + Arrays.toString(invocation.getArguments()));
        Object result = null;
        try {
            result = invocation.proceed();
        } catch (Exception ex) {
            log.error(ex);
        }

        if (!(null == result)) {
            log.info(invocation.getMethod().getName() + " method stop executing. Result is " + result);
        } else {
            log.info(invocation.getMethod().getName() + " method stop executing.");
        }
        return result;
    }
}
