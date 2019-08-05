package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown enabledActions = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray userPrivilegeNames = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray groupPrivilegeNames = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString constraint = null;
 /**
   * Get enabledActions
   * @return enabledActions
  **/
  @JsonProperty("enabledActions")
  public ConfigNodePropertyDropDown getEnabledActions() {
    return enabledActions;
  }

  public void setEnabledActions(ConfigNodePropertyDropDown enabledActions) {
    this.enabledActions = enabledActions;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties enabledActions(ConfigNodePropertyDropDown enabledActions) {
    this.enabledActions = enabledActions;
    return this;
  }

 /**
   * Get userPrivilegeNames
   * @return userPrivilegeNames
  **/
  @JsonProperty("userPrivilegeNames")
  public ConfigNodePropertyArray getUserPrivilegeNames() {
    return userPrivilegeNames;
  }

  public void setUserPrivilegeNames(ConfigNodePropertyArray userPrivilegeNames) {
    this.userPrivilegeNames = userPrivilegeNames;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties userPrivilegeNames(ConfigNodePropertyArray userPrivilegeNames) {
    this.userPrivilegeNames = userPrivilegeNames;
    return this;
  }

 /**
   * Get groupPrivilegeNames
   * @return groupPrivilegeNames
  **/
  @JsonProperty("groupPrivilegeNames")
  public ConfigNodePropertyArray getGroupPrivilegeNames() {
    return groupPrivilegeNames;
  }

  public void setGroupPrivilegeNames(ConfigNodePropertyArray groupPrivilegeNames) {
    this.groupPrivilegeNames = groupPrivilegeNames;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties groupPrivilegeNames(ConfigNodePropertyArray groupPrivilegeNames) {
    this.groupPrivilegeNames = groupPrivilegeNames;
    return this;
  }

 /**
   * Get constraint
   * @return constraint
  **/
  @JsonProperty("constraint")
  public ConfigNodePropertyString getConstraint() {
    return constraint;
  }

  public void setConstraint(ConfigNodePropertyString constraint) {
    this.constraint = constraint;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties constraint(ConfigNodePropertyString constraint) {
    this.constraint = constraint;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

