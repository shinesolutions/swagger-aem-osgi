package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString nonValidChars;
 /**
  * Get nonValidChars
  * @return nonValidChars
  */
  @JsonProperty("nonValidChars")
  public ConfigNodePropertyString getNonValidChars() {
    return nonValidChars;
  }

  /**
   * Sets the <code>nonValidChars</code> property.
   */
 public void setNonValidChars(ConfigNodePropertyString nonValidChars) {
    this.nonValidChars = nonValidChars;
  }

  /**
   * Sets the <code>nonValidChars</code> property.
   */
  public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties nonValidChars(ConfigNodePropertyString nonValidChars) {
    this.nonValidChars = nonValidChars;
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
    ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties = (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties) o;
    return Objects.equals(this.nonValidChars, comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.nonValidChars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonValidChars);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties {\n");
    
    sb.append("    nonValidChars: ").append(toIndentedString(nonValidChars)).append("\n");
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

