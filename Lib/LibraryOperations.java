package Lib;


/**
* Lib/LibraryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Library.idl
* Thursday, 3 April, 2014 8:49:34 PM IST
*/

public interface LibraryOperations 
{
  String get_book (String id);
  void addBook (String id, String date, String book);
} // interface LibraryOperations
