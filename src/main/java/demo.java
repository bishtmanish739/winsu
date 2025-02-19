import java.util.Objects;

public class demo {

    public static  void main(String[] args){
        A a=new A(1,"abc","adx");
        A b=new A(1,"abc","adx");
        B b1=new B(1,"abc","adx");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(b1.hashCode());
        System.out.println(a.equals(b));



    }
}
class  B{
    int id;
    String name;
    String b;
    public B(int id, String name,String b){
        this.id=id;
        this.name=name;
        this.b=b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return id == a.id && Objects.equals(name, a.name) && Objects.equals(b, a.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, b);
    }
}
class  A{
    int id;
    String name;
    String b;
   public A(int id, String name,String b){
       this.id=id;
        this.name=name;
        this.b=b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return id == a.id && Objects.equals(name, a.name) && Objects.equals(b, a.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, b);
    }
}