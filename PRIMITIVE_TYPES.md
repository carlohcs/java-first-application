# PRIMITIVE TYPES

- `byte`: A primitive type that represents a signed 8-bit integer. It has a range of -128 to 127.
- `short`: A primitive type that represents a signed 16-bit integer. It has a range of -32,768 to 32,767.
- `int`: A primitive type that represents a signed 32-bit integer. It has a range of -2,147,483,648 to 2,147,483,647.
- `long`: A primitive type that represents a signed 64-bit integer. It has a range of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. -> only for long integers.
- `float`: A primitive type that represents a single-precision 32-bit floating-point number. -> 7 decimals
- `double`: A primitive type that represents a double-precision 64-bit floating-point number. -> 15 decimals
- `boolean`: A primitive type that represents a boolean value, which can be either `true` or `false`.
- `char`: A primitive type that represents a single Unicode character. It has a range of '\u0000' to '\uffff'.

public class PrimitiveTypesExample {
  public static void main(String[] args) {
    byte myByte = 10;
    short myShort = 100;
    int myInt = 1000;
    long myLong = 100000L;
    float myFloat = 3.14f;
    double myDouble = 3.14159;
    boolean myBoolean = true;
    char myChar = 'A';

    System.out.println("byte: " + myByte);
    System.out.println("short: " + myShort);
    System.out.println("int: " + myInt);
    System.out.println("long: " + myLong);
    System.out.println("float: " + myFloat);
    System.out.println("double: " + myDouble);
    System.out.println("boolean: " + myBoolean);
    System.out.println("char: " + myChar);
  }
}