package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties   {
  
  private ConfigNodePropertyDropDown enabledActions = null;

  private ConfigNodePropertyArray userPrivilegeNames = null;

  private ConfigNodePropertyArray groupPrivilegeNames = null;

  private ConfigNodePropertyString constraint = null;


  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties enabledActions(ConfigNodePropertyDropDown enabledActions) {
    this.enabledActions = enabledActions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabledActions")
  public ConfigNodePropertyDropDown getEnabledActions() {
    return enabledActions;
  }
  public void setEnabledActions(ConfigNodePropertyDropDown enabledActions) {
    this.enabledActions = enabledActions;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties userPrivilegeNames(ConfigNodePropertyArray userPrivilegeNames) {
    this.userPrivilegeNames = userPrivilegeNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userPrivilegeNames")
  public ConfigNodePropertyArray getUserPrivilegeNames() {
    return userPrivilegeNames;
  }
  public void setUserPrivilegeNames(ConfigNodePropertyArray userPrivilegeNames) {
    this.userPrivilegeNames = userPrivilegeNames;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties groupPrivilegeNames(ConfigNodePropertyArray groupPrivilegeNames) {
    this.groupPrivilegeNames = groupPrivilegeNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("groupPrivilegeNames")
  public ConfigNodePropertyArray getGroupPrivilegeNames() {
    return groupPrivilegeNames;
  }
  public void setGroupPrivilegeNames(ConfigNodePropertyArray groupPrivilegeNames) {
    this.groupPrivilegeNames = groupPrivilegeNames;
  }


  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties constraint(ConfigNodePropertyString constraint) {
    this.constraint = constraint;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("constraint")
  public ConfigNodePropertyString getConstraint() {
    return constraint;
  }
  public void setConstraint(ConfigNodePropertyString constraint) {
    this.constraint = constraint;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties = (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties) o;
    return Objects.equals(enabledActions, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.enabledActions) &&
        Objects.equals(userPrivilegeNames, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.userPrivilegeNames) &&
        Objects.equals(groupPrivilegeNames, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.groupPrivilegeNames) &&
        Objects.equals(constraint, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.constraint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledActions, userPrivilegeNames, groupPrivilegeNames, constraint);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

