package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingXssImplXSSFilterImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString policyPath;
 /**
  * Get policyPath
  * @return policyPath
  */
  @JsonProperty("policyPath")
  public ConfigNodePropertyString getPolicyPath() {
    return policyPath;
  }

  /**
   * Sets the <code>policyPath</code> property.
   */
 public void setPolicyPath(ConfigNodePropertyString policyPath) {
    this.policyPath = policyPath;
  }

  /**
   * Sets the <code>policyPath</code> property.
   */
  public OrgApacheSlingXssImplXSSFilterImplProperties policyPath(ConfigNodePropertyString policyPath) {
    this.policyPath = policyPath;
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
    OrgApacheSlingXssImplXSSFilterImplProperties orgApacheSlingXssImplXSSFilterImplProperties = (OrgApacheSlingXssImplXSSFilterImplProperties) o;
    return Objects.equals(this.policyPath, orgApacheSlingXssImplXSSFilterImplProperties.policyPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingXssImplXSSFilterImplProperties {\n");
    
    sb.append("    policyPath: ").append(toIndentedString(policyPath)).append("\n");
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

