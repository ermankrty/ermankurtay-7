package com.assignment7.ermankurtay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_items_to_list() {

		//Arrange
		CustomArrayList<Integer> list = new CustomArrayList<Integer>();

		
		//Act
		list.add(10);
		list.add(20);


		
		//Assert
		assertEquals(10, list.get(0));
		assertEquals(20, list.get(1));
		
		

	
	}
	
	@Test
	void should_add_items_based_on_index() {
		
		//Arrange
		CustomArrayList<Integer> list = new CustomArrayList<Integer>();
		
		//Act
		list.add(5);
		list.add(10);
		list.add(15);
		
		list.add(1, 20);

				
		//Assert
		assertEquals(20, list.get(1));
		assertEquals(15, list.get(3));
				
		
	}
	
	@Test
	void should_get_size() {
		
		
		//Arrange
		CustomArrayList<Integer> list = new CustomArrayList<Integer>();

		//Act
		list.add(5);
		list.add(10);
		
		//Assert
		assertEquals(2, list.getSize());
		
	}
	
	@Test
	void should_get_item_from_list() {
		
		//Arrange
		CustomArrayList<Integer> list = new CustomArrayList<Integer>();

		//Act
		list.add(5);
		list.add(10);
		list.add(15);
				
		//Assert
		
		assertEquals(15, list.get(2));
	}
	
	@Test
	void should_remove_item_from_list() {
		
		//Arrange
		CustomArrayList<Integer> list = new CustomArrayList<Integer>();
		
		//Act
		list.add(5);
		list.add(10);
		list.add(20);
		
		list.remove(0);
		
		//Assert
		assertEquals(10, list.get(0));
		
	}

}
