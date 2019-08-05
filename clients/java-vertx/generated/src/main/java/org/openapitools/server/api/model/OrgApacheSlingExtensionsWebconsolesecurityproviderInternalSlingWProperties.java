package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties   {
  
  private ConfigNodePropertyArray users = null;
  private ConfigNodePropertyArray groups = null;

  public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties () {

  }

  public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties (ConfigNodePropertyArray users, ConfigNodePropertyArray groups) {
    this.users = users;
    this.groups = groups;
  }

    
  @JsonProperty("users")
  public ConfigNodePropertyArray getUsers() {
    return users;
  }
  public void setUsers(ConfigNodePropertyArray users) {
    this.users = users;
  }

    
  @JsonProperty("groups")
  public ConfigNodePropertyArray getGroups() {
    return groups;
  }
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
    return Objects.equals(users, orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.users) &&
        Objects.equals(groups, orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties.groups);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
