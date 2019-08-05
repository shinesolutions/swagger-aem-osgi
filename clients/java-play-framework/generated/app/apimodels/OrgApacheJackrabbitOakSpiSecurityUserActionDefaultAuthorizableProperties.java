package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
    return Objects.equals(enabledActions, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.enabledActions) &&
        Objects.equals(userPrivilegeNames, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.userPrivilegeNames) &&
        Objects.equals(groupPrivilegeNames, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.groupPrivilegeNames) &&
        Objects.equals(constraint, orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties.constraint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledActions, userPrivilegeNames, groupPrivilegeNames, constraint);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

