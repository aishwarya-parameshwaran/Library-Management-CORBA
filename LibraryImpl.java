import org.omg.CORBA.*;
import Lib.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.sql.*;
public class LibraryImpl extends  _LibraryImplBase
{
public String get_book(String stid)
{
int id=Integer.parseInt(stid);
int id1,id2;
String bk,dt,str="null";
try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
String url = "jdbc:odbc:servernew";
Connection con = DriverManager.getConnection(url,"username","password");
Statement st= con.createStatement();
String QueryString = "SELECT * from Issued where id="+id;
ResultSet rs = st.executeQuery(QueryString);
while(rs.next()) 
{
id1= rs.getInt(1);
//st= rs.getString("stname");
//id2=rs.getInt("bkid");
bk= rs.getString(2);
dt=rs.getString(3);
str= bk;
}

}
catch(Exception e){e.printStackTrace();}
return str;
}
public void addBook(String id1, String date,String book)
{
int id=Integer.parseInt(id1);
try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
String url = "jdbc:odbc:servernew";
Connection con = DriverManager.getConnection(url,"sa","aishwarya2106");
Statement st= con.createStatement();
String QueryString = "INSERT into Issued values ("+id+",'"+book+"','"+date+"')";
st.executeUpdate(QueryString);
//String query="DELETE from Available where book='"+book+"'";
//st.executeUpdate(query);
//System.out.println("Book added");
}
catch(Exception e){e.printStackTrace();}
}

public LibraryImpl()
{
super();
}
}
