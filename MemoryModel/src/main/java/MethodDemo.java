
    class Person
    {
        public String firstName;
        public String lastName;
        public int age;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }
    }
    public class MethodDemo
    {
        public static void main(String[] args)
        {
            Person phil = new Person("Phil", "Windridge", 18 );
            System.out.println(phil.getFullName());
            Person nish = new Person("Nish", "Mandal", 21);
            double lachlan = 4.2;
            String cathy = aMethod(phil, lachlan);
        }
        public static String aMethod(Person conner, double anna)
        {
            conner.setLastName("Mandal");
            conner.setAge(26);
            anna *= 2;
            return conner.getFullName();
        }
    }

