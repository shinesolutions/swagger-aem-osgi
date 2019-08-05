package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqSecurityACLSetupProperties   {
  
  private @Valid ConfigNodePropertyArray cqAclsetupRules = null;

  /**
   **/
  public ComDayCqSecurityACLSetupProperties cqAclsetupRules(ConfigNodePropertyArray cqAclsetupRules) {
    this.cqAclsetupRules = cqAclsetupRules;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.aclsetup.rules")
  public ConfigNodePropertyArray getCqAclsetupRules() {
    return cqAclsetupRules;
  }
  public void setCqAclsetupRules(ConfigNodePropertyArray cqAclsetupRules) {
    this.cqAclsetupRules = cqAclsetupRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqSecurityACLSetupProperties comDayCqSecurityACLSetupProperties = (ComDayCqSecurityACLSetupProperties) o;
    return Objects.equals(cqAclsetupRules, comDayCqSecurityACLSetupProperties.cqAclsetupRules);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

