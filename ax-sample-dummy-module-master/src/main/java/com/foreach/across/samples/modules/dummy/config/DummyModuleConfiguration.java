package com.foreach.across.samples.modules.dummy.config;

import com.foreach.across.samples.modules.dummy.DummyModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author Steven Gentens
 * @since 0.0.1
 */
@Configuration
@Slf4j
public class DummyModuleConfiguration {

    @PostConstruct
    public void isBootstrapped() {
        LOG.info( DummyModule.NAME + " has been added to the application." );
    }

}
