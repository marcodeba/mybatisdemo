package marco.springboot.mybatisdemo.demo;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MapperProxyFactory implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Select select = method.getAnnotation(Select.class);
        String sql = select.value()[0];
        System.out.println(sql);
        return null;
    }
}
