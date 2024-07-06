package com.tech.home.app;

import com.tech.home.app.config.AsyncSyncConfiguration;
import com.tech.home.app.config.EmbeddedSQL;
import com.tech.home.app.config.JacksonConfiguration;
import com.tech.home.app.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        FinancialServiceApplicationApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class,
    }
)
@EmbeddedSQL
public @interface IntegrationTest {
}
