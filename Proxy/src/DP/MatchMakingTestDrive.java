package DP;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    public static void main(String[] args) {
        PersonBean ye = new PersonBeanImpl();
        ye = getOwnerProxy(ye);
        ye.setName("Ye");
        ye.setGender("Male");
        ye.setInterests("JAVA");
        try {
            ye.setHotOrNotRating(100);
        } catch (Exception e) {
            System.out.println("You can't set you hot rating");
        }
        PersonBean ye2 = new PersonBeanImpl();
        PersonBean nonYe = getNonOwnProxy(ye2);
        System.out.println(nonYe.getHotOrNotRating());
        nonYe.setHotOrNotRating(1000);
    }

    static PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }

    static PersonBean getNonOwnProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new NonOwnerInvocationHandler(personBean));
    }
}
