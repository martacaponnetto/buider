public class Person {
        private String firstName;
        private String lastName;
        private Integer age;
        private String address;
        private Integer height;

        public Person(Builder builder) {
            this.firstName = builder.getFirstName();
            this.lastName = builder.getLastName();
            this.age = builder.getAge();
            this.address = builder.getAddress();
            this.height = builder.getHeight();

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", height=" + height +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

