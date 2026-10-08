package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteCsrfImplCSRFFilterProperties   {

    private ConfigNodePropertyArray filterMethods;
    private ConfigNodePropertyBoolean filterEnableSafeUserAgents;
    private ConfigNodePropertyArray filterSafeUserAgents;
    private ConfigNodePropertyArray filterExcludedPaths;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteCsrfImplCSRFFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteCsrfImplCSRFFilterProperties.
     *
     * @param filterMethods filterMethods
     * @param filterEnableSafeUserAgents filterEnableSafeUserAgents
     * @param filterSafeUserAgents filterSafeUserAgents
     * @param filterExcludedPaths filterExcludedPaths
     */
    public ComAdobeGraniteCsrfImplCSRFFilterProperties(
        ConfigNodePropertyArray filterMethods, 
        ConfigNodePropertyBoolean filterEnableSafeUserAgents, 
        ConfigNodePropertyArray filterSafeUserAgents, 
        ConfigNodePropertyArray filterExcludedPaths
    ) {
        this.filterMethods = filterMethods;
        this.filterEnableSafeUserAgents = filterEnableSafeUserAgents;
        this.filterSafeUserAgents = filterSafeUserAgents;
        this.filterExcludedPaths = filterExcludedPaths;
    }



    /**
     * Get filterMethods
     * @return filterMethods
     */
    public ConfigNodePropertyArray getFilterMethods() {
        return filterMethods;
    }

    public void setFilterMethods(ConfigNodePropertyArray filterMethods) {
        this.filterMethods = filterMethods;
    }

    /**
     * Get filterEnableSafeUserAgents
     * @return filterEnableSafeUserAgents
     */
    public ConfigNodePropertyBoolean getFilterEnableSafeUserAgents() {
        return filterEnableSafeUserAgents;
    }

    public void setFilterEnableSafeUserAgents(ConfigNodePropertyBoolean filterEnableSafeUserAgents) {
        this.filterEnableSafeUserAgents = filterEnableSafeUserAgents;
    }

    /**
     * Get filterSafeUserAgents
     * @return filterSafeUserAgents
     */
    public ConfigNodePropertyArray getFilterSafeUserAgents() {
        return filterSafeUserAgents;
    }

    public void setFilterSafeUserAgents(ConfigNodePropertyArray filterSafeUserAgents) {
        this.filterSafeUserAgents = filterSafeUserAgents;
    }

    /**
     * Get filterExcludedPaths
     * @return filterExcludedPaths
     */
    public ConfigNodePropertyArray getFilterExcludedPaths() {
        return filterExcludedPaths;
    }

    public void setFilterExcludedPaths(ConfigNodePropertyArray filterExcludedPaths) {
        this.filterExcludedPaths = filterExcludedPaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteCsrfImplCSRFFilterProperties {\n");
        
        sb.append("    filterMethods: ").append(toIndentedString(filterMethods)).append("\n");
        sb.append("    filterEnableSafeUserAgents: ").append(toIndentedString(filterEnableSafeUserAgents)).append("\n");
        sb.append("    filterSafeUserAgents: ").append(toIndentedString(filterSafeUserAgents)).append("\n");
        sb.append("    filterExcludedPaths: ").append(toIndentedString(filterExcludedPaths)).append("\n");
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

