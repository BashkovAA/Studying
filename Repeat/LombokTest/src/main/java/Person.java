import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"age"})
public class Person {
    private String name;
    private int age;

//    @Override
//    public String toString() {
//        return "Name: " + name +
//                "\n" + "Age: " + age;
//    }
}
