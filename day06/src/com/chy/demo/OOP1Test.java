package com.chy.demo;
/*
 * 面向过程：(强调行为)
 * 		强调的是功能行为，以函数为最小单位，强调怎么做
 * 面向对象：
 * 		强调了具备功能的对象，以类/对象为最小单位，考虑谁来做
 * 类：
 * 		是对一类事物的描述，是抽象的，概念上的意义。
 * 对象：
 * 		实际存在的该类事物的个体，因此也称为实例。
 * 面向对象程序设计的重点是：类的设计（属性和方法）
 * 		属性：成员变量=field
 * 		行为：成员方法=函数
 * 创建类的对象等同于类的实例化
 * 类和对象的使用：
 * 		1.创建类，设计类的成员
 * 		2.创建类的对象
 * 		3.通过“对象.属性”或者“对象.方法”调用对象的结构
 * 如果创建了一个类的多个对象：则每个对象都独立的拥有一套类的属性(非static)
 * 意味着如果我们修改一个对象的属性a，则不影响另一个对象属性a
 * 面向对象的内存解析：
 * 		堆(heap)：存放实例对象，所有的实例对象和数组都要在堆上分配。
 * 		栈(stack)：虚拟机栈，用于存放局部变量。
 * 		方法区：用于存储已被虚拟机加载的类信息，常量，静态变量，即时编译器编译后的代码等数据。
 *
 * 1.Java类即类的成员：
 * 		属性，方法，构造器，代码块，内部类
 * 2.面向对象的三大特征：
 * 		封装性，继承性，多态性，（抽象性）
 * 3.其它关键字：
 * 		this,super,static,final,abstract,interface,package,import
 * 		
 */
public class OOP1Test {
	public static void main(String[] args)
	{
		//创建Person类的对象
		Person p1 = new Person();
		//调用对象的属性
		p1.name = "Tom";
		p1.isMale = true;
		p1.age=1;
		System.out.println(p1.name);
		//调用对象的方法
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		
		Person p2 = new Person();
		System.out.println(p2.name);
		System.out.println(p2.isMale);
		
		//将p1变量保存的对象地址值赋给p3，导致p1和p3指向了堆空间中的同一个对象实体
		Person p3 =p1;
		p3.age=10;
		System.out.println(p3.name);
		System.out.println(p1.age);
	}
}
class Person{
	//属性
	String name;
	int age;
	boolean isMale;
	//方法
	public void eat() {
		System.out.println("人可以吃饭");
	}
	public void sleep() {
		System.out.println("人可以睡觉");
	}
	public void talk(String language)
	{
		System.out.println("人可以说话,使用的是："+language);
	}
}
