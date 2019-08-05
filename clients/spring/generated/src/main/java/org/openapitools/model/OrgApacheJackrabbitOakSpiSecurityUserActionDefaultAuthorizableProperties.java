package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties   {
  @JsonProperty("enabledActions")
  private ConfigNodePropertyDropDown enabledActions = null;

  @JsonProperty("userPrivilegeNames")
  private ConfigNodePropertyArray userPrivilegeNames = null;

  @JsonProperty("groupPrivilegeNames")
  private ConfigNodePropertyArray groupPrivilegeNames = null;

  @JsonProperty("constraint")
  private ConfigNodePropertyString constraint = null;

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties enabledActions(ConfigNodePropertyDropDown enabledActions) {
    this.enabledActions = enabledActions;
    return this;
  }

  /**
   * Get enabledActions
   * @return enabledActions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyDropDown getEnabledActions() {
    return enabledActions;
  }

  public void setEnabledActions(ConfigNodePropertyDropDown enabledActions) {
    this.enabledActions = enabledActions;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties userPrivilegeNames(ConfigNodePropertyArray userPrivilegeNames) {
    this.userPrivilegeNames = userPrivilegeNames;
    return this;
  }

  /**
   * Get userPrivilegeNames
   * @return userPrivilegeNames
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getUserPrivilegeNames() {
    return userPrivilegeNames;
  }

  public void setUserPrivilegeNames(ConfigNodePropertyArray userPrivilegeNames) {
    this.userPrivilegeNames = userPrivilegeNames;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties groupPrivilegeNames(ConfigNodePropertyArray groupPrivilegeNames) {
    this.groupPrivilegeNames = groupPrivilegeNames;
    return this;
  }

  /**
   * Get groupPrivilegeNames
   * @return groupPrivilegeNames
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getGroupPrivilegeNames() {
    return groupPrivilegeNames;
  }

  public void setGroupPrivilegeNames(ConfigNodePropertyArray groupPrivilegeNames) {
    this.groupPrivilegeNames = groupPrivilegeNames;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties constraint(ConfigNodePropertyString constraint) {
    this.constraint = constraint;
    return this;
  }

  /**
   * Get constraint
   * @return constraint
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.enabledActions, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.enabledActions) &&
        Objects.equals(this.userPrivilegeNames, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.userPrivilegeNames) &&
        Objects.equals(this.groupPrivilegeNames, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.groupPrivilegeNames) &&
        Objects.equals(this.constraint, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.constraint);
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

