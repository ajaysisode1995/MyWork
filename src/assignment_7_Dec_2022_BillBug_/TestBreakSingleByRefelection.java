package assignment_7_Dec_2022_BillBug_;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestBreakSingleByRefelection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SingleTon singleTon1 = SingleTon.getInstance();
		SingleTon singleTon2=null;
		
		Constructor<?>[] constructors = SingleTon.class.getDeclaredConstructors();
		for(Constructor<?> constructor:constructors) {
			constructor.setAccessible(true);
			
			Object object = constructor.newInstance();
			singleTon2=(SingleTon) object;
			break;
		}
		System.out.println(singleTon1.hashCode());
		System.out.println(singleTon2.hashCode());
	}
	
}
