package p2q3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Controller {
	private Object model;
	private Object view;

	public Controller(Object model, Object view) {
		this.model = model;
		this.view = view;
	}

	public void setName(String name) {
		Method method;
			try {
				method = model.getClass().getMethod("setName", String.class);
				method.invoke(model, name);
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public String getName() {
		Method method;
		try {
			method = model.getClass().getMethod("getName");
			return (String) method.invoke(model);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void setRollNo(String rollNo) {
		Method method;
		try {
			method = model.getClass().getMethod("setRollNo", String.class);
			method.invoke(model, rollNo);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getRollNo() {
		Method method;
		try {
			method = model.getClass().getMethod("getRollNo");
			return (String) method.invoke(model);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void updateView() {
		Method method;
		try {
			method = view.getClass().getMethod("printDetails", String.class, String.class);
			method.invoke(view,this.getName(),this.getRollNo());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
