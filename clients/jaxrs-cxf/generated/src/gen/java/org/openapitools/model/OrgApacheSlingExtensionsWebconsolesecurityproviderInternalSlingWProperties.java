package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
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

public class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray users = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray groups = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

