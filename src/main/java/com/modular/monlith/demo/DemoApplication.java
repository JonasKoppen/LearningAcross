package com.modular.monlith.demo;

import com.foreach.across.AcrossApplicationRunner;
import com.foreach.across.config.AcrossApplication;
import com.foreach.across.modules.debugweb.DebugWebModule;
import com.foreach.across.modules.web.AcrossWebModule;
import com.foreach.across.samples.modules.dummy.DummyModule;
import com.infradna.tool.bridge_method_injector.BridgeMethodsAdded;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@AcrossApplication(
		modules = {
				DummyModule.NAME
		},
		modulePackages = {
				"com.foreach.across.samples.modules"
		}
)
public class DemoApplication
{
	public static void main( String[] args ) {
		AcrossApplicationRunner.run( DemoApplication.class, args );
	}

	@Bean
	@ConditionalOnProperty("dev")
	public DebugWebModule debugWebModule(){
		return new DebugWebModule();
	}
}
