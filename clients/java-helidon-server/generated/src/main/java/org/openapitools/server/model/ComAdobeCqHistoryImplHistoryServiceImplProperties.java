package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqHistoryImplHistoryServiceImplProperties   {

    private ConfigNodePropertyArray historyServiceResourceTypes;
    private ConfigNodePropertyArray historyServicePathFilter;

    /**
     * Default constructor.
     */
    public ComAdobeCqHistoryImplHistoryServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqHistoryImplHistoryServiceImplProperties.
     *
     * @param historyServiceResourceTypes historyServiceResourceTypes
     * @param historyServicePathFilter historyServicePathFilter
     */
    public ComAdobeCqHistoryImplHistoryServiceImplProperties(
        ConfigNodePropertyArray historyServiceResourceTypes, 
        ConfigNodePropertyArray historyServicePathFilter
    ) {
        this.historyServiceResourceTypes = historyServiceResourceTypes;
        this.historyServicePathFilter = historyServicePathFilter;
    }



    /**
     * Get historyServiceResourceTypes
     * @return historyServiceResourceTypes
     */
    public ConfigNodePropertyArray getHistoryServiceResourceTypes() {
        return historyServiceResourceTypes;
    }

    public void setHistoryServiceResourceTypes(ConfigNodePropertyArray historyServiceResourceTypes) {
        this.historyServiceResourceTypes = historyServiceResourceTypes;
    }

    /**
     * Get historyServicePathFilter
     * @return historyServicePathFilter
     */
    public ConfigNodePropertyArray getHistoryServicePathFilter() {
        return historyServicePathFilter;
    }

    public void setHistoryServicePathFilter(ConfigNodePropertyArray historyServicePathFilter) {
        this.historyServicePathFilter = historyServicePathFilter;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqHistoryImplHistoryServiceImplProperties {\n");
        
        sb.append("    historyServiceResourceTypes: ").append(toIndentedString(historyServiceResourceTypes)).append("\n");
        sb.append("    historyServicePathFilter: ").append(toIndentedString(historyServicePathFilter)).append("\n");
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

