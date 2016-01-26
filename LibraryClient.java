import java.util.*;
import java.io.*;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.*;
import Lib.*;

public class LibraryClient
{
public static void main(String[] args)
{
try
{
int ch=0;
ORB orb=ORB.init(args,null);
NamingContext ncRef=NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
NameComponent path[]={new NameComponent("Data Structure","")};
Library lib= LibraryHelper.narrow(ncRef.resolve(path));


//System.out.println("Book borrowed: "+lib.get_book(args[2]));
DataInputStream d1=new DataInputStream(System.in);
while(ch!=3)
{
System.out.println("1.Check issued book	2.Add entry for issued book	3.Exit");
System.out.println("Select action to be performed:");
ch=Integer.parseInt(d1.readLine());
switch(ch)
{
case 1: 	System.out.println("Enter student id:");
	String id=d1.readLine();
	System.out.println("Book borrowed: "+lib.get_book(id));
	break;

case 2:	System.out.println("Enter student id:");
	String id1=d1.readLine();
	System.out.println("Enter book name:");
	String bk=d1.readLine();
	System.out.println("Enter return date:");
	String dt=d1.readLine();
	lib.addBook(id1,dt,bk);
	break;


}
}
}
catch(Exception e) {
e.printStackTrace();
}
}
}