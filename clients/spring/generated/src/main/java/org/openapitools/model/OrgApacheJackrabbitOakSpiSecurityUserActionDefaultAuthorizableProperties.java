package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown enabledActions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray userPrivilegeNames;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray groupPrivilegeNames;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString constraint;

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties enabledActions(@Nullable ConfigNodePropertyDropDown enabledActions) {
    this.enabledActions = enabledActions;
    return this;
  }

  /**
   * Get enabledActions
   * @return enabledActions
   */
  @Valid 
  @Schema(name = "enabledActions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabledActions")
  public @Nullable ConfigNodePropertyDropDown getEnabledActions() {
    return enabledActions;
  }

  @JsonProperty("enabledActions")
  public void setEnabledActions(@Nullable ConfigNodePropertyDropDown enabledActions) {
    this.enabledActions = enabledActions;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties userPrivilegeNames(@Nullable ConfigNodePropertyArray userPrivilegeNames) {
    this.userPrivilegeNames = userPrivilegeNames;
    return this;
  }

  /**
   * Get userPrivilegeNames
   * @return userPrivilegeNames
   */
  @Valid 
  @Schema(name = "userPrivilegeNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userPrivilegeNames")
  public @Nullable ConfigNodePropertyArray getUserPrivilegeNames() {
    return userPrivilegeNames;
  }

  @JsonProperty("userPrivilegeNames")
  public void setUserPrivilegeNames(@Nullable ConfigNodePropertyArray userPrivilegeNames) {
    this.userPrivilegeNames = userPrivilegeNames;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties groupPrivilegeNames(@Nullable ConfigNodePropertyArray groupPrivilegeNames) {
    this.groupPrivilegeNames = groupPrivilegeNames;
    return this;
  }

  /**
   * Get groupPrivilegeNames
   * @return groupPrivilegeNames
   */
  @Valid 
  @Schema(name = "groupPrivilegeNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupPrivilegeNames")
  public @Nullable ConfigNodePropertyArray getGroupPrivilegeNames() {
    return groupPrivilegeNames;
  }

  @JsonProperty("groupPrivilegeNames")
  public void setGroupPrivilegeNames(@Nullable ConfigNodePropertyArray groupPrivilegeNames) {
    this.groupPrivilegeNames = groupPrivilegeNames;
  }

  public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties constraint(@Nullable ConfigNodePropertyString constraint) {
    this.constraint = constraint;
    return this;
  }

  /**
   * Get constraint
   * @return constraint
   */
  @Valid 
  @Schema(name = "constraint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("constraint")
  public @Nullable ConfigNodePropertyString getConstraint() {
    return constraint;
  }

  @JsonProperty("constraint")
  public void setConstraint(@Nullable ConfigNodePropertyString constraint) {
    this.constraint = constraint;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

