package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties   {

    private ConfigNodePropertyInteger length;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.
     *
     * @param length length
     */
    public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties(
        ConfigNodePropertyInteger length
    ) {
        this.length = length;
    }



    /**
     * Get length
     * @return length
     */
    public ConfigNodePropertyInteger getLength() {
        return length;
    }

    public void setLength(ConfigNodePropertyInteger length) {
        this.length = length;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties {\n");
        
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

