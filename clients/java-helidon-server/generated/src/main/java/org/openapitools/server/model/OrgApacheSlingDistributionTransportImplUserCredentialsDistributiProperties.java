package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString username;
    private ConfigNodePropertyString password;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.
     *
     * @param name name
     * @param username username
     * @param password password
     */
    public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString username, 
        ConfigNodePropertyString password
    ) {
        this.name = name;
        this.username = username;
        this.password = password;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
    }

    /**
     * Get username
     * @return username
     */
    public ConfigNodePropertyString getUsername() {
        return username;
    }

    public void setUsername(ConfigNodePropertyString username) {
        this.username = username;
    }

    /**
     * Get password
     * @return password
     */
    public ConfigNodePropertyString getPassword() {
        return password;
    }

    public void setPassword(ConfigNodePropertyString password) {
        this.password = password;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

