package com.practice.hrms.core;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public final class ConfigReader {
    private static final Properties P = new Properties();
    static {
        try (InputStream in = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (in == null) throw new IllegalStateException("config.properties not found");
            P.load(in);
        } catch (IOException e) { throw new ExceptionInInitializerError(e); }
    }
    private ConfigReader() {}
    public static String get(String key) { return System.getProperty(key, P.getProperty(key)); }
    public static int getInt(String key) { return Integer.parseInt(get(key)); }
}
