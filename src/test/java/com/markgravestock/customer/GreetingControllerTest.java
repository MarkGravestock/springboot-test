package com.markgravestock.customer;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GreetingControllerTest {

    private static final String NAME_TO_GREET = "Mark";
    private GreetingController sut;

    @Before
    public void setUp() throws Exception {
        sut = new GreetingController();
    }

    @Test
    public void canCreateGreetingContent() {
        assertThat(sut.greeting(NAME_TO_GREET).getContent(), is(equalTo("Hello, Mark!")));
    }

    @Test
    public void canCreateGreetingsWithUniqueIds() {
        assertThat(sut.greeting(NAME_TO_GREET).getId(), is(equalTo(1L)));
        assertThat(sut.greeting(NAME_TO_GREET).getId(), is(equalTo(2L)));
    }
}