package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties   {

    private ConfigNodePropertyString eventTopics;
    private ConfigNodePropertyString eventFilter;
    private ConfigNodePropertyArray translateListenerType;
    private ConfigNodePropertyArray translatePropertyList;
    private ConfigNodePropertyInteger poolSize;
    private ConfigNodePropertyInteger maxPoolSize;
    private ConfigNodePropertyInteger queueSize;
    private ConfigNodePropertyInteger keepAliveTime;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties.
     *
     * @param eventTopics eventTopics
     * @param eventFilter eventFilter
     * @param translateListenerType translateListenerType
     * @param translatePropertyList translatePropertyList
     * @param poolSize poolSize
     * @param maxPoolSize maxPoolSize
     * @param queueSize queueSize
     * @param keepAliveTime keepAliveTime
     */
    public ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties(
        ConfigNodePropertyString eventTopics, 
        ConfigNodePropertyString eventFilter, 
        ConfigNodePropertyArray translateListenerType, 
        ConfigNodePropertyArray translatePropertyList, 
        ConfigNodePropertyInteger poolSize, 
        ConfigNodePropertyInteger maxPoolSize, 
        ConfigNodePropertyInteger queueSize, 
        ConfigNodePropertyInteger keepAliveTime
    ) {
        this.eventTopics = eventTopics;
        this.eventFilter = eventFilter;
        this.translateListenerType = translateListenerType;
        this.translatePropertyList = translatePropertyList;
        this.poolSize = poolSize;
        this.maxPoolSize = maxPoolSize;
        this.queueSize = queueSize;
        this.keepAliveTime = keepAliveTime;
    }



    /**
     * Get eventTopics
     * @return eventTopics
     */
    public ConfigNodePropertyString getEventTopics() {
        return eventTopics;
    }

    public void setEventTopics(ConfigNodePropertyString eventTopics) {
        this.eventTopics = eventTopics;
    }

    /**
     * Get eventFilter
     * @return eventFilter
     */
    public ConfigNodePropertyString getEventFilter() {
        return eventFilter;
    }

    public void setEventFilter(ConfigNodePropertyString eventFilter) {
        this.eventFilter = eventFilter;
    }

    /**
     * Get translateListenerType
     * @return translateListenerType
     */
    public ConfigNodePropertyArray getTranslateListenerType() {
        return translateListenerType;
    }

    public void setTranslateListenerType(ConfigNodePropertyArray translateListenerType) {
        this.translateListenerType = translateListenerType;
    }

    /**
     * Get translatePropertyList
     * @return translatePropertyList
     */
    public ConfigNodePropertyArray getTranslatePropertyList() {
        return translatePropertyList;
    }

    public void setTranslatePropertyList(ConfigNodePropertyArray translatePropertyList) {
        this.translatePropertyList = translatePropertyList;
    }

    /**
     * Get poolSize
     * @return poolSize
     */
    public ConfigNodePropertyInteger getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(ConfigNodePropertyInteger poolSize) {
        this.poolSize = poolSize;
    }

    /**
     * Get maxPoolSize
     * @return maxPoolSize
     */
    public ConfigNodePropertyInteger getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    /**
     * Get queueSize
     * @return queueSize
     */
    public ConfigNodePropertyInteger getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(ConfigNodePropertyInteger queueSize) {
        this.queueSize = queueSize;
    }

    /**
     * Get keepAliveTime
     * @return keepAliveTime
     */
    public ConfigNodePropertyInteger getKeepAliveTime() {
        return keepAliveTime;
    }

    public void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties {\n");
        
        sb.append("    eventTopics: ").append(toIndentedString(eventTopics)).append("\n");
        sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
        sb.append("    translateListenerType: ").append(toIndentedString(translateListenerType)).append("\n");
        sb.append("    translatePropertyList: ").append(toIndentedString(translatePropertyList)).append("\n");
        sb.append("    poolSize: ").append(toIndentedString(poolSize)).append("\n");
        sb.append("    maxPoolSize: ").append(toIndentedString(maxPoolSize)).append("\n");
        sb.append("    queueSize: ").append(toIndentedString(queueSize)).append("\n");
        sb.append("    keepAliveTime: ").append(toIndentedString(keepAliveTime)).append("\n");
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

