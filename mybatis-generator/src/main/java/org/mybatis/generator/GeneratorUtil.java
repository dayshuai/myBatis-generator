package org.mybatis.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorUtil {

	public static boolean operator() throws Exception {
		boolean flag = false;
		boolean overwrite = true;
		List<String> warnings = new ArrayList<String>();
		String genCfg = "/config-mysql.xml";
		File configFile = new File(MyBatisGenerator.class.getResource(genCfg)
				.getFile());
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = null;
		try {
			config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
					callback, warnings);
			myBatisGenerator.generate(null);
			flag = true;
		} catch (Exception e) {
			throw new Exception("", e);
		}
		return flag;
	}

	public static void main(String[] args) {
		try {
			operator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}