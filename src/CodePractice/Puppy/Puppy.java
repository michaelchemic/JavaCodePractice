package CodePractice.Puppy;

public class Puppy {
    int puppyAge;
    public Puppy(String name){ //构造方法
        System.out.println("name" + name);
    }
    public void setAge(int age){
        puppyAge = age;
    }
    public void getAge(){
        System.out.println("age"+ puppyAge);
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("变量值位：" + myPuppy.puppyAge);

    }
}
