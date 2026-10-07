package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray users;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray groups;
 /**
   * Get users
   * @return users
  **/
  @JsonProperty("users")
  public ConfigNodePropertyArray getUsers() {
    return users;
  }

  public void setUsers(ConfigNodePropertyArray users) {
    this.users = users;
  }

  public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties users(ConfigNodePropertyArray users) {
    this.users = users;
    return this;
  }

 /**
   * Get groups
   * @return groups
  **/
  @JsonProperty("groups")
  public ConfigNodePropertyArray getGroups() {
    return groups;
  }

  public void setGroups(ConfigNodePropertyArray groups) {
    this.groups = groups;
  }

  public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties groups(ConfigNodePropertyArray groups) {
    this.groups = groups;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

