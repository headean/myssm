package com.maven.test.interview2021.a_equals;

import com.google.common.base.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description: 重写 equals()方法的模板
 *              为什么重写equals方法之前要重写hashCode方法：
 *              1.因为 Object规范中说到: 相等的对象必须具有相等的散列码
 *              2.因为hashCode散列码的目的是为了HashSet、HashMap、HashTable比较的时候缩小范围空间,
 *                  它只是返回一个散列整数然后根据散列码去散列桶中查找对象区间。它不保证对象是否是相等的
 *
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-17 13:58
 * @author input
 */
public class EqualsOverride {
    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EqualsOverride that = (EqualsOverride) o;
        return age == that.age &&
                Objects.equal(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EqualsOverride() {
    }

    public EqualsOverride(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        EqualsOverride zhangsan = new EqualsOverride(1, "zhangsan");
        EqualsOverride lisi = new EqualsOverride(1, "zhangsan");

        System.out.println(zhangsan.equals(lisi));
        System.out.println(zhangsan.hashCode());
        System.out.println(lisi.hashCode());
    }
}
