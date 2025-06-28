package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class MyServiceTest {

	 @Test
	    public void testVerifyInteraction() {
	        ExternalApi mockApi = mock(ExternalApi.class);     
	        MyService service = new MyService(mockApi);        
	        service.fetchData();                               
	        verify(mockApi).getData("jas");                 
	    }
}