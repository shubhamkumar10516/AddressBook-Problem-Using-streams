package com.bridgelab.addressBookProblem;


import java.util.*;
import java.util.stream.Collectors;

public class Dictionary {

	 HashMap<String , String>  cityPersonDictionary = new HashMap<>();
	 HashMap<String , String>  statePersonDictionary = new HashMap<>();
	 
	 
	 public void addToDictionary(String name , String state, String city) {
		 
		 cityPersonDictionary.put(city, name );
		 statePersonDictionary.put( state, name);
	 }
	 public void viewPersonByCityAndState() {
		 cityPersonDictionary.forEach(
				 (k,v) -> System.out.println("City : "+ k + ", Person : "+v)
				 );
		 
		 statePersonDictionary.forEach(
				 (k,v) -> System.out.println("State : "+ k + ", Person : "+v)
				 );
	 }
	 public void countByState(String state) {
		 //int count = (int)statePersonDictionary.entrySet().stream().filter(e -> e.getKey().equals(state)).
			//	 map(Map.Entry::getValue).count();
		 List<String> names = statePersonDictionary.entrySet().stream().filter(e -> e.getKey().equals(state))
				                       .map(Map.Entry :: getValue).collect(Collectors.toList());
		 System.out.println(names);
		 System.out.println(names.size());
	 }
	 public void countByCity(String city) {
		 //int count = (int)statePersonDictionary.entrySet().stream().filter(e -> e.getKey().equals(city)).
			//	 map(Map.Entry::getValue).count();
		 List<String> names = statePersonDictionary.entrySet().stream().filter(e -> e.getKey().equals(city))
                 .map(Map.Entry :: getValue).collect(Collectors.toList());
         System.out.println(names);
         System.out.println(names.size());
	 }
	 
}
