class Person {

    String firstName;

    String lastName;


  Person(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
}

String getLastName() {
  return lastName;
}

String getFirstName() {
  return firstName;

}

}

// linked list java util 1.4
class Entry {

  Person element; 
  Entry next; 
  Entry previous;

  Entry(Person element, Entry next, Entry previous) { 
  this.element = element; 
  this.next = next; 
  this.previous = previous; }

}

class LinkedList1618 {

Entry header = new Entry(null, null, null); int size;

/ * Constructs an empty Linked List. * / LinkedList1618() {

header.next = header;

header.previous = header; }

/ * Returns the last Element in this List. * / 

  Person getLast() {
    if (size == 0) throw new java.util.NoSuchElementException();
    return header.previous.element; 
}

/ * Removes and returns the last Element from this List. * / 
  Person removeLast() { 
  Entry lastEntry = header.previous; 
  if (lastEntry == header) throw new java.util.NoSuchElementException(); 
  lastEntry.previous.next = lastEntry.next; 
  lastEntry.next.previous = lastEntry.previous; 
  size--; 
  return lastEntry.element; }

/ * Appends the given element to the end of this List. * / 
  void addLast(Person p) { Entry newEntry = new Entry(p, header, header.previous); header.previous.next = newEntry; header.previous = newEntry; size++; }

/ * Returns the number of elements in this List. * / 
  int size() { return size; }

}
