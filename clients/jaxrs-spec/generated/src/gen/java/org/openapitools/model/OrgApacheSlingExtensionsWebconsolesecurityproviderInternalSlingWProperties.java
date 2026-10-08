package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties   {
  private ConfigNodePropertyArray users;
  private ConfigNodePropertyArray groups;

  public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties() {
  }

  /**
   **/
  public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties users(ConfigNodePropertyArray users) {
    this.users = users;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("users")
  @Valid public ConfigNodePropertyArray getUsers() {
    return users;
  }

  @JsonProperty("users")
  public void setUsers(ConfigNodePropertyArray users) {
    this.users = users;
  }

  /**
   **/
  public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties groups(ConfigNodePropertyArray groups) {
    this.groups = groups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("groups")
  @Valid public ConfigNodePropertyArray getGroups() {
    return groups;
  }

  @JsonProperty("groups")
  public void setGroups(ConfigNodePropertyArray groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties = (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties) o;
    return Objects.equals(this.users, orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.users) &&
        Objects.equals(this.groups, orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, groups);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
