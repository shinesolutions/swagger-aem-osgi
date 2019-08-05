package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties   {
  
  private @Valid ConfigNodePropertyArray resourceTypes = null;

  /**
   **/
  public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties resourceTypes(ConfigNodePropertyArray resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.types")
  public ConfigNodePropertyArray getResourceTypes() {
    return resourceTypes;
  }
  public void setResourceTypes(ConfigNodePropertyArray resourceTypes) {
    this.resourceTypes = resourceTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties = (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties) o;
    return Objects.equals(resourceTypes, comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.resourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties {\n");
    
    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
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

