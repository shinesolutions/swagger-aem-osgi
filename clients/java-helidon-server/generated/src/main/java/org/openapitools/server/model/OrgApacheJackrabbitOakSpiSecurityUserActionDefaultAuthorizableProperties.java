package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties   {

    private ConfigNodePropertyDropDown enabledActions;
    private ConfigNodePropertyArray userPrivilegeNames;
    private ConfigNodePropertyArray groupPrivilegeNames;
    private ConfigNodePropertyString constraint;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.
     *
     * @param enabledActions enabledActions
     * @param userPrivilegeNames userPrivilegeNames
     * @param groupPrivilegeNames groupPrivilegeNames
     * @param constraint constraint
     */
    public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties(
        ConfigNodePropertyDropDown enabledActions, 
        ConfigNodePropertyArray userPrivilegeNames, 
        ConfigNodePropertyArray groupPrivilegeNames, 
        ConfigNodePropertyString constraint
    ) {
        this.enabledActions = enabledActions;
        this.userPrivilegeNames = userPrivilegeNames;
        this.groupPrivilegeNames = groupPrivilegeNames;
        this.constraint = constraint;
    }



    /**
     * Get enabledActions
     * @return enabledActions
     */
    public ConfigNodePropertyDropDown getEnabledActions() {
        return enabledActions;
    }

    public void setEnabledActions(ConfigNodePropertyDropDown enabledActions) {
        this.enabledActions = enabledActions;
    }

    /**
     * Get userPrivilegeNames
     * @return userPrivilegeNames
     */
    public ConfigNodePropertyArray getUserPrivilegeNames() {
        return userPrivilegeNames;
    }

    public void setUserPrivilegeNames(ConfigNodePropertyArray userPrivilegeNames) {
        this.userPrivilegeNames = userPrivilegeNames;
    }

    /**
     * Get groupPrivilegeNames
     * @return groupPrivilegeNames
     */
    public ConfigNodePropertyArray getGroupPrivilegeNames() {
        return groupPrivilegeNames;
    }

    public void setGroupPrivilegeNames(ConfigNodePropertyArray groupPrivilegeNames) {
        this.groupPrivilegeNames = groupPrivilegeNames;
    }

    /**
     * Get constraint
     * @return constraint
     */
    public ConfigNodePropertyString getConstraint() {
        return constraint;
    }

    public void setConstraint(ConfigNodePropertyString constraint) {
        this.constraint = constraint;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties {\n");
        
        sb.append("    enabledActions: ").append(toIndentedString(enabledActions)).append("\n");
        sb.append("    userPrivilegeNames: ").append(toIndentedString(userPrivilegeNames)).append("\n");
        sb.append("    groupPrivilegeNames: ").append(toIndentedString(groupPrivilegeNames)).append("\n");
        sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
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

