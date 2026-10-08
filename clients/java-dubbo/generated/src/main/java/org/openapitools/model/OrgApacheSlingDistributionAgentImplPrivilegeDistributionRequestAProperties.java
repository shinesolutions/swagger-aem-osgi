package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private ConfigNodePropertyString name;

  @JsonProperty("jcrPrivilege")
  private ConfigNodePropertyString jcrPrivilege;

  /**
   * 
   * @return name
   */
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * 
   * @return jcrPrivilege
   */
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
