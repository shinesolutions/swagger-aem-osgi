package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties   {

    private ConfigNodePropertyString processLabel;
    private ConfigNodePropertyBoolean extractPages;

    /**
     * Default constructor.
     */
    public ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.
     *
     * @param processLabel processLabel
     * @param extractPages extractPages
     */
    public ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties(
        ConfigNodePropertyString processLabel, 
        ConfigNodePropertyBoolean extractPages
    ) {
        this.processLabel = processLabel;
        this.extractPages = extractPages;
    }



    /**
     * Get processLabel
     * @return processLabel
     */
    public ConfigNodePropertyString getProcessLabel() {
        return processLabel;
    }

    public void setProcessLabel(ConfigNodePropertyString processLabel) {
        this.processLabel = processLabel;
    }

    /**
     * Get extractPages
     * @return extractPages
     */
    public ConfigNodePropertyBoolean getExtractPages() {
        return extractPages;
    }

    public void setExtractPages(ConfigNodePropertyBoolean extractPages) {
        this.extractPages = extractPages;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties {\n");
        
        sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
        sb.append("    extractPages: ").append(toIndentedString(extractPages)).append("\n");
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

