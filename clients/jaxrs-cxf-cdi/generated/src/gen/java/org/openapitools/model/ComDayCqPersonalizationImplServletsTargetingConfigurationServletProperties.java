package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties   {
  
  private ConfigNodePropertyBoolean forcelocation = null;


  /**
   **/
  public ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties forcelocation(ConfigNodePropertyBoolean forcelocation) {
    this.forcelocation = forcelocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("forcelocation")
  public ConfigNodePropertyBoolean getForcelocation() {
    return forcelocation;
  }
  public void setForcelocation(ConfigNodePropertyBoolean forcelocation) {
    this.forcelocation = forcelocation;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties = (ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties) o;
    return Objects.equals(forcelocation, comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.forcelocation);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

