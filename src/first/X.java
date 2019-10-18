package first;

import java.io.*; 
  
// A simple interface 
interface Test3
{ 
    // public, static and final 
     int a = 10; 
  
    // public and abstract  
    void display(); 
} 
  
// A class that implements interface. 
class X implements Test3
{ 
    // Implementing the capabilities of 
    // interface. 
    public void display() 
    { 
        System.out.println("Geek"); 
    } 
  
    // Driver Code 
    public static void main (String[] args) 
    { 
        X t = new X(); 
        t.display(); 
        System.out.println(a); 
    } 
} 
