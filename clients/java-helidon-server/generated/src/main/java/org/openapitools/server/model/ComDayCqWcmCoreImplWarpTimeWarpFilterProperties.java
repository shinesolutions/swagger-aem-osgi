package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties   {

    private ConfigNodePropertyString filterOrder;
    private ConfigNodePropertyString filterScope;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplWarpTimeWarpFilterProperties.
     *
     * @param filterOrder filterOrder
     * @param filterScope filterScope
     */
    public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties(
        ConfigNodePropertyString filterOrder, 
        ConfigNodePropertyString filterScope
    ) {
        this.filterOrder = filterOrder;
        this.filterScope = filterScope;
    }



    /**
     * Get filterOrder
     * @return filterOrder
     */
    public ConfigNodePropertyString getFilterOrder() {
        return filterOrder;
    }

    public void setFilterOrder(ConfigNodePropertyString filterOrder) {
        this.filterOrder = filterOrder;
    }

    /**
     * Get filterScope
     * @return filterScope
     */
    public ConfigNodePropertyString getFilterScope() {
        return filterScope;
    }

    public void setFilterScope(ConfigNodePropertyString filterScope) {
        this.filterScope = filterScope;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {\n");
        
        sb.append("    filterOrder: ").append(toIndentedString(filterOrder)).append("\n");
        sb.append("    filterScope: ").append(toIndentedString(filterScope)).append("\n");
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

