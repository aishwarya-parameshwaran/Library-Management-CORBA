import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import Lib.*;
public class LibraryServer
{
public static void main(String[] args)
{
try
{
ORB orb=ORB.init(args,null);
LibraryImpl libimpl=new LibraryImpl();
orb.connect(libimpl);
org.omg.CORBA.Object objRef=orb.resolve_initial_references("NameService");
NamingContext ncRef=NamingContextHelper.narrow(objRef);
NameComponent nc=new NameComponent("Data Structure","");
NameComponent path[]={nc};
ncRef.rebind(path,libimpl);
System.out.println("server is ready");
Thread.currentThread().join();
}
catch(Exception e){
e.printStackTrace();
}}}
