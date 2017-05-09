package com.dengdd.learnspringapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.dengdd.learnspringapp.proxy.BookFacade;
import com.dengdd.learnspringapp.proxy.BookFacadeImpl;
import com.dengdd.learnspringapp.proxy.BookFacadeProxy;
import com.dengdd.learnspringapp.proxy.BookfacadeCGLib;
import com.dengdd.learnspringapp.proxy.BookfacadeCGLibProxy;
import com.dengdd.learnspringapp.proxy.BookfacadeImplCGLib;

// 默认的测试Runner，和不写着是一样的
@RunWith(BlockJUnit4ClassRunner.class)
public class ProxyTest {

	@Test
	public void testJDKProxy() {
		BookFacadeProxy bookProxy = new BookFacadeProxy();
		BookFacadeImpl bookimplt = new BookFacadeImpl();
		BookFacade bookf = (BookFacade) bookProxy.bind(bookimplt);
		bookf.addBook();
	}

	@Test
	public void testCGLibProxy() {
		BookfacadeCGLibProxy bookcg = new BookfacadeCGLibProxy();
		BookfacadeImplCGLib bookcgimpl = (BookfacadeImplCGLib) bookcg.getInstance(new BookfacadeImplCGLib());
		bookcgimpl.addBook("nihao");
	}
}
