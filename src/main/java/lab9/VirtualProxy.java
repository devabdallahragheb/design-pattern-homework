package lab9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class VirtualProxy implements InvocationHandler {

    private IComplex realObject;  // The real object is initially null
    private boolean isInitialized = false;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Check if the real object is not yet initialized
        if (!isInitialized) {
            System.out.println("real ComplexClass");
            realObject = new ComplexClass();
            isInitialized = true;
        }
        return method.invoke(realObject, args);
    }

    // Static method to create a proxy instance
    public static IComplex createProxy() {
        return (IComplex) Proxy.newProxyInstance(
                IComplex.class.getClassLoader(),
                new Class<?>[]{IComplex.class},
                new VirtualProxy()
        );
    }
}