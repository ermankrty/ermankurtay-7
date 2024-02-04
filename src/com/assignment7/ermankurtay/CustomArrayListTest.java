package com.assignment7.ermankurtay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_items_to_list() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.add(10);
		list.add(20);
		assertEquals(10, list.get(0));
		assertEquals(20, list.get(1));
	}

	@Test
	void should_add_items_based_on_index() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(1, 20);
		assertEquals(20, list.get(1));
		assertEquals(15, list.get(3));
	}

	@Test
	void should_get_size() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.add(5);
		list.add(10);
		assertEquals(2, list.getSize());
	}

	@Test
	void should_get_item_from_list() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		assertEquals(15, list.get(2));
	}

	@Test
	void should_remove_item_from_list() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.add(5);
		list.add(10);
		list.add(20);
		list.remove(0);
		assertEquals(10, list.get(0));
	}

	@Test
	void should_add_and_remove_items_to_change_size() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.remove(1);
		list.add(20);
		assertEquals(3, list.getSize());
	}

	@Test
	void should_remove_last_item() {
		CustomArrayList<Integer> list = new CustomArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.remove(2);
		assertEquals(10, list.get(1));
	}

	@Test
	void should_not_add_null_items() {
		CustomArrayList<String> list = new CustomArrayList<>();
		assertFalse(list.add(null));
	}

}
