package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean forcelocation;
 /**
   * Get forcelocation
   * @return forcelocation
  **/
  @JsonProperty("forcelocation")
  public ConfigNodePropertyBoolean getForcelocation() {
    return forcelocation;
  }

  public void setForcelocation(ConfigNodePropertyBoolean forcelocation) {
    this.forcelocation = forcelocation;
  }

  public ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties forcelocation(ConfigNodePropertyBoolean forcelocation) {
    this.forcelocation = forcelocation;
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
    ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties = (ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties) o;
    return Objects.equals(this.forcelocation, comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.forcelocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forcelocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties {\n");
    
    sb.append("    forcelocation: ").append(toIndentedString(forcelocation)).append("\n");
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

