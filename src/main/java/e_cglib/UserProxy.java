package e_cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 使用CGLIB代理. 这就是CGLIB的代理工厂.
 */
public class UserProxy implements MethodInterceptor {

	// 持有一个对象引用, 这里使用Object类型, 可以处理一切对象类型
	private Object target;

	/**
	 * 有参构造, 为了传入目标对象
	 * 
	 * @param target
	 */
	public UserProxy(Object target) {
		super();
		this.target = target;
	}

	/**
	 * 获取到所有代理对象后的子对象
	 * 
	 * @return
	 */
	public Object getProxyInstance() {
		/**
		 * Enhancer是字节码生成工具类
		 */
		Enhancer enhancer = new Enhancer();

		/**
		 * 获取到目标对象的运行时对象, 并且把它设为父类
		 */
		enhancer.setSuperclass(target.getClass());

		/**
		 * 设置回调函数
		 */
		enhancer.setCallback(this);

		/**
		 * 创建出子对象, 并且返回
		 */
		return enhancer.create();
	}

	/**
	 * 执行目标方法的时候来出发这里的操作
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

		System.out.println("开始做事...");

		Object result = method.invoke(target, args);

		System.out.println("结束做事...");

		return result;
	}

}
