package com.yy.chapter19Ã¶¾Ù;

enum Shrubbery{GROUND,CRAWING,HANGING}
public class EnumClass {
    public static void main(String[] args) {
        for(Shrubbery s : Shrubbery.values()){
            System.out.print(s + "ordinal" + s.ordinal());
            System.out.print("----" + s.compareTo(Shrubbery.CRAWING) + " compareTo ");
            System.out.print("----" + s.equals(Shrubbery.CRAWING) + " equals ");
            System.out.print( s == Shrubbery.CRAWING);
            System.out.print(s.getDeclaringClass());
            System.out.print(s.name());
            System.out.println("================");
        }
    }
}
