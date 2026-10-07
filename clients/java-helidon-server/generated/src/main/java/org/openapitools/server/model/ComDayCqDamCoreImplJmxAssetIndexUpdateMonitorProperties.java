package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyFloat;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties   {

    private ConfigNodePropertyString jmxObjectname;
    private ConfigNodePropertyBoolean propertyMeasureEnabled;
    private ConfigNodePropertyString propertyName;
    private ConfigNodePropertyInteger propertyMaxWaitMs;
    private ConfigNodePropertyFloat propertyMaxRate;
    private ConfigNodePropertyBoolean fulltextMeasureEnabled;
    private ConfigNodePropertyString fulltextName;
    private ConfigNodePropertyInteger fulltextMaxWaitMs;
    private ConfigNodePropertyFloat fulltextMaxRate;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.
     *
     * @param jmxObjectname jmxObjectname
     * @param propertyMeasureEnabled propertyMeasureEnabled
     * @param propertyName propertyName
     * @param propertyMaxWaitMs propertyMaxWaitMs
     * @param propertyMaxRate propertyMaxRate
     * @param fulltextMeasureEnabled fulltextMeasureEnabled
     * @param fulltextName fulltextName
     * @param fulltextMaxWaitMs fulltextMaxWaitMs
     * @param fulltextMaxRate fulltextMaxRate
     */
    public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(
        ConfigNodePropertyString jmxObjectname, 
        ConfigNodePropertyBoolean propertyMeasureEnabled, 
        ConfigNodePropertyString propertyName, 
        ConfigNodePropertyInteger propertyMaxWaitMs, 
        ConfigNodePropertyFloat propertyMaxRate, 
        ConfigNodePropertyBoolean fulltextMeasureEnabled, 
        ConfigNodePropertyString fulltextName, 
        ConfigNodePropertyInteger fulltextMaxWaitMs, 
        ConfigNodePropertyFloat fulltextMaxRate
    ) {
        this.jmxObjectname = jmxObjectname;
        this.propertyMeasureEnabled = propertyMeasureEnabled;
        this.propertyName = propertyName;
        this.propertyMaxWaitMs = propertyMaxWaitMs;
        this.propertyMaxRate = propertyMaxRate;
        this.fulltextMeasureEnabled = fulltextMeasureEnabled;
        this.fulltextName = fulltextName;
        this.fulltextMaxWaitMs = fulltextMaxWaitMs;
        this.fulltextMaxRate = fulltextMaxRate;
    }



    /**
     * Get jmxObjectname
     * @return jmxObjectname
     */
    public ConfigNodePropertyString getJmxObjectname() {
        return jmxObjectname;
    }

    public void setJmxObjectname(ConfigNodePropertyString jmxObjectname) {
        this.jmxObjectname = jmxObjectname;
    }

    /**
     * Get propertyMeasureEnabled
     * @return propertyMeasureEnabled
     */
    public ConfigNodePropertyBoolean getPropertyMeasureEnabled() {
        return propertyMeasureEnabled;
    }

    public void setPropertyMeasureEnabled(ConfigNodePropertyBoolean propertyMeasureEnabled) {
        this.propertyMeasureEnabled = propertyMeasureEnabled;
    }

    /**
     * Get propertyName
     * @return propertyName
     */
    public ConfigNodePropertyString getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(ConfigNodePropertyString propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * Get propertyMaxWaitMs
     * @return propertyMaxWaitMs
     */
    public ConfigNodePropertyInteger getPropertyMaxWaitMs() {
        return propertyMaxWaitMs;
    }

    public void setPropertyMaxWaitMs(ConfigNodePropertyInteger propertyMaxWaitMs) {
        this.propertyMaxWaitMs = propertyMaxWaitMs;
    }

    /**
     * Get propertyMaxRate
     * @return propertyMaxRate
     */
    public ConfigNodePropertyFloat getPropertyMaxRate() {
        return propertyMaxRate;
    }

    public void setPropertyMaxRate(ConfigNodePropertyFloat propertyMaxRate) {
        this.propertyMaxRate = propertyMaxRate;
    }

    /**
     * Get fulltextMeasureEnabled
     * @return fulltextMeasureEnabled
     */
    public ConfigNodePropertyBoolean getFulltextMeasureEnabled() {
        return fulltextMeasureEnabled;
    }

    public void setFulltextMeasureEnabled(ConfigNodePropertyBoolean fulltextMeasureEnabled) {
        this.fulltextMeasureEnabled = fulltextMeasureEnabled;
    }

    /**
     * Get fulltextName
     * @return fulltextName
     */
    public ConfigNodePropertyString getFulltextName() {
        return fulltextName;
    }

    public void setFulltextName(ConfigNodePropertyString fulltextName) {
        this.fulltextName = fulltextName;
    }

    /**
     * Get fulltextMaxWaitMs
     * @return fulltextMaxWaitMs
     */
    public ConfigNodePropertyInteger getFulltextMaxWaitMs() {
        return fulltextMaxWaitMs;
    }

    public void setFulltextMaxWaitMs(ConfigNodePropertyInteger fulltextMaxWaitMs) {
        this.fulltextMaxWaitMs = fulltextMaxWaitMs;
    }

    /**
     * Get fulltextMaxRate
     * @return fulltextMaxRate
     */
    public ConfigNodePropertyFloat getFulltextMaxRate() {
        return fulltextMaxRate;
    }

    public void setFulltextMaxRate(ConfigNodePropertyFloat fulltextMaxRate) {
        this.fulltextMaxRate = fulltextMaxRate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties {\n");
        
        sb.append("    jmxObjectname: ").append(toIndentedString(jmxObjectname)).append("\n");
        sb.append("    propertyMeasureEnabled: ").append(toIndentedString(propertyMeasureEnabled)).append("\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
        sb.append("    propertyMaxWaitMs: ").append(toIndentedString(propertyMaxWaitMs)).append("\n");
        sb.append("    propertyMaxRate: ").append(toIndentedString(propertyMaxRate)).append("\n");
        sb.append("    fulltextMeasureEnabled: ").append(toIndentedString(fulltextMeasureEnabled)).append("\n");
        sb.append("    fulltextName: ").append(toIndentedString(fulltextName)).append("\n");
        sb.append("    fulltextMaxWaitMs: ").append(toIndentedString(fulltextMaxWaitMs)).append("\n");
        sb.append("    fulltextMaxRate: ").append(toIndentedString(fulltextMaxRate)).append("\n");
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

