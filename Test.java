public class Test{
    public static void main(String[] args)
    {
        IntegerArrayList list = new IntegerArrayList();

        for(int val = 10; val<= 60; val +=10)
        {
            list.add(val);
        }
        System.out.println("List: ");
        System.out.println(list);
        System.out.println();

        System.out.println("remove(5): ");
        list.remove(5);
        System.out.println(list);
        System.out.println();

        System.out.println("add(2,100): ");
        list.add(2,100);
        System.out.println(list);
        System.out.println();

        System.out.println("contains(100): ");
        System.out.println(list.contains(100));
        System.out.println(list);
        System.out.println();

        System.out.println("get(2): ");
        System.out.println(list.get(2));
        System.out.println(list);
        System.out.println();

        System.out.println("indexOf(100): ");
        System.out.println(list.indexOf(100));
        System.out.println(list);
        System.out.println();

        System.out.println("isEmpty(): ");
        System.out.println(list.isEmpty());
        System.out.println(list);
        System.out.println();

        
    IntegerArrayList list2 = new IntegerArrayList();
    for (int val = 10; val <= 60; val +=10)
    {
        list2.add(val);
    }
    list2.remove(5);
    list2.add(2,100);
    System.out.println("list 2: ");
    System.out.println(list2);
    System.out.println();

    System.out.println("equals(list2): ");
    System.out.println(list.equals(list2));
    System.out.println(list);
    System.out.println();

    System.out.println("size(): ");
    System.out.println(list.size());
    System.out.println(list);
    System.out.println();

    System.out.println("clear(): ");
    list.clear();
    System.out.println(list);
    System.out.println();

    }
}