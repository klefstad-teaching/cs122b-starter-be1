package edu.uci.ics.UCNETID.service.basic.configs;

import edu.uci.ics.UCNETID.service.basic.logger.ServiceLogger;

public class ServiceConfigs {

    // TODO COMPLETE THIS CLASS

    public static final int MIN_SERVICE_PORT = 1024;
    public static final int MAX_SERVICE_PORT = 65535;

    // Default gateway configs
    private final String DEFAULT_SCHEME = "http://";
    private final String DEFAULT_HOSTNAME = "0.0.0.0";
    private final int    DEFAULT_PORT = 2942;
    private final String DEFAULT_PATH = "/activity";
    // Default logger configs
    private final String DEFAULT_OUTPUTDIR = "./logs/";
    private final String DEFAULT_OUTPUTFILE = "test.log";

    // Service configs

    // Logger configs

    public ServiceConfigs() { }

    public ServiceConfigs(ConfigsModel cm) throws NullPointerException {
        if (cm == null) {
            ServiceLogger.LOGGER.severe("ConfigsModel not found.");
            throw new NullPointerException("ConfigsModel not found.");
        } else {
            // Set Service Configs
            // TODO

            // Set Logger Configs
            // TODO
        }
    }

    public void currentConfigs() {
        // Log the current configs
        // TODO
    }

    // Getters and Setters
    // TODO

 }