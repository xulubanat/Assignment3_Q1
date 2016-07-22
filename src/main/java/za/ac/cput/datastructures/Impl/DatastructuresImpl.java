package za.ac.cput.datastructures.Impl;

import za.ac.cput.datastructures.Datastructures;

import java.util.*;

/**
 * Created by student on 2016/06/03.
 */
public class DatastructuresImpl implements Datastructures {


    public DatastructuresImpl() {
        super();
    }

    @Override
    public Set<String> winningnumbers() {
        Set nums = new HashSet();
        nums.add(38);
        nums.add(4);
        nums.add(12);
        nums.add(18);
        nums.add(34);
        nums.add(25);
        return nums;
    }

    @Override
    public Map<String, String> myBooks() {

        Map books = new HashMap();
        books.put("1", "Java");
        books.put("2", "C++");
        books.put("3", "PL/SQL");
        return books;

    }

    @Override
    public List<String> cars() {

        List cars = new ArrayList();
        cars.add("Rollsroyce");
        cars.add("Range Rover");
        cars.add("BMW");

        return cars;

    }
}
