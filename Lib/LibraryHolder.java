package Lib;

/**
* Lib/LibraryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Library.idl
* Thursday, 3 April, 2014 8:49:34 PM IST
*/

public final class LibraryHolder implements org.omg.CORBA.portable.Streamable
{
  public Lib.Library value = null;

  public LibraryHolder ()
  {
  }

  public LibraryHolder (Lib.Library initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Lib.LibraryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Lib.LibraryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Lib.LibraryHelper.type ();
  }

}
