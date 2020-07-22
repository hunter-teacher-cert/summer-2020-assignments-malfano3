/**
 * The Phonebook program is used for storing a phonebook.
 *
 * Methods will include:
 *
 * add - you should be able to add new people in to the PhoneBook.
 * This operation should be optimized to be as fast as possible.
 *
 * find - you should be able to find a person. For example, pb.find("Smith")
 * would return the person in the phone book with last name "Smith".
 * Assume that last names are unique. Find should return null if the person is
 * not in the phone book. This operation should be optimized
 * to be as fast as possible.
 *
 * remove - remove a person from the list based on lastName.
 * This operation does not have to be optimized.
 *
 * printList - this would print out an entire phone book.
 * This operation does not have to be optimized.
 *
 *
 * The Phonebook class will use the class Person, which has the following:
 *
 * private String lastName
 * private String firstName
 * private String phoneNumber
 *
 *
 *
 */

/*

public class Phonebook {

public Phonebook() {
        // create an empty ArrayList of length 10,009 (prime)
        // to reduce load factor
}

public void add(Person p) {
        // run unique last name through hash function and add to ArrayList
        // hash will use the following function:
        // [(sum lastName chars) * 20,719]  % 10,009

        // where are constants listed above are prime

        // data type of long will be used since max value is ~ 9 * 10^18

        // add Person p to al[hash_output]

        // use linear probing if collision occurs
}

public Person find(String lastName) {
        // calculate hash_output using lastName
        // verify result, use linear probing, if required, store as "index"
        // return al[index]
}

public void remove(String lastName) {
        // calculate hash_output using lastName
        // verify result, use linear probing, if required, store as "index"
        // al[index] = null
}

public void printList(PhoneBook pb) {
        // for all elements of ArrayList
        // if current element != null:
        // System.out.println(lastName + ", " + firstName + ", " + phoneNumber);
}

*/

/*
 * Additional questions:
 *
 * 1. What is the runtime for add?
 * The runtime for add should be extremely close to O(1), but could stray
 * closer to O(n) if clustering and collisions occur.
 *
 * 2. What is the runtime for find?
 * The runtime for find should be extremely close to O(1), but could stray
 * closer to O(n) if clustering and collisions occur.
 *
 * 3. What is the runtime for remove?
 * The runtime for remove should be extremely close to O(1), but could stray
 * closer to O(n) if clustering and collisions occur.
 *
 * 4. What is the runtime for printList?
 * The runtime for printList will be O(n) since we have to iterate through
 * an entire ArrayList of n items to check if each position contains
 * a Person or is null.
 *
 *
 *
 *
 *
 *
 */




























}
