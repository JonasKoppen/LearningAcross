package com.foreach.across.samples.modules.dummy;

import com.foreach.across.core.AcrossModule;
import com.foreach.across.core.context.configurer.ApplicationContextConfigurer;
import com.foreach.across.core.context.configurer.ComponentScanConfigurer;

import java.util.Set;

/**
 * @author Steven Gentens
 */
public class DummyModule extends AcrossModule {
    public static final String NAME = "DummyModule";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    protected void registerDefaultApplicationContextConfigurers(Set<ApplicationContextConfigurer> contextConfigurers) {
        contextConfigurers.add( ComponentScanConfigurer.forAcrossModule( DummyModule.class ) );
    }
}
