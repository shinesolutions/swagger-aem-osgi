package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties   {
  
  private ConfigNodePropertyString name;
  private ConfigNodePropertyString jcrPrivilege;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  @Valid
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jcrPrivilege")
  @Valid
  public ConfigNodePropertyString getJcrPrivilege() {
    return jcrPrivilege;
  }
  public void setJcrPrivilege(ConfigNodePropertyString jcrPrivilege) {
    this.jcrPrivilege = jcrPrivilege;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties = (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.name) &&
        Objects.equals(this.jcrPrivilege, orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.jcrPrivilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, jcrPrivilege);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    jcrPrivilege: ").append(toIndentedString(jcrPrivilege)).append("\n");
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

