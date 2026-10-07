package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString jcrPrivilege;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.
     *
     * @param name name
     * @param jcrPrivilege jcrPrivilege
     */
    public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString jcrPrivilege
    ) {
        this.name = name;
        this.jcrPrivilege = jcrPrivilege;
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
     * Get jcrPrivilege
     * @return jcrPrivilege
     */
    public ConfigNodePropertyString getJcrPrivilege() {
        return jcrPrivilege;
    }

    public void setJcrPrivilege(ConfigNodePropertyString jcrPrivilege) {
        this.jcrPrivilege = jcrPrivilege;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    jcrPrivilege: ").append(toIndentedString(jcrPrivilege)).append("\n");
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

