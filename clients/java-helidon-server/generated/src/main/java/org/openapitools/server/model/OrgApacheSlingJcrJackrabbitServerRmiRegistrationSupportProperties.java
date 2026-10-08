package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties   {

    private ConfigNodePropertyInteger port;

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.
     *
     * @param port port
     */
    public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties(
        ConfigNodePropertyInteger port
    ) {
        this.port = port;
    }



    /**
     * Get port
     * @return port
     */
    public ConfigNodePropertyInteger getPort() {
        return port;
    }

    public void setPort(ConfigNodePropertyInteger port) {
        this.port = port;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties {\n");
        
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

