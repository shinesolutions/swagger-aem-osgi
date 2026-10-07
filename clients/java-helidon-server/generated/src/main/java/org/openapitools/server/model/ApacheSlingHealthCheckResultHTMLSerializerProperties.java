package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ApacheSlingHealthCheckResultHTMLSerializerProperties   {

    private ConfigNodePropertyString styleString;

    /**
     * Default constructor.
     */
    public ApacheSlingHealthCheckResultHTMLSerializerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ApacheSlingHealthCheckResultHTMLSerializerProperties.
     *
     * @param styleString styleString
     */
    public ApacheSlingHealthCheckResultHTMLSerializerProperties(
        ConfigNodePropertyString styleString
    ) {
        this.styleString = styleString;
    }



    /**
     * Get styleString
     * @return styleString
     */
    public ConfigNodePropertyString getStyleString() {
        return styleString;
    }

    public void setStyleString(ConfigNodePropertyString styleString) {
        this.styleString = styleString;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApacheSlingHealthCheckResultHTMLSerializerProperties {\n");
        
        sb.append("    styleString: ").append(toIndentedString(styleString)).append("\n");
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

