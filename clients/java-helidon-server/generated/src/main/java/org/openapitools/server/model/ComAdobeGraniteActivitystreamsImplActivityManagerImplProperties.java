package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties   {

    private ConfigNodePropertyArray aggregateRelationships;
    private ConfigNodePropertyBoolean aggregateDescendVirtual;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.
     *
     * @param aggregateRelationships aggregateRelationships
     * @param aggregateDescendVirtual aggregateDescendVirtual
     */
    public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties(
        ConfigNodePropertyArray aggregateRelationships, 
        ConfigNodePropertyBoolean aggregateDescendVirtual
    ) {
        this.aggregateRelationships = aggregateRelationships;
        this.aggregateDescendVirtual = aggregateDescendVirtual;
    }



    /**
     * Get aggregateRelationships
     * @return aggregateRelationships
     */
    public ConfigNodePropertyArray getAggregateRelationships() {
        return aggregateRelationships;
    }

    public void setAggregateRelationships(ConfigNodePropertyArray aggregateRelationships) {
        this.aggregateRelationships = aggregateRelationships;
    }

    /**
     * Get aggregateDescendVirtual
     * @return aggregateDescendVirtual
     */
    public ConfigNodePropertyBoolean getAggregateDescendVirtual() {
        return aggregateDescendVirtual;
    }

    public void setAggregateDescendVirtual(ConfigNodePropertyBoolean aggregateDescendVirtual) {
        this.aggregateDescendVirtual = aggregateDescendVirtual;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties {\n");
        
        sb.append("    aggregateRelationships: ").append(toIndentedString(aggregateRelationships)).append("\n");
        sb.append("    aggregateDescendVirtual: ").append(toIndentedString(aggregateDescendVirtual)).append("\n");
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

