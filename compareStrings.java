public class compareStrings {
    
    public static void main(String[] args) {
        String s1= new String("apple"); // Here create new obj so new reference
        String s2= new String("apple"); // Here create new obj so new reference

        System.out.println(s1.equals(s2));
        String a1= "apple"; //
        String a2= "apple"; // Points a1's reference
        System.out.println(a1==a2); // Compare reference between them
    }
}
/* 
 * PRIMITIVE DATA TYPES:
 * BYTE,SHORT,INT,LONG,FLOAT,DOUBLE,CHAR,BOOLEAN
 * REFERENCE AND OBJECTS:
 * STRING,ARRAY,OBJECT
 * 
 * 
 * MEMORY CONTAINS: STACK,HEAP-->POOL
 */