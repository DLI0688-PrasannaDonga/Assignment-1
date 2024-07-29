public class StudentManagementSystem {
    int studentId;
    String name;
    int age;
    char grade;

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGrade(){
        return grade;
    }


    public static void main(String[] args) {
        StudentManagementSystem st =new StudentManagementSystem();
        st.setStudentId(34);
        st.setName("MOWAA");
        st.setAge(20);
        st.setGrade('A');
        System.out.println(st.getStudentId());
        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(st.getGrade());
    }
}
