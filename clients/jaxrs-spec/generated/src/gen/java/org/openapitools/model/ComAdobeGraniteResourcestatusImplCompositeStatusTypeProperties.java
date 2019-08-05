package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties   {
  
  private @Valid ConfigNodePropertyString name = null;
  private @Valid ConfigNodePropertyArray types = null;

  /**
   **/
  public ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  public ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties types(ConfigNodePropertyArray types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("types")
  public ConfigNodePropertyArray getTypes() {
    return types;
  }
  public void setTypes(ConfigNodePropertyArray types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties = (ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties) o;
    return Objects.equals(name, comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.name) &&
        Objects.equals(types, comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

