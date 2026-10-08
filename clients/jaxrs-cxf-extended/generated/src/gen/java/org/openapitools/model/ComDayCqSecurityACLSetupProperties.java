package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqSecurityACLSetupProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cqAclsetupRules;
 /**
  * Get cqAclsetupRules
  * @return cqAclsetupRules
  */
  @JsonProperty("cq.aclsetup.rules")
  public ConfigNodePropertyArray getCqAclsetupRules() {
    return cqAclsetupRules;
  }

  /**
   * Sets the <code>cqAclsetupRules</code> property.
   */
 public void setCqAclsetupRules(ConfigNodePropertyArray cqAclsetupRules) {
    this.cqAclsetupRules = cqAclsetupRules;
  }

  /**
   * Sets the <code>cqAclsetupRules</code> property.
   */
  public ComDayCqSecurityACLSetupProperties cqAclsetupRules(ConfigNodePropertyArray cqAclsetupRules) {
    this.cqAclsetupRules = cqAclsetupRules;
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
    ComDayCqSecurityACLSetupProperties comDayCqSecurityACLSetupProperties = (ComDayCqSecurityACLSetupProperties) o;
    return Objects.equals(this.cqAclsetupRules, comDayCqSecurityACLSetupProperties.cqAclsetupRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAclsetupRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqSecurityACLSetupProperties {\n");
    
    sb.append("    cqAclsetupRules: ").append(toIndentedString(cqAclsetupRules)).append("\n");
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

