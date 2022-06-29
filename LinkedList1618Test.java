class LinkedList1618Test {

public static void main(String[] args) { LinkedList1618 personList = new LinkedList1618();

Person p0 = new Person("vorname_0", "nachname_0");

personList.addLast(p0);

Person p1 = new Person("vorname_1", "nachname_1");

personList.addLast(p1);

Person p2 = new Person("vorname_2", "nachname_2");

personList.addLast(p2);

for (int i = 0; i < personList.size; i++) {

Person p = personList.getElementAt(i); System.out.println(p.getFirstName() + " " + p.getLastName());

} Person x = personList.getElementAt(4);

}

}
