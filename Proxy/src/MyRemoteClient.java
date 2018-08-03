import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        new MyRemoteClient().go();
    }

    public void go() throws RemoteException, MalformedURLException, NotBoundException {
        MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
        System.out.println(service.sayHello());
    }
}
