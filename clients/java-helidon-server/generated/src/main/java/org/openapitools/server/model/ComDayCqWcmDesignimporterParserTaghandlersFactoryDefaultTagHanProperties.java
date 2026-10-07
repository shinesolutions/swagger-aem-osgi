package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties   {

    private ConfigNodePropertyInteger serviceRanking;
    private ConfigNodePropertyString tagpattern;

    /**
     * Default constructor.
     */
    public ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties.
     *
     * @param serviceRanking serviceRanking
     * @param tagpattern tagpattern
     */
    public ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties(
        ConfigNodePropertyInteger serviceRanking, 
        ConfigNodePropertyString tagpattern
    ) {
        this.serviceRanking = serviceRanking;
        this.tagpattern = tagpattern;
    }



    /**
     * Get serviceRanking
     * @return serviceRanking
     */
    public ConfigNodePropertyInteger getServiceRanking() {
        return serviceRanking;
    }

    public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
        this.serviceRanking = serviceRanking;
    }

    /**
     * Get tagpattern
     * @return tagpattern
     */
    public ConfigNodePropertyString getTagpattern() {
        return tagpattern;
    }

    public void setTagpattern(ConfigNodePropertyString tagpattern) {
        this.tagpattern = tagpattern;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties {\n");
        
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
        sb.append("    tagpattern: ").append(toIndentedString(tagpattern)).append("\n");
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

