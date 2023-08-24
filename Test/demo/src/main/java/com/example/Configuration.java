package com.example;

import hu.meza.tools.config.Config;
import hu.meza.tools.config.Loaders.SystemPropertiesConfiguration;
import hu.meza.tools.config.Required;

import java.io.File;

public class Configuration {

	private Config config = new Config();

	public Configuration() {
		config.addHighOrder(new SystemPropertiesConfiguration());

		String configFilename = config.get("config", "config.properties");
		File file = new File(configFilename);
		config.add(new Required(file));
	}

}
