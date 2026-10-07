package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties   {

    private ConfigNodePropertyString formportalInterval;

    /**
     * Default constructor.
     */
    public ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.
     *
     * @param formportalInterval formportalInterval
     */
    public ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties(
        ConfigNodePropertyString formportalInterval
    ) {
        this.formportalInterval = formportalInterval;
    }



    /**
     * Get formportalInterval
     * @return formportalInterval
     */
    public ConfigNodePropertyString getFormportalInterval() {
        return formportalInterval;
    }

    public void setFormportalInterval(ConfigNodePropertyString formportalInterval) {
        this.formportalInterval = formportalInterval;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties {\n");
        
        sb.append("    formportalInterval: ").append(toIndentedString(formportalInterval)).append("\n");
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

