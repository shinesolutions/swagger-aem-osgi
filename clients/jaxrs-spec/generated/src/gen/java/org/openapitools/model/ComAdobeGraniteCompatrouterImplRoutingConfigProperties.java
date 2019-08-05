package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteCompatrouterImplRoutingConfigProperties   {
  
  private @Valid ConfigNodePropertyString id = null;
  private @Valid ConfigNodePropertyString compatPath = null;
  private @Valid ConfigNodePropertyString newPath = null;

  /**
   **/
  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties id(ConfigNodePropertyString id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public ConfigNodePropertyString getId() {
    return id;
  }
  public void setId(ConfigNodePropertyString id) {
    this.id = id;
  }

  /**
   **/
  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties compatPath(ConfigNodePropertyString compatPath) {
    this.compatPath = compatPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("compatPath")
  public ConfigNodePropertyString getCompatPath() {
    return compatPath;
  }
  public void setCompatPath(ConfigNodePropertyString compatPath) {
    this.compatPath = compatPath;
  }

  /**
   **/
  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties newPath(ConfigNodePropertyString newPath) {
    this.newPath = newPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("newPath")
  public ConfigNodePropertyString getNewPath() {
    return newPath;
  }
  public void setNewPath(ConfigNodePropertyString newPath) {
    this.newPath = newPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCompatrouterImplRoutingConfigProperties comAdobeGraniteCompatrouterImplRoutingConfigProperties = (ComAdobeGraniteCompatrouterImplRoutingConfigProperties) o;
    return Objects.equals(id, comAdobeGraniteCompatrouterImplRoutingConfigProperties.id) &&
        Objects.equals(compatPath, comAdobeGraniteCompatrouterImplRoutingConfigProperties.compatPath) &&
        Objects.equals(newPath, comAdobeGraniteCompatrouterImplRoutingConfigProperties.newPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, compatPath, newPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCompatrouterImplRoutingConfigProperties {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    compatPath: ").append(toIndentedString(compatPath)).append("\n");
    sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
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

