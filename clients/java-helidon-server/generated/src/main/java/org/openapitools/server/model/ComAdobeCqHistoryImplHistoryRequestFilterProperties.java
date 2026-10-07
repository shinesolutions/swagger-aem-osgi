package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqHistoryImplHistoryRequestFilterProperties   {

    private ConfigNodePropertyArray historyRequestFilterExcludedSelectors;
    private ConfigNodePropertyArray historyRequestFilterExcludedExtensions;

    /**
     * Default constructor.
     */
    public ComAdobeCqHistoryImplHistoryRequestFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqHistoryImplHistoryRequestFilterProperties.
     *
     * @param historyRequestFilterExcludedSelectors historyRequestFilterExcludedSelectors
     * @param historyRequestFilterExcludedExtensions historyRequestFilterExcludedExtensions
     */
    public ComAdobeCqHistoryImplHistoryRequestFilterProperties(
        ConfigNodePropertyArray historyRequestFilterExcludedSelectors, 
        ConfigNodePropertyArray historyRequestFilterExcludedExtensions
    ) {
        this.historyRequestFilterExcludedSelectors = historyRequestFilterExcludedSelectors;
        this.historyRequestFilterExcludedExtensions = historyRequestFilterExcludedExtensions;
    }



    /**
     * Get historyRequestFilterExcludedSelectors
     * @return historyRequestFilterExcludedSelectors
     */
    public ConfigNodePropertyArray getHistoryRequestFilterExcludedSelectors() {
        return historyRequestFilterExcludedSelectors;
    }

    public void setHistoryRequestFilterExcludedSelectors(ConfigNodePropertyArray historyRequestFilterExcludedSelectors) {
        this.historyRequestFilterExcludedSelectors = historyRequestFilterExcludedSelectors;
    }

    /**
     * Get historyRequestFilterExcludedExtensions
     * @return historyRequestFilterExcludedExtensions
     */
    public ConfigNodePropertyArray getHistoryRequestFilterExcludedExtensions() {
        return historyRequestFilterExcludedExtensions;
    }

    public void setHistoryRequestFilterExcludedExtensions(ConfigNodePropertyArray historyRequestFilterExcludedExtensions) {
        this.historyRequestFilterExcludedExtensions = historyRequestFilterExcludedExtensions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqHistoryImplHistoryRequestFilterProperties {\n");
        
        sb.append("    historyRequestFilterExcludedSelectors: ").append(toIndentedString(historyRequestFilterExcludedSelectors)).append("\n");
        sb.append("    historyRequestFilterExcludedExtensions: ").append(toIndentedString(historyRequestFilterExcludedExtensions)).append("\n");
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

