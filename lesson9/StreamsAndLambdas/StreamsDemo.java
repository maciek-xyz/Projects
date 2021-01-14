package Lesson9;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Lesson9.Sex.FEMALE;
import static Lesson9.Sex.MALE;

public class StreamsDemo {

    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("Jan", "Kowalski", LocalDate.of(2004,2,14),MALE,6000, new Addres("Kraków")));
        personsList.add(new Person("Maria", "Nowak", LocalDate.of(1990,12,27),FEMALE,4500, new Addres("Poznań")));
        personsList.add(new Person("Tadeusz", "Lewandowski", LocalDate.of(1968,3,30),MALE,12000, new Addres("Wrocław")));
        personsList.add(new Person("Agnieszka", "Zielińska", LocalDate.of(1999,7,1),FEMALE,5800, new Addres("Kraków")));
        personsList.add(new Person("Andrzej", "Grosicki", LocalDate.of(1972,1,19),MALE,9500, new Addres("Warszawa")));
        personsList.add(new Person("Jakub", "Fabiański", LocalDate.of(1979,5,13),MALE,2500, new Addres("Lublin")));
        personsList.add(new Person("Katarzyna", "Bednarek", LocalDate.of(1950,9,05),FEMALE,28000, new Addres("Warszawa")));
        personsList.add(new Person("Michał", "Glik", LocalDate.of(1984,11,16),MALE,16000, new Addres("Kraków")));
        personsList.add(new Person("Tomasz", "Płacheta", LocalDate.of(1954,5,28),MALE,3500, new Addres("Gdańsk")));
        personsList.add(new Person("Aleksandra", "Piątek", LocalDate.of(1948,3,25),FEMALE,7000, new Addres("Wrocław")));

        System.out.println("==============all men under 65 years==================");
        List<Person> menUnder65 = personsList.stream()
                .filter(x -> x.sex.equals(MALE))
                .filter(x -> x.birthDay.isBefore(LocalDate.of(1956, 1, 14)))
                .collect(Collectors.toList());
        System.out.println(menUnder65);

        System.out.println("==============all women with salary less than 5000==================");
        List<Person> womenWithSalaryLessThan5000 = personsList.stream()
                .filter(x -> x.sex.equals(FEMALE))
                .filter(x -> x.salary < 5000)
                .collect(Collectors.toList());
        System.out.println(womenWithSalaryLessThan5000);

        System.out.println("==============all persons younger than 18 years from Krakow==================");
        List<Person> personsYoungerThan18YearsFromKrakow = personsList.stream()
                .filter(x -> x.birthDay.isAfter(LocalDate.of(2003,1,14)))
                .filter(x -> x.addres.getCity().equals("Kraków"))
                .collect(Collectors.toList());
        System.out.println(personsYoungerThan18YearsFromKrakow);

        System.out.println("==============all persons who are not from Krakow==================");
        List<Person> personsWhoAreNotFromKrakow = personsList.stream()
                .filter(x -> !x.addres.getCity().equals("Kraków"))
                .collect(Collectors.toList());
        System.out.println(personsWhoAreNotFromKrakow);

        System.out.println("==============average salary==================");
        Double averageSalary = personsList.stream()
                .collect(Collectors.averagingDouble(x -> x.salary));
        System.out.println("Average salary: " + averageSalary);

        System.out.println("==============number of women in Krakow==================");
        long numberOfWomenInKrakow =  personsList.stream()
                .filter(x -> x.sex.equals(FEMALE))
                .filter(x -> x.addres.getCity().equals("Kraków"))
                .count();
        System.out.println("Number of women in Krakow: " + numberOfWomenInKrakow);

        System.out.println("==============number of men after 65 years==================");
        long numberOfManAfter65 = personsList.stream()
                .filter(x -> x.sex.equals(MALE))
                .filter(x -> x.birthDay.isAfter(LocalDate.of(1956, 1, 14)))
                .count();
        System.out.println("Number of men after 65 years: " + numberOfManAfter65);

        System.out.println("==============oldest person==================");
        Comparator<Person> comparator1 = Comparator.comparing(Person::getBirthDay);
        Person oldestPerson = personsList.stream()
                .min(comparator1).get();
        System.out.println("Oldest person: " + oldestPerson);

        System.out.println("==============youngest person from Krakow==================");
        Comparator<Person> comparator2 = Comparator.comparing(Person::getBirthDay);
        Person youngestPersonFromKrakow = personsList.stream()
                .filter(x -> x.addres.getCity().equals("Kraków"))
                .max(comparator2).get();
        System.out.println("Youngest person from Krakow: " + youngestPersonFromKrakow);

        System.out.println("==============total salary==================");
        long totalSalary = personsList.stream()
                .collect(Collectors.summingLong(Person::getSalary));
        System.out.println("Total salary: " + totalSalary);

        System.out.println("==============does any person has first letter 'A' in firstName==================");
        boolean doesAnyPersonHasFirstLetterAInFirstName = personsList.stream()
                .anyMatch(x -> x.firstName.startsWith("A"));
        System.out.println(doesAnyPersonHasFirstLetterAInFirstName);

        System.out.println("==============does all persons contains letter 'a' in lastName==================");
        boolean doesAllPersonsContainsLetteraInLastName = personsList.stream()
                .allMatch(x -> x.lastName.contains("a"));
        System.out.println(doesAllPersonsContainsLetteraInLastName);

    }
}
