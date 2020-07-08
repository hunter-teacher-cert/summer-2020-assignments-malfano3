
import java.io.*;
import java.util.*;

public class Node {
  private String data;
  private Node next;

  public Node(String data, Node next){
    this.next = next;
    this.data = data;
  }
  public Node(String data){
    this.next = null;
    this.data = data;
  }
  public Node(){
    this.next = null;
    this.data = "";
  }

  public void setData(String data){
    this.data = data;
  }

  public void setNext(Node next){
    this.next = next;
  }
  public String getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }

  public String toString(){
    return this.data;
  }
}
