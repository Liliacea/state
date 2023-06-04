import java.rmi.*;
import java.rmi.server.*;
public  class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    private static final long serialVersionUID = 1L;
    protected MyRemoteImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "say Hello";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("/ /localhost / MyRemote", service);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
