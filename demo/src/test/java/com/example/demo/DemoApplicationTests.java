package com.example.demo;

import Model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import Model.Book;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@PersistenceContext
	EntityManager em;


	@Test
	@Transactional
	public void SaveBook() {
		Book book = new Book();
		em.persist(book);
	}

	@Test
	@Transactional
	public void When_SaveBook_BookIsSaved() {
		Book book = new Book();
		String title = "book's title";
		book.setTitle(title);
		em.persist(book);

		fail();
	}

	}
