package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties   {
  @JsonProperty("name")
  @Valid

  private ConfigNodePropertyString name;

  @JsonProperty("jcrPrivilege")
  @Valid

  private ConfigNodePropertyString jcrPrivilege;

  public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties jcrPrivilege(ConfigNodePropertyString jcrPrivilege) {
    this.jcrPrivilege = jcrPrivilege;
    return this;
  }

   /**
   * Get jcrPrivilege
   * @return jcrPrivilege
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

