package service;


import dbService.DatabaseService;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoginServiceTest {

    private DatabaseService databaseService;

    @Before
    public void before(){
        databaseService = mock(DatabaseService.class);
    }

    @Test
    public void testGetRole(){
        // Given
        LoginService loginService = new LoginService(databaseService);
        when(databaseService.getRoleByEmail(eq("email"))).thenReturn("role");

        // When
        String result = loginService.getRoleByEmail("email");

        // Then
        assertThat(result).isEqualTo("role");

    }

}