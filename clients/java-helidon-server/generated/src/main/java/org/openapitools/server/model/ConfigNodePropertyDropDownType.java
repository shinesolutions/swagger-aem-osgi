package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConfigNodePropertyDropDownType   {

    private Object labels = null;
    private Object values = null;

    /**
     * Default constructor.
     */
    public ConfigNodePropertyDropDownType() {
    // JSON-B / Jackson
    }

    /**
     * Create ConfigNodePropertyDropDownType.
     *
     * @param labels Drop Down label
     * @param values Drown Down value
     */
    public ConfigNodePropertyDropDownType(
        Object labels, 
        Object values
    ) {
        this.labels = labels;
        this.values = values;
    }



    /**
     * Drop Down label
     * @return labels
     */
    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    /**
     * Drown Down value
     * @return values
     */
    public Object getValues() {
        return values;
    }

    public void setValues(Object values) {
        this.values = values;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigNodePropertyDropDownType {\n");
        
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

