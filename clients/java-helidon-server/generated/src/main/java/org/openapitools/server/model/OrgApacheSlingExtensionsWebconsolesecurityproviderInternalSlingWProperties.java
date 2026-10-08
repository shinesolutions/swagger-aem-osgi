package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties   {

    private ConfigNodePropertyArray users;
    private ConfigNodePropertyArray groups;

    /**
     * Default constructor.
     */
    public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.
     *
     * @param users users
     * @param groups groups
     */
    public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties(
        ConfigNodePropertyArray users, 
        ConfigNodePropertyArray groups
    ) {
        this.users = users;
        this.groups = groups;
    }



    /**
     * Get users
     * @return users
     */
    public ConfigNodePropertyArray getUsers() {
        return users;
    }

    public void setUsers(ConfigNodePropertyArray users) {
        this.users = users;
    }

    /**
     * Get groups
     * @return groups
     */
    public ConfigNodePropertyArray getGroups() {
        return groups;
    }

    public void setGroups(ConfigNodePropertyArray groups) {
        this.groups = groups;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties {\n");
        
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

