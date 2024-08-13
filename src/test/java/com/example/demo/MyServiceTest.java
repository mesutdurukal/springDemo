package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@ExtendWith(MockitoExtension.class)
public class MyServiceTest {

    // inject mocks into
    @InjectMocks
    MyService myService;

    // Create mocks
    @Mock
    private MySecondServices mySecondServices;

    @Test
    public void testMyFunction(){
        // given
        when(mySecondServices.getCurrentMemberCount()).thenReturn(5);

        // when
        final int result = myService.myFunction();

        // then
        assertThat(result, is(6));

    }
}
