package OptionalTest;

import java.util.Optional;

/**
 *  develop by AhmdIbrahim
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        Optional<String> hello = Optional.ofNullable(null);
//
//        System.out.println(hello.isPresent());
//        System.out.println(hello.isEmpty());
//
//        hello.ifPresentOrElse(System.out::println, () -> System.out.println("world"));

        Person  person = new Person("JAMES", "JAMES@gmail.com");

//        String email = person
//                .getEmail()
//                .map(String::toLowerCase)
//                .orElse("email not provided");
//
//        System.out.println(email);

        if (person.getEmail().isPresent()){
            String email = person.getEmail().get();
            System.out.println(email.toLowerCase());
        }else {
            System.out.println("email not provided");
        }

    }

}

class Person {
    private final String name;

    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional <String> getEmail() {
        return Optional.ofNullable(email);
    }
}
