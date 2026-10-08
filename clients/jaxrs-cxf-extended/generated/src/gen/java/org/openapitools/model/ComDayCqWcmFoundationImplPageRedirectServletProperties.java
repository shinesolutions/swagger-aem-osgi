package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmFoundationImplPageRedirectServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray excludedResourceTypes;
 /**
  * Get excludedResourceTypes
  * @return excludedResourceTypes
  */
  @JsonProperty("excluded.resource.types")
  public ConfigNodePropertyArray getExcludedResourceTypes() {
    return excludedResourceTypes;
  }

  /**
   * Sets the <code>excludedResourceTypes</code> property.
   */
 public void setExcludedResourceTypes(ConfigNodePropertyArray excludedResourceTypes) {
    this.excludedResourceTypes = excludedResourceTypes;
  }

  /**
   * Sets the <code>excludedResourceTypes</code> property.
   */
  public ComDayCqWcmFoundationImplPageRedirectServletProperties excludedResourceTypes(ConfigNodePropertyArray excludedResourceTypes) {
    this.excludedResourceTypes = excludedResourceTypes;
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
    ComDayCqWcmFoundationImplPageRedirectServletProperties comDayCqWcmFoundationImplPageRedirectServletProperties = (ComDayCqWcmFoundationImplPageRedirectServletProperties) o;
    return Objects.equals(this.excludedResourceTypes, comDayCqWcmFoundationImplPageRedirectServletProperties.excludedResourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedResourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationImplPageRedirectServletProperties {\n");
    
    sb.append("    excludedResourceTypes: ").append(toIndentedString(excludedResourceTypes)).append("\n");
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

