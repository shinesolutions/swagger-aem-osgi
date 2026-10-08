package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jcrPrivilege;
 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
  * Get jcrPrivilege
  * @return jcrPrivilege
  */
  @JsonProperty("jcrPrivilege")
  public ConfigNodePropertyString getJcrPrivilege() {
    return jcrPrivilege;
  }

  /**
   * Sets the <code>jcrPrivilege</code> property.
   */
 public void setJcrPrivilege(ConfigNodePropertyString jcrPrivilege) {
    this.jcrPrivilege = jcrPrivilege;
  }

  /**
   * Sets the <code>jcrPrivilege</code> property.
   */
  public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties jcrPrivilege(ConfigNodePropertyString jcrPrivilege) {
    this.jcrPrivilege = jcrPrivilege;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

