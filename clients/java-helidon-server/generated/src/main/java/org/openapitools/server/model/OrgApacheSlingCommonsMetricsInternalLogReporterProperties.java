package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCommonsMetricsInternalLogReporterProperties   {

    private ConfigNodePropertyInteger period;
    private ConfigNodePropertyDropDown timeUnit;
    private ConfigNodePropertyDropDown level;
    private ConfigNodePropertyString loggerName;
    private ConfigNodePropertyString prefix;
    private ConfigNodePropertyString pattern;
    private ConfigNodePropertyString registryName;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCommonsMetricsInternalLogReporterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCommonsMetricsInternalLogReporterProperties.
     *
     * @param period period
     * @param timeUnit timeUnit
     * @param level level
     * @param loggerName loggerName
     * @param prefix prefix
     * @param pattern pattern
     * @param registryName registryName
     */
    public OrgApacheSlingCommonsMetricsInternalLogReporterProperties(
        ConfigNodePropertyInteger period, 
        ConfigNodePropertyDropDown timeUnit, 
        ConfigNodePropertyDropDown level, 
        ConfigNodePropertyString loggerName, 
        ConfigNodePropertyString prefix, 
        ConfigNodePropertyString pattern, 
        ConfigNodePropertyString registryName
    ) {
        this.period = period;
        this.timeUnit = timeUnit;
        this.level = level;
        this.loggerName = loggerName;
        this.prefix = prefix;
        this.pattern = pattern;
        this.registryName = registryName;
    }



    /**
     * Get period
     * @return period
     */
    public ConfigNodePropertyInteger getPeriod() {
        return period;
    }

    public void setPeriod(ConfigNodePropertyInteger period) {
        this.period = period;
    }

    /**
     * Get timeUnit
     * @return timeUnit
     */
    public ConfigNodePropertyDropDown getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(ConfigNodePropertyDropDown timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * Get level
     * @return level
     */
    public ConfigNodePropertyDropDown getLevel() {
        return level;
    }

    public void setLevel(ConfigNodePropertyDropDown level) {
        this.level = level;
    }

    /**
     * Get loggerName
     * @return loggerName
     */
    public ConfigNodePropertyString getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(ConfigNodePropertyString loggerName) {
        this.loggerName = loggerName;
    }

    /**
     * Get prefix
     * @return prefix
     */
    public ConfigNodePropertyString getPrefix() {
        return prefix;
    }

    public void setPrefix(ConfigNodePropertyString prefix) {
        this.prefix = prefix;
    }

    /**
     * Get pattern
     * @return pattern
     */
    public ConfigNodePropertyString getPattern() {
        return pattern;
    }

    public void setPattern(ConfigNodePropertyString pattern) {
        this.pattern = pattern;
    }

    /**
     * Get registryName
     * @return registryName
     */
    public ConfigNodePropertyString getRegistryName() {
        return registryName;
    }

    public void setRegistryName(ConfigNodePropertyString registryName) {
        this.registryName = registryName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCommonsMetricsInternalLogReporterProperties {\n");
        
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    loggerName: ").append(toIndentedString(loggerName)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

