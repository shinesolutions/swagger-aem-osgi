package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name;

  @JsonProperty("jcrPrivilege")
  private ConfigNodePropertyString jcrPrivilege;

  /**
   **/
  public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties jcrPrivilege(ConfigNodePropertyString jcrPrivilege) {
    this.jcrPrivilege = jcrPrivilege;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jcrPrivilege")
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
    return Objects.equals(name, orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.name) &&
        Objects.equals(jcrPrivilege, orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.jcrPrivilege);
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

