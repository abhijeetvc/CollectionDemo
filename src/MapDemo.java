import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by abhi on 30/08/17.
 */
class Student{

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    Integer id;

    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class MapDemo {

    void getMap(){
        Map<String,Object> map=new HashMap();

        Student s=new Student();
        s.setId(1);
        s.setName("abhijeet");

        Student s2=new Student();
        s2.setId(2);
        s2.setName("abcd");

        map.put("name",s);


        Map<String,Object> map1=new HashMap<>();
        map1.put("name","abcd");
        map1.put("city","pune");


        Map<String,Object> map2=new HashMap<>();
        map2.put("1","abcd");
        map2.put("2","xyz");
      //  System.out.println(map1);


        List<Map<String,Object>> list=new ArrayList<>();

        list.add(map1);
        list.add(map2);

        Map<String,List<Student>> m3=new HashMap<>();

        List<Student> l11=new ArrayList<>();
        l11.add(s);
        l11.add(s2);

        m3.put("students",l11);

        for(Map.Entry<String,List<Student>> mn:m3.entrySet()){

            System.out.println(mn.);

            List<Student> li=mn.getValue();

//            for(Student l:li){
//                System.out.println(l.getId()+" "+l.getName());
//            }

        }


        for(Map<String,Object> m:list){
            //System.out.println(m.entrySet());

            for(Map.Entry<String,Object> mm:m.entrySet()) {

           //     System.out.println(mm.getKey() + " " + mm.getValue());
            }


          //  System.out.println(m.values());
        }


//        for(Map.Entry m1:map2.entrySet()){
//            System.out.println(m1.getKey()+" "+m1.getValue());
//        }

    }

    public static void main(String[] args) {
        MapDemo m=new MapDemo();
        m.getMap();
    }
}


