package com.huawei.esdk.platform.professional.local.impl.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public abstract class PropertiesUtils {
    
    private static final Logger logger = Logger
        .getLogger(PropertiesUtils.class);

	private static Properties properties = null;

	static {
		properties = loadProperty();
	}

    private static Properties loadProperty()
    {
        Properties p = new Properties();
        loadProp("esdk_uc_config.properties", p);
        loadProp("platform_professional_url.properties", p);
        
        return p;
    }
    private static void loadProp(String conf, Properties p)
    {
        InputStream is = null;
        try
        {
            is = getInputStream(conf);
            
            if (null != is)
            {
                p.load(is);
            }
        }
        catch (IOException e)
        {
            logger.error( "Exception happened in loadProp() " + conf , e);
        }
        finally
        {
            if (null != is)
            {
                try
                {
                    is.close();
                }
                catch (IOException e)
                {
                    logger.error( "Exception happened in loadProperty()" + conf , e);
                }
            }
        }
    }
	public static String getValue(String key) {
		String value = properties.getProperty(key);

		return null == value ? "" : value;
	}

	private static InputStream getInputStream(String path) throws IOException {
		InputStream is = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream(path);
		if (null == is) {
			throw new FileNotFoundException(path
					+ " cannot be opened because it does not exist");
		}
		return is;
	}
}