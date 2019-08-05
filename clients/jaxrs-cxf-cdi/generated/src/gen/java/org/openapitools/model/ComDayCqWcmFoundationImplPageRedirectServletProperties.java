package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqWcmFoundationImplPageRedirectServletProperties   {
  
  private ConfigNodePropertyArray excludedResourceTypes = null;


  /**
   **/
  public ComDayCqWcmFoundationImplPageRedirectServletProperties excludedResourceTypes(ConfigNodePropertyArray excludedResourceTypes) {
    this.excludedResourceTypes = excludedResourceTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("excluded.resource.types")
  public ConfigNodePropertyArray getExcludedResourceTypes() {
    return excludedResourceTypes;
  }
  public void setExcludedResourceTypes(ConfigNodePropertyArray excludedResourceTypes) {
    this.excludedResourceTypes = excludedResourceTypes;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationImplPageRedirectServletProperties comDayCqWcmFoundationImplPageRedirectServletProperties = (ComDayCqWcmFoundationImplPageRedirectServletProperties) o;
    return Objects.equals(excludedResourceTypes, comDayCqWcmFoundationImplPageRedirectServletProperties.excludedResourceTypes);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

